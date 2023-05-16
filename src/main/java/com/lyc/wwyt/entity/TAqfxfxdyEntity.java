package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 安全风险分析单元表(t_aqfxfxdy)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全风险分析单元表", name = "t_aqfxfxdy")
@TableName("t_aqfxfxdy")
public class TAqfxfxdyEntity extends BaseEntity {

    private static final long serialVersionUID = -60402785782854702L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "风险分析对象编码（重大危险源）", name = "hazardCode", implementation = String.class, maxLength = 36)
    @Size(max = 36, message = "风险分析对象编码（重大危险源）不能超过36个字符(1个汉字记两个字符)!")
    private String hazardCode;

    @Schema(description = "风险分析对象编码（非重大危险源）", name = "hazardCode1", implementation = String.class, maxLength = 36)
    @Size(max = 36, message = "风险分析对象编码（非重大危险源）不能超过36个字符(1个汉字记两个字符)!")
    private String hazardCode1;

    @Schema(description = "责任部门", name = "hazardDep", implementation = String.class, maxLength = 200)
    @NotBlank(message = "责任部门不能为空!")
    @Size(max = 200, message = "责任部门不能超过200个字符(1个汉字记两个字符)!")
    private String hazardDep;

    @Schema(description = "责任人", name = "hazardLiablePerson", implementation = String.class, maxLength = 20)
    @NotBlank(message = "责任人不能为空!")
    @Size(max = 20, message = "责任人不能超过20个字符(1个汉字记两个字符)!")
    private String hazardLiablePerson;

    @Schema(description = "风险分析单元名称", name = "riskUnitName", implementation = String.class, maxLength = 200)
    @NotBlank(message = "风险分析单元名称不能为空!")
    @Size(max = 200, message = "风险分析单元名称不能超过200个字符(1个汉字记两个字符)!")
    private String riskUnitName;

    @Schema(description = "风险等级", name = "riskClass", implementation = Integer.class, maxLength = 1)
    @NotNull(message = "风险等级不能为空")
    private Integer riskClass;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companyCode;

}
