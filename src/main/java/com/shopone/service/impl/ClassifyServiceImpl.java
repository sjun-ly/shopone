package com.shopone.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shopone.entity.Classify;
import com.shopone.mapper.ClassifyMapper;
import com.shopone.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
@Service
public class ClassifyServiceImpl extends ServiceImpl<ClassifyMapper, Classify> implements ClassifyService {
    @Autowired
    ClassifyMapper classifyMapper;


    @Override
    public List<Classify> getClassifyList() {
        return classifyMapper.getClassifyList();
    }
}


