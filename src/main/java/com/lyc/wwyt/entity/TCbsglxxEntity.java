package com.lyc.wwyt.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 承包商管理信息表(t_cbsglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-12 15:32:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "承包商管理信息表")
@TableName("t_cbsglxx")
public class TCbsglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 406723379518917540L;

    @TableId(value = "id")
    @NotBlank
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, minLength = 18, maxLength = 18)
    @NotBlank
    private String tyshxydm;

    @Schema(description = "承包商单位名称", name = "cbsdwmc", implementation = String.class, maxLength = 100)
    @NotBlank
    private String cbsdwmc;

    @Schema(description = "单位性质", name = "dwxz", implementation = String.class, maxLength = 100)
    @NotBlank
    private String dwxz;

    @Schema(description = "承包商类别", name = "cbslb", implementation = Integer.class)
    @NotNull
    private Integer cbslb;

    @Schema(description = "承包商类型", name = "cbslx", implementation = Integer.class)
    @NotNull
    private Integer cbslx;

    @Schema(description = "经营范围", name = "jyfw", implementation = String.class)
    @NotBlank
    private String jyfw;

    @Schema(description = "承包商电话", name = "cbsdh", implementation = String.class)
    @NotBlank
    private String cbsdh;

    @Schema(description = "邮箱", name = "yx", implementation = String.class)
    private String yx;

    @Schema(description = "承包商统一社会信用代码", name = "cbstyshxydm", implementation = String.class)
    @NotBlank
    private String cbstyshxydm;

    @Schema(description = "营业执照字号", name = "yyzzzh", implementation = String.class)
    @NotBlank
    private String yyzzzh;

    @Schema(description = "是否在黑名单", name = "sfzhmd", implementation = Integer.class)
    @NotNull
    private Integer sfzhmd;

    @Schema(description = "协议附件名称", name = "xyfjmc", implementation = String.class)
    private String xyfjmc;

    @Schema(description = "协议附件", name = "xyfjmcfj", implementation = String.class)
    private String xyfjmcfj;
}
