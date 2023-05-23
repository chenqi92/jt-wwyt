package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.ApplyStatusEnum;
import com.lyc.wwyt.enums.PlanTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 开停车大检修(t_shutdown_exam)表实体类
 *
 * @author chenqi
 * @since 2023-05-23 11:07:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "开停车大检修", name = "t_shutdown_exam")
@TableName("t_shutdown_exam")
public class TShutdownExamEntity extends BaseEntity {

    private static final long serialVersionUID = 557959070795892804L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "方案名称", name = "planName", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "方案名称不能超过255个字符(1个汉字记两个字符)!")
    private String planName;

    @Schema(description = "类型 1:开车  2：停车  3：检修", name = "planType", implementation = Integer.class, maxLength = 2)
    @EnumValueConstraint(enumClass = PlanTypeEnum.class)
    private Integer planType;

    @Schema(description = "开始日期", name = "startTime", implementation = LocalDate.class)
    private LocalDate startTime;

    @Schema(description = "结束日期", name = "endTime", implementation = LocalDate.class)
    private LocalDate endTime;

    @Schema(description = "方案描述", name = "planDescription", implementation = String.class, maxLength = 2200)
    @Size(max = 2200, message = "方案描述不能超过2200个字符(1个汉字记两个字符)!")
    private String planDescription;

    @Schema(description = "装置名称", name = "facilityName", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "装置名称不能超过255个字符(1个汉字记两个字符)!")
    private String facilityName;

    @Schema(description = "申请人", name = "applyPerson", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "申请人不能超过255个字符(1个汉字记两个字符)!")
    private String applyPerson;

    @Schema(description = "申请时间", name = "applyTime", implementation = LocalDateTime.class)
    private LocalDateTime applyTime;

    @Schema(description = "状态 1：未开始    2：进行中   3：已结束", name = "applyStatus", implementation = Integer.class, maxLength = 2)
    @EnumValueConstraint(enumClass = ApplyStatusEnum.class)
    private Integer applyStatus;

    @Schema(description = "协议附件", name = "xyfjmcfj", implementation = String.class, maxLength = 1000)
    @NotBlank(message = "协议附件不能为空!")
    @Size(max = 1000, message = "协议附件不能超过1000个字符(1个汉字记两个字符)!")
    private String xyfjmcfj;

}
