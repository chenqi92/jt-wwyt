package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.SffbEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 安全活动信息表(t_aqhdxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全活动信息表", name = "t_aqhdxx")
@TableName("t_aqhdxx")
public class TAqhdxxEntity extends BaseEntity {

    private static final long serialVersionUID = 598937847055373174L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "活动标题", name = "hdbt", implementation = String.class, maxLength = 200)
    @NotBlank(message = "活动标题不能为空!")
    @Size(max = 200, message = "活动标题不能超过200个字符(1个汉字记两个字符)!")
    private String hdbt;

    @Schema(description = "活动日期", name = "hdrq", implementation = LocalDate.class)
    @NotNull(message = "活动日期不能为空")
    private LocalDate hdrq;

    @Schema(description = "活动地点", name = "hddd", implementation = String.class, maxLength = 200)
    @NotBlank(message = "活动地点不能为空!")
    @Size(max = 200, message = "活动地点不能超过200个字符(1个汉字记两个字符)!")
    private String hddd;

    @Schema(description = "活动主持人", name = "hdzcr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "活动主持人不能为空!")
    @Size(max = 100, message = "活动主持人不能超过100个字符(1个汉字记两个字符)!")
    private String hdzcr;

    @Schema(description = "主办部门", name = "zbbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "主办部门不能为空!")
    @Size(max = 200, message = "主办部门不能超过200个字符(1个汉字记两个字符)!")
    private String zbbm;

    @Schema(description = "主要参与人员", name = "zycyry", implementation = String.class, maxLength = 500)
    @NotBlank(message = "主要参与人员不能为空!")
    @Size(max = 500, message = "主要参与人员不能超过500个字符(1个汉字记两个字符)!")
    private String zycyry;

    @Schema(description = "是否发布", name = "sffb", implementation = Integer.class)
    @EnumValueConstraint(enumClass = SffbEnum.class)
    private Integer sffb;

    @Schema(description = "活动内容", name = "hdnr", implementation = String.class)
    private String hdnr;

    @Schema(description = "活动情况与总结", name = "hdqkyzj", implementation = String.class)
    private String hdqkyzj;

    @Schema(description = "附件", name = "fj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "附件不能超过1000个字符(1个汉字记两个字符)!")
    private String fj;

}
