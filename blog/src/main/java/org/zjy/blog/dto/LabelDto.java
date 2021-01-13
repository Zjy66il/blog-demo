package org.zjy.blog.dto;

import lombok.Data;

import java.util.List;

@Data
public class LabelDto {

    // 值
    private String label;
    // Articles
    private List<ArticleDto> articles;
}
