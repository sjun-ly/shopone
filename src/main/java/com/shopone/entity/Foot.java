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
@TableName("foot")
@ApiModel(value="Foot对象", description="")
public class Foot implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "foot_id", type = IdType.AUTO)
    private Integer footId;

    private String footTime;

    private Integer gdId;

    private Integer userId;

    private Integer flag;


}
