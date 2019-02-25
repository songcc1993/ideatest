package com.aiwen.wfgwechat.entity.public_api_pojo;

import org.hibernate.annotations.Filters;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 接收请求的 对象
 */

public class RequestObj implements Serializable {

    private static final long serialVersionUID = -1572523312591510267L;

    //组织id
    private String organ_id;
    //指定模块
    private String organ_model;
    //加密信息
    private String encryption;
    //公众号信息  (appid  秘钥)
    private String app_sign;
    //新闻信息
    private String request_data;
    //标识该条请求参数的唯一键
    private String app_flag;

    @Override
    public String toString() {
        return "RequestObj{" +
                "organ_id='" + organ_id + '\'' +
                ", organ_model='" + organ_model + '\'' +
                ", encryption='" + encryption + '\'' +
                ", app_sign='" + app_sign + '\'' +
                ", request_data='" + request_data + '\'' +
                '}';
    }

    public void setOrgan_id(String organ_id) {
        this.organ_id = organ_id;
    }

    public void setOrgan_model(String organ_model) {
        this.organ_model = organ_model;
    }


    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public void setApp_sign(String app_sign) {
        this.app_sign = app_sign;
    }

    public void setRequest_data(String request_data) {
        this.request_data = request_data;
    }

    public String getOrgan_id() {
        return organ_id;
    }

    public String getOrgan_model() {
        return organ_model;
    }


    public String getEncryption() {
        return encryption;
    }

    public String getApp_sign() {
        return app_sign;
    }

    public String getRequest_data() {
        return request_data;
    }

    public String getApp_flag() {
        return app_flag;
    }

    public void setApp_flag(String app_flag) {
        this.app_flag = app_flag;
    }
}
