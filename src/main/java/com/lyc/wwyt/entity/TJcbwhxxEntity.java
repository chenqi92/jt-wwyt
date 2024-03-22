package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.JclxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 安全检查表维护信息表结构(t_jcbwhxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全检查表维护信息表结构", name = "t_jcbwhxx")
@TableName("t_jcbwhxx")
public class TJcbwhxxEntity extends BaseEntity {

    private static final long serialVersionUID = 718695572034949547L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "检查类型", name = "jclx", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = JclxEnum.class)
    private String jclx;

    @Schema(description = "检查项目", name = "jcxm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "检查项目不能为空!")
    @Size(max = 200, message = "检查项目不能超过200个字符(1个汉字记两个字符)!")
    private String jcxm;

    @Schema(description = "检查方式", name = "jcfs", implementation = String.class, maxLength = 100)
    @NotBlank(message = "检查方式不能为空!")
    @Size(max = 100, message = "检查方式不能超过100个字符(1个汉字记两个字符)!")
    private String jcfs;

    @Schema(description = "检查内容", name = "jcnr", implementation = String.class, maxLength = 500)
    @NotBlank(message = "检查内容不能为空!")
    @Size(max = 500, message = "检查内容不能超过500个字符(1个汉字记两个字符)!")
    private String jcnr;

    @Schema(description = "检查依据", name = "jcyj", implementation = String.class, maxLength = 500)
    @NotBlank(message = "检查依据不能为空!")
    @Size(max = 500, message = "检查依据不能超过500个字符(1个汉字记两个字符)!")
    private String jcyj;

    @Schema(description = "备注", name = "bz", implementation = String.class)
    private String bz;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Pattern(regexp = "^\\d{9}$", message = "企业编码为小于9位的数字字符串!")
    private String companyCode;

}
