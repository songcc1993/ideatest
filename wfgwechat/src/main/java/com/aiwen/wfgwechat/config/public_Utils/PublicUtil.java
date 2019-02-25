package com.aiwen.wfgwechat.config.public_Utils;

import com.aiwen.wfgwechat.config.HttpPost;
import com.aiwen.wfgwechat.entity.pojo.Field;
import com.aiwen.wfgwechat.entity.public_api_pojo.PublicToken;
import com.aiwen.wfgwechat.entity.public_api_pojo.RequestField;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.publicmodules.util.HttpUtil;
import com.aiwen.wfgwechat.publicmodules.util.ImageUtil;
import com.aiwen.wfgwechat.publicmodules.util.UploadUtill;
import com.aiwen.wfgwechat.service.FieldService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PublicUtil {

    @Autowired
    private static  FieldService fieldService;


    //获取token
    public static ResultMessage getToken(String appId ,String appSecret){
        ResultMessage message = new ResultMessage();
        String sendPost = HttpPost.sendPost(EnumData.GETTOKEN, "appid=" + appId + "&secret=" + appSecret);
        System.out.println("微信平台返回获取token信息"+sendPost);
        JSONObject jsonObject = JSONObject.parseObject(sendPost);
        Integer errcode = (Integer)jsonObject.get("errcode");
        if(!"".equals(errcode) && errcode != null){
            message.setData(errcode);
            message.setResult(Constant.FALSE);
            return message;
        }
        PublicToken token = JSONObject.parseObject(sendPost, PublicToken.class);

        System.out.println("获取token状态：====="+JSON.toJSONString(token));

            message.setData(token);
            message.setResult(Constant.TREU);
            return message;
    }

    /**
     * @param token
     * @param url  网络图片url
     * @param wxImgUrl  调用微信接口
     * @return
     */
    public static ResultMessage getImgUrl(String token,String url,String wxImgUrl){
        ResultMessage message = new ResultMessage();
        String post = HttpPost.getImg( wxImgUrl+ "?access_token=" + token+"&type=image",url);
        try{
            JSONObject jsonObject = JSONObject.parseObject(post);
            String url1 = jsonObject.getString("media_id");
            if(url1 == null || "".equals(url1)) {
                url1 = jsonObject.getString("url");
            }
            if(url1.equals("") || url1 == null){
                message.setResult(Constant.FALSE);
                return message;
            }
            message.setResult(Constant.TREU);
            message.setData(url1);
        }catch (Exception e){
            message.setData(post);
            message.setResult(Constant.FALSE);
            System.out.println("上传微信服务器图片异常=======："+JSON.toJSONString(message)+"==============微信返回信息："+post);
            return message;
        }
        return  message;
    }
   /* //将图片上传微信服务器  返回图片的url
    public static ResultMessage getImgUrl(String token,String url){
        ResultMessage message = new ResultMessage();
        String post = HttpPost.getImg(EnumData.PUBLIC_API_UPLOADIMG + "?access_token=" + token+"&type=image",url);
        try{
            JSONObject jsonObject = JSONObject.parseObject(post);
            String url1 = jsonObject.getString("media_id");
            if(url1.equals("") || url1 == null){
                message.setSuccess(Constant.FALSE);
                return message;
            }
            message.setSuccess(Constant.TREU);
            message.setData(url1);
        }catch (Exception e){
            e.printStackTrace();
            message.setMessage("图片路径："+url+"，解析错误！");
            message.setSuccess(Constant.FALSE);
            return message;
        }
        return  message;
    }*/

    /**
     * 解析文章内容，向微信公众号上传内容中的图片
     * @param content
     * @param token
     * @return
     */
    public static ResultMessage getContent(String content,String token){
        ResultMessage message = new ResultMessage();
        Map<String,String> map = new TreeMap<>();
        //获取图片的集合
        List<String> imgStr = ImageUtil.getImgStr(content);
        for(int i = 0 ; i <imgStr.size() ; i++){
            String imageUrl = imgStr.get(i);
            String sec = imageUrl.replaceAll("'", "");
            //判断字符串是否包含
            if(imageUrl.contains("lianziapp.com")){
                imageUrl = UploadUtill.getImageFullUrl(sec, new Date().getTime() + ".jpg");
                message = getImgUrl(token,imageUrl,EnumData.PUBLIC_API_UPLOADIMG);
            }else {
                imageUrl = UploadUtill.getImageFullUrl(sec,"");
            if(imageUrl.equals("4")){
                message = getImgUrl(token,EnumData.TUPIAN_URL,EnumData.PUBLIC_API_UPLOADIMG);
                map.put(imgStr.get(i),(String) message.getData());
                continue;
            }
            message = getImgUrl(token,imageUrl,EnumData.PUBLIC_API_UPLOADIMG);
        }
        if("45008".contains((String)message.getData())){
                message.setMessage("上传图片接口调用超出限制！");
            return message;
            }
            if(!message.getResult()){
                message = getImgUrl(token,EnumData.TUPIAN_URL,EnumData.PUBLIC_API_UPLOADIMG);
            }
            map.put(imgStr.get(i),(String) message.getData());
        }
        message.setResult(Constant.TREU);
        message.setData(map);
        return message;
    }

    /**
     *
     */
    public static ResultMessage getMediaId(String token,String data){
        ResultMessage message = new ResultMessage();
        try{
            String getMediaId = EnumData.PUBLIC_API_UPLOADIMGANDCONT.replace("ACCESS_TOKEN", token);

           // String media_id = HttpPost.sendPost(getMediaId,data);
                JSONObject jsonObject1 = HttpUtil.doPoststr(getMediaId, data);
                 System.out.println("发送图文信息保存至微信服务器："+jsonObject1);
                String media_id = jsonObject1.getString("media_id");

                if(media_id.equals("")||media_id == null){
                    message.setMessage("图文信息上传失败！");
                    message.setResult(Constant.FALSE);
                    message.setStatus(Constant.STATUS_500);
                    message.setData(jsonObject1);
                    return message;
            }
            message.setData(media_id);
            message.setResult(Constant.TREU);
        }catch (Exception e){
            message.setMessage("图文信息上传异常！");
            message.setResult(Constant.FALSE);
            message.setStatus(Constant.STATUS_500);
        }
        return message;
    }




    /**
     * 解析appFIeld
     *//*
    public static ResultMessage appField(String data){
        ResultMessage message = new ResultMessage();
       try{
           List<RequestField> fieldArray = JSONObject.parseArray(data, RequestField.class);
           List<String> idlist = new ArrayList<>();
           for(int i = 0 ; i <fieldArray.size() ; i++){
               idlist.add(fieldArray.get(i).getField_id());
           }
           List<Field> fieldList = fieldService.findByList(idlist);
           for(int i = 0 ; i < fieldArray.size() ; i++){
               for(int j = 0 ; j < fieldList.size() ; j++){
                   if(fieldArray.get(i).getField_id().equals(fieldList.get(j).getFieldId())){
                       fieldArray.get(i).setField_name(fieldList.get(j).getFieldName());
                   }
               }
           }
           message.setSuccess(Constant.TREU);
           message.setData(fieldArray);
       }catch(Exception e){
            message.setMessage("app_field参数错误，获取失败！");
            message.setSuccess(Constant.FALSE);
            message.setStatus(Constant.STATUS_500);
            return message;
       }
        return message;
    }*/


}
