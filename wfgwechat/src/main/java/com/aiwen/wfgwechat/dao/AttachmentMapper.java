package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.entity.pojo.AttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

@Component
public interface AttachmentMapper {
    int countByExample(AttachmentExample example);

    int deleteByExample(AttachmentExample example);

    int deleteByPrimaryKey(String attachmentId);

    int insert(Attachment record);

    int insertSelective(Attachment record);

    List<Attachment> selectByExampleWithRowbounds(AttachmentExample example, RowBounds rowBounds);

    List<Attachment> selectByExample(AttachmentExample example);

    Attachment selectByPrimaryKey(String attachmentId);

    int updateByExampleSelective(@Param("record") Attachment record, @Param("example") AttachmentExample example);

    int updateByExample(@Param("record") Attachment record, @Param("example") AttachmentExample example);

    int updateByPrimaryKeySelective(Attachment record);

    int updateByPrimaryKey(Attachment record);

    int insertList (List<Attachment> attachmentList);

    int save(Attachment attachment);
}