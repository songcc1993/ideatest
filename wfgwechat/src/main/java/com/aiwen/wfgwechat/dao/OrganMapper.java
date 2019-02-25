package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Organ;
import com.aiwen.wfgwechat.entity.pojo.OrganExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganMapper {
    int countByExample(OrganExample example);

    int deleteByExample(OrganExample example);

    int deleteByPrimaryKey(String organId);

    int insert(Organ record);

    int insertSelective(Organ record);

    List<Organ> selectByExampleWithRowbounds(OrganExample example, RowBounds rowBounds);

    List<Organ> selectByExample(OrganExample example);

    Organ selectByPrimaryKey(String organId);

    int updateByExampleSelective(@Param("record") Organ record, @Param("example") OrganExample example);

    int updateByExample(@Param("record") Organ record, @Param("example") OrganExample example);

    int updateByPrimaryKeySelective(Organ record);

    int updateByPrimaryKey(Organ record);
}