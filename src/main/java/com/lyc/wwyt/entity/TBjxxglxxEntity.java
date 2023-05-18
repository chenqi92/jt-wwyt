package com.lyc.wwyt.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.BjlxEnum;
import com.lyc.wwyt.enums.GldxlxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 报警信息管理信息表(t_bjxxglxx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 16:32:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "报警信息管理信息表", name = "t_bjxxglxx")
@TableName("t_bjxxglxx")
public class TBjxxglxxEntity extends BaseEntity {

    private static final long serialVersionUID = -75811838096248844L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "报警区域id", name = "bjqybh", implementation = String.class, maxLength = 36)
    @NotBlank(message = "报警区域id不能为空!")
    @Size(max = 36, message = "报警区域id不能超过36个字符(1个汉字记两个字符)!")
    private String bjqybh;

    @Schema(description = "报警人员姓名", name = "bjryxm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "报警人员姓名不能为空!")
    @Size(max = 100, message = "报警人员姓名不能超过100个字符(1个汉字记两个字符)!")
    private String bjryxm;

    @Schema(description = "报警人员位置经度（度）", name = "bjrywzjd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "报警人员位置经度（度）不能为空")
    private Double bjrywzjd;

    @Schema(description = "报警人员位置纬度（度）", name = "bjrywzwd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "报警人员位置纬度（度）不能为空")
    private Double bjrywzwd;

    @Schema(description = "报警时间", name = "bjsj", implementation = LocalDateTime.class)
    @NotNull(message = "报警时间不能为空")
    private LocalDateTime bjsj;

    @Schema(description = "报警类型", name = "bjlx", implementation = Object.class)
    @NotNull(message = "报警类型不能为空")
    @EnumValueConstraint(enumClass = BjlxEnum.class, message = "报警类型不在指定范围内,请根据字典表定义重新输入!")
    private Object bjlx;

    @Schema(description = "报警处置时间", name = "bjczsj", implementation = LocalDateTime.class)
    private LocalDateTime bjczsj;

    @Schema(description = "报警处置人员", name = "bjczry", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "报警处置人员不能超过200个字符(1个汉字记两个字符)!")
    private String bjczry;

    @Schema(description = "报警处置结果", name = "bjczjg", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "报警处置结果不能超过500个字符(1个汉字记两个字符)!")
    private String bjczjg;

    @Schema(description = "告警记录", name = "bjjl", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "告警记录不能超过1000个字符(1个汉字记两个字符)!")
    private String bjjl;

}
