package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.service.impl.ArticleObjServiceImpl;

public interface ArticleObjService {

    int insertArticle(Article article);

    Article findArticle(Article article);

    Integer updataArticle(Article article);
}
