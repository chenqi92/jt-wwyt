package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.SfyyxqEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 供应商管理信息表(t_gysglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "供应商管理信息表", name = "t_gysglxx")
@TableName("t_gysglxx")
public class TGysglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 118761698038374690L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "供应商公司名称", name = "gysgsmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "供应商公司名称不能为空!")
    @Size(max = 100, message = "供应商公司名称不能超过100个字符(1个汉字记两个字符)!")
    private String gysgsmc;

    @Schema(description = "供应商类型", name = "gyslx", implementation = String.class, maxLength = 100)
    @NotBlank(message = "供应商类型不能为空!")
    @Size(max = 100, message = "供应商类型不能超过100个字符(1个汉字记两个字符)!")
    private String gyslx;

    @Schema(description = "公司地址", name = "gsdz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "公司地址不能为空!")
    @Size(max = 100, message = "公司地址不能超过100个字符(1个汉字记两个字符)!")
    private String gsdz;

    @Schema(description = "联系人", name = "lxr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "联系人不能为空!")
    @Size(max = 100, message = "联系人不能超过100个字符(1个汉字记两个字符)!")
    private String lxr;

    @Schema(description = "联系电话", name = "lxdh", implementation = String.class, maxLength = 11)
    @NotBlank(message = "联系电话不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "手机号码格式不正确!")
    private String lxdh;

    @Schema(description = "供应商风险评级", name = "gysfxpj", implementation = String.class, maxLength = 100)
    @NotBlank(message = "供应商风险评级不能为空!")
    @Size(max = 100, message = "供应商风险评级不能超过100个字符(1个汉字记两个字符)!")
    private String gysfxpj;

    @Schema(description = "供应商类别", name = "gyslb", implementation = String.class, maxLength = 100)
    @NotBlank(message = "供应商类别不能为空!")
    @Size(max = 100, message = "供应商类别不能超过100个字符(1个汉字记两个字符)!")
    private String gyslb;

    @Schema(description = "邮政编码", name = "yzbm", implementation = String.class, maxLength = 6)
    @NotBlank(message = "邮政编码不能为空!")
    @Size(max = 6, message = "邮政编码不能超过6个字符(1个汉字记两个字符)!")
    private String yzbm;

    @Schema(description = "经营范围", name = "jyfw", implementation = String.class, maxLength = 2000)
    @NotBlank(message = "经营范围不能为空!")
    @Size(max = 2000, message = "经营范围不能超过2000个字符(1个汉字记两个字符)!")
    private String jyfw;

    @Schema(description = "公司描述(没有填:无)", name = "gsms", implementation = String.class)
    @NotNull(message = "公司描述不能为空")
    private String gsms;

    @Schema(description = "考核日期", name = "khrq", implementation = LocalDate.class)
    @NotNull(message = "考核日期不能为空")
    private LocalDate khrq;

    @Schema(description = "总分", name = "zf", implementation = Long.class)
    @NotNull(message = "总分不能为空")
    private Long zf;

    @Schema(description = "考核结果", name = "khjg", implementation = String.class, maxLength = 100)
    @NotBlank(message = "考核结果不能为空!")
    @Size(max = 100, message = "考核结果不能超过100个字符(1个汉字记两个字符)!")
    private String khjg;

    @Schema(description = "证书名称", name = "zsmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "证书名称不能为空!")
    @Size(max = 100, message = "证书名称不能超过100个字符(1个汉字记两个字符)!")
    private String zsmc;

    @Schema(description = "证书编号", name = "zsbh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "证书编号不能为空!")
    @Size(max = 100, message = "证书编号不能超过100个字符(1个汉字记两个字符)!")
    private String zsbh;

    @Schema(description = "是否有有效期", name = "sfyyxq", implementation = Integer.class, maxLength = 1)
    @EnumValueConstraint(enumClass = SfyyxqEnum.class)
    private Integer sfyyxq;

    @Schema(description = "取证日期", name = "qzrq", implementation = LocalDate.class)
    @NotNull(message = "取证日期不能为空")
    private LocalDate qzrq;

    @Schema(description = "到期日期", name = "dqrq", implementation = LocalDate.class)
    @NotNull(message = "到期日期不能为空")
    private LocalDate dqrq;

    @Schema(description = "标题", name = "bt", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "标题不能超过100个字符(1个汉字记两个字符)!")
    private String bt;

    @Schema(description = "考核部门", name = "khbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "考核部门不能为空!")
    @Size(max = 200, message = "考核部门不能超过200个字符(1个汉字记两个字符)!")
    private String khbm;

}
