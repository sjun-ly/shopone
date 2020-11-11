package com.shopone.mapper;

import com.shopone.entity.GdDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
public interface GdDetailMapper extends BaseMapper<GdDetail> {
   List<GdDetail> infoGdDeatilByID(Integer id);
}
