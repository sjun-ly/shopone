package com.shopone.service;

import com.shopone.entity.AttributeDetail;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
public interface AttributeDetailService extends IService<AttributeDetail> {
    List<AttributeDetail> attriButeByid();
    List<AttributeDetail> AllSerice();

}
