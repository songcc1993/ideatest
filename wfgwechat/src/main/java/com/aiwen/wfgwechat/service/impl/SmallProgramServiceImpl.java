package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.config.public_Utils.EnumData;
import com.aiwen.wfgwechat.config.public_Utils.JsonToBean;
import com.aiwen.wfgwechat.config.small_program_utils.ArticleUtil;
import com.aiwen.wfgwechat.entity.pojo.*;
import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.entity.public_api_pojo.*;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.publicmodules.util.ParseDataUtil;
import com.aiwen.wfgwechat.service.*;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class SmallProgramServiceImpl implements SmallProgramService {

    @Autowired//异步处理数据
    private AsyncService asyncService;
    @Autowired
    private ResultStatusService resultStatusService;
    @Autowired
    private ArticleObjService articleService;


    @Autowired
    private ArticleService articleSer;
    @Autowired
    private MediaService mediaService;

    /**
     * 修改和保存
     * @param data
     */
    @Override
    public ResultMessage saveOrEdit(String data) {
        ResultMessage result = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.string2Data(data, EnumData.KEY_PUBLIC_SAVEOREUPDATE);
        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        String app_flag=(String) stringObjectMap.get("app_flag");
        List<Article> list = null;
        if(flag){
            list = (List<Article>)stringObjectMap.get("list");
            resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_0);
            asyncService.parseAttachment(list,app_flag,Constant.MODEL_200,"","");
        }else{
            throw new RuntimeException(message);
        }
        return result;
    }

    /**
     * 发布数据
     * @param data
     */
    @Override
    public ResultMessage publish(String data) {
        ResultMessage result = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.parseData(data, new PublishParam(), EnumData.KEY_PUBLIC_PUBLISH);
        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        PublishParam pp = (PublishParam)stringObjectMap.get(PublishParam.class.getSimpleName());
        String app_id = pp.getApp_id();
        Article article = new Article();
        if(flag){
            article.setAppFlag(app_id);
            Article byId = articleService.findArticle(article);
            if(byId == null){
                result.setMessage("没有该文章，要发布的文章id为："+app_id);
                result.setStatus(Constant.STATUS_500);
                result.setResult(Constant.FALSE);
                return result;
            }
            byId.setAppStatus("1");
            articleService.updataArticle(byId);
            result.setMessage("发布成功！");
            result.setResult(Constant.TREU);
            result.setStatus(Constant.STATUS_200);
        }else{
            result.setMessage("发布失败！");
            result.setResult(Constant.FALSE);
            result.setStatus(Constant.STATUS_500);
            System.out.println("发布消息报错信息：===="+new RuntimeException(message));
        }
        return result;
    }

    /**
     * 预览图文消息
     * @param data
     * @return
     */
    @Override
    public ResultMessage preview(String data) {
        ResultMessage result = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.parseData(data, new PublishParam(), EnumData.KEY_PUBLIC_PUBLISH);
        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        PublishParam pp = (PublishParam)stringObjectMap.get(PublishParam.class.getSimpleName());
        String app_id = pp.getApp_id();
        Article article = new Article();
        if(flag){
            article.setAppFlag(app_id);
            Article byId = articleService.findArticle(article);
            if(byId == null){
                result.setMessage("没有该文章，要预览的文章id为："+app_id);
                result.setStatus(Constant.STATUS_500);
                result.setResult(Constant.FALSE);
                return result;
            }
            byId.setAppStatus("2");
            Integer stat = articleService.updataArticle(byId);
            if(stat == 1){
                result.setMessage("预览成功！");
                result.setResult(Constant.TREU);
                result.setStatus(Constant.STATUS_200);
                return result;
            }else{
                result.setMessage("发布失败，保存数据错误！");
                result.setResult(Constant.FALSE);
                result.setStatus(Constant.STATUS_500);
                System.out.println("预览消息报错信息：===="+new RuntimeException(message));
                return result;
            }

        }else{
            result.setMessage("预览失败！");
            result.setResult(Constant.FALSE);
            result.setStatus(Constant.STATUS_500);
            System.out.println("发布消息报错信息：===="+new RuntimeException(message));
        }
        return result;
    }

    /**
     * 撤销数据
     * @param data
     */
    @Override
    public ResultMessage repeal(String data) {
        ResultMessage result = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.parseData(data, new RepealParam(), EnumData.KEY_PUBLIC_PUBLISH);
        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        RepealParam rp = (RepealParam)stringObjectMap.get(RepealParam.class.getSimpleName());
        String app_id = rp.getApp_id();
        Article article = new Article();
        if(flag){
            article.setAppFlag(app_id);
            Article byId = articleService.findArticle(article);
            if(byId == null){
                result.setMessage("没有该文章，要撤销的文章id为："+app_id);
                result.setStatus(Constant.STATUS_500);
                result.setResult(Constant.FALSE);
                return result;
            }
            byId.setAppStatus("3");
            articleService.updataArticle(byId);
            result.setMessage("撤销成功！");
            result.setResult(Constant.TREU);
            result.setStatus(Constant.STATUS_200);
        }else{
            result.setMessage("撤销失败！");
            result.setResult(Constant.FALSE);
            result.setStatus(Constant.STATUS_500);
            System.out.println("撤销消息报错信息：===="+new RuntimeException(message));
        }
        return result;
    }

    @Override
    public ResultMessage returnStatus(String data) {
        ResultMessage rm = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.parseData(data, new ReturnStatusParam(), EnumData.KEY_PUBLIC_RETURNSTATUS);
        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        Map<String, String> map = new HashMap<>();
        ReturnStatusParam rp = (ReturnStatusParam)stringObjectMap.get(ReturnStatusParam.class.getSimpleName());
        if(flag){
            String app_flag = rp.getApp_flag();
            System.out.println("要查询状态的flag："+app_flag);
            ResultStatus rs = new ResultStatus();
            rs.setAppFlag(app_flag);
            List<ResultStatus> listBy = resultStatusService.findListBy(rs);
            if (listBy!=null&&listBy.size()>0){
                ResultStatus resultStatus = listBy.get(0);
                String appCode = resultStatus.getApp_code();
                if(Constant.RESULT_STATUS_0.equals(appCode)){
                    message=Constant.RESULT_STATUS_0_VALUE;
                    map.put("app_code",Constant.RESULT_STATUS_0);
                }else if(Constant.RESULT_STATUS_1.equals(appCode)){
                    message=Constant.RESULT_STATUS_1_VALUE;
                    map.put("app_code",Constant.RESULT_STATUS_1);
                }else if(Constant.RESULT_STATUS_2.equals(appCode)){
                    message=Constant.RESULT_STATUS_2_VALUE;
                    map.put("app_code",Constant.RESULT_STATUS_2);
                }
                rm.setData(map);
                rm.setMessage(message);
            }
            return rm;
        }else{
            throw new RuntimeException(message);
        }
    }


    /**
     * 保存和修改
     * @param data
     */
    @Override
    public ResultMessage send(String data) {
        ResultMessage result = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.string2Data(data, EnumData.KEY_PUBLIC_SAVEOREUPDATE);
        //解析数据

        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        String app_flag=(String) stringObjectMap.get("app_flag");
        String appid = (String) stringObjectMap.get("appid");
         String secret = (String)stringObjectMap.get("secret");
         List<Article> list = null;
        //判断时间戳 文章是否存在


               if(flag){
            list = (List<Article>)stringObjectMap.get("data");
            Map<String, String> map = new HashMap<>();
            // asyncService.parseAttachment(list,requestObj.getApp_flag(),Constant.MODEL_300,split[0],split[1]);
            //将图片信息保存到微信服务器d
            // asyncService.saveWX(list,requestObj.getApp_flag(),split[0],split[1]);

            List<Article> articles = null;
            Media media = new Media();
            for (int i = 0 ; i < list.size() ; i++){
                Article article = list.get(i);
                result = ArticleUtil.articleIsNull(article);
                if(!result.getResult()){
                    return result;
                }
                Article version = articleSer.findByVersion(article.getAppVersion());
                if(version == null ){
                        resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_0);
                        asyncService.saveSmall(list,app_flag);

                    }
                    //时间戳相同 返回信息
                     map.put("app_id",app_flag);
                    result.setData(map);
                    return result;
            }
        }else{
            throw new RuntimeException(message);
        }

            return null;
    }







    public Map<String,Object> encapsulation(RequestObj requestObj){
        Map<String, Object> map = new HashMap<>();
        ResultMessage message = new ResultMessage();
        message.setResult(Constant.FALSE);
        if(requestObj.getOrgan_id() == null || "".equals(requestObj.getOrgan_id())){
                    message.setStatus("201");
                    message.setMessage("organ_id不能问为空！");
        }else if(requestObj.getEncryption() == null || "".equals(requestObj.getEncryption())){
                    message.setStatus(Constant.STATUS_500);
                    message.setMessage("encryption不能为空！");
        }else if(requestObj.getRequest_data() == null || "".equals(requestObj.getRequest_data())){
                    message.setStatus(Constant.STATUS_500);
                    message.setMessage("request_data不能为空！");
        }
                    map.put("message",message);
        try{
            List<SendMessage> sendMessageList = JSONObject.parseArray(requestObj.getRequest_data(),SendMessage.class);
            List<Field> fieldList ;
            for(int i = 0 ; i < sendMessageList.size() ; i++){
                SendMessage sendMessage = sendMessageList.get(i);
                if(sendMessage.getApp_title() == null || "".equals(sendMessage.getApp_title())){
                    message.setStatus("204");
                    message.setMessage("app_title不能为空!");
                }else if(sendMessage.getApp_content() == null || "".equals(sendMessage.getApp_content())){
                    message.setStatus("205");
                    message.setMessage("app_content不能为空!");
                }else if(sendMessage.getApp_field() == null || "".equals(sendMessage.getApp_field())){
                    message.setStatus("211");
                    message.setMessage("app_field不能为空!");
                }
                fieldList = JSONObject.parseArray(sendMessage.getApp_field(),Field.class);
                if(sendMessage.getApp_attachment() != null || !"".equals(sendMessage.getApp_attachment())){
                    try{
                        Attachment attachment = (Attachment)JsonToBean.jsonToObj(sendMessage.getApp_attachment(), new Attachment());
                        //生成uuid
                        attachment.setAttachment_id(UUID.randomUUID().toString().replace("-",""));

                    }catch(Exception e){

                    }
                }

            }

        }catch(Exception e){
                message.setStatus(Constant.STATUS_500);
                message.setMessage("requset_data解析错误！");
                return map;
        }



        return null;
    }
}
