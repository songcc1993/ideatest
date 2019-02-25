package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.config.public_Utils.EnumData;
import com.aiwen.wfgwechat.config.public_Utils.PublicUtil;
import com.aiwen.wfgwechat.dao.ArticleMapper;
import com.aiwen.wfgwechat.dao.BaseMapper;
import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.public_api_pojo.PublicToken;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.PreviewReturn;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.SendAllTableReturn;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.publicmodules.util.WeiXinUtil;
import com.aiwen.wfgwechat.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article> implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    protected BaseMapper<Article, Serializable> getDao() {
        return articleMapper;
    }

    @Override
    public SendAllTableReturn publish(String app_id, String organ_wx_label,String appid,String secret) {
        SendAllTableReturn sendAllTableReturn = WeiXinUtil.sendAll(EnumData.PUBLIC_API_SENDMESSAGE, app_id, organ_wx_label, appid, secret);
        return sendAllTableReturn;
    }

    @Override
    public PreviewReturn preview(String app_id, String organ_wx_user, String appid, String secret) {
        PreviewReturn preview =null;
        if(organ_wx_user!=null&&!"".equals(organ_wx_user)){
            String[] split = organ_wx_user.split(",");
            if(split!=null&&split.length>0){

                ResultMessage rm = PublicUtil.getToken(appid, secret);
                PublicToken data = (PublicToken)rm.getData();

                String token=data.getAccess_token();
                for(String item:split){
                    preview = WeiXinUtil.newPreview(EnumData.PUBLIC_API_PREVIEW, app_id, item,token, true);
                    String errcode = preview.getErrcode();
                    if(!"0".equals(errcode)){
                        return preview;
                    }
                }

            }
        }
        return preview;
    }

    @Override
    public Article findByVersion(String article) {
        return articleMapper.findByVersion(article);
    }

    @Override
    public int insert(Article article) {
        return articleMapper.insert(article);
    }
}
