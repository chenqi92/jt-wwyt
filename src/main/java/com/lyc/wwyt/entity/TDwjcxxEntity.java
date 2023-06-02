package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.XjyhjbEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * 点位检查信息表(t_dwjcxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "点位检查信息表", name = "t_dwjcxx")
@TableName("t_dwjcxx")
public class TDwjcxxEntity extends BaseEntity {

    private static final long serialVersionUID = 650679410850655292L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "任务名称", name = "rwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "任务名称不能为空!")
    @Size(max = 100, message = "任务名称不能超过100个字符(1个汉字记两个字符)!")
    private String rwmc;

    @Schema(description = "巡检人", name = "xjr", implementation = String.class, maxLength = 200)
    @NotBlank(message = "巡检人不能为空!")
    @Size(max = 200, message = "巡检人不能超过200个字符(1个汉字记两个字符)!")
    private String xjr;

    @Schema(description = "所在岗位", name = "szgw", implementation = String.class, maxLength = 100)
    @NotBlank(message = "所在岗位不能为空!")
    @Size(max = 100, message = "所在岗位不能超过100个字符(1个汉字记两个字符)!")
    private String szgw;

    @Schema(description = "所在部门", name = "szbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "所在部门不能为空!")
    @Size(max = 200, message = "所在部门不能超过200个字符(1个汉字记两个字符)!")
    private String szbm;

    @Schema(description = "巡检频次", name = "jcpc", implementation = String.class, maxLength = 20)
    @NotBlank(message = "巡检频次不能为空!")
    @Size(max = 20, message = "巡检频次不能超过20个字符(1个汉字记两个字符)!")
    private String jcpc;

    @Schema(description = "巡检生产区域", name = "xjscqy", implementation = String.class, maxLength = 100)
    @NotBlank(message = "巡检生产区域不能为空!")
    @Size(max = 100, message = "巡检生产区域不能超过100个字符(1个汉字记两个字符)!")
    private String xjscqy;

    @Schema(description = "巡检设备设施", name = "xjsbss", implementation = String.class, maxLength = 100)
    @NotBlank(message = "巡检设备设施不能为空!")
    @Size(max = 100, message = "巡检设备设施不能超过100个字符(1个汉字记两个字符)!")
    private String xjsbss;

    @Schema(description = "巡检点位编号", name = "xjdwbh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "巡检点位编号不能为空!")
    @Size(max = 50, message = "巡检点位编号不能超过50个字符(1个汉字记两个字符)!")
    private String xjdwbh;

    @Schema(description = "巡检时间", name = "xjsj", implementation = LocalDateTime.class)
    @NotNull(message = "巡检时间不能为空")
    private LocalDateTime xjsj;

    @Schema(description = "巡检标准", name = "xjbz", implementation = String.class, maxLength = 500)
    @NotBlank(message = "巡检标准不能为空!")
    @Size(max = 500, message = "巡检标准不能超过500个字符(1个汉字记两个字符)!")
    private String xjbz;

    @Schema(description = "巡检隐患级别", name = "xjyhjb", implementation = Integer.class)
    @NotNull(message = "巡检隐患级别不能为空")
    @EnumValueConstraint(enumClass = XjyhjbEnum.class, message = "巡检隐患级别不在指定范围内,请根据字典表定义重新输入!")
    private Integer xjyhjb;

    @Schema(description = "巡检隐患描述", name = "xjyhms", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "巡检隐患描述不能超过500个字符(1个汉字记两个字符)!")
    private String xjyhms;

    @Schema(description = "巡检隐患照片", name = "xjyhzp", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "巡检隐患照片不能超过200个字符(1个汉字记两个字符)!")
    private String xjyhzp;

    @Schema(description = "整改人", name = "zgr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "整改人不能为空!")
    @Size(max = 100, message = "整改人不能超过100个字符(1个汉字记两个字符)!")
    private String zgr;

    @Schema(description = "核实时间", name = "hssj", implementation = LocalDateTime.class)
    private LocalDateTime hssj;

    @Schema(description = "核实结果", name = "hsjg", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "核实结果不能超过200个字符(1个汉字记两个字符)!")
    private String hsjg;

    @Schema(description = "核实人", name = "hsr", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "核实人不能超过100个字符(1个汉字记两个字符)!")
    private String hsr;

    @Schema(description = "处置措施", name = "czcs", implementation = String.class, maxLength = 5000)
    @Size(max = 5000, message = "处置措施不能超过5000个字符(1个汉字记两个字符)!")
    private String czcs;

    @Schema(description = "处置时间", name = "czsj", implementation = LocalDateTime.class)
    private LocalDateTime czsj;

    @Schema(description = "处置人", name = "czr", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "处置人不能超过100个字符(1个汉字记两个字符)!")
    private String czr;

    @Schema(description = "处置结果", name = "czjg", implementation = String.class, maxLength = 5000)
    @NotBlank(message = "处置结果不能为空!")
    @Size(max = 5000, message = "处置结果不能超过5000个字符(1个汉字记两个字符)!")
    private String czjg;

    @Schema(description = "复查时间", name = "fcsj", implementation = LocalDateTime.class)
    @NotNull(message = "复查时间不能为空")
    private LocalDateTime fcsj;

    @Schema(description = "复查结果", name = "chjg", implementation = String.class, maxLength = 500)
    @NotBlank(message = "复查结果不能为空!")
    @Size(max = 500, message = "复查结果不能超过500个字符(1个汉字记两个字符)!")
    private String chjg;

    @Schema(description = "复查人", name = "chr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "复查人不能为空!")
    @Size(max = 100, message = "复查人不能超过100个字符(1个汉字记两个字符)!")
    private String chr;

    @Schema(description = "备注", name = "bz", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "备注不能超过100个字符(1个汉字记两个字符)!")
    private String bz;

}
