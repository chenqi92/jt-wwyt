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
 * 安全培训奖惩记录表(t_aqpxjcjl)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全培训奖惩记录表", name = "t_aqpxjcjl")
@TableName("t_aqpxjcjl")
public class TAqpxjcjlEntity extends BaseEntity {

    private static final long serialVersionUID = -62674719016151371L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "奖惩内容", name = "content", implementation = String.class)
    @NotNull(message = "奖惩内容不能为空")
    private String content;

    @Schema(description = "奖惩日期", name = "date", implementation = LocalDate.class)
    @NotNull(message = "奖惩日期不能为空")
    private LocalDate date;

    @Schema(description = "奖惩费用", name = "fee", implementation = Long.class)
    @NotNull(message = "奖惩费用不能为空")
    private Long fee;

    @Schema(description = "奖惩依据", name = "basis", implementation = String.class, maxLength = 200)
    @NotBlank(message = "奖惩依据不能为空!")
    @Size(max = 200, message = "奖惩依据不能超过200个字符(1个汉字记两个字符)!")
    private String basis;

    @Schema(description = "被奖惩者名称", name = "name", implementation = String.class, maxLength = 50)
    @NotBlank(message = "被奖惩者名称不能为空!")
    @Size(max = 50, message = "被奖惩者名称不能超过50个字符(1个汉字记两个字符)!")
    private String name;

    @Schema(description = "奖惩类型", name = "type", implementation = Integer.class, maxLength = 1)
    @NotNull(message = "奖惩类型不能为空")
    private Integer type;

    @Schema(description = "审批人", name = "operatorName", implementation = String.class, maxLength = 50)
    @NotBlank(message = "审批人不能为空!")
    @Size(max = 50, message = "审批人不能超过50个字符(1个汉字记两个字符)!")
    private String operatorName;

}
