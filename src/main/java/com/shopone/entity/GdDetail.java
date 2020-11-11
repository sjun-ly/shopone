package com.shopone.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("gd_detail")
@ApiModel(value="GdDetail对象", description="")
public class GdDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gd_detail_id", type = IdType.AUTO)
    private Integer gdDetailId;

    private String gdDetailName;

    private BigDecimal gdDetailPrice;

    private BigDecimal gdDetailRefprice;

    private String gdDetailInfo;

    private Integer gdDetailQuantity;

    private String gdDetailTime;

    private Integer gdDetailHot;

    private String gdDetailAddress;

    private String gdDetailImg;

    private String gdDetailLogo;

    private String gdDetailImgdetail;
    //查询商品属性集合
    List<GdAttribute> findGdAttributeList;

    //查询商品属性详情集合
    List<GdAttrdetail> findGdAttrDetailList;


}
