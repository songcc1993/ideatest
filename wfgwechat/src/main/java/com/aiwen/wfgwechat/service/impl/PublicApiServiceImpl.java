package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.config.HttpPost;
import com.aiwen.wfgwechat.config.public_Utils.EnumData;
import com.aiwen.wfgwechat.config.public_Utils.JsonToBean;
import com.aiwen.wfgwechat.dao.FieldMapper;
import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.pojo.Field;
import com.aiwen.wfgwechat.entity.pojo.Media;
import com.aiwen.wfgwechat.entity.pojo.ResultStatus;
import com.aiwen.wfgwechat.entity.public_api_pojo.Articles;
import com.aiwen.wfgwechat.entity.public_api_pojo.*;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.PreviewReturn;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.SendAllTableReturn;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.publicmodules.util.AesEbcUtil;
import com.aiwen.wfgwechat.publicmodules.util.ParseDataUtil;
import com.aiwen.wfgwechat.service.ArticleService;
import com.aiwen.wfgwechat.service.MediaService;
import com.aiwen.wfgwechat.service.PublicApiService;
import com.aiwen.wfgwechat.service.ResultStatusService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PublicApiServiceImpl implements PublicApiService {
    @Autowired
    private ResultStatusService resultStatusService;
    @Autowired
    private AsyncService asyncService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private MediaService mediaService;

    /**
     * 修改和保存
     * @paramdata
     */
    @Override
    public void saveOrEdit(String data) {
        ResultMessage re = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.string2Data(data, EnumData.KEY_PUBLIC_SAVEOREUPDATE);
        //解析数据

        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        String app_flag=(String) stringObjectMap.get("app_flag");
        String appid = (String) stringObjectMap.get("appid");
        String secret = (String)stringObjectMap.get("secret");
        List<Article> list = null;
        if(flag){
            list = (List<Article>)stringObjectMap.get("data");
            resultStatusService.ifHasUpdateOrSave(app_flag, Constant.RESULT_STATUS_0);
           // asyncService.parseAttachment(list,requestObj.getApp_flag(),Constant.MODEL_300,split[0],split[1]);
            //将图片信息保存到微信服务器d
           // asyncService.saveWX(list,requestObj.getApp_flag(),split[0],split[1]);

            List<Article> articles = null;
            Media media = new Media();
            for (int i = 0 ; i < list.size() ; i++){
                media.setAppVersion(list.get(i).getAppVersion());
                media.setAppFlag(list.get(i).getAppField());
                List<Media> listBy = mediaService.findListBy(media);

            }

            asyncService.saveWX(list,app_flag,appid,secret);
        }else{
            throw new RuntimeException(message);
        }
    }

    /**
     * 发送
     * @param data
     * @return
     */
    @Override
    public ResultMessage publish(String data) {
        ResultMessage m = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.parseData(data, new PublishParam(), EnumData.KEY_PUBLIC_PUBLISH);
        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        PublishParam pp = (PublishParam)stringObjectMap.get(PublishParam.class.getSimpleName());
        String app_sign = pp.getApp_sign();
        String s1 ="";
        String[] split =null;
        try {
            s1 = AesEbcUtil.aesTransferDncrypt(app_sign, EnumData.KEY_PUBLIC_APPID_APPSECRCT);
            if(s1!=null&&!"".equals(s1)){
               split = s1.split("&");
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
        String app_id = pp.getApp_id();
        Media me = new Media();
        me.setAppFlag(app_id);
        List<Media> listBy = mediaService.findListBy(me);
        String mediaId =null;
        if (listBy!=null&&listBy.size()>0){
            Media media = listBy.get(0);
            mediaId= media.getMediaId();
        }
        if(mediaId==null||"".equals(mediaId)){
            message="获取素材失败！";
            flag=false;
        }
        String organ_wx_label = pp.getOrgan_wx_label();
        String appid="";
        String secret="";
        if(split!=null&&split.length>=2){
            appid=split[0];
            secret=split[1];
        }
        if(flag){
            SendAllTableReturn publish = articleService.publish(mediaId, organ_wx_label, appid, secret);
            m.setData(publish);
            System.out.println("保存信息发送微信服务器返回状态：======="+JSON.toJSONString(publish));
            String code = publish.getErrcode();

            m.setResult(Constant.FALSE);
            m.setStatus(Constant.STATUS_500);
            switch (code){
                case "40001":
                    m.setMessage("获取 access_token 时 AppSecret 错误，或者 access_token 无效。");
                    break;
                case"45028":
                    m.setMessage("图文消息超过限制");
                    break;
                case"40009":
                    m.setMessage("不合法的图片文件大小");
                    break;
                case"48001":
                    m.setMessage("api 功能未授权，请确认公众号已获得该接口，可以在公众平台官网 - 开发者中心页中查看接口权限");
                    break;
                case"48002":
                    m.setMessage("粉丝拒收消息（粉丝在公众号选项中，关闭了 “ 接收消息 ” ）");
                    break;
                case"50005":
                    m.setMessage("用户未关注公众号");
                    break;
                case"40132":
                    m.setMessage("微信号不合法");
                    break;
            }
            if(code.equals("0")){
                m.setResult(Constant.TREU);
                m.setStatus(Constant.STATUS_200);
                m.setMessage("发送成功！");
            }
            System.out.println("保存信息返回最终状态：======="+JSON.toJSONString(m));
            return m;
        }else{
            throw new RuntimeException(message);
        }
    }

    /**
     * 预览实现
     * @param data
     * @return
     */
    @Override
    public ResultMessage preview(String data) {
        ResultMessage m = new ResultMessage();
        Map<String, Object> stringObjectMap = ParseDataUtil.parseData(data, new PreviewParam(), EnumData.KEY_PUBLIC_PREVIEW);
        boolean flag = (boolean)stringObjectMap.get("flag");
        String message = (String)stringObjectMap.get("message");
        PreviewParam pp = (PreviewParam)stringObjectMap.get(PreviewParam.class.getSimpleName());
        String app_sign = pp.getApp_sign();
        String s1 ="";
        String[] split =null;
        try {
            s1 = AesEbcUtil.aesTransferDncrypt(app_sign, EnumData.KEY_PUBLIC_APPID_APPSECRCT);
            if(s1!=null&&!"".equals(s1)){
                split = s1.split("&");
            }
        } catch (Exception e) {
            System.out.println("预览app_sign解密失败！");
            e.printStackTrace();
        }
        String app_id = pp.getApp_id();
        Media me = new Media();
        me.setAppFlag(app_id);
        List<Media> listBy = mediaService.findListBy(me);
        String mediaId =null;
        if (listBy!=null&&listBy.size()>0){
            Media media = listBy.get(0);
            mediaId= media.getMediaId();
        }
        if(mediaId==null||"".equals(mediaId)){
            message="获取素材失败！";
            flag=false;
        }
        String organ_wx_user = pp.getOrgan_wx_user();
        String appid="";
        String secret="";
        if(split!=null&&split.length>=2){
            appid=split[0];
            secret=split[1];
        }
        if(flag){
            PreviewReturn preview = articleService.preview(mediaId, organ_wx_user, appid, secret);

            m.setData(preview);
            String code = preview.getErrcode();
            m.setResult(Constant.FALSE);
            m.setStatus(Constant.STATUS_500);

            switch (code){
                case "40001":
                    m.setMessage("获取 access_token 时 AppSecret 错误，或者 access_token 无效。");
                    break;
                case"45008":
                    m.setMessage("图文消息超过限制");
                    break;
                case"40009":
                    m.setMessage("不合法的图片文件大小");
                    break;
                case"48001":
                    m.setMessage("api 功能未授权，请确认公众号已获得该接口，可以在公众平台官网 - 开发者中心页中查看接口权限");
                    break;
                case"48002":
                    m.setMessage("粉丝拒收消息（粉丝在公众号选项中，关闭了 “ 接收消息 ” ）");
                    break;
                case"50005":
                    m.setMessage("用户未关注公众号");
                    break;
                case"40132":
                    m.setMessage("微信号不合法");
                    break;
            }
            if(code.equals("0")){
                m.setResult(Constant.TREU);
                m.setStatus(Constant.STATUS_200);
                m.setMessage("发送成功！");
            }
            System.out.println("预览返回的最终状态：======"+JSON.toJSONString(m));
            return m;
        }else{
            throw new RuntimeException(message);
        }
    }


    @Override
    public String send(String data) {
        return null;
    }

    @Override
    public void repeal(String data) {


    }

    @Override
    public ResultMessage returnStatus(String data) {
        ResultMessage rm = new ResultMessage();
            Map<String, Object> stringObjectMap = ParseDataUtil.parseData(data, new ReturnStatusParam(), EnumData.KEY_PUBLIC_RETURNSTATUS);
            boolean flag = (boolean)stringObjectMap.get("flag");
            String message = (String)stringObjectMap.get("message");
            ReturnStatusParam rp = (ReturnStatusParam)stringObjectMap.get(ReturnStatusParam.class.getSimpleName());
            if(flag){
                String app_flag = rp.getApp_flag();
                ResultStatus rs = new ResultStatus();
            rs.setAppFlag(app_flag);
            List<ResultStatus> listBy = resultStatusService.findListBy(rs);
            Map<String,Object> map  = new HashMap<>();
            if (listBy!=null&&listBy.size()>0){
                ResultStatus resultStatus = listBy.get(0);
                String appCode = resultStatus.getApp_code();
                if(Constant.RESULT_STATUS_0.equals(appCode)){
                    message=Constant.RESULT_STATUS_0_VALUE;
                }else if(Constant.RESULT_STATUS_1.equals(appCode)){
                    message=Constant.RESULT_STATUS_1_VALUE;
                }else if(Constant.RESULT_STATUS_2.equals(appCode)){
                    message=Constant.RESULT_STATUS_2_VALUE;
                }
                map.put("app_code",appCode);
                rm.setData(map);
                rm.setMessage(message);
            }
            return rm;
        }else{
            throw new RuntimeException(message);
        }
    }


    /**
     * 推送图文消息
     * @param data
     * @return
     */
    @Override
    public ResultMessage SendPublic(String data) {
        ResultMessage message = new ResultMessage();
        //判断请求的json串是否为空
        if(data == null || "".equals(data)){
            message.setMessage("请求数据为空！");
            message.setStatus(Constant.STATUS_500);
            return message;
        }
        try{
            message = encapsulation(data);
            if(message.getResult() == false){
                return message;
            }
            Map<String,Object> objMap =(Map<String,Object>) message.getData();
            RequestObj publicApi =(RequestObj) objMap.get("publicApi");
            //调用接口获取   token  错误返回message
            User user = (User)objMap.get("user");
            PublicToken publicToken ;
            try{
                String tokenJson = HttpPost.sendPost(EnumData.PUBLIC_API_GETTOKEN, "grant_type=client_credential&appid=" + user.getAppId() + "&secret=" + user.getAppSecret());
                    publicToken =(PublicToken) JsonToBean.jsonToObj(tokenJson,new PublicToken());
            }catch(Exception e){
                message.setMessage("appId或appSecret错误！");
                message.setResult(Constant.FALSE);
                message.setStatus(Constant.STATUS_500);
                return message;
            }
            //将数据转成  json bin发送
            PublicApiMessage publicApiMessage;
            try{
                List<Articles> articles = ( List<Articles>)objMap.get("articlesList");
                String jsonArticles = JSONObject.toJSONString(articles);
                String publicMessage = "{"+"\"articles\":"+jsonArticles+"}";
                String jsonMessage = HttpPost.sendPost(EnumData.PUBLIC_API_GETMESSAGE + "?access_token=" + publicToken.getAccess_token(), publicMessage);
                publicApiMessage = (PublicApiMessage)JsonToBean.jsonToObj(jsonMessage,new PublicApiMessage());
            }catch(Exception e){
                message.setMessage("微信公众号发送图文消息失败！");
                message.setResult(Constant.FALSE);
                message.setStatus(Constant.STATUS_500);
                return message;
            }
            //
            Map<String, Object> mediaMap = new HashMap<>();
            //创建群发
            Map<String, Object> filter = new HashMap<>();
            filter.put("is_to_all",true);
            //创建群发数据
            Map<String, Object> wxcard = new HashMap<>();
            wxcard.put("media_id",publicApiMessage.getMedia_id());
            //封装发送数据
            mediaMap.put("filter",filter);
            mediaMap.put("wxcard",wxcard);
            mediaMap.put("msgtype","mpnews");
            mediaMap.put("send_ignore_reprint",0);
            String messageJson = JSONObject.toJSONString(mediaMap);
            //发送消息
            String post = HttpPost.sendPost(EnumData.PUBLIC_API_SENDMESSAGE + "?access_token=" + publicToken.getAccess_token(), messageJson);
            message.setMessage("公众号发送图文消息，发送成功！");
            message.setResult(Constant.TREU);
            message.setStatus(Constant.STATUS_200);
        }catch (Exception e){
            message.setResult(Constant.FALSE);
            message.setStatus(Constant.STATUS_500);
            message.setMessage("系统异常！");
        }
        return message;
    }
    /**
     * 将请求的数据都封装到对象中
     */
    public  ResultMessage encapsulation(String data){
        ResultMessage message = new ResultMessage();
        message.setResult(Constant.FALSE);
        try{
            Map<String, Object> map = new HashMap<>();
            RequestObj publicApi = JSON.parseObject(data, new TypeReference<RequestObj>() {});
            map.put("publicApi",publicApi);
            //查看 PublicObj对象中的属性是否为空
            message = equels(publicApi);
            if(message.getResult() == false){
                return message;
            }
            String appSign = publicApi.getApp_sign();
            if(appSign == null || "".equals(appSign)){
                message.setMessage("app_sign不能为空！");
                message.setStatus("209");
                return message;
            }
            String[] split = appSign.split("&");
            User user = new User();
            user.setAppId(split[0]);
            user.setAppSecret(split[1]);
            map.put("user",user);
            //将公众号的id和密钥进行解密
            //String strUser = AesUtil.AESDncode(EnumData.PUBLIC_APPID_APPSECRCT, app_sign);
            List<Field> fieldList ;
            //获取全部数据 将对象转换成集合
            List<Attachment> attaList = new ArrayList<>();
            List<Articles> articles = new ArrayList<>();
            String messageData = publicApi.getRequest_data();
            List<SendMessage> sendMessages = JSONObject.parseArray(messageData,SendMessage.class);
            for(int i = 0 ; i < sendMessages.size() ; i++){

                SendMessage sendMessage = sendMessages.get(i);
                //创建访问微信接口的集合
                Articles articlesObj = new Articles();
                if(sendMessage.getApp_title() == null || "".equals(sendMessage.getApp_title())){
                    message.setStatus("204");
                    message.setMessage("app_title不能为空!");
                    return message;
                }else if(sendMessage.getApp_content() == null || "".equals(sendMessage.getApp_content())){
                    message.setStatus("205");
                    message.setMessage("app_content不能为空!");
                    return message;
                }else if(sendMessage.getApp_field() == null || "".equals(sendMessage.getApp_field())){
                    message.setStatus("211");
                    message.setMessage("app_field不能为空!");
                    return message;
                }
                //标题
                articlesObj.setTitle(sendMessage.getApp_title());
                //内容
                articlesObj.setContent(sendMessage.getApp_content());
                //图片链接
                articlesObj.setThumb_media_id(sendMessage.getApp_img());
                //  文件简介
                articlesObj.setDigest(sendMessage.getApp_descride());

                fieldList = JSONObject.parseArray(sendMessages.get(i).getApp_field(),Field.class);

                for(int j = 0 ; j < fieldList.size() ; j++){
                    if(fieldList.get(j).getFieldId() == null || "".equals(fieldList.get(j).getFieldId())){
                        message.setStatus("212");
                        message.setMessage("field_id不能为空！");
                        return message;
                    }else if(fieldList.get(j).getFieldValue() == null || "".equals(fieldList.get(j).getFieldValue())){
                        message.setStatus("214");
                        message.setMessage("field_value不能为空！");
                        return message;
                    }
                    switch (fieldList.get(j).getFieldId()){
                        case "zuozhe":
                            articlesObj.setAuthor(fieldList.get(j).getFieldValue());
                            break;
                         case"openpinglun":
                            articlesObj.setNeed_open_comment(fieldList.get(j).getFieldValue());
                            break;
                        case "canpinglun":
                                articlesObj.setOnly_fans_can_comment(fieldList.get(j).getFieldValue());
                            break;
                        case "tiaozhuanurl":
                            articlesObj.setContent_source_url(fieldList.get(j).getFieldValue());
                            break;
                    }
                }
                //根据id集合 查询全部 field信息  循环fieldAllList  判断数据尽心封装数据
                articles.add(articlesObj);
            }
            map.put("articlesList",articles);
            message.setData(map);
        }catch (Exception e){
            message.setStatus(Constant.STATUS_500);
            message.setMessage("传递数据进行json解析时错误！");
        }
        message.setResult(Constant.TREU);
        return message;
    }


    //判断传递的对象是否为空（publicApi）
    public  ResultMessage equels(RequestObj publicApi){
        ResultMessage message = new ResultMessage();
        message.setResult(Constant.FALSE);
        if(publicApi.getRequest_data() == null || "".equals(publicApi.getRequest_data())){
            message.setMessage("request_data不能为空！");
            message.setStatus(Constant.STATUS_500);
            return message;
        }else if(publicApi.getApp_sign() == null || "".equals(publicApi.getApp_sign())){
            message.setMessage("app_sign不能问空!");
            message.setStatus(Constant.STATUS_500);
            return message;
        }
        message.setResult(Constant.TREU);
        return message;
    }

}
