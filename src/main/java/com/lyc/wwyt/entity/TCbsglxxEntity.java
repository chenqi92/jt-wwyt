package com.lyc.wwyt.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.CbslbEnum;
import com.lyc.wwyt.enums.CbslxEnum;
import com.lyc.wwyt.enums.SFZHMDTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 承包商管理信息表(t_cbsglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-12 15:32:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商管理信息表", name = "t_cbsglxx")
@TableName("t_cbsglxx")
public class TCbsglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 406723379518917540L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, minLength = 18, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "承包商单位名称", name = "cbsdwmc", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "承包商单位名称不能超过100个字符(50个汉字)!")
    @NotBlank(message = "承包商单位名称不能为空!")
    private String cbsdwmc;

    @Schema(description = "单位性质", name = "dwxz", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "单位性质不能超过100位字符(50个汉字)!")
    @NotBlank(message = "单位性质不能为空!")
    private String dwxz;

    @Schema(description = "承包商类别", name = "cbslb", implementation = Integer.class)
    @EnumValueConstraint(enumClass = CbslbEnum.class, message = "承包商类别不在指定范围内,请根据字典表定义重新输入!")
    private Integer cbslb;

    @Schema(description = "承包商类型", name = "cbslx", implementation = Integer.class)
    @EnumValueConstraint(enumClass = CbslxEnum.class, message = "承包商类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer cbslx;

    @Schema(description = "经营范围", name = "jyfw", implementation = String.class)
    @Size(max = 100, message = "经营范围不能超过100位字符(50个汉字)!")
    @NotBlank(message = "经营范围不能为空!")
    private String jyfw;

    @Schema(description = "承包商手机号码", name = "cbsdh", implementation = String.class)
    @NotBlank(message = "承包商手机号不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "承包商手机号码格式不正确!")
    private String cbsdh;

    @Schema(description = "邮箱", name = "yx", implementation = String.class)
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$", message = "邮箱格式不正确!")
    @Size(max = 100, message = "邮箱不能超过100个字符!")
    private String yx;

    @Schema(description = "承包商统一社会信用代码", name = "cbstyshxydm", implementation = String.class)
    @Size(min = 18, max = 18, message = "承包商统一社会信用代码必须为18位!")
    @NotBlank(message = "承包商统一社会信用代码不能为空!")
    private String cbstyshxydm;

    @Schema(description = "营业执照字号", name = "yyzzzh", implementation = String.class)
    @NotBlank(message = "营业执照字号不能为空,如果没有的话填写承包商统一社会信用代码。")
    @Size(max = 100, message = "营业执照字号不能超过100位字符")
    private String yyzzzh;

    @Schema(description = "是否在黑名单", name = "sfzhmd", implementation = Integer.class)
    @EnumValueConstraint(enumClass = SFZHMDTypeEnum.class, message = "是否在黑名单不在指定范围内,请根据字典表定义重新输入!")
    private Integer sfzhmd;

    @Schema(description = "协议附件名称", name = "xyfjmc", implementation = String.class)
    @Size(max = 500, message = "协议附件名称不能超过500位字符(250个汉字)!")
    private String xyfjmc;

    @Schema(description = "协议附件", name = "xyfjmcfj", implementation = String.class)
    @Size(max = 500, message = "协议附件不能超过1000位字符(500个汉字)!")
    private String xyfjmcfj;
}
