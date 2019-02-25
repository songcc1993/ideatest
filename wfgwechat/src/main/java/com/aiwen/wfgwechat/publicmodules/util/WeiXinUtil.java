package com.aiwen.wfgwechat.publicmodules.util;

import com.aiwen.wfgwechat.config.public_Utils.EnumData;
import com.aiwen.wfgwechat.config.public_Utils.PublicUtil;
import com.aiwen.wfgwechat.entity.public_api_pojo.PublicToken;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.*;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class WeiXinUtil {
    //PUBLIC_API_GETTOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    public static String getToken(String appId,String appSecret){
        String tokenUrl= EnumData.PUBLIC_API_GETTOKEN.replace("APPID", appId);
        tokenUrl.replace("APPSECRET", appSecret);
        JSONObject jsonObject = HttpUtil.doGetstr(tokenUrl);
        String access_token =null;
        if (null != jsonObject) {
            access_token = jsonObject.getString("access_token");
        }
        return access_token;
    }
    //获取图片url的方法
    public static String postImg(String url,String token,String sourceImageUrl) {
        url = url.replace("ACCESS_TOKEN", token);
        String result="";
        try {
            URL url1 = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(30000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Cache-Control", "no-cache");
            String boundary = "-----------------------------" + System.currentTimeMillis();
            String filename="";
            if(sourceImageUrl!=null&&!"".equals(sourceImageUrl)){
                int i = url.lastIndexOf("/");
                filename = url.substring(i+1, url.length());
            }
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            OutputStream output = conn.getOutputStream();
            output.write(("--" + boundary + "\r\n").getBytes());
            output.write(
                    String.format("Content-Disposition: form-data; name=\"media\"; filename=\"%s\"\r\n", filename)
                            .getBytes());
            output.write("Content-Type: image/jpeg \r\n\r\n".getBytes());
            byte[] data = new byte[1024];
            int len = 0;


            URLConnection urlConnection = HttpUtil.postConnection(sourceImageUrl);
            InputStream input = urlConnection.getInputStream();



            while ((len = input.read(data)) > -1) {
                output.write(data, 0, len);
            }
            output.write(("\r\n--" + boundary + "\r\n\r\n").getBytes());
            output.flush();
            output.close();
            input.close();
            InputStream resp = conn.getInputStream();
            StringBuffer sb = new StringBuffer();
            while ((len = resp.read(data)) > -1)
                sb.append(new String(data, 0, len, "utf-8"));
            resp.close();
            result = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("postFile，不支持http协议");
        }
        return result;

    }

    /**
     * 获取图文上
     * @paramdata
     * @return
     */
    public static ImageContReturn uploadImgCont(String ImageContParam){
        JSONObject jsonObject = HttpUtil.doPoststr(EnumData.PUBLIC_API_UPLOADIMGANDCONT, ImageContParam);
        String s = JSONObject.toJSONString(jsonObject);
        ImageContReturn imageContReturn = JSONObject.parseObject(s, ImageContReturn.class);
        return imageContReturn;
    }

    /**
     * @param sendallUrl 群发接口
     * @param media_id
     * @param organ_wx_label
     */
    public static SendAllTableReturn sendAll(String sendallUrl, String media_id, String organ_wx_label,String appid,String secret){
        ResultMessage rm = PublicUtil.getToken(appid, secret);
        PublicToken data = (PublicToken)rm.getData();
        String token=data.getAccess_token();
        sendallUrl=sendallUrl.replace("ACCESS_TOKEN", token);
        SendAllTableParam sned = new SendAllTableParam();
        if(organ_wx_label!=null&&!"".equals(organ_wx_label)){
            sned.getFilter().put("is_to_all",false);
            sned.getFilter().put("tag_id", organ_wx_label);
        }else{
        sned.getFilter().put("is_to_all",true);
    }
        sned.getMpnews().put("media_id", media_id);
        sned.setMsgtype("mpnews");
        sned.setSend_ignore_reprint("1");
        //filter: filter	是	用于设定图文消息的接收者
        //is_to_all	否	用于设定是否向全部用户发送，值为true或false，选择true该消息群发给所有用户，选择false可根据tag_id发送给指定群组的用户
        //tag_id	否	群发到的标签的tag_id，参见用户管理中用户分组接口，若is_to_all值为true，可不填写tag_id
        //mpnews	是	用于设定即将发送的图文消息
        //media_id	是	用于群发的消息的media_id
        //msgtype	是	群发的消息类型，图文消息为mpnews，文本消息为text，语音为voice，音乐为music，图片为image，视频为video，卡券为wxcard
        //send_ignore_reprint	是	图文消息被判定为转载时，是否继续群发。 1为继续群发（转载），0为停止群发。 该参数默认为0。
        String s = JSONObject.toJSONString(sned);
        JSONObject jsonObject = HttpUtil.doPoststr(sendallUrl, s);
        String s1 = JSONObject.toJSONString(jsonObject);
        SendAllTableReturn sendAllTableReturn = JSONObject.parseObject(s1, SendAllTableReturn.class);
        return sendAllTableReturn;
    }

    /**
     * 预览
     * @param previewUrl
     * @param media_id
     * @param organ_wx_user
     * @param appid
     * @param secret
     * @return
     */
    public static PreviewReturn preview(String previewUrl, String media_id, String organ_wx_user,String appid,String secret,boolean flag){
        ResultMessage rm = PublicUtil.getToken(appid, secret);
        System.out.println("获取token状态：======================"+JSON.toJSONString(rm));

        PublicToken data = (PublicToken)rm.getData();

        String token=data.getAccess_token();

        previewUrl=previewUrl.replace("ACCESS_TOKEN", token);
        PreviewParam previewParam = new PreviewParam();
        previewParam.setMsgtype("mpnews");
        previewParam.setTouser(organ_wx_user);
        previewParam.getMpnews().put("media_id", media_id);
        previewParam.setTowxname(organ_wx_user);
        String s = JSONObject.toJSONString(previewParam);
        JSONObject jsonObject = HttpUtil.doPoststr(previewUrl, s);
        String s1 = JSONObject.toJSONString(jsonObject);
        System.out.println("预览发送状态：================"+s1);
        PreviewReturn previewReturn = JSONObject.parseObject(s1, PreviewReturn.class);
        return previewReturn;
    }


    /**
     * 新建获取token   只获取一次 token
     * @param previewUrl
     * @param media_id
     * @param organ_wx_user
     * @param token
     * @param flag
     * @return
     */
    public static PreviewReturn newPreview(String previewUrl, String media_id, String organ_wx_user,String token,boolean flag){

        previewUrl=previewUrl.replace("ACCESS_TOKEN", token);
        PreviewParam previewParam = new PreviewParam();
        previewParam.setMsgtype("mpnews");
        previewParam.setTouser(organ_wx_user);
        previewParam.getMpnews().put("media_id", media_id);
        previewParam.setTowxname(organ_wx_user);
        String s = JSONObject.toJSONString(previewParam);
        JSONObject jsonObject = HttpUtil.doPoststr(previewUrl, s);
        String s1 = JSONObject.toJSONString(jsonObject);
        System.out.println("预览发送状态：================"+s1);
        PreviewReturn previewReturn = JSONObject.parseObject(s1, PreviewReturn.class);
        return previewReturn;
    }

}


