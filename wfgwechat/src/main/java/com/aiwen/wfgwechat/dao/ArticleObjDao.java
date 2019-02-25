package com.aiwen.wfgwechat.dao;

import com.aiwen.wfgwechat.entity.pojo.Article;
import org.springframework.stereotype.Component;

@Component
public interface ArticleObjDao {

    int insertArticle(Article article);

    Article findArticle(Article article);

    Integer updataArticle(Article article);
}
