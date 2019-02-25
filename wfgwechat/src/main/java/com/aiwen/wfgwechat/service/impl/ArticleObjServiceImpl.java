package com.aiwen.wfgwechat.service.impl;


import com.aiwen.wfgwechat.dao.ArticleObjDao;
import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.service.ArticleObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleObjServiceImpl  implements ArticleObjService {

    @Autowired
    private ArticleObjDao articleObjDao;

    //插入一个对象
    @Override
    public int insertArticle(Article article) {
        return articleObjDao.insertArticle(article);
    }

    /**
     * 根据文章属性查询一个对象是否存在
     * @param article
     * @return
     */
    @Override
    public Article findArticle(Article article) {
        return articleObjDao.findArticle(article);
    }

    /**
     * 修改状态  实现 发布  预览  撤销
     * @param article
     * @return
     */
    @Override
    public Integer updataArticle(Article article) {
        return articleObjDao.updataArticle(article);
    }
}
