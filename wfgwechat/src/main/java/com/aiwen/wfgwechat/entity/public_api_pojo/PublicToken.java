package com.aiwen.wfgwechat.entity.public_api_pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户的token码和返回状态的对象
 */

public class PublicToken implements Serializable {
    private static final long serialVersionUID = -1926970660977820227L;




    private String access_token;

    //状态码

    private String expires_in;


    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    @Override
    public String toString() {
        return "PublicToken{" +
                "access_token='" + access_token + '\'' +
                ", expires_in='" + expires_in + '\'' +
                '}';
    }
}
