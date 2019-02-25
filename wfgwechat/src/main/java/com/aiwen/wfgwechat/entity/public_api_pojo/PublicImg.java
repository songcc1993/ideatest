package com.aiwen.wfgwechat.entity.public_api_pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 想公众号发送图片、音频素材时   返回的地址信息
 */

public class PublicImg implements Serializable {
    private static final long serialVersionUID = 3494978311833466867L;

    private String type;

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
        return "PublicImg{" +
                "type='" + type + '\'' +
                ", media_id='" + media_id + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
