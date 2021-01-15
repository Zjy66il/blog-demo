package org.zjy.blog.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zjy.blog.dto.ArticleDto;
import org.zjy.blog.entity.Article;
import org.zjy.blog.service.ArticleService;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/")
    public List<ArticleDto> getAllArticles() {
       // List<ArticleDto> articleList = articleService.getAllArticles();
        List<ArticleDto> articleDtoList = articleService.getAllArticles();
        return articleDtoList;
    }

    @GetMapping("/{articleID}")
    public ArticleDto getArticleByID(@PathVariable int articleID) {
        //Article article = articleService.getArticleByID(articleID);
        ArticleDto articleDto = articleService.getArticleByID(articleID);
        return articleDto;
    }

    @GetMapping("/info/{articleID}")
    public String getArticleInfoByID(@PathVariable int articleID) {
        //System.out.println(articleID);
        ArticleDto articleDto = articleService.getArticleByID(articleID);
        return articleDto.getTitle();
    }

    @PostMapping("/")
    public int saveArticle(@RequestBody String data) {
        JSONObject jsonObject = new JSONObject(data);
        JSONObject jsonObject1 = jsonObject.getJSONObject("article");
        Article article = new Article();
        article.setTitle(jsonObject1.getString("title"));
        article.setContent(jsonObject1.getString("content"));
        article.setDigest(jsonObject1.getString("digest"));
        try {
            article.setPublicTime(jsonObject1.getLong("publicTime"));
        } catch (Exception e) {
            article.setPublicTime(0L);
        }
        JSONArray labels = jsonObject.getJSONArray("labels");
        String[] labelLis = new String[labels.length()];
        for (int i = 0; i < labels.length(); i++) {
            labelLis[i] = labels.getString(i);
        }
        return articleService.insertArticle(article, labelLis);
    }

    @DeleteMapping("/{articleID}")
    public int deleteArticle(@PathVariable int articleID){
        return articleService.deleteArticleByTD(articleID);
    }

    @PutMapping("/")
    public int updateArticle(@RequestBody Article article){
        return articleService.updateArticleByID(article);
    }

    @PutMapping("/read/{articleID}")
    public int addReadNum(@PathVariable int articleID){
        return articleService.addReadNum(articleID);
    }
}