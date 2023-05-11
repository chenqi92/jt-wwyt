package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 类 TUserEntity
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Data
@Schema(description = "五位一体用户表", name = "TUserEntity")
@TableName("t_user")
public class TUserEntity {

    private static final long serialVersionUID = 268029960688673404L;

    @TableId(value = "user_id", type = IdType.AUTO)
    @Schema(description = "主键ID")
    private Long userId;

    @Schema(description = "用户名", name = "username", implementation = String.class)
    private String username;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "手机号")
    private String phone;

    @Schema(description = "统一社会信用代码")
    private String tyshxydm;

    @Schema(description = "公司名称")
    private String companyName;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "修改时间")
    private LocalDateTime updateTime;

    @Schema(description = "是否锁定")
    private String lockFlag;

    @Schema(description = "删除标识")
    @TableLogic
    private String deleteMark;
}
