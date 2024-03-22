package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.ZzbwflEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 关键装置重点部位信息表(t_gjzzzdbwxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "关键装置重点部位信息表", name = "t_gjzzzdbwxx")
@TableName("t_gjzzzdbwxx")
public class TGjzzzdbwxxEntity extends BaseEntity {

    private static final long serialVersionUID = -56108076112268062L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "装置/部位名称", name = "zzbwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "装置/部位名称不能为空!")
    @Size(max = 100, message = "装置/部位名称不能超过100个字符(1个汉字记两个字符)!")
    private String zzbwmc;

    @Schema(description = "所属部门", name = "ssbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "所属部门不能为空!")
    @Size(max = 200, message = "所属部门不能超过200个字符(1个汉字记两个字符)!")
    private String ssbm;

    @Schema(description = "具体位置", name = "jtwz", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "具体位置不能超过100个字符(1个汉字记两个字符)!")
    private String jtwz;

    @Schema(description = "负责人姓名", name = "fzrxm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "负责人姓名不能为空!")
    @Size(max = 100, message = "负责人姓名不能超过100个字符(1个汉字记两个字符)!")
    private String fzrxm;

    @Schema(description = "联系人", name = "lxr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "联系人不能为空!")
    @Size(max = 100, message = "联系人不能超过100个字符(1个汉字记两个字符)!")
    private String lxr;

    @Schema(description = "录入人", name = "lrr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "录入人不能为空!")
    @Size(max = 100, message = "录入人不能超过100个字符(1个汉字记两个字符)!")
    private String lrr;

    @Schema(description = "责任人", name = "zrr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "责任人不能为空!")
    @Size(max = 100, message = "责任人不能超过100个字符(1个汉字记两个字符)!")
    private String zrr;

    @Schema(description = "装置部位分类", name = "zzbwfl", implementation = Integer.class)
    @NotNull(message = "装置部位分类不能为空")
    @EnumValueConstraint(enumClass = ZzbwflEnum.class, message = "装置部位分类不在指定范围内,请根据字典表定义重新输入!")
    private Integer zzbwfl;

    @Schema(description = "检查周期", name = "jczq", implementation = Double.class, maxLength = 10)
    @NotNull(message = "检查周期不能为空")
    private Double jczq;

    @Schema(description = "相关应急预案", name = "xgyjya", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "相关应急预案不能超过1000个字符(1个汉字记两个字符)!")
    private String xgyjya;

    @Schema(description = "主要危险有害因素", name = "zywxyhys", implementation = String.class, maxLength = 500)
    @NotBlank(message = "主要危险有害因素不能为空!")
    @Size(max = 500, message = "主要危险有害因素不能超过500个字符(1个汉字记两个字符)!")
    private String zywxyhys;

    @Schema(description = "易导致风险", name = "ydzfx", implementation = String.class, maxLength = 500)
    @NotBlank(message = "易导致风险不能为空!")
    @Size(max = 500, message = "易导致风险不能超过500个字符(1个汉字记两个字符)!")
    private String ydzfx;

    @Schema(description = "应急处置措施", name = "yjczcs", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "应急处置措施不能超过500个字符(1个汉字记两个字符)!")
    private String yjczcs;

    @Schema(description = "现场照片", name = "xczp", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "现场照片不能超过1000个字符(1个汉字记两个字符)!")
    private String xczp;

    @Schema(description = "经度（度）", name = "jd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "经度（度）不能为空")
    private Double jd;

    @Schema(description = "纬度（度）", name = "wd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "纬度（度）不能为空")
    private Double wd;

    @Schema(description = "备注", name = "bz", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "备注不能超过1000个字符(1个汉字记两个字符)!")
    private String bz;

}
