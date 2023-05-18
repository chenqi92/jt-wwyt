package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.config.check.RequiredIf;
import com.lyc.wwyt.enums.ScssxxWxztEnum;
import com.lyc.wwyt.enums.SmzqEnum;
import com.lyc.wwyt.enums.TyztEnum;
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
 * 生产设施信息表(t_scssxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施信息表", name = "t_scssxx")
@RequiredIf(dependentField = "sfsstqy", field = "fssstid", fieldValue = "1")
@TableName("t_scssxx")
public class TScssxxEntity extends BaseEntity {

    private static final long serialVersionUID = 633842264505334621L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "是否在四色图区域内", name = "sfsstqy", implementation = String.class, maxLength = 1)
    @NotBlank(message = "是否在四色图区域内不能为空!")
    @Size(max = 1, message = "是否在四色图区域内不能超过1个字符(1个汉字记两个字符)!")
    private String sfsstqy;

    @Schema(description = "风险四色图ID", name = "fssstid", implementation = String.class, maxLength = 36)
    @Size(max = 36, message = "风险四色图ID不能超过36个字符(1个汉字记两个字符)!")
    private String fssstid;

    @Schema(description = "装置设施名称", name = "zzssmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "装置设施名称不能为空!")
    @Size(max = 100, message = "装置设施名称不能超过100个字符(1个汉字记两个字符)!")
    private String zzssmc;

    @Schema(description = "装置设施位号", name = "zzsswh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "装置设施位号不能为空!")
    @Size(max = 100, message = "装置设施位号不能超过100个字符(1个汉字记两个字符)!")
    private String zzsswh;

    @Schema(description = "装置编码", name = "zzbm", implementation = String.class, maxLength = 17)
    @Size(max = 17, message = "装置编码不能超过17个字符(1个汉字记两个字符)!")
    private String zzbm;

    @Schema(description = "装置设施用途", name = "zzssyt", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "装置设施用途不能超过500个字符(1个汉字记两个字符)!")
    private String zzssyt;

    @Schema(description = "装置设施型号", name = "zzssxh", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "装置设施型号不能超过100个字符(1个汉字记两个字符)!")
    private String zzssxh;

    @Schema(description = "类型/类别", name = "lxlb", implementation = String.class, maxLength = 1)
    @NotBlank(message = "类型/类别不能为空!")
    @EnumValueConstraint(enumClass = XmxzEnum.class, message = "项目性质类型不在指定范围内,请根据字典表定义重新输入!")
    private String lxlb;

    @Schema(description = "单位部门", name = "dwbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "单位部门不能为空!")
    @Size(max = 200, message = "单位部门不能超过200个字符(1个汉字记两个字符)!")
    private String dwbm;

    @Schema(description = "设置部位", name = "szbw", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "设置部位不能超过100个字符(1个汉字记两个字符)!")
    private String szbw;

    @Schema(description = "生产日期", name = "scrq", implementation = LocalDate.class)
    @NotNull(message = "生产日期不能为空")
    private LocalDate scrq;

    @Schema(description = "使用期限", name = "syqx", implementation = Integer.class, maxLength = 4)
    @NotNull(message = "使用期限不能为空")
    private Integer syqx;

    @Schema(description = "生命周期", name = "smzq", implementation = Integer.class)
    @NotNull(message = "生命周期不能为空")
    @EnumValueConstraint(enumClass = SmzqEnum.class, message = "生命周期类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer smzq;

    @Schema(description = "投用日期", name = "tyrq", implementation = LocalDate.class)
    @NotNull(message = "投用日期不能为空")
    private LocalDate tyrq;

    @Schema(description = "维修状态", name = "wxzt", implementation = Integer.class)
    @NotNull(message = "维修状态不能为空")
    @EnumValueConstraint(enumClass = ScssxxWxztEnum.class, message = "维修状态类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer wxzt;

    @Schema(description = "停用状态", name = "tyzt", implementation = Integer.class)
    @NotNull(message = "停用状态不能为空")
    @EnumValueConstraint(enumClass = TyztEnum.class, message = "停用状态类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer tyzt;

    @Schema(description = "上次检查日期", name = "scjcrq", implementation = LocalDate.class)
    @NotNull(message = "上次检查日期不能为空")
    private LocalDate scjcrq;

    @Schema(description = "上次检测日期", name = "scjcrq1", implementation = LocalDate.class)
    @NotNull(message = "上次检测日期不能为空")
    private LocalDate scjcrq1;

    @Schema(description = "上次保养日期", name = "scbyrq", implementation = LocalDate.class)
    @NotNull(message = "上次保养日期不能为空")
    private LocalDate scbyrq;

    @Schema(description = "下次检查日期", name = "xcjcrq", implementation = LocalDate.class)
    @NotNull(message = "下次检查日期不能为空")
    private LocalDate xcjcrq;

    @Schema(description = "下次检测日期", name = "xcjcrq1", implementation = LocalDate.class)
    @NotNull(message = "下次检测日期不能为空")
    private LocalDate xcjcrq1;

    @Schema(description = "下次保养日期", name = "xcbyrq", implementation = LocalDate.class)
    @NotNull(message = "下次保养日期不能为空")
    private LocalDate xcbyrq;

    @Schema(description = "负责人", name = "fzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "负责人不能为空!")
    @Size(max = 100, message = "负责人不能超过100个字符(1个汉字记两个字符)!")
    private String fzr;

    @Schema(description = "负责人部门", name = "fzrdw", implementation = String.class, maxLength = 200)
    @NotBlank(message = "负责人部门不能为空!")
    @Size(max = 200, message = "负责人部门不能超过200个字符(1个汉字记两个字符)!")
    private String fzrdw;

    @Schema(description = "供应商", name = "gys", implementation = String.class, maxLength = 100)
    @NotBlank(message = "供应商不能为空!")
    @Size(max = 100, message = "供应商不能超过100个字符(1个汉字记两个字符)!")
    private String gys;

    @Schema(description = "使用说明", name = "sysm", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "使用说明不能超过1000个字符(1个汉字记两个字符)!")
    private String sysm;

    @Schema(description = "是否检查", name = "sfjc", implementation = Integer.class, maxLength = 2)
    private Integer sfjc;

    @Schema(description = "检查周期", name = "jczq", implementation = Integer.class, maxLength = 4)
    private Integer jczq;

    @Schema(description = "检查提前提醒", name = "jctqtx", implementation = Integer.class, maxLength = 4)
    private Integer jctqtx;

    @Schema(description = "是否检测", name = "sfjc1", implementation = Integer.class, maxLength = 2)
    private Integer sfjc1;

    @Schema(description = "检测周期", name = "jczq1", implementation = Integer.class, maxLength = 4)
    private Integer jczq1;

    @Schema(description = "检测提前提醒", name = "jctqtx1", implementation = Integer.class, maxLength = 4)
    private Integer jctqtx1;

    @Schema(description = "是否是特种设备", name = "sfstzsb", implementation = String.class, maxLength = 1)
    @Size(max = 1, message = "是否是特种设备不能超过1个字符(1个汉字记两个字符)!")
    private String sfstzsb;

    @Schema(description = "企业编码", name = "companyCode", implementation = Integer.class, maxLength = 9)
    @NotNull(message = "企业编码不能为空")
    private Integer companyCode;

}
