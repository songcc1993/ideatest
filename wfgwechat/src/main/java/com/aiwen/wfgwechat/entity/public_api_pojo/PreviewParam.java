package com.aiwen.wfgwechat.entity.public_api_pojo;

public class PreviewParam extends BaseParam{
    private String app_sign; //"公众号&密钥"
    private String organ_wx_user; //标星用户,钻石会员,黄金会员
    private String app_id;


    public String getApp_sign() {
        return app_sign;
    }

    public void setApp_sign(String app_sign) {
        this.app_sign = app_sign;
    }

    public String getOrgan_wx_user() {
        return organ_wx_user;
    }

    public void setOrgan_wx_user(String organ_wx_user) {
        this.organ_wx_user = organ_wx_user;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }
}
