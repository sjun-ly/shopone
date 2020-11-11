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
@TableName("class_goods")
@ApiModel(value="ClassGoods对象", description="")
public class ClassGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "class_goods_id", type = IdType.AUTO)
    private Integer classGoodsId;

    private Integer gdDetailId;

    private Integer classdetailId;

    private Integer flag;


}
