package com.aiwen.wfgwechat.entity.public_api_pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 公众号 账号 密钥
 */
public class User implements Serializable {

    private static final long serialVersionUID = 6179416300636606292L;

    private String appId;

    private String appSecret;



    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }


    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }


    @Override
    public String toString() {
        return "Articles{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                '}';
    }
}
