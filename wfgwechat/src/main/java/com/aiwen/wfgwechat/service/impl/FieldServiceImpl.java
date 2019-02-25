package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.dao.FieldMapper;
import com.aiwen.wfgwechat.entity.pojo.Field;
import com.aiwen.wfgwechat.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldServiceImpl implements FieldService {

    @Autowired
    private FieldMapper fieldMapper;


    @Override
    public List<Field> findByList(List<String> list) {
        return fieldMapper.findIdListByField(list);
    }



}
