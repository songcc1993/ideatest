package com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface;

import java.util.Map;

public class PreviewReturn {

    /*"errcode":0,
     "errmsg":"preview success",
     "msg_id":34182*/
    //errcode	错误码
    private String errcode;//错误码
    private String errmsg; //错误信息
    private String msg_id; //消息ID

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
}
