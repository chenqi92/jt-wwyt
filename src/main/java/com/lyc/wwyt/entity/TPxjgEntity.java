package com.lyc.wwyt.entity;

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
 * 培训结果表(t_pxjg)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训结果表", name = "t_pxjg")
@TableName("t_pxjg")
public class TPxjgEntity extends BaseEntity {

    private static final long serialVersionUID = 147469276431734555L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "培训主题", name = "theme", implementation = String.class, maxLength = 200)
    @NotBlank(message = "培训主题不能为空!")
    @Size(max = 200, message = "培训主题不能超过200个字符(1个汉字记两个字符)!")
    private String theme;

    @Schema(description = "培训活动", name = "activity", implementation = String.class)
    @NotNull(message = "培训活动不能为空")
    private String activity;

    @Schema(description = "培训人员", name = "member", implementation = String.class)
    @NotNull(message = "培训人员不能为空")
    private String member;

    @Schema(description = "培训结果", name = "result", implementation = String.class)
    @NotNull(message = "培训结果不能为空")
    private String result;

    @Schema(description = "培训开始时间", name = "startTime", implementation = LocalDateTime.class)
    @NotNull(message = "培训开始时间不能为空")
    private LocalDateTime startTime;

    @Schema(description = "培训结束时间", name = "endTime", implementation = LocalDateTime.class)
    @NotNull(message = "培训结束时间不能为空")
    private LocalDateTime endTime;

}
