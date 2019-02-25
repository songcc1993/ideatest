package com.aiwen.wfgwechat.entity.public_api_pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 发送消息的对象
 */
public class SendMessage implements Serializable {
    private static final long serialVersionUID = -8781942862133932814L;

    private String app_id;

    private String app_title;

    private String app_content;

    private String app_title_long;

    //private String app_seq;

    private String app_img;

    private String app_descride;

    private String app_attachment;

    //private String app_status;

    private String app_field;

    private String app_version; //用于判断数据是否发生改变

    @Override
    public String toString() {
        return "SendMessage{" +
                "app_id='" + app_id + '\'' +
                ", app_title='" + app_title + '\'' +
                ", app_content='" + app_content + '\'' +
                ", app_title_long='" + app_title_long + '\'' +
                ", app_img='" + app_img + '\'' +
                ", app_descride='" + app_descride + '\'' +
                ", app_attachment='" + app_attachment + '\'' +
                ", app_field='" + app_field + '\'' +
                '}';
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public void setApp_title(String app_title) {
        this.app_title = app_title;
    }

    public void setApp_content(String app_content) {
        this.app_content = app_content;
    }

    public void setApp_title_long(String app_title_long) {
        this.app_title_long = app_title_long;
    }


    public void setApp_img(String app_img) {
        this.app_img = app_img;
    }

    public void setApp_descride(String app_descride) {
        this.app_descride = app_descride;
    }

    public void setApp_attachment(String app_attachment) {
        this.app_attachment = app_attachment;
    }


    public void setApp_field(String app_field) {
        this.app_field = app_field;
    }

    public String getApp_id() {
        return app_id;
    }

    public String getApp_title() {
        return app_title;
    }

    public String getApp_content() {
        return app_content;
    }

    public String getApp_title_long() {
        return app_title_long;
    }


    public String getApp_img() {
        return app_img;
    }

    public String getApp_descride() {
        return app_descride;
    }

    public String getApp_attachment() {
        return app_attachment;
    }


    public String getApp_field() {
        return app_field;
    }


    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }
}
