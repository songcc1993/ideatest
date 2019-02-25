package com.aiwen.wfgwechat.service.impl;


import com.aiwen.wfgwechat.config.public_Utils.EnumData;
import com.aiwen.wfgwechat.config.public_Utils.PublicUtil;
import com.aiwen.wfgwechat.config.small_program_utils.ArticleUtil;
import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.pojo.Media;
import com.aiwen.wfgwechat.entity.public_api_pojo.Articles;
import com.aiwen.wfgwechat.entity.public_api_pojo.Attachment;
import com.aiwen.wfgwechat.entity.public_api_pojo.PublicToken;
import com.aiwen.wfgwechat.entity.public_api_pojo.RequestField;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.publicmodules.util.ImageUtil;
import com.aiwen.wfgwechat.publicmodules.util.UUIDUtil;
import com.aiwen.wfgwechat.publicmodules.util.UploadUtill;
import com.aiwen.wfgwechat.publicmodules.util.WeiXinUtil;
import com.aiwen.wfgwechat.service.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.tobato.fastdfs.domain.StorePath;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Slf4j
public class AsyncService {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private ResultStatusService resultStatusService;
    @Autowired
    private  MediaService mediaService;
    @Autowired
    private AttachmentService attachmentService;

    @Autowired
    private ArticleObjService articleObjService;

    /**
     *
     * @param list
     * @param appFlag
     * @param model  //100:网站  200：小程序 300:公众号
     * @param appid
     * @param secret
     */
    @Async
    public void parseAttachment(List<Article> list,String appFlag,String model,String appid,String secret){
        try {
            log.info("进入线程处理数据---开始");
            long l = System.currentTimeMillis();
            List<Article>  articleListSave = new ArrayList<>();
            List<Article>  articleListUpdate = new ArrayList<>();
            boolean flag=false;
            String token =null;
            if(Constant.MODEL_300.equals(model)){
                token = WeiXinUtil.getToken(appid, secret);
            }
            for(Article ar:list){
                String appId = ar.getAppId();
                String appContent = ar.getAppContent();
                String appImg = ar.getAppImg();
                String appAttachment = ar.getAppAttachment();
                List<String> imgStr = ImageUtil.getImgStr(appContent);
                if(appImg!=null&&!"".equals(appImg)){
                    StorePath upload = UploadUtill.upload(appImg,null);
                    String fullPath = upload.getFullPath();
                    if(Constant.MODEL_300.equals(model)){
                        String s = WeiXinUtil.postImg(EnumData.PUBLIC_API_UPLOADIMG, token, fullPath);
                        ar.setAppImg(s);
                    }
                    ar.setAppImg(fullPath);
                }
                for(String imgurl:imgStr){
                    StorePath upload = UploadUtill.upload(imgurl,null);
                    String fullPath = upload.getFullPath();
                    appContent.replace(imgurl, fullPath);
                }
                ar.setAppContent(appContent);
                JSONArray objects = JSON.parseArray(appAttachment);
                JSONArray objectsNew=new JSONArray();
                for(Object item:objects){
                    String s = JSONObject.toJSONString(item);
                    Attachment attachment = JSONObject.parseObject(s, Attachment.class);
                    String attachment_url = attachment.getAttachment_url();
                    StorePath upload = UploadUtill.upload(attachment_url,null);
                    String fullPath = upload.getFullPath();
                    attachment.setAttachment_url(fullPath);
                    objectsNew.add(attachment);
                }
                ar.setAppAttachment(JSONArray.toJSONString(objectsNew));
                if(appId!=null&&!"".equals(appId)){
                    articleListUpdate.add(ar);
                }else{
                    articleListSave.add(ar);
                }
            }
            if(articleListUpdate.size()>0){
                articleService.updateList(articleListUpdate);
            }
            if(articleListSave.size()>0){
                articleService.saveList(articleListSave);
            }
            resultStatusService.ifHasUpdateOrSave(appFlag, Constant.RESULT_STATUS_1);
            long ll = System.currentTimeMillis();
            log.info("进入线程处理数据---结束共用时: /{}"+(ll-l)/1000+"s");
        } catch (Exception e) {
            resultStatusService.ifHasUpdateOrSave(appFlag, Constant.RESULT_STATUS_2);
            e.printStackTrace();
        }

    }

    /**
     * 小程序保存修改状态
     */
    @Async
    public void saveSmall(List<Article> list,String flag){
        ResultMessage message;
        String appImg = null;

        for(int i = 0 ; i < list.size() ; i++){
            Article article = list.get(i);
            //上传 文章图片
            if(article.getAppImg() != null && !"".equals(article.getAppImg())){
                appImg = UploadUtill.getImageFullUrl(article.getAppImg(), new Date().getTime() + ".jpg");
                if(appImg.equals("4")){
                    article.setAppImg(EnumData.TUPIAN_URL);
                }
                article.setAppImg(appImg);
            }
            System.out.println("文章大图片替换内容路径：==========="+article.getAppImg());
            //上传文章内容图片
            ResultMessage content = ArticleUtil.Content(article.getAppContent());
            if(!content.getResult()){
                resultStatusService.ifHasUpdateOrSave(flag, Constant.RESULT_STATUS_2);
                return;
            }
            Map<String,String> map = (Map<String,String>)content.getData();
            String appContent = article.getAppContent();
            for(Map.Entry<String,String> m:map.entrySet()){
                appContent = appContent.replace(m.getKey(), m.getValue());
            }
            article.setAppContent(appContent);
            System.out.println("解析后的文章内容：====="+appContent);
            //获取附件信息
            String appAttachment = article.getAppAttachment();
            if(appAttachment != null && !"".equals(appAttachment)){
                message = ArticleUtil.Attachment(appAttachment);
                //将数据插入数据库
                List<com.aiwen.wfgwechat.entity.pojo.Attachment> attachmentList = (List<com.aiwen.wfgwechat.entity.pojo.Attachment>)message.getData();
                for(int j = 0 ; j < attachmentList.size() ;j++){
                    com.aiwen.wfgwechat.entity.pojo.Attachment attachment = attachmentList.get(j);
                    //attachment.setAttachment_id(UUIDUtil.getUuid());
                    try{
                        int save = attachmentService.save(attachment);
                    }catch(Exception e){
                        System.out.println("小程序保存附件信息报错，错误信息为：===="+e);
                        resultStatusService.ifHasUpdateOrSave(flag, Constant.RESULT_STATUS_2);
                        return;
                    }
                }
                String attachmentJson = JSON.toJSONString(attachmentList);
                article.setAppAttachment(attachmentJson);
            }
            //将数据进行保存
            try{

                article.setAppDate(new Date());
                article.setAppStatus("0");
                article.setAppId(UUIDUtil.getUuid());
                article.setAppFlag(flag);

                int start = articleObjService.insertArticle(article);
                System.out.println("保存最终状态成功！"+start);
                resultStatusService.ifHasUpdateOrSave(flag, Constant.RESULT_STATUS_1);
            }catch (Exception e){
                System.out.println("小程序保存图文信息报错，错误信息为：===="+e);
                resultStatusService.ifHasUpdateOrSave(flag, Constant.RESULT_STATUS_2);
            }
        }
    }




    /**
     *  公众号保存状态
     * @param list
     * @param app_flag
     * @param appId
     * @param appSecret
     * @return
     */
    @Async
    public  void saveWX(List<Article> list,String app_flag,String appId , String appSecret){

        ResultMessage message ;
        String token=null;
            //保存文章状态
        //resultStatusService.ifHasUpdateOrSave(filg,Constant.RESULT_STATUS_0);
        //获取code信息
         message = PublicUtil.getToken(appId, appSecret);
         if(message.getResult() == false){
             System.out.println("获取token失败！");
             resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_2);
             return;
             //return message;
         }
         //获取token对象
        PublicToken publicToken = (PublicToken)message.getData();
         token = publicToken.getAccess_token();
        List<Articles> arrayList = new ArrayList<>();
         //循环获取文章开始上传

        for(int i = 0 ; i <list.size() ; i++){

            String appContent = list.get(i).getAppContent();
            message = PublicUtil.getContent(appContent,token);
            if(!message.getResult()){
                System.out.println("文章内容解析失败,或图片上传失败"+"========"+message.getMessage());
                resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_2);
                return;
                //return message;
            }
            Map<String,String> map = (Map<String,String>)message.getData();
            String content = null;
            for(Map.Entry<String,String> entry:map.entrySet()){
                appContent = appContent.replace(entry.getKey(), entry.getValue());
            }

            Articles articles = new Articles();
                    //文章属性
            List<RequestField> fieldList = JSONObject.parseArray(list.get(i).getAppField(), RequestField.class);

            for(int j = 0 ; j < fieldList.size() ;j++){
                RequestField field = fieldList.get(j);
                if("zuozhexingming".equals(field.getField_id())){
                    articles.setAuthor(field.getField_value());
                }else if("xianzhipinglun".equals(field.getField_id())){
                    //所有人可评论
                    if(field.getField_value().equals("0")){
                        articles.setNeed_open_comment("1");
                        articles.setOnly_fans_can_comment("0");
                        //仅关注可评论
                    }else if(field.getField_value().equals("1")){
                        articles.setNeed_open_comment("1");
                        articles.setOnly_fans_can_comment("1");
                        //不可评论
                    }else if(field.getField_value().equals("3")){
                        articles.setNeed_open_comment("0");
                    }
                }else if("tiaozhuanurl".equals(field.getField_id())){
                    articles.setContent_source_url(field.getField_value());
                }else if("datupian".equals(field.getField_id())){
                    String appImg = field.getField_value();
                    if(appImg == null && "".equals(appImg)){
                        message.setResult(Constant.FALSE);
                        message.setMessage("文章图片不能为空！");
                        message.setStatus(Constant.STATUS_500);
                        System.out.println("文章图片为空！");
                        resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_2);
                        return;
                    }
                    appImg = UploadUtill.getImageFullUrl(appImg, new Date().getTime() + ".jpg");
                    //保存文章封面图片的路径
                    message = PublicUtil.getImgUrl(token,appImg,EnumData.PUBLIC_API_GETIMGURL);
                    if(message.getResult() == false){
                        System.out.println("保存文章封面路径错误！");
                        resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_2);
                        return;
                        //return message;
                    }
                    list.get(i).setAppImg((String) message.getData());
                }
            }
            //文章内容
            articles.setContent(appContent);
            //文章标题
            articles.setTitle(list.get(i).getAppTitle());
            //封面图片
            articles.setThumb_media_id(list.get(i).getAppImg());
            //文章描述
            articles.setDigest(list.get(i).getAppDescride());

            //封装发送文章
            arrayList.add(articles);
        }

        String jsonArticles = JSON.toJSONString(arrayList);
        String ar ="{"+"\"articles\":"+jsonArticles+""+"}";
        System.out.println("上传保存信息"+ar);
        //调用方法 发送图文信息 获取media_id
        message = PublicUtil.getMediaId(token, ar);
        if(!message.getResult()){
            resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_2);
            return;
            //return message;
        }
        String media_id =(String) message.getData();
        System.out.println("微信平台返回最终的media_id:"+media_id);
        Media media = new Media();
        //media.setId(UUIDUtil.getUuid());
        media.setMediaId(media_id);
        media.setAppFlag(app_flag);
        //保存数据
        try{
            mediaService.save(media);
        }catch (Exception e){
            e.printStackTrace();
            message.setResult(Constant.FALSE);
            message.setMessage("信息保存失败！");
            message.setStatus(Constant.STATUS_500);
            resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_2);
            return;
           // return message;
        }

       /* if(seve == 0){

        }*/
        Map<String, Object> map = new HashMap<>();
        map.put("media_id",media.getId());
        message.setData(map);
        message.setStatus(Constant.STATUS_200);
        message.setResult(Constant.TREU);
        message.setMessage("请求成功！");
        resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_1);
        //return message;
    }


}
