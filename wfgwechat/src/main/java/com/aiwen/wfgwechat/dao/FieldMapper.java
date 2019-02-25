package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Field;
import com.aiwen.wfgwechat.entity.pojo.FieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FieldMapper {
    List<Field> findAll();

    List<Field> findIdListByField(List<String> list);


}