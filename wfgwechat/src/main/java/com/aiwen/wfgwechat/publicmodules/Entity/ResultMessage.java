package com.aiwen.wfgwechat.publicmodules.Entity;

public class ResultMessage {
    private Object data;  //保存数据
    private boolean result = Constant.TREU; //返回结果的状态  true  成功   fasle  失败 默认成功
    private String status =Constant.STATUS_200;//返回结果的状态码  200  成功   500  失败 默认成功
    private String message;//返回结果的信息  这个看需求填写


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }
    public String getStatus() {
        return status;
    }
}
