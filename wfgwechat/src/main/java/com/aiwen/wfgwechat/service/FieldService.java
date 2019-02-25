package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.pojo.Field;

import java.util.List;

public interface FieldService {

    List<Field> findByList(List<String> list);
}
