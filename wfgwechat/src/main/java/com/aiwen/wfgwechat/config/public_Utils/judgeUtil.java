package com.aiwen.wfgwechat.config.public_Utils;

import com.aiwen.wfgwechat.config.HttpPost;
import com.aiwen.wfgwechat.entity.public_api_pojo.*;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class judgeUtil {






























    /**
     * 将id和密钥进行转义  将封装到  对象中
     * @param app_sign
     */
    public void charm(String app_sign){


        }

    /**
     * 发送图文消息
     * @param publicApi
     * @param field
     * @param user
     * @return
     */
        public static String sendMessage(RequestObj publicApi,List<RequestField> field,User user){
            ResultMessage message = new ResultMessage();
            String appId = user.getAppId();
            String appSecret = user.getAppSecret();
            String tokenJson = HttpPost.sendPost(EnumData.PUBLIC_API_GETTOKEN, "grant_type=client_credential&appid=" + appId + "&secret=" + appSecret);
            PublicToken publicToken ;
            try {
                publicToken = (PublicToken)JsonToBean.jsonToObj(tokenJson,new PublicToken());
            } catch (IOException e) {
              message.setResult(Constant.FALSE);
              message.setStatus(Constant.STATUS_500);
              message.setMessage("appid或appSecret错误！");
              return message.toString();
            }
            String token = publicToken.getAccess_token();



            return message.toString();
        }

    /**
     * 上传图片信息
     */
    public static PublicImg SendImg(String token,String imgUrl)throws Exception{
        ResultMessage m = new ResultMessage();
        //获取图片上传图片
        String imgJson = HttpPost.getImg(EnumData.PUBLIC_API_GETIMGURL + "?access_token=" + token + "&type=image", imgUrl);
        //将imgJson转成对象
        PublicImg publicImg = (PublicImg)JsonToBean.jsonToObj(imgJson,new PublicImg());
        return publicImg;
    }


    /**
     * 封装信息将图文信息进行发送
     * @param publicApi
     * @param token
     * @return
     * @throws JsonProcessingException
     */
    public static PublicApiMessage sendMessage(Object publicApi,String token) throws IOException {
        String publicApiJson = JsonToBean.objToJson(publicApi);
        String publicMessage = "{"+"\"articles\":"+publicApiJson+"}";
        //发送请求 获取MessageJson （图文信息上传保存的路径  获取 media_id  属性）
        String postMessage = HttpPost.sendPost(EnumData.PUBLIC_API_GETMESSAGE + "?access_token=" + token , publicMessage);
        //发送请求 获取图文信息url对象
        PublicApiMessage apiMessage = (PublicApiMessage)JsonToBean.jsonToObj(postMessage,new PublicApiMessage());
        return apiMessage;
    }
}
