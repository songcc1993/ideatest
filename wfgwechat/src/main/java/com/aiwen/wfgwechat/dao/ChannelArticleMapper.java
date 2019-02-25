package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.entity.pojo.ChannelArticle;

import java.io.Serializable;
import java.util.List;

public interface ChannelArticleMapper extends BaseMapper<ChannelArticle,Serializable> {

    Integer insertList(List<Attachment> list);
}
