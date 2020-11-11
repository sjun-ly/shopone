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
@TableName("order_user")
@ApiModel(value="OrderUser对象", description="")
public class OrderUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_user_id", type = IdType.AUTO)
    private Integer orderUserId;

    private Integer orderId;


}
