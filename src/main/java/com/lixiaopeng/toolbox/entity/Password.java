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
 * 密码信息记录表
 * </p>
 *
 * @author lixiaopeng
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("password")
@ApiModel(value="Password对象", description="密码信息记录表")
public class Password implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "网站用户名")
    private String username;

    @ApiModelProperty(value = "网站链接")
    private String websiteUrl;

    @ApiModelProperty(value = "网站名称")
    private String websiteName;

    @ApiModelProperty(value = "网站密码")
    private String password;

    @ApiModelProperty(value = "创建时间 ")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "备注")
    private String remark;


}
