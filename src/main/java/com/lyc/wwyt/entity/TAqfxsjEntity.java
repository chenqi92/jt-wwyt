package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 安全风险事件表(t_aqfxsj)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全风险事件表", name = "t_aqfxsj")
@TableName("t_aqfxsj")
public class TAqfxsjEntity extends BaseEntity {

    private static final long serialVersionUID = 425391793009905507L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "风险单元ID", name = "riskUnitId", implementation = String.class, maxLength = 36)
    @NotBlank(message = "风险单元ID不能为空!")
    @Size(max = 36, message = "风险单元ID不能超过36个字符(1个汉字记两个字符)!")
    private String riskUnitId;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "风险事件名称", name = "riskEventName", implementation = String.class, maxLength = 500)
    @NotBlank(message = "风险事件名称不能为空!")
    @Size(max = 500, message = "风险事件名称不能超过500个字符(1个汉字记两个字符)!")
    private String riskEventName;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Pattern(regexp = "^\\d{9}$", message = "企业编码为小于9位的数字字符串!")
    private String companyCode;

}
