package org.zjy.blog.config;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.zjy.blog.dto.ArticleDto;
import org.zjy.blog.dto.UserDto;
import org.zjy.blog.entity.Account;
import org.zjy.blog.entity.Article;

@Mapper(componentModel = "spring")
public interface CustomMapper {

    @Mapping(source = "articleId", target = "articleId")
    ArticleDto convert(Article article);

    //@Mapping(source = "user", target = "user")
    UserDto convert(Account account);
/*
    Dept convert(DeptDTO deptDTO);*/

}
