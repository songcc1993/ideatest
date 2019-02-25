package com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface;

import java.util.HashMap;
import java.util.Map;

public class SendAllTableParam {
    private Map<String,Object> filter = new HashMap<>();
    private Map<String,Object> mpnews = new HashMap<>();
    private String msgtype;
    private String send_ignore_reprint;


    public Map<String, Object> getFilter() {
        return filter;
    }

    public void setFilter(Map<String, Object> filter) {
        this.filter = filter;
    }

    public Map<String, Object> getMpnews() {
        return mpnews;
    }

    public void setMpnews(Map<String, Object> mpnews) {
        this.mpnews = mpnews;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getSend_ignore_reprint() {
        return send_ignore_reprint;
    }

    public void setSend_ignore_reprint(String send_ignore_reprint) {
        this.send_ignore_reprint = send_ignore_reprint;
    }
    /*{
        "filter":{
        "is_to_all":false,
                "tag_id":2
    },
        "mpnews":{
        "media_id":"123dsdajkasd231jhksad"
    },
        "msgtype":"mpnews",
            "send_ignore_reprint":0
    }*/


}
