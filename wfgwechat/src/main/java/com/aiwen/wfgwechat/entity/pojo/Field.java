package com.aiwen.wfgwechat.entity.pojo;

import java.io.Serializable;
import java.util.Date;

public class Field extends  BaseEntity implements Serializable {
    private static final long serialVersionUID = -4311152149446462236L;
    private String fieldId;

    private String fieldName;

    private String fieldCmd;

    private String fieldDataType;

    private String fieldDesc;

    private String fieldSeq;

    private String fieldFill;

    private String fieldRegular;

    private String fieldValue;

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getFieldValue() {

        return fieldValue;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public String getFieldCmd() {
        return fieldCmd;
    }

    public void setFieldCmd(String fieldCmd) {
        this.fieldCmd = fieldCmd == null ? null : fieldCmd.trim();
    }

    public String getFieldDataType() {
        return fieldDataType;
    }

    public void setFieldDataType(String fieldDataType) {
        this.fieldDataType = fieldDataType == null ? null : fieldDataType.trim();
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc == null ? null : fieldDesc.trim();
    }

    public String getFieldSeq() {
        return fieldSeq;
    }

    public void setFieldSeq(String fieldSeq) {
        this.fieldSeq = fieldSeq == null ? null : fieldSeq.trim();
    }

    public String getFieldFill() {
        return fieldFill;
    }

    public void setFieldFill(String fieldFill) {
        this.fieldFill = fieldFill == null ? null : fieldFill.trim();
    }

    public String getFieldRegular() {
        return fieldRegular;
    }

    public void setFieldRegular(String fieldRegular) {
        this.fieldRegular = fieldRegular == null ? null : fieldRegular.trim();
    }

}