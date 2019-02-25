package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.pojo.Media;

import java.io.Serializable;

public interface MediaMapper  extends BaseMapper<Media,Serializable> {

    Media findByVersion(Media media);

}
