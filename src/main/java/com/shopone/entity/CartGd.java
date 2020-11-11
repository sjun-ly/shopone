package com.shopone.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
@TableName("cart_gd")
@ApiModel(value="CartGd对象", description="")
public class CartGd implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "购物车商品信息表")
    @TableId(value = "cart_gd_id", type = IdType.AUTO)
    private Integer cartGdId;

    private Integer cartNum;

    private Integer cartId;

    private Integer gdDetailId;

    private Integer flag;


}
