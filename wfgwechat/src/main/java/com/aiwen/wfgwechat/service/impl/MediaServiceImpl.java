package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.dao.BaseMapper;
import com.aiwen.wfgwechat.dao.MediaMapper;
import com.aiwen.wfgwechat.entity.pojo.Media;
import com.aiwen.wfgwechat.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class MediaServiceImpl extends BaseServiceImpl<Media> implements MediaService {

    @Autowired
    private MediaMapper dao;
    @Override
    protected BaseMapper<Media, Serializable> getDao() {
        return dao;
    }

    @Override
    public Media findByVersion(Media media) {
        return dao.findByVersion(media);
    }
}
