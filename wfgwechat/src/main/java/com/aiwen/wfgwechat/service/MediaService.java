package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.pojo.Media;

import java.io.Serializable;

public interface MediaService extends BaseService<Media, Serializable> {

    Media findByVersion(Media media);

}
