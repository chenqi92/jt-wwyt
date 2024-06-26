package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.JgdwEnum;
import com.lyc.wwyt.enums.QtlxEnum;
import com.lyc.wwyt.enums.ZylxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * 受限空间作业气体分析数据表(t_sxkjzy_qtfx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 15:55:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业气体分析数据表", name = "t_sxkjzy_qtfx")
@TableName("t_sxkjzy_qtfx")
public class TSxkjzyQtfxEntity extends BaseEntity {

    private static final long serialVersionUID = -34104283823777741L;

    @Schema(description = "主键ID", name = "id", implementation = String.class, maxLength = 36)
    @NotBlank(message = "主键ID不能为空!")
    @Size(max = 36, message = "主键ID不能超过36个字符(1个汉字记两个字符)!")
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
