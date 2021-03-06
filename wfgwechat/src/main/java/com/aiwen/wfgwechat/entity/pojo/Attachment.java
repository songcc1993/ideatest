package com.aiwen.wfgwechat.entity.pojo;

import java.io.Serializable;

public class Attachment extends  BaseEntity implements Serializable {
    private static final long serialVersionUID = -8774322491988047088L;
    private String attachment_id;

    private String attachment_name;

    private String attachment_url;

    private String attachment_size;

    private String attachment_type;

    private String attachment_extension;

    private String attachment_date;

    public String getAttachment_id() {
        return attachment_id;
    }

    public void setAttachment_id(String attachment_id) {
        this.attachment_id = attachment_id;
    }

    public String getAttachment_name() {
        return attachment_name;
    }

    public void setAttachment_name(String attachment_name) {
        this.attachment_name = attachment_name;
    }

    public String getAttachment_url() {
        return attachment_url;
    }

    public void setAttachment_url(String attachment_url) {
        this.attachment_url = attachment_url;
    }

    public String getAttachment_size() {
        return attachment_size;
    }

    public void setAttachment_size(String attachment_size) {
        this.attachment_size = attachment_size;
    }

    public String getAttachment_type() {
        return attachment_type;
    }

    public void setAttachment_type(String attachment_type) {
        this.attachment_type = attachment_type;
    }

    public String getAttachment_extension() {
        return attachment_extension;
    }

    public void setAttachment_extension(String attachment_extension) {
        this.attachment_extension = attachment_extension;
    }

    public String getAttachment_date() {
        return attachment_date;
    }

    public void setAttachment_date(String attachment_date) {
        this.attachment_date = attachment_date;
    }
}