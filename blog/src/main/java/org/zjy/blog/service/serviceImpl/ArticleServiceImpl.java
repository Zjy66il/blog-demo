package org.zjy.blog.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zjy.blog.config.CustomMapper;
import org.zjy.blog.dto.ArticleDto;
import org.zjy.blog.entity.*;
import org.zjy.blog.mapper.Article2labelMapper;
import org.zjy.blog.mapper.ArticleMapper;
import org.zjy.blog.mapper.LabelMapper;
import org.zjy.blog.service.ArticleService;
import org.zjy.blog.service.LabelService;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private LabelMapper labelMapper;
    @Autowired
    private Article2labelMapper article2labelMapper;
    @Autowired
    private LabelService labelService;

    @Override
    public List<ArticleDto> getAllArticles() {
        List<Article> articleList = articleMapper.selectByExampleWithBLOBs(null);
        //System.out.println(articleList.get(0).getContent());
        List<ArticleDto> articleDtoList = new ArrayList<>();
        for(Article article : articleList){
            //System.out.println(article.getArticleId());
           // System.out.println(article.getTitle());
            //System.out.println(articleMapper.selectByPrimaryKey(article.getArticleId()).getTitle());
            ArticleDto articleDto =  Mappers.getMapper(CustomMapper.class).convert(article);
            //System.out.println(articleDto.getTitle());
            articleDtoList.add(articleDto);
        }
        return articleDtoList;
    }

    @Override
    public ArticleDto getArticleByID(int articleID) {

        Article article = articleMapper.selectByPrimaryKey(articleID);
        ArticleDto articleDto = Mappers.getMapper(CustomMapper.class).convert(article);
        return articleDto;
    }

    @Override
    public int insertArticle(Article article, String[] label) {
        articleMapper.insert(article);
        Article2label article2label = new Article2label();
        List<Article2label> labels = new ArrayList<>();
        int res = 0;
        for (int i = 0; i < label.length; i++){
            if(label[i] == "")
                continue;
            if(null == labelService.getLabelByContent(label[i])){
                labelMapper.insert(label[i]);
            }
            article2label.setArticleId(article.getArticleId());
            article2label.setLabel(label[i]);
            res = article2labelMapper.insert(article2label);
        }
        return res;
    }

    @Override
    public int deleteArticleByTD(int articleID) {

        return articleMapper.deleteByPrimaryKey(articleID);
    }

    @Override
    public int updateArticleByID(Article article) {
        Article articleEntity = articleMapper.selectByPrimaryKey(article.getArticleId());
        articleEntity.setPublicTime(article.getPublicTime());
        articleEntity.setTitle(article.getTitle());
        articleEntity.setDigest(article.getDigest());
        articleEntity.setContent(article.getContent());
        return articleMapper.updateByPrimaryKey(articleEntity);
    }

    @Override
    public int addReadNum(int articleID) {
        Article articleEntity = articleMapper.selectByPrimaryKey(articleID);
        articleEntity.setReadNum(articleEntity.getReadNum()+1);
        return articleMapper.updateByPrimaryKey(articleEntity);
    }
}
