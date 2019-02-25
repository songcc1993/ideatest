package com.aiwen.wfgwechat.entity.public_api_pojo;

import java.io.Serializable;

/**
 * 联子推送信息  fieldid  和value 的对象
 */
public class RequestField implements Serializable {

    private static final long serialVersionUID = -4596724093463612669L;

    private String field_id;

    private String field_value;

    private String field_name;

    @Override
    public String toString() {
        return "Field{" +
                "field_id='" + field_id + '\'' +
                ", field_value='" + field_value + '\'' +
                ", field_name='" + field_name + '\'' +
                '}';
    }

    public void setField_name(String field_name) {
        this.field_name = field_name;
    }

    public String getField_name() {
        return field_name;
    }

    public void setField_id(String field_id) {
        this.field_id = field_id;
    }

    public void setField_value(String field_value) {
        this.field_value = field_value;
    }

    public String getField_id() {
        return field_id;
    }

    public String getField_value() {
        return field_value;
    }
}
