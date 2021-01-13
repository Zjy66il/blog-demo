package org.zjy.blog.service;

import org.zjy.blog.entity.Label;

import java.util.List;

public interface LabelService {

    // 得到所有标签
    List<Label> getAllLabels();

    // 根据ID获得标签
    Label getLabelByContent(String content);

    Boolean insertLabel(String label);
}
