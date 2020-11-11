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
@TableName("classify")
@ApiModel(value="Classify对象", description="")
public class Classify implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "classify_id", type = IdType.AUTO)
    private Integer classifyId;

    private String classifyName;

    private Integer flag;


}
