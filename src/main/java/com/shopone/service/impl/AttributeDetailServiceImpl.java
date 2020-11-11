package com.shopone.service.impl;

import com.shopone.entity.AttributeDetail;
import com.shopone.mapper.AttributeDetailMapper;
import com.shopone.service.AttributeDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
@Service
public class AttributeDetailServiceImpl extends ServiceImpl<AttributeDetailMapper, AttributeDetail> implements AttributeDetailService {

    @Autowired
    AttributeDetailMapper attributeDetailMapper;
    @Override
    public List<AttributeDetail> attriButeByid() {
        return attributeDetailMapper.attriButeByid();
    }

    @Override
    public List<AttributeDetail> AllSerice() {
        return attributeDetailMapper.AllSerice();
    }
}
