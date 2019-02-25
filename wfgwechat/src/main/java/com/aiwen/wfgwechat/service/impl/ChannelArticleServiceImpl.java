package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.dao.BaseMapper;
import com.aiwen.wfgwechat.dao.ChannelArticleMapper;
import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.entity.pojo.ChannelArticle;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.service.ChannelArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ChannelArticleServiceImpl extends BaseServiceImpl<ChannelArticle> implements ChannelArticleService {

    @Autowired
    private ChannelArticleMapper mapper;

    @Override
    protected BaseMapper<ChannelArticle, Serializable> getDao() {
        return mapper;
    }


    @Override
    public Integer insertList(List<Attachment> list) {
        return mapper.insertList(list);
    }
}
