package com.lyc.wwyt.entity;

import java.time.LocalDate;
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
 * 承包商施工管理信息表(t_cbssgglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商施工管理信息表", name = "t_cbssgglxx")
@TableName("t_cbssgglxx")
public class TCbssgglxxEntity extends BaseEntity {

    private static final long serialVersionUID = -19242175158424693L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "承包商ID", name = "sscbs", implementation = String.class, maxLength = 36)
    @NotBlank(message = "承包商ID不能为空!")
    @Size(max = 36, message = "承包商ID不能超过36个字符(1个汉字记两个字符)!")
    private String sscbs;

    @Schema(description = "施工队伍营业等级", name = "sgdwyydj", implementation = String.class, maxLength = 100)
    @NotBlank(message = "施工队伍营业等级不能为空!")
    @Size(max = 100, message = "施工队伍营业等级不能超过100个字符(1个汉字记两个字符)!")
    private String sgdwyydj;

    @Schema(description = "责任书签订日期", name = "zrsqdrq", implementation = LocalDate.class)
    @NotNull(message = "责任书签订日期不能为空")
    private LocalDate zrsqdrq;

    @Schema(description = "责任书到期日期", name = "zrsdqrq", implementation = LocalDate.class)
    @NotNull(message = "责任书到期日期不能为空")
    private LocalDate zrsdqrq;

    @Schema(description = "特种设备安装许可证", name = "tzsbazxkz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "特种设备安装许可证不能为空!")
    @Size(max = 100, message = "特种设备安装许可证不能超过100个字符(1个汉字记两个字符)!")
    private String tzsbazxkz;

    @Schema(description = "施工队伍负责人", name = "sgdwfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "施工队伍负责人不能为空!")
    @Size(max = 100, message = "施工队伍负责人不能超过100个字符(1个汉字记两个字符)!")
    private String sgdwfzr;

    @Schema(description = "施工队负责人联系电话", name = "sgdwfzrlxdh", implementation = String.class, maxLength = 11)
    @NotBlank(message = "施工队负责人联系电话不能为空!")
    @Size(max = 11, message = "施工队负责人联系电话不能超过11个字符(1个汉字记两个字符)!")
    private String sgdwfzrlxdh;

    @Schema(description = "施工队伍负责人身份证", name = "sgdwfzrsfz", implementation = String.class, maxLength = 18)
    @NotBlank(message = "施工队伍负责人身份证不能为空!")
    @Size(max = 18, message = "施工队伍负责人身份证不能超过18个字符(1个汉字记两个字符)!")
    private String sgdwfzrsfz;

    @Schema(description = "安全负责人", name = "aqfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "安全负责人不能为空!")
    @Size(max = 100, message = "安全负责人不能超过100个字符(1个汉字记两个字符)!")
    private String aqfzr;

    @Schema(description = "安全负责人联系电话", name = "aqfzrlxdh", implementation = String.class, maxLength = 11)
    @NotBlank(message = "安全负责人联系电话不能为空!")
    @Size(max = 11, message = "安全负责人联系电话不能超过11个字符(1个汉字记两个字符)!")
    private String aqfzrlxdh;

    @Schema(description = "安全负责人身份证", name = "aqfzrsfz", implementation = String.class, maxLength = 18)
    @NotBlank(message = "安全负责人身份证不能为空!")
    @Size(max = 18, message = "安全负责人身份证不能超过18个字符(1个汉字记两个字符)!")
    private String aqfzrsfz;

    @Schema(description = "进厂日期", name = "jcrq", implementation = LocalDate.class)
    @NotNull(message = "进厂日期不能为空")
    private LocalDate jcrq;

    @Schema(description = "考核日期", name = "khrz", implementation = LocalDate.class)
    @NotNull(message = "考核日期不能为空")
    private LocalDate khrz;

    @Schema(description = "施工单位简介", name = "sgdwjj", implementation = String.class)
    private String sgdwjj;

}
