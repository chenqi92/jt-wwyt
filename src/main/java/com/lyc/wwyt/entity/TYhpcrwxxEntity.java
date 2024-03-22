package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.*;

/**
 * 隐患排查任务信息表(t_yhpcrwxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "隐患排查任务信息表", name = "t_yhpcrwxx")
@TableName("t_yhpcrwxx")
public class TYhpcrwxxEntity extends BaseEntity {

    private static final long serialVersionUID = 713622294602882967L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "管控措施ID", name = "riskMeasureId", implementation = String.class, maxLength = 36)
    @NotBlank(message = "管控措施ID不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    private String riskMeasureId;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "隐患排查内容", name = "troubleshootContent", implementation = String.class, maxLength = 1000)
    @NotBlank(message = "隐患排查内容不能为空!")
    @Size(max = 1000, message = "隐患排查内容不能超过1000个字符(1个汉字记两个字符)!")
    private String troubleshootContent;

    @Schema(description = "巡检周期", name = "checkCycle", implementation = Double.class, maxLength = 4)
    @NotNull(message = "巡检周期不能为空")
    @Digits(integer = 2, fraction = 2, message = "巡检周期超出限制范围!")
    @Min(value = 0, message = "巡检周期不能小于0!")
    private Double checkCycle;

    @Schema(description = "巡检周期单位(小时、天、月、年)", name = "checkCycleUnit", implementation = String.class, maxLength = 20)
    @NotBlank(message = "巡检周期单位(小时、天、月、年)不能为空!")
    @Size(max = 20, message = "巡检周期单位(小时、天、月、年)不能超过20个字符(1个汉字记两个字符)!")
    private String checkCycleUnit;

    @Schema(description = "企业编码(化学品登记管理系统中的企业编码)", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Pattern(regexp = "^\\d{9}$", message = "企业编码为小于9位的数字字符串!")
    private String companyCode;

}
