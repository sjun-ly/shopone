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
@TableName("gd_da")
@ApiModel(value="GdDa对象", description="")
public class GdDa implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品和商品属性连接表	")
    @TableId(value = "gd_da_id", type = IdType.AUTO)
    private Integer gdDaId;

    private Integer gdDetailId;

    private Integer gdGdattrdetailId;


}
