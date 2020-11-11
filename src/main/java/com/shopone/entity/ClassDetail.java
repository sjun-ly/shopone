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
@TableName("class_detail")
@ApiModel(value="ClassDetail对象", description="")
public class ClassDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "classdetail_id", type = IdType.AUTO)
    private Integer classdetailId;

    private String classdetailName;

    private Integer classifyId;

    private Integer flag;


}
