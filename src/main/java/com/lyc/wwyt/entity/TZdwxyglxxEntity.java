package com.lyc.wwyt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 重大危险源管理信息表(t_zdwxyglxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 14:04:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "重大危险源管理信息表", name = "t_zdwxyglxx")
@TableName("t_zdwxyglxx")
public class TZdwxyglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 656538198313306144L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "重大危险源编号", name = "zdwxybh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "重大危险源编号不能为空!")
    @Size(min = 9, max = 9, message = "重大危险源编号必须为9位!")
    private String zdwxybh;

    @Schema(description = "重大危险源名称", name = "zdwxymc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "重大危险源名称不能为空!")
    @Size(max = 100, message = "重大危险源名称不能超过100个字符(1个汉字记两个字符)!")
    private String zdwxymc;

    @Schema(description = "危险源简称", name = "wxyjc", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "危险源简称不能超过50个字符(1个汉字记两个字符)!")
    private String wxyjc;

    @Schema(description = "危险源类型", name = "wxllx", implementation = String.class)
    @NotNull(message = "危险源类型不能为空")
    @EnumValueConstraint(enumClass = WxylxEnum.class, message = "危险源类型不在指定范围内,请根据字典表定义重新输入!")
    private String wxllx;

    @Schema(description = "所属部门", name = "ssbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "所属部门不能为空!")
    @Size(max = 200, message = "所属部门不能超过200个字符(1个汉字记两个字符)!")
    private String ssbm;

    @Schema(description = "负责人电话", name = "fzrdh", implementation = String.class, maxLength = 11)
    @NotBlank(message = "负责人电话不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "负责人电话号码格式不正确!")
    private String fzrdh;

    @Schema(description = "是否在化工园区", name = "sfzhgyq", implementation = Integer.class, maxLength = 1)
    @NotNull(message = "是否在化工园区不能为空")
    private Integer sfzhgyq;

    @Schema(description = "详细地址", name = "xxdz", implementation = String.class, maxLength = 200)
    @NotBlank(message = "详细地址不能为空!")
    @Size(max = 200, message = "详细地址不能超过200个字符(1个汉字记两个字符)!")
    private String xxdz;

    @Schema(description = "占地面积", name = "zdmj", implementation = String.class, maxLength = 100)
    @NotBlank(message = "占地面积不能为空!")
    @Size(max = 100, message = "占地面积不能超过100个字符(1个汉字记两个字符)!")
    private String zdmj;

    @Schema(description = "固定资产值", name = "gdzcz", implementation = Double.class, maxLength = 10)
    private Double gdzcz;

    @Schema(description = "设计使用年限", name = "sjsynx", implementation = Double.class, maxLength = 10)
    @NotNull(message = "设计使用年限不能为空")
    private Double sjsynx;

    @Schema(description = "存储形式", name = "ccxs", implementation = String.class, maxLength = 100)
    @NotBlank(message = "存储形式不能为空!")
    @Size(max = 100, message = "存储形式不能超过100个字符(1个汉字记两个字符)!")
    private String ccxs;

    @Schema(description = "检查周期", name = "jczq", implementation = Double.class, maxLength = 10)
    @NotNull(message = "检查周期不能为空")
    private Double jczq;

    @Schema(description = "简述工艺流程", name = "jsgylc", implementation = String.class)
    private String jsgylc;

    @Schema(description = "公用工程信息", name = "gygcxx", implementation = String.class)
    private String gygcxx;

    @Schema(description = "安全负责人", name = "aqfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "安全负责人不能为空!")
    @Size(max = 100, message = "安全负责人不能超过100个字符(1个汉字记两个字符)!")
    private String aqfzr;

    @Schema(description = "安全负责人手机", name = "aqfzrsj", implementation = String.class, maxLength = 11)
    @NotBlank(message = "安全负责人手机不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "安全负责人手机号码格式不正确!")
    private String aqfzrsj;

    @Schema(description = "区域负责人", name = "qyfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "区域负责人不能为空!")
    @Size(max = 100, message = "区域负责人不能超过100个字符(1个汉字记两个字符)!")
    private String qyfzr;

    @Schema(description = "区域负责人手机", name = "qyfzrsj", implementation = String.class, maxLength = 11)
    @NotBlank(message = "区域负责人手机不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "区域负责人手机号码格式不正确!")
    private String qyfzrsj;

    @Schema(description = "危害程度", name = "whcd", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "危害程度不能超过100个字符(1个汉字记两个字符)!")
    private String whcd;

    @Schema(description = "评审年度(年)", name = "psnd", implementation = Double.class, maxLength = 6)
    private Double psnd;

    @Schema(description = "重大危险源描述", name = "zdwxyms", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "重大危险源描述不能超过200个字符(1个汉字记两个字符)!")
    private String zdwxyms;

    @Schema(description = "生产经营活动类型", name = "scjyhdlx", implementation = String.class)
    @NotNull(message = "生产经营活动类型不能为空")
    @EnumValueConstraint(enumClass = ScjyhdlxEnum.class, message = "生产经营活动类型不在指定范围内,请根据字典表定义重新输入!")
    private String scjyhdlx;

    @Schema(description = "生产存储场所产权", name = "sccccscq", implementation = Integer.class)
    @NotNull(message = "生产存储场所产权不能为空")
    @EnumValueConstraint(enumClass = SccccscqEnum.class, message = "生产存储场所产权类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer sccccscq;

    @Schema(description = "防雷防静电设施是否定期接受检测", name = "flfjdsssfdqjsjc", implementation = Integer.class, maxLength = 1)
    @NotNull(message = "防雷防静电设施是否定期接受检测不能为空")
    private Integer flfjdsssfdqjsjc;

    @Schema(description = "涉及危险工艺", name = "sjwxgy", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "涉及危险工艺不能超过100个字符(1个汉字记两个字符)!")
    private String sjwxgy;

    @Schema(description = "环境位置", name = "hjwz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "环境位置不能为空!")
    @Size(max = 100, message = "环境位置不能超过100个字符(1个汉字记两个字符)!")
    private String hjwz;

    @Schema(description = "投用日期", name = "tyrq", implementation = LocalDate.class)
    private LocalDate tyrq;

    @Schema(description = "R值", name = "rz", implementation = Double.class, maxLength = 9)
    @NotNull(message = "R值不能为空")
    private Double rz;

    @Schema(description = "重大危险源级别", name = "zdwxyjb", implementation = String.class)
    @NotNull(message = "重大危险源级别不能为空")
    @EnumValueConstraint(enumClass = ZdwxyjbEnum.class, message = "重大危险源级别不在指定范围内,请根据字典表定义重新输入!")
    private String zdwxyjb;

    @Schema(description = "压力容器总数", name = "ylrqzs", implementation = Double.class, maxLength = 6)
    @NotNull(message = "压力容器总数不能为空")
    private Double ylrqzs;

    @Schema(description = "防雷防静电设施检测时间：最近一次检测时间", name = "flfjdzj", implementation = LocalDateTime.class)
    @NotNull(message = "防雷防静电设施检测时间：最近一次检测时间不能为空")
    private LocalDateTime flfjdzj;

    @Schema(description = "防雷防静电设施检测时间：到期时间", name = "flfjddq", implementation = LocalDateTime.class)
    @NotNull(message = "防雷防静电设施检测时间：到期时间不能为空")
    private LocalDateTime flfjddq;

    @Schema(description = "危险源备案有效期始", name = "wxybayxqs", implementation = LocalDateTime.class)
    @NotNull(message = "危险源备案有效期始不能为空")
    private LocalDateTime wxybayxqs;

    @Schema(description = "危险源备案有效期止", name = "wxybayxqz", implementation = LocalDateTime.class)
    @NotNull(message = "危险源备案有效期止不能为空")
    private LocalDateTime wxybayxqz;

    @Schema(description = "单元内涉及的危险化学品", name = "dynsjdwxhxp", implementation = String.class, maxLength = 500)
    @NotBlank(message = "单元内涉及的危险化学品不能为空!")
    @Size(max = 500, message = "单元内涉及的危险化学品不能超过500个字符(1个汉字记两个字符)!")
    private String dynsjdwxhxp;

    @Schema(description = "危险化学品存量", name = "wxhxpcl", implementation = Double.class, maxLength = 9)
    @NotNull(message = "危险化学品存量不能为空")
    private Double wxhxpcl;

    @Schema(description = "危险化学品性质", name = "wxhxpxz", implementation = Integer.class)
    @NotNull(message = "危险化学品性质不能为空")
    @EnumValueConstraint(enumClass = WxhxpxzEnum.class, message = "危险化学品性质类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer wxhxpxz;

    @Schema(description = "所处装置或区域", name = "sczzhqy", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "所处装置或区域不能超过200个字符(1个汉字记两个字符)!")
    private String sczzhqy;

    @Schema(description = "存在量", name = "czl", implementation = Double.class, maxLength = 9)
    private Double czl;

    @Schema(description = "周边环境类型", name = "zbhjlx", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "周边环境类型不能超过200个字符(1个汉字记两个字符)!")
    private String zbhjlx;

    @Schema(description = "周边环境名称", name = "zbhjmc", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "周边环境名称不能超过200个字符(1个汉字记两个字符)!")
    private String zbhjmc;

    @Schema(description = "周边环境人数", name = "zbhjrs", implementation = Double.class, maxLength = 9)
    private Double zbhjrs;

    @Schema(description = "与危险源最近距离", name = "ywxyzjjl", implementation = Double.class, maxLength = 6)
    private Double ywxyzjjl;

    @Schema(description = "重大危险源周边安全间距", name = "zdwxyzbaqjj", implementation = Double.class, maxLength = 6)
    private Double zdwxyzbaqjj;

    @Schema(description = "周边环境联系人", name = "zbhjlxr", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "周边环境联系人不能超过100个字符(1个汉字记两个字符)!")
    private String zbhjlxr;

    @Schema(description = "周边环境联系人电话", name = "zbhjlxrdh", implementation = String.class, maxLength = 11)
    @Size(max = 11, message = "周边环境联系人电话不能超过11个字符(1个汉字记两个字符)!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "安全值班电话号码格式不正确!")
    private String zbhjlxrdh;

    @Schema(description = "周边防护目标最近距离（米）", name = "zbfhmbzjjl", implementation = Double.class, maxLength = 5)
    private Double zbfhmbzjjl;

    @Schema(description = "外边界500米范围人数估算", name = "wbj500mfwlrsgs", implementation = Double.class, maxLength = 8)
    private Double wbj500mfwlrsgs;

    @Schema(description = "经度（度）", name = "jd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "经度（度）不能为空")
    private Double jd;

    @Schema(description = "纬度（度）", name = "wd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "纬度（度）不能为空")
    private Double wd;

}
