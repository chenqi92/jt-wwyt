package com.lyc.wwyt.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 作业场所岗位风险应知卡信息表(t_zycswxyshwpwxwhtxyzkxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "作业场所岗位风险应知卡信息表", name = "t_zycswxyshwpwxwhtxyzkxx")
@TableName("t_zycswxyshwpwxwhtxyzkxx")
public class TZycswxyshwpwxwhtxyzkxxEntity extends BaseEntity {

    private static final long serialVersionUID = 305893415634059795L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "岗位名称", name = "gwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "岗位名称不能为空!")
    @Size(max = 100, message = "岗位名称不能超过100个字符(1个汉字记两个字符)!")
    private String gwmc;

    @Schema(description = "主要危险有害因素", name = "zywxyhys", implementation = String.class)
    @NotNull(message = "主要危险有害因素不能为空")
    private String zywxyhys;

    @Schema(description = "易导致事故风险", name = "ydzsgfx", implementation = String.class, maxLength = 500)
    @NotBlank(message = "易导致事故风险不能为空!")
    @Size(max = 500, message = "易导致事故风险不能超过500个字符(1个汉字记两个字符)!")
    private String ydzsgfx;

    @Schema(description = "风险等级", name = "fxdj", implementation = String.class, maxLength = 8)
    @NotBlank(message = "风险等级不能为空!")
    @Size(max = 8, message = "风险等级不能超过8个字符(1个汉字记两个字符)!")
    private String fxdj;

    @Schema(description = "风险管控措施", name = "fxgkcs", implementation = String.class)
    @NotNull(message = "风险管控措施不能为空")
    private String fxgkcs;

    @Schema(description = "应急处置对策", name = "yjcsdc", implementation = String.class)
    @NotNull(message = "应急处置对策不能为空")
    private String yjcsdc;

    @Schema(description = "安全警示标示", name = "aqjsbs", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "安全警示标示不能超过50个字符(1个汉字记两个字符)!")
    private String aqjsbs;

    @Schema(description = "附件", name = "fj", implementation = String.class)
    @NotNull(message = "附件不能为空")
    private String fj;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companyCode;

}
