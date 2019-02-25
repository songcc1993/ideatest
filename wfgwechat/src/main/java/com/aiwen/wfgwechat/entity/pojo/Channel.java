package com.aiwen.wfgwechat.entity.pojo;

import java.io.Serializable;
import java.util.Date;

public class Channel extends  BaseEntity implements Serializable {
    private static final long serialVersionUID = 7346291210954391358L;
    private String fieldItemId;

    private String fieldItemName;

    private String fieldItemValue;

    private String parentItemId;

    private String organId;

    private String groupId;

    private String start;

    public String getFieldItemId() {
        return fieldItemId;
    }

    public void setFieldItemId(String fieldItemId) {
        this.fieldItemId = fieldItemId == null ? null : fieldItemId.trim();
    }

    public String getFieldItemName() {
        return fieldItemName;
    }

    public void setFieldItemName(String fieldItemName) {
        this.fieldItemName = fieldItemName == null ? null : fieldItemName.trim();
    }

    public String getFieldItemValue() {
        return fieldItemValue;
    }

    public void setFieldItemValue(String fieldItemValue) {
        this.fieldItemValue = fieldItemValue == null ? null : fieldItemValue.trim();
    }

    public String getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId == null ? null : parentItemId.trim();
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId == null ? null : organId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }
}