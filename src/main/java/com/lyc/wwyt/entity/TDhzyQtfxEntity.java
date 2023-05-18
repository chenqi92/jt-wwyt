package com.lyc.wwyt.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.DqztEnum;
import com.lyc.wwyt.enums.JgdwEnum;
import com.lyc.wwyt.enums.QtlxEnum;
import com.lyc.wwyt.enums.ZylxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 动火作业气体分析数据表(t_dhzy_qtfx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 15:54:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业气体分析数据表", name = "t_dhzy_qtfx")
@TableName("t_dhzy_qtfx")
public class TDhzyQtfxEntity extends BaseEntity {

    private static final long serialVersionUID = 995293854423761074L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "关联作业ID", name = "zyid", implementation = String.class, maxLength = 36)
    @NotBlank(message = "关联作业ID不能为空!")
    @Size(max = 36, message = "关联作业ID不能超过36个字符(1个汉字记两个字符)!")
    private String zyid;

    @Schema(description = "关联作业类型", name = "zylx", implementation = Object.class)
    @NotNull(message = "关联作业类型不能为空")
    @EnumValueConstraint(enumClass = ZylxEnum.class, message = "关联作业类型不在指定范围内,请根据字典表定义重新输入!")
    private Object zylx;

    @Schema(description = "气体类型", name = "qtlx", implementation = Integer.class)
    @NotNull(message = "气体类型不能为空")
    @EnumValueConstraint(enumClass = QtlxEnum.class, message = "气体类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer qtlx;

    @Schema(description = "代表性气体名称", name = "qtmc", implementation = String.class, maxLength = 50)
    @NotBlank(message = "代表性气体名称不能为空!")
    @Size(max = 50, message = "代表性气体名称不能超过50个字符(1个汉字记两个字符)!")
    private String qtmc;

    @Schema(description = "分析结果", name = "fxjg", implementation = Double.class, maxLength = 4)
    @NotNull(message = "分析结果不能为空")
    private Double fxjg;

    @Schema(description = "分析结果单位", name = "jgdw", implementation = Integer.class)
    @NotNull(message = "分析结果单位不能为空")
    @EnumValueConstraint(enumClass = JgdwEnum.class, message = "分析结果单位类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer jgdw;

    @Schema(description = "分析人", name = "fxr", implementation = String.class, maxLength = 50)
    @NotBlank(message = "分析人不能为空!")
    @Size(max = 50, message = "分析人不能超过50个字符(1个汉字记两个字符)!")
    private String fxr;

    @Schema(description = "分析时间", name = "fxsj", implementation = LocalDateTime.class)
    @NotNull(message = "分析时间不能为空")
    private LocalDateTime fxsj;

    @Schema(description = "采样分析部位", name = "cyfxbw", implementation = String.class, maxLength = 50)
    @NotBlank(message = "采样分析部位不能为空!")
    @Size(max = 50, message = "采样分析部位不能超过50个字符(1个汉字记两个字符)!")
    private String cyfxbw;

}
