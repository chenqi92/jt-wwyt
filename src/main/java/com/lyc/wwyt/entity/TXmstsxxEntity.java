package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.XmjzqkEnum;
import com.lyc.wwyt.enums.XmstslbEnum;
import com.lyc.wwyt.enums.XmxzEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 项目三同时信息表(t_xmstsxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:19:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "项目三同时信息表", name = "t_xmstsxx")
@TableName("t_xmstsxx")
public class TXmstsxxEntity extends BaseEntity {

    private static final long serialVersionUID = -76025046954629696L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "项目名称", name = "xmmc", implementation = String.class, maxLength = 200)
    @NotBlank(message = "项目名称不能为空!")
    @Size(max = 200, message = "项目名称不能超过200个字符(1个汉字记两个字符)!")
    private String xmmc;

    @Schema(description = "项目编号", name = "xmbh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "项目编号不能为空!")
    @Size(max = 100, message = "项目编号不能超过100个字符(1个汉字记两个字符)!")
    private String xmbh;

    @Schema(description = "项目性质", name = "xmxz", implementation = Integer.class)
    @NotNull(message = "项目性质不能为空")
    @EnumValueConstraint(enumClass = XmxzEnum.class, message = "项目性质类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer xmxz;

    @Schema(description = "项目建设单位", name = "xmjsdw", implementation = String.class, maxLength = 200)
    @NotBlank(message = "项目建设单位不能为空!")
    @Size(max = 200, message = "项目建设单位不能超过200个字符(1个汉字记两个字符)!")
    private String xmjsdw;

    @Schema(description = "项目总投资", name = "xmztz", implementation = Double.class, maxLength = 10)
    @NotNull(message = "项目总投资不能为空")
    private Double xmztz;

    @Schema(description = "项目建设地点", name = "xmjsdd", implementation = String.class, maxLength = 200)
    @NotBlank(message = "项目建设地点不能为空!")
    @Size(max = 200, message = "项目建设地点不能超过200个字符(1个汉字记两个字符)!")
    private String xmjsdd;

    @Schema(description = "项目进展情况", name = "xmjzqk", implementation = Integer.class)
    @EnumValueConstraint(enumClass = XmjzqkEnum.class, message = "项目进展情况类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer xmjzqk;

    @Schema(description = "项目开工日期", name = "xmkgrq", implementation = LocalDate.class)
    @NotNull(message = "项目开工日期不能为空")
    private LocalDate xmkgrq;

    @Schema(description = "项目竣工验收日期", name = "xmjgysrq", implementation = LocalDate.class)
    @NotNull(message = "项目竣工验收日期不能为空")
    private LocalDate xmjgysrq;

    @Schema(description = "项目描述", name = "xmms", implementation = String.class)
    private String xmms;

    @Schema(description = "项目三同时类别", name = "xmstslb", implementation = String.class)
    @NotNull(message = "项目三同时类别不能为空")
    @EnumValueConstraint(enumClass = XmstslbEnum.class, message = "项目三同时类别不在指定范围内,请根据字典表定义重新输入!")
    private String xmstslb;

    @Schema(description = "附件", name = "fj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "附件不能超过1000个字符(1个汉字记两个字符)!")
    private String fj;

    @Schema(description = "附件名称", name = "fjmc", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "附件名称不能超过500个字符(1个汉字记两个字符)!")
    private String fjmc;

}
