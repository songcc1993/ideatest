package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.PreviewReturn;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.SendAllTableReturn;
import org.springframework.stereotype.Service;

import java.io.Serializable;


public interface ArticleService extends BaseService<Article, Serializable> {
//appid=APPID&secret=APPSECRET";

    public SendAllTableReturn publish(String app_id, String organ_wx_label, String appid, String secret);

    public PreviewReturn preview(String app_id, String organ_wx_label, String appid, String secret);

    public Article findByVersion(String article);

    int insert(Article article);

}
