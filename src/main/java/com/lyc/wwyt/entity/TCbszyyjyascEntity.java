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
import java.time.LocalDateTime;

/**
 * 承包商作业应急预案审查表(t_cbszyyjyasc)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商作业应急预案审查表", name = "t_cbszyyjyasc")
@TableName("t_cbszyyjyasc")
public class TCbszyyjyascEntity extends BaseEntity {

    private static final long serialVersionUID = -23896973537704676L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "承包商名称", name = "contractorName", implementation = String.class, maxLength = 100)
    @NotBlank(message = "承包商名称不能为空!")
    @Size(max = 100, message = "承包商名称不能超过100个字符(1个汉字记两个字符)!")
    private String contractorName;

    @Schema(description = "作业名称", name = "jobName", implementation = String.class, maxLength = 100)
    @NotBlank(message = "作业名称不能为空!")
    @Size(max = 100, message = "作业名称不能超过100个字符(1个汉字记两个字符)!")
    private String jobName;

    @Schema(description = "作业规程内容", name = "content", implementation = String.class)
    @NotNull(message = "作业规程内容不能为空")
    private String content;

    @Schema(description = "存在问题分析", name = "problemAnalysis", implementation = String.class)
    @NotNull(message = "存在问题分析不能为空")
    private String problemAnalysis;

    @Schema(description = "改进意见", name = "improvements", implementation = String.class)
    @NotNull(message = "改进意见不能为空")
    private String improvements;

    @Schema(description = "整改时间", name = "rectificationTime", implementation = LocalDateTime.class)
    @NotNull(message = "整改时间不能为空")
    private LocalDateTime rectificationTime;

    @Schema(description = "评审人员", name = "assessor", implementation = String.class, maxLength = 50)
    @NotBlank(message = "评审人员不能为空!")
    @Size(max = 50, message = "评审人员不能超过50个字符(1个汉字记两个字符)!")
    private String assessor;

    @Schema(description = "评审时间", name = "reviewTime", implementation = LocalDateTime.class)
    @NotNull(message = "评审时间不能为空")
    private LocalDateTime reviewTime;

    @Schema(description = "附件", name = "appendix", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "附件不能超过1000个字符(1个汉字记两个字符)!")
    private String appendix;

}
