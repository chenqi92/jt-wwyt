package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.LevelEnum;
import com.lyc.wwyt.enums.StateEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * 安全活动记录表(t_aqhdjl)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全活动记录表", name = "t_aqhdjl")
@TableName("t_aqhdjl")
public class TAqhdjlEntity extends BaseEntity {

    private static final long serialVersionUID = -71820737355176512L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "活动名称", name = "name", implementation = String.class, maxLength = 50)
    @NotBlank(message = "活动名称不能为空!")
    @Size(max = 50, message = "活动名称不能超过50个字符(1个汉字记两个字符)!")
    private String name;

    @Schema(description = "召集部门", name = "departmentId", implementation = Long.class)
    @NotNull(message = "召集部门不能为空")
    private Long departmentId;

    @Schema(description = "地点", name = "location", implementation = String.class, maxLength = 50)
    @NotBlank(message = "地点不能为空!")
    @Size(max = 50, message = "地点不能超过50个字符(1个汉字记两个字符)!")
    private String location;

    @Schema(description = "活动时间", name = "time", implementation = LocalDateTime.class)
    @NotNull(message = "活动时间不能为空")
    private LocalDateTime time;

    @Schema(description = "召集人", name = "convener", implementation = String.class, maxLength = 50)
    @NotBlank(message = "召集人不能为空!")
    @Size(max = 50, message = "召集人不能超过50个字符(1个汉字记两个字符)!")
    private String convener;

    @Schema(description = "活动级别", name = "level", implementation = Integer.class, maxLength = 1)
    @EnumValueConstraint(enumClass = LevelEnum.class)
    private Integer level;

    @Schema(description = "活动内容", name = "content", implementation = String.class, maxLength = 500)
    @NotBlank(message = "活动内容不能为空!")
    @Size(max = 500, message = "活动内容不能超过500个字符(1个汉字记两个字符)!")
    private String content;

    @Schema(description = "参加人员", name = "member", implementation = String.class)
    @NotNull(message = "参加人员不能为空")
    private String member;

    @Schema(description = "状态", name = "state", implementation = Integer.class, maxLength = 1)
    @EnumValueConstraint(enumClass = StateEnum.class)
    private Integer state;

    @Schema(description = "活动照片、视频", name = "resource", implementation = String.class)
    @NotNull(message = "活动照片、视频不能为空")
    private String resource;

}
