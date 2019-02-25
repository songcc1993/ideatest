package com.aiwen.wfgwechat.entity.pojo;

import java.io.Serializable;

public class Media extends  BaseEntity implements Serializable {

    private static final long serialVersionUID = -4193253646229463796L;

    private String id;

    private String mediaId;

    private String appFlag;

    private String appVersion;

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public String getAppFlag() {
        return appFlag;
    }

    public void setAppFlag(String appFlag) {
        this.appFlag = appFlag;
    }

    public String getId() {
        return id;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
