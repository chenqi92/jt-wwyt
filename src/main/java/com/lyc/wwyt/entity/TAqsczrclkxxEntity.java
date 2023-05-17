package com.lyc.wwyt.entity;

import java.time.LocalDate;
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
 * 安全生产责任承诺卡信息表(t_aqsczrclkxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全生产责任承诺卡信息表", name = "t_aqsczrclkxx")
@TableName("t_aqsczrclkxx")
public class TAqsczrclkxxEntity extends BaseEntity {

    private static final long serialVersionUID = 786536901648453109L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "承诺人", name = "cnr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "承诺人不能为空!")
    @Size(max = 100, message = "承诺人不能超过100个字符(1个汉字记两个字符)!")
    private String cnr;

    @Schema(description = "主管领导", name = "zgld", implementation = String.class, maxLength = 100)
    @NotBlank(message = "主管领导不能为空!")
    @Size(max = 100, message = "主管领导不能超过100个字符(1个汉字记两个字符)!")
    private String zgld;

    @Schema(description = "岗位名称", name = "gwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "岗位名称不能为空!")
    @Size(max = 100, message = "岗位名称不能超过100个字符(1个汉字记两个字符)!")
    private String gwmc;

    @Schema(description = "承诺事项", name = "cnsx", implementation = String.class, maxLength = 1000)
    @NotBlank(message = "承诺事项不能为空!")
    @Size(max = 1000, message = "承诺事项不能超过1000个字符(1个汉字记两个字符)!")
    private String cnsx;

    @Schema(description = "承诺日期", name = "cnrq", implementation = LocalDate.class)
    @NotNull(message = "承诺日期不能为空")
    private LocalDate cnrq;

    @Schema(description = "附件", name = "fj", implementation = Object.class)
    @NotNull(message = "附件不能为空")
    private Object fj;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companyCode;

}
