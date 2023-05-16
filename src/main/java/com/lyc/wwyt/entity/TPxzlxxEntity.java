package com.lyc.wwyt.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 培训资料信息表(t_pxzlxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训资料信息表", name = "t_pxzlxx")
@TableName("t_pxzlxx")
public class TPxzlxxEntity extends BaseEntity {

    private static final long serialVersionUID = 912673013274801950L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "资料标题", name = "zlbt", implementation = String.class, maxLength = 200)
    @NotBlank(message = "资料标题不能为空!")
    @Size(max = 200, message = "资料标题不能超过200个字符(1个汉字记两个字符)!")
    private String zlbt;

    @Schema(description = "所属类别", name = "sslb", implementation = String.class, maxLength = 100)
    @NotBlank(message = "所属类别不能为空!")
    @Size(max = 100, message = "所属类别不能超过100个字符(1个汉字记两个字符)!")
    private String sslb;

    @Schema(description = "上传人", name = "scr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "上传人不能为空!")
    @Size(max = 100, message = "上传人不能超过100个字符(1个汉字记两个字符)!")
    private String scr;

    @Schema(description = "上传日期", name = "scrq", implementation = LocalDateTime.class)
    @NotNull(message = "上传日期不能为空")
    private LocalDateTime scrq;

    @Schema(description = "关键字", name = "gjz", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "关键字不能超过50个字符(1个汉字记两个字符)!")
    private String gjz;

    @Schema(description = "文件类型", name = "wjlx", implementation = String.class, maxLength = 100)
    @NotBlank(message = "文件类型不能为空!")
    @Size(max = 100, message = "文件类型不能超过100个字符(1个汉字记两个字符)!")
    private String wjlx;

    @Schema(description = "教程简介", name = "jcjj", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "教程简介不能超过500个字符(1个汉字记两个字符)!")
    private String jcjj;

    @Schema(description = "资料附件", name = "zlfj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "资料附件不能超过1000个字符(1个汉字记两个字符)!")
    private String zlfj;

}
