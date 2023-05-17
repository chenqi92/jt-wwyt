package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.Classify1Enum;
import com.lyc.wwyt.enums.Classify2Enum;
import com.lyc.wwyt.enums.DataSrcEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 安全风险管控措施表结构(t_aqfxgkcs)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全风险管控措施表结构", name = "t_aqfxgkcs")
@TableName("t_aqfxgkcs")
public class TAqfxgkcsEntity extends BaseEntity {

    private static final long serialVersionUID = 852236574190830204L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "风险事件ID", name = "riskEventId", implementation = String.class, maxLength = 36)
    @NotBlank(message = "风险事件ID不能为空!")
    @Size(max = 36, message = "风险事件ID不能超过36个字符(1个汉字记两个字符)!")
    private String riskEventId;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "管控方式", name = "dataSrc", implementation = String.class, maxLength = 2)
    @EnumValueConstraint(enumClass = DataSrcEnum.class)
    private String dataSrc;

    @Schema(description = "管控措施描述", name = "riskMeasureDesc", implementation = String.class, maxLength = 4000)
    @NotBlank(message = "管控措施描述不能为空!")
    @Size(max = 4000, message = "管控措施描述不能超过4000个字符(1个汉字记两个字符)!")
    private String riskMeasureDesc;

    @Schema(description = "管控措施分类1", name = "classify1", implementation = String.class, maxLength = 2)
    @EnumValueConstraint(enumClass = Classify1Enum.class)
    private String classify1;

    @Schema(description = "管控措施分类2", name = "classify2", implementation = String.class, maxLength = 4)
    @EnumValueConstraint(enumClass = Classify2Enum.class)
    private String classify2;

    @Schema(description = "管控措施分类3", name = "classify3", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "管控措施分类3不能超过100个字符(1个汉字记两个字符)!")
    private String classify3;

    @Schema(description = "隐患排查内容", name = "troubleshootContent", implementation = String.class)
    @NotNull(message = "隐患排查内容不能为空")
    private String troubleshootContent;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Pattern(regexp = "^\\d{9}$", message = "企业编码为小于9位的数字字符串!")
    private String companyCode;

}
