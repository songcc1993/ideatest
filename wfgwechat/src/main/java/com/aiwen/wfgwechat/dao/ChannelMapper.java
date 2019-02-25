package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Channel;
import com.aiwen.wfgwechat.entity.pojo.ChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChannelMapper {
    int countByExample(ChannelExample example);

    int deleteByExample(ChannelExample example);

    int deleteByPrimaryKey(String fieldItemId);

    int insert(Channel record);

    int insertSelective(Channel record);

    List<Channel> selectByExampleWithRowbounds(ChannelExample example, RowBounds rowBounds);

    List<Channel> selectByExample(ChannelExample example);

    Channel selectByPrimaryKey(String fieldItemId);

    int updateByExampleSelective(@Param("record") Channel record, @Param("example") ChannelExample example);

    int updateByExample(@Param("record") Channel record, @Param("example") ChannelExample example);

    int updateByPrimaryKeySelective(Channel record);

    int updateByPrimaryKey(Channel record);
}