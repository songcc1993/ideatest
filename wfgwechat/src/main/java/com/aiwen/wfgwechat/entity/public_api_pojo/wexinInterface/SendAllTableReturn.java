package com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface;

public class SendAllTableReturn {
    /*"errcode":0, 错误码
       "errmsg":"send job submission success", 错误信息
       "msg_id":34182, 消息发送任务的ID
       "msg_data_id": 206227730*/ //消息的数据ID，该字段只有在群发图文消息时，
                                // 才会出现。可以用于在图文分析数据接口中，
                               // 获取到对应的图文消息的数据，
                                // 是图文分析数据接口中的msgid字段中的前半部分，
                                // 详见图文分析数据接口中的msgid字段的介绍。
    private String msg_data_id;
    private String errcode;
    private String errmsg;
    private String msg_id;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public String getMsg_data_id() {
        return msg_data_id;
    }

    public void setMsg_data_id(String msg_data_id) {
        this.msg_data_id = msg_data_id;
    }
}
