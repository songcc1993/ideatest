package com.aiwen.wfgwechat.config.public_Utils;

import com.aiwen.wfgwechat.dao.FieldMapper;
import com.aiwen.wfgwechat.entity.pojo.Field;
import com.aiwen.wfgwechat.entity.public_api_pojo.Articles;
import com.aiwen.wfgwechat.entity.public_api_pojo.RequestField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetAttributes {

    @Autowired
    private static FieldMapper fieldMapper;

    /**
     * 根据field_id获取文章属性信息，将属性信息进行拼装
     * @param fieldList
     * @param publicApi
     */
    public static void getAttributes(List<RequestField> fieldList, RequestField publicApi,Articles articles ){

        //标题头
       // articles.setTitle(publicApi.getApp_title());
        //文章内容
       // articles.setContent(publicApi.getApp_content());
        //文章描述
       // articles.setAuthor(publicApi.getApp_descride());
        List<String> filedIdList = new ArrayList<>();

        for(int i = 0 ; i < fieldList.size() ; i++){
            filedIdList.add(fieldList.get(i).getField_id());
        }
        List<Field> idListByField = fieldMapper.findIdListByField(filedIdList);
        for(int j = 0 ; j <idListByField.size() ; j++){
            System.out.println(idListByField.get(j));
        }


    }
}
