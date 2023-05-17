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
 * 安全检查记录表(t_aqjcjl)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全检查记录表", name = "t_aqjcjl")
@TableName("t_aqjcjl")
public class TAqjcjlEntity extends BaseEntity {

    private static final long serialVersionUID = -73373981166303524L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "检查标题", name = "jcbt", implementation = String.class, maxLength = 100)
    @NotBlank(message = "检查标题不能为空!")
    @Size(max = 100, message = "检查标题不能超过100个字符(1个汉字记两个字符)!")
    private String jcbt;

    @Schema(description = "检查单编号", name = "jcdbh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "检查单编号不能为空!")
    @Size(max = 100, message = "检查单编号不能超过100个字符(1个汉字记两个字符)!")
    private String jcdbh;

    @Schema(description = "记录人员", name = "jcr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "记录人员不能为空!")
    @Size(max = 100, message = "记录人员不能超过100个字符(1个汉字记两个字符)!")
    private String jcr;

    @Schema(description = "检查日期", name = "jcrq", implementation = LocalDate.class)
    @NotNull(message = "检查日期不能为空")
    private LocalDate jcrq;

    @Schema(description = "检查组成员", name = "jczcy", implementation = String.class, maxLength = 50)
    @NotBlank(message = "检查组成员不能为空!")
    @Size(max = 50, message = "检查组成员不能超过50个字符(1个汉字记两个字符)!")
    private String jczcy;

    @Schema(description = "受检对象", name = "sjdx", implementation = String.class, maxLength = 200)
    @NotBlank(message = "受检对象不能为空!")
    @Size(max = 200, message = "受检对象不能超过200个字符(1个汉字记两个字符)!")
    private String sjdx;

    @Schema(description = "检查类型", name = "jclx", implementation = String.class, maxLength = 10)
    @NotBlank(message = "检查类型不能为空!")
    @Size(max = 10, message = "检查类型不能超过10个字符(1个汉字记两个字符)!")
    private String jclx;

    @Schema(description = "检查项目", name = "jcxm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "检查项目不能为空!")
    @Size(max = 200, message = "检查项目不能超过200个字符(1个汉字记两个字符)!")
    private String jcxm;

    @Schema(description = "检查内容", name = "jcnr", implementation = String.class, maxLength = 500)
    @NotBlank(message = "检查内容不能为空!")
    @Size(max = 500, message = "检查内容不能超过500个字符(1个汉字记两个字符)!")
    private String jcnr;

    @Schema(description = "检查结论", name = "jcjl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "检查结论不能为空!")
    @Size(max = 50, message = "检查结论不能超过50个字符(1个汉字记两个字符)!")
    private String jcjl;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companyCode;

}
