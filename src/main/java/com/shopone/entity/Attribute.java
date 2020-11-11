package com.shopone.entity;

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
@TableName("attribute")
@ApiModel(value="Attribute对象", description="")
public class Attribute implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "attribute_id", type = IdType.AUTO)
    private Integer attributeId;

    private String attributeType;

    private Integer flag;

    AttributeDetail attributeDetail;




}
