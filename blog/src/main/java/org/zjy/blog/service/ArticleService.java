package org.zjy.blog.service;

import org.zjy.blog.dto.ArticleDto;
import org.zjy.blog.entity.Article;

import java.util.List;

public interface ArticleService {

    // 得到所有的文章
    //List<Article> getAllArticles();
    List<ArticleDto> getAllArticles();

    // 根据id得到文章
    ArticleDto getArticleByID(int articleID);

    // 添加文章
    int insertArticle(Article article,String []label);

    // 根据ID删除文章
    int deleteArticleByTD(int articleID);

    // 根据ID更新文章
    int updateArticleByID(Article article);

    // 访问量++
    int addReadNum(int articleID);
}
