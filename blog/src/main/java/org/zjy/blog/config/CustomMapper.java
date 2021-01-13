package org.zjy.blog.config;

import org.mapstruct.Mapper;
import org.zjy.blog.dto.ArticleDto;
import org.zjy.blog.entity.Article;

@Mapper(componentModel = "spring")
public interface CustomMapper {

    ArticleDto convert(Article article);
/*
    Dept convert(DeptDTO deptDTO);*/

}
