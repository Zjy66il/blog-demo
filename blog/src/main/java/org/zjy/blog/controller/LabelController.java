package org.zjy.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zjy.blog.entity.Label;
import org.zjy.blog.service.LabelService;

import java.util.List;

@RestController
@RequestMapping("/labels")
public class LabelController {

    @Autowired
    LabelService labelService;

    @GetMapping("/")
    public List<Label> getAllLabels(){
        List<Label> labelList = labelService.getAllLabels();

        return labelList;
    }

    @GetMapping("/{content}")
    public Label getLabelByID(@PathVariable String content){
        Label label = labelService.getLabelByContent(content);
        return label;
    }

    @GetMapping("/info/{content}")
    public String getLabelInfoByID(@PathVariable String content){
        Label label = labelService.getLabelByContent(content);
        return label.getLabel();
    }
}
