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
@TableName("attribute_detail")
@ApiModel(value="AttributeDetail对象", description="")
public class AttributeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "属性分类详情")
    @TableId(value = "attributedetail_id", type = IdType.AUTO)
    private Integer attributedetailId;

    private String attributedetailInfo;

    private Integer attributeId;

    private Integer flag;

    List<AttributeDetail> attributeDetails;


}
