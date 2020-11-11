package com.shopone.service;

import com.shopone.entity.Classify;
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
public interface ClassifyService extends IService<Classify> {
    List<Classify> getClassifyList();
}
