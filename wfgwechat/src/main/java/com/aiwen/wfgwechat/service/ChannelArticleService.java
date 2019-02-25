package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.entity.pojo.ChannelArticle;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;

import java.io.Serializable;
import java.util.List;

public interface ChannelArticleService extends BaseService<ChannelArticle, Serializable> {

    Integer insertList(List<Attachment> list);
}
