package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.config.check.RequiredIf;
import com.lyc.wwyt.enums.DqztEnum;
import com.lyc.wwyt.enums.ZydwlxEnum;
import com.lyc.wwyt.enums.ZyjbEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * 吊装作业信息表(t_dzzy)表实体类
 *
 * @author lhh
 * @since 2023-05-18 15:54:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "吊装作业信息表", name = "t_dzzy")
@RequiredIf(dependentField = "sfsstqy", field = "fssstid", fieldValue = "1")
@TableName("t_dzzy")
public class TDzzyEntity extends BaseEntity {

    private static final long serialVersionUID = 565317050424503848L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "是否在四色图区域内", name = "sfsstqy", implementation = String.class, maxLength = 1)
    @NotBlank(message = "是否在四色图区域内不能为空!")
    @Size(max = 1, message = "是否在四色图区域内不能超过1个字符(1个汉字记两个字符)!")
    private String sfsstqy;

    @Schema(description = "风险四色图ID", name = "fssstid", implementation = String.class, maxLength = 36)
    @Size(max = 36, message = "风险四色图ID不能超过36个字符(1个汉字记两个字符)!")
    private String fssstid;

    @Schema(description = "作业证编号", name = "zyzbh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "作业证编号不能为空!")
    @Size(max = 50, message = "作业证编号不能超过50个字符(1个汉字记两个字符)!")
    private String zyzbh;

    @Schema(description = "作业申请单位", name = "sqdw", implementation = String.class, maxLength = 100)
    @NotBlank(message = "作业申请单位不能为空!")
    @Size(max = 100, message = "作业申请单位不能超过100个字符(1个汉字记两个字符)!")
    private String sqdw;

    @Schema(description = "作业申请时间", name = "zysqsj", implementation = LocalDateTime.class)
    @NotNull(message = "作业申请时间不能为空")
    private LocalDateTime zysqsj;

    @Schema(description = "作业申请人", name = "sqr", implementation = String.class, maxLength = 20)
    @NotBlank(message = "作业申请人不能为空!")
    @Size(max = 20, message = "作业申请人不能超过20个字符(1个汉字记两个字符)!")
    private String sqr;

    @Schema(description = "作业内容", name = "zynr", implementation = String.class, maxLength = 200)
    @NotBlank(message = "作业内容不能为空!")
    @Size(max = 200, message = "作业内容不能超过200个字符(1个汉字记两个字符)!")
    private String zynr;

    @Schema(description = "作业位置", name = "zywz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "作业位置不能为空!")
    @Size(max = 100, message = "作业位置不能超过100个字符(1个汉字记两个字符)!")
    private String zywz;

    @Schema(description = "吊具名称", name = "djmc", implementation = String.class, maxLength = 50)
    @NotBlank(message = "吊具名称不能为空!")
    @Size(max = 50, message = "吊具名称不能超过50个字符(1个汉字记两个字符)!")
    private String djmc;

    @Schema(description = "吊物质量（t）", name = "dwzl", implementation = Double.class, maxLength = 4)
    @NotNull(message = "吊物质量（t）不能为空")
    private Double dwzl;

    @Schema(description = "作业级别", name = "zyjb", implementation = Integer.class)
    @NotNull(message = "作业级别不能为空")
    @EnumValueConstraint(enumClass = ZyjbEnum.class, message = "作业级别不在指定范围内,请根据字典表定义重新输入!")
    private Integer zyjb;

    @Schema(description = "作业人员信息", name = "zyryxx", implementation = String.class, maxLength = 300)
    @Size(max = 300, message = "作业人员信息不能超过300个字符(1个汉字记两个字符)!")
    private String zyryxx;

    @Schema(description = "司索人", name = "ssr", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "司索人不能超过50个字符(1个汉字记两个字符)!")
    private String ssr;

    @Schema(description = "吊装指挥人", name = "dzzhr", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "吊装指挥人不能超过50个字符(1个汉字记两个字符)!")
    private String dzzhr;

    @Schema(description = "作业单位类型", name = "zydwlx", implementation = Integer.class)
    @NotNull(message = "作业单位类型不能为空")
    @EnumValueConstraint(enumClass = ZydwlxEnum.class, message = "作业单位类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer zydwlx;

    @Schema(description = "作业单位名称", name = "zydwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "作业单位名称不能为空!")
    @Size(max = 100, message = "作业单位名称不能超过100个字符(1个汉字记两个字符)!")
    private String zydwmc;

    @Schema(description = "作业负责人", name = "zyfzr", implementation = String.class, maxLength = 50)
    @NotBlank(message = "作业负责人不能为空!")
    @Size(max = 50, message = "作业负责人不能超过50个字符(1个汉字记两个字符)!")
    private String zyfzr;

    @Schema(description = "作业实施开始时间", name = "zysskssj", implementation = LocalDateTime.class)
    private LocalDateTime zysskssj;

    @Schema(description = "作业实施结束时间", name = "zyssjssj", implementation = LocalDateTime.class)
    private LocalDateTime zyssjssj;

    @Schema(description = "是否涉及的其他特殊作业", name = "sfsjqttszy", implementation = String.class, maxLength = 1)
    @Size(max = 1, message = "是否涉及的其他特殊作业不能超过1个字符(1个汉字记两个字符)!")
    private String sfsjqttszy;

    @Schema(description = "涉及的其他特殊作业安全作业证编号", name = "sjqttszyzbh", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "涉及的其他特殊作业安全作业证编号不能超过100个字符(1个汉字记两个字符)!")
    private String sjqttszyzbh;

    @Schema(description = "风险辨识", name = "fxbs", implementation = String.class, maxLength = 200)
    @NotBlank(message = "风险辨识不能为空!")
    @Size(max = 200, message = "风险辨识不能超过200个字符(1个汉字记两个字符)!")
    private String fxbs;

    @Schema(description = "安全交底人", name = "aqjdr", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "安全交底人不能超过50个字符(1个汉字记两个字符)!")
    private String aqjdr;

    @Schema(description = "接受交底人", name = "jsjdr", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "接受交底人不能超过200个字符(1个汉字记两个字符)!")
    private String jsjdr;

    @Schema(description = "监护人", name = "jhr", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "监护人不能超过50个字符(1个汉字记两个字符)!")
    private String jhr;

    @Schema(description = "当前状态", name = "dqzt", implementation = Integer.class)
    @NotNull(message = "当前状态不能为空")
    @EnumValueConstraint(enumClass = DqztEnum.class, message = "当前状态类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer dqzt;

    @Schema(description = "企业编码", name = "companycode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companyCode;

    @Schema(description = "作业地点经度", name = "longitude", implementation = Double.class, maxLength = 9)
    private Double longitude;

    @Schema(description = "作业地点纬度", name = "latitude", implementation = Double.class, maxLength = 9)
    private Double latitude;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

}
