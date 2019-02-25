package com.aiwen.wfgwechat.entity.pojo;

public class ResultStatus extends  BaseEntity{
    private String id;
    private String app_code;//状态码  2	正在发送  3	发送成功！4	发送失败！
    private String appFlag;//信息标志（uuid用于查找返回数据）

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApp_code() {
        return app_code;
    }

    public void setApp_code(String app_code) {
        this.app_code = app_code;
    }

    public String getAppFlag() {
        return appFlag;
    }

    public void setAppFlag(String appFlag) {
        this.appFlag = appFlag;
    }
}
