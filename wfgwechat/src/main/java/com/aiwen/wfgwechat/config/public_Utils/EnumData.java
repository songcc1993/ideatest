package com.aiwen.wfgwechat.config.public_Utils;

public class EnumData {

    //根据 appid  和 密钥 获取token
    //access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET"
    public static final String PUBLIC_API_GETTOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    //上传群发的图文信息图片获取图片地址
    public static final String PUBLIC_API_UPLOADIMG = "https://api.weixin.qq.com/cgi-bin/media/uploadimg";
   // public static final String PUBLIC_API_UPLOADIMG = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
    //上传群发的图文信息获取media_id
    public static final String PUBLIC_API_UPLOADIMGANDCONT="https://api.weixin.qq.com/cgi-bin/media/uploadnews?access_token=ACCESS_TOKEN";
    //根据标签群发
    public static final String PUBLIC_API_SNEDALL_TABLE="https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN";
    //根据opeid群发
    public static final String PUBLIC_API_SNEDALL_OPENID="https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=ACCESS_TOKEN";


    public static String GETTOKEN="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";

    //上传图片获取图片的media
    public static final String PUBLIC_API_GETIMGURL = "http://file.api.weixin.qq.com/cgi-bin/media/upload";
    //上传图文信息
    public static final String PUBLIC_API_GETMESSAGE = "https://api.weixin.qq.com/cgi-bin/media/uploadnews";
    //发送信息
    public static final String PUBLIC_API_SENDMESSAGE="https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN";
    //预览
    public static final String PUBLIC_API_PREVIEW="https://api.weixin.qq.com/cgi-bin/message/mass/preview?access_token=ACCESS_TOKEN";


    //公众号 图文信息加密方式
    public static final String PUBLIC_MESSAGE="ylwe5dUbhm8HrMD5";
    //公众号id  和  密钥加密方式
    public static final String KEY_PUBLIC_APPID_APPSECRCT ="XSGwGvOxQRPjfpSs";
    //保存修改图文信息加密方式：u6an9vtwW4Kcs6nY
    public static final String KEY_PUBLIC_SAVEOREUPDATE ="u6an9vtwW4Kcs6nY";
    //发布数据
    public static final String KEY_PUBLIC_PUBLISH ="ylwe5dUbhm8HrMD5";
    //获取返回状态
    public static final String KEY_PUBLIC_RETURNSTATUS="GMncKjYKhFmYNVR3";
    //预览图文信息加密方式：VDHSSLPpXHHwHoDV
    public static final String KEY_PUBLIC_PREVIEW="VDHSSLPpXHHwHoDV";


    public static final String TUPIAN_URL ="http://47.95.6.0:8880/group1/M00/00/03/rBE4ZlwbOpGASUwlAAAiaoErk0w274.jpg";

}
