package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

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
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "承包商ID(承包商t_cbsglxx表id)", name = "sscbs", implementation = String.class, maxLength = 36)
    @NotBlank(message = "承包商ID不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
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

    @Schema(description = "施工队负责人手机号码", name = "sgdwfzrlxdh", implementation = String.class, maxLength = 11)
    @NotBlank(message = "施工队负责人手机号码不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "施工队负责人手机号码格式不正确!")
    private String sgdwfzrlxdh;

    @Schema(description = "施工队伍负责人身份证", name = "sgdwfzrsfz", implementation = String.class, maxLength = 18)
    @NotBlank(message = "施工队伍负责人身份证不能为空!")
    @Pattern(regexp = "^(^[1-9]\\\\d{5}(18|19|20)\\\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\\\d{3}[0-9Xx]|\\\\d{8}(0[1-9]|1[0-2])([0-2]\\\\d|3[0-1])\\\\d{2}$)|(^[1-9]\\\\d{5}\\\\d{2}(0[1-9]|1[0-2])([0-2]\\\\d|3[0-1])\\\\d{3}$)\n", message = "施工队伍负责人身份证号码格式不正确!")
    private String sgdwfzrsfz;

    @Schema(description = "安全负责人", name = "aqfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "安全负责人不能为空!")
    @Size(max = 100, message = "安全负责人不能超过100个字符(1个汉字记两个字符)!")
    private String aqfzr;

    @Schema(description = "安全负责人联系电话", name = "aqfzrlxdh", implementation = String.class, maxLength = 11)
    @NotBlank(message = "安全负责人联系电话不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "安全负责人手机号码格式不正确!")
    private String aqfzrlxdh;

    @Schema(description = "安全负责人身份证", name = "aqfzrsfz", implementation = String.class, maxLength = 18)
    @NotBlank(message = "安全负责人身份证不能为空!")
    @Pattern(regexp = "^(^[1-9]\\\\d{5}(18|19|20)\\\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\\\d{3}[0-9Xx]|\\\\d{8}(0[1-9]|1[0-2])([0-2]\\\\d|3[0-1])\\\\d{2}$)|(^[1-9]\\\\d{5}\\\\d{2}(0[1-9]|1[0-2])([0-2]\\\\d|3[0-1])\\\\d{3}$)\n", message = "安全负责人身份证号码格式不正确!")
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
