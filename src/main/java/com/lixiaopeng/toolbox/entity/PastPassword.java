package com.lixiaopeng.toolbox.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 以往的密码记录表
 * </p>
 *
 * @author lixiaopeng
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("past_password")
@ApiModel(value="PastPassword对象", description="以往的密码记录表")
public class PastPassword implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "以往的密码")
    private String password;

    @ApiModelProperty(value = "关联用户表的id")
    private Integer userId;

    @ApiModelProperty(value = "以往密码的入表时间")
    private LocalDateTime insertTime;

    @ApiModelProperty(value = "以往密码在用户表里面的创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "备注")
    private String remark;


}
