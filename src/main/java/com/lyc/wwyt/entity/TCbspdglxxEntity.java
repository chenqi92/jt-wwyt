package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.KhjgEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 承包商评定管理信息表(t_cbspdglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商评定管理信息表", name = "t_cbspdglxx")
@TableName("t_cbspdglxx")
public class TCbspdglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 250793510471377981L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "标题", name = "bt", implementation = String.class, maxLength = 100)
    @NotBlank(message = "标题不能为空!")
    @Size(max = 100, message = "标题不能超过100个字符(1个汉字记两个字符)!")
    private String bt;

    @Schema(description = "承包商ID(承包商t_cbsglxx表id)", name = "bkhcbs", implementation = String.class, maxLength = 36)
    @NotBlank(message = "承包商ID不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    private String bkhcbs;

    @Schema(description = "考核部门", name = "khbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "考核部门不能为空!")
    @Size(max = 200, message = "考核部门不能超过200个字符(1个汉字记两个字符)!")
    private String khbm;

    @Schema(description = "考核日期", name = "khrq", implementation = LocalDate.class)
    @NotNull(message = "考核日期不能为空")
    private LocalDate khrq;

    @Schema(description = "总分", name = "zf", implementation = Long.class)
    @NotNull(message = "总分不能为空")
    private Long zf;

    @Schema(description = "考核结果", name = "khjg", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = KhjgEnum.class)
    private String khjg;

    @Schema(description = "审批前类别", name = "spqlb", implementation = String.class, maxLength = 100)
    @NotBlank(message = "审批前类别不能为空!")
    @Size(max = 100, message = "审批前类别不能超过100个字符(1个汉字记两个字符)!")
    private String spqlb;

    @Schema(description = "审批认定类别", name = "sprdlb", implementation = String.class, maxLength = 100)
    @NotBlank(message = "审批认定类别不能为空!")
    @Size(max = 100, message = "审批认定类别不能超过100个字符(1个汉字记两个字符)!")
    private String sprdlb;

    @Schema(description = "承包商所在厂区", name = "cbsszcq", implementation = String.class, maxLength = 100)
    @NotBlank(message = "承包商所在厂区不能为空!")
    @Size(max = 100, message = "承包商所在厂区不能超过100个字符(1个汉字记两个字符)!")
    private String cbsszcq;

    @Schema(description = "承包商在厂状态", name = "cbszczt", implementation = String.class, maxLength = 100)
    @NotBlank(message = "承包商在厂状态不能为空!")
    @Size(max = 100, message = "承包商在厂状态不能超过100个字符(1个汉字记两个字符)!")
    private String cbszczt;

}
