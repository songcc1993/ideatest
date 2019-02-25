package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Article;

import java.io.Serializable;

public interface ArticleMapper extends BaseMapper<Article,Serializable> {

    Article findByVersion(String version);

    int insert(Article article);
}