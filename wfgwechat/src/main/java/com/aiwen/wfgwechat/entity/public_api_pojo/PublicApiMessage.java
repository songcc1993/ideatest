package com.aiwen.wfgwechat.entity.public_api_pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 发送消息封装的对象
 */

public class PublicApiMessage implements Serializable {

    private static final long serialVersionUID = -8972585381422997201L;


    private String type;

    //消息保存 路径

    private String media_id;


    private String created_at;

    public String getType() {
        return type;
    }

    public String getMedia_id() {
        return media_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "PublicApiMessage{" +
                "type='" + type + '\'' +
                ", media_id='" + media_id + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }

}
