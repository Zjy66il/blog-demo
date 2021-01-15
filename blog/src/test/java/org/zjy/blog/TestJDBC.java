package org.zjy.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zjy.blog.dto.ArticleDto;
import org.zjy.blog.entity.Article;
import org.zjy.blog.service.AccountService;
import org.zjy.blog.service.ArticleService;
import org.zjy.blog.service.LabelService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogApplication.class)
public class TestJDBC {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private LabelService labelService;

    @Autowired
    private AccountService accountService;

    @Test
    public void test(){
        System.out.println(labelService.getAllLabels());
    }

    @Test
    public void test2(){
        ArticleDto articleDto = articleService.getArticleByID(1);
        System.out.println(articleDto.getTitle());

/*        List<ArticleDto> articleList = articleService.getAllArticles();
        System.out.println(articleList.size());
        for(ArticleDto article : articleList){
            System.out.println(article.getTitle());
        }*/
        //System.out.println(accountService.get("zjy","123456"));
        //System.out.println(articleService.getArticleByID(1).getTitle());
    }
}