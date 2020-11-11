package com.shopone.mapper;

import com.shopone.entity.AttributeDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
@Repository
public interface AttributeDetailMapper extends BaseMapper<AttributeDetail> {
    List<AttributeDetail> attriButeByid();
    List<AttributeDetail> AllSerice();

}
