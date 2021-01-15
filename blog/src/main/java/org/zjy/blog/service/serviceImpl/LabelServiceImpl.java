package org.zjy.blog.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zjy.blog.entity.Label;
import org.zjy.blog.entity.LabelExample;
import org.zjy.blog.mapper.LabelMapper;
import org.zjy.blog.service.LabelService;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelMapper labelMapper;

    @Override
    public List<Label> getAllLabels() {
        return labelMapper.selectByExample(null);
    }

    @Override
    public Label getLabelByContent(String content) {
        LabelExample example = new LabelExample();
        LabelExample.Criteria criteria = example.createCriteria();
        criteria.andLabelEqualTo(content);
        List<Label> labelList = labelMapper.selectByExample(example);
        if(!labelList.isEmpty()){
            return labelList.get(0);
        }
        return null;
    }

    @Override
    public Boolean insertLabel(String label){
        Integer result = labelMapper.insertSelective(label);
        return 1 == result ? true : false;
    }
}
