package com.aiwen.wfgwechat.controller;


import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping("/id")
    public Article findById(String id){
        Article byId = articleService.findById(id);
        return byId;
    }
}
