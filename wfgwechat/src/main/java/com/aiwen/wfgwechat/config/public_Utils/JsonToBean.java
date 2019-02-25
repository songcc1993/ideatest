package com.aiwen.wfgwechat.config.public_Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonToBean {

    /**
     * json转换成对象
     */
    public static Object jsonToObj(String json, Object obj) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json,obj.getClass());
    }


    /**
     * 将对象转成json
     */
    public static String objToJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }

}
