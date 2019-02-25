package com.aiwen.wfgwechat.entity.pojo;

import java.io.Serializable;
import java.util.Date;

public class Organ extends  BaseEntity implements Serializable {
    private static final long serialVersionUID = 713108693948500970L;
    private String organId;

    private String organName;

    private String organUrl;

    private String publicId;

    private String publicName;

    private String smallId;

    private String smallName;


    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId == null ? null : organId.trim();
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    public String getOrganUrl() {
        return organUrl;
    }

    public void setOrganUrl(String organUrl) {
        this.organUrl = organUrl == null ? null : organUrl.trim();
    }

    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId == null ? null : publicId.trim();
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName == null ? null : publicName.trim();
    }

    public String getSmallId() {
        return smallId;
    }

    public void setSmallId(String smallId) {
        this.smallId = smallId == null ? null : smallId.trim();
    }

    public String getSmallName() {
        return smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName == null ? null : smallName.trim();
    }

}