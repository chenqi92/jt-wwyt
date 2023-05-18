package com.lyc.wwyt.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.config.check.RequiredIf;
import com.lyc.wwyt.enums.DqztEnum;
import com.lyc.wwyt.enums.ZydwlxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 断路作业信息表(t_dlzy)表实体类
 *
 * @author lhh
 * @since 2023-05-18 15:54:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业信息表", name = "t_dlzy")
@RequiredIf(dependentField = "sfsstqy", field = "fssstid", fieldValue = "1")
@TableName("t_dlzy")
public class TDlzyEntity extends BaseEntity {

    private static final long serialVersionUID = 124352792147648817L;

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

    @Schema(description = "断路原因", name = "dlyy", implementation = String.class, maxLength = 200)
    @NotBlank(message = "断路原因不能为空!")
    @Size(max = 200, message = "断路原因不能超过200个字符(1个汉字记两个字符)!")
    private String dlyy;

    @Schema(description = "涉及相关单位（部门）", name = "xgdwbm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "涉及相关单位（部门）不能为空!")
    @Size(max = 100, message = "涉及相关单位（部门）不能超过100个字符(1个汉字记两个字符)!")
    private String xgdwbm;

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

    @Schema(description = "断路地段示意图", name = "dlddsyt", implementation = String.class)
    private String dlddsyt;

    @Schema(description = "相关说明", name = "zyfwfs", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "相关说明不能超过500个字符(1个汉字记两个字符)!")
    private String zyfwfs;

    @Schema(description = "编制人名称", name = "bzrmc", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "编制人名称不能超过50个字符(1个汉字记两个字符)!")
    private String bzrmc;

    @Schema(description = "编制时间", name = "bzsj", implementation = LocalDateTime.class)
    private LocalDateTime bzsj;

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

    @Schema(description = "创建时间", name = "createtime", implementation = LocalDateTime.class)
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createtime;

    @Schema(description = "创建人", name = "createby", implementation = String.class, maxLength = 200)
    @NotBlank(message = "创建人不能为空!")
    @Size(max = 200, message = "创建人不能超过200个字符(1个汉字记两个字符)!")
    private String createby;

    @Schema(description = "最后修改时间", name = "updatetime", implementation = LocalDateTime.class)
    @NotNull(message = "最后修改时间不能为空")
    private LocalDateTime updatetime;

    @Schema(description = "最后修改人", name = "updateby", implementation = String.class, maxLength = 200)
    @NotBlank(message = "最后修改人不能为空!")
    @Size(max = 200, message = "最后修改人不能超过200个字符(1个汉字记两个字符)!")
    private String updateby;

    @Schema(description = "删除标识", name = "deletemark", implementation = String.class, maxLength = 1)
    @NotBlank(message = "删除标识不能为空!")
    @Size(max = 1, message = "删除标识不能超过1个字符(1个汉字记两个字符)!")
    private String deletemark;

    @Schema(description = "企业编码", name = "companycode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companycode;

    @Schema(description = "作业地点经度", name = "longitude", implementation = Double.class, maxLength = 9)
    private Double longitude;

    @Schema(description = "作业地点纬度", name = "latitude", implementation = Double.class, maxLength = 9)
    private Double latitude;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

}
