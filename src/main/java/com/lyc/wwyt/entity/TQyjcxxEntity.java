package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.GmqkEnum;
import com.lyc.wwyt.enums.JyztEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * 企业基础信息表(t_qyjcxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 11:20:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业基础信息表", name = "t_qyjcxx")
@TableName("t_qyjcxx")
public class TQyjcxxEntity extends BaseEntity {

    private static final long serialVersionUID = -24796997922353190L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "企业名称", name = "qymc", implementation = String.class, maxLength = 300)
    @NotBlank(message = "企业名称不能为空!")
    @Size(max = 300, message = "企业名称不能超过300个字符(1个汉字记两个字符)!")
    private String qymc;

    @Schema(description = "行政区划", name = "xzqy", implementation = String.class, maxLength = 300)
    @NotBlank(message = "行政区划不能为空!")
    @Size(max = 300, message = "行政区划不能超过300个字符(1个汉字记两个字符)!")
    private String xzqy;

    @Schema(description = "所在省", name = "szs1", implementation = String.class, maxLength = 100)
    @NotBlank(message = "所在省不能为空!")
    @Size(max = 100, message = "所在省不能超过100个字符(1个汉字记两个字符)!")
    private String szs1;

    @Schema(description = "所在市", name = "szs2", implementation = String.class, maxLength = 100)
    @NotBlank(message = "所在市不能为空!")
    @Size(max = 100, message = "所在市不能超过100个字符(1个汉字记两个字符)!")
    private String szs2;

    @Schema(description = "所在县（市、区）", name = "szx", implementation = String.class, maxLength = 100)
    @NotBlank(message = "所在县（市、区）不能为空!")
    @Size(max = 100, message = "所在县（市、区）不能超过100个字符(1个汉字记两个字符)!")
    private String szx;

    @Schema(description = "所在乡镇（街道）", name = "szxz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "所在乡镇（街道）不能为空!")
    @Size(max = 100, message = "所在乡镇（街道）不能超过100个字符(1个汉字记两个字符)!")
    private String szxz;

    @Schema(description = "所在村（社区）", name = "szc", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "所在村（社区）不能超过100个字符(1个汉字记两个字符)!")
    private String szc;

    @Schema(description = "所在园区（开发区）", name = "szyq", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "所在园区（开发区）不能超过100个字符(1个汉字记两个字符)!")
    private String szyq;

    @Schema(description = "工商注册地址", name = "gszcdz", implementation = String.class, maxLength = 300)
    @NotBlank(message = "工商注册地址不能为空!")
    @Size(max = 300, message = "工商注册地址不能超过300个字符(1个汉字记两个字符)!")
    private String gszcdz;

    @Schema(description = "生产经营地址", name = "scjydz", implementation = String.class, maxLength = 300)
    @NotBlank(message = "生产经营地址不能为空!")
    @Size(max = 300, message = "生产经营地址不能超过300个字符(1个汉字记两个字符)!")
    private String scjydz;

    @Schema(description = "邮政编码", name = "yzbm", implementation = Integer.class, maxLength = 6)
    @NotNull(message = "邮政编码不能为空")
    private Integer yzbm;

    @Schema(description = "成立日期", name = "clrq", implementation = LocalDateTime.class)
    @NotNull(message = "成立日期不能为空")
    private LocalDateTime clrq;

    @Schema(description = "法定代表人", name = "fddbr", implementation = String.class, maxLength = 300)
    @NotBlank(message = "法定代表人不能为空!")
    @Size(max = 300, message = "法定代表人不能超过300个字符(1个汉字记两个字符)!")
    private String fddbr;

    @Schema(description = "企业固定电话", name = "qygddh", implementation = String.class, maxLength = 13)
    @NotBlank(message = "企业固定电话不能为空!")
    @Pattern(regexp = "^0\\d{2,3}-?\\d{7,8}$", message = "企业固定电话号码格式不正确!")
    private String qygddh;

    @Schema(description = "安全值班电话", name = "aqzbdh", implementation = String.class, maxLength = 13)
    @NotBlank(message = "安全值班电话不能为空!")
    @Pattern(regexp = "^0\\d{2,3}-?\\d{7,8}$|^1[3-9][0-9]{9}$", message = "安全值班电话号码格式不正确!")
    private String aqzbdh;

    @Schema(description = "电子邮箱", name = "dzyx", implementation = String.class, maxLength = 100)
    @NotBlank(message = "电子邮箱不能为空!")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$", message = "邮箱格式不正确!")
    private String dzyx;

    @Schema(description = "联系QQ号", name = "lxqqh", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "联系QQ号不能超过100个字符(1个汉字记两个字符)!")
    private String lxqqh;

    @Schema(description = "官方网站地址", name = "gfwzdz", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "官方网站地址不能超过100个字符(1个汉字记两个字符)!")
    private String gfwzdz;

    @Schema(description = "单位传真", name = "dwcz", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "单位传真不能超过50个字符(1个汉字记两个字符)!")
    private String dwcz;

    @Schema(description = "主要负责人", name = "zyfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "主要负责人不能为空!")
    @Size(max = 100, message = "主要负责人不能超过100个字符(1个汉字记两个字符)!")
    private String zyfzr;

    @Schema(description = "主要负责人固定电话", name = "zyfzrgddh", implementation = String.class, maxLength = 100)
    @Pattern(regexp = "^0\\d{2,3}-?\\d{7,8}$", message = "主要负责人固定电话格式不正确!")
    private String zyfzrgddh;

    @Schema(description = "主要负责人移动电话", name = "zyfzryddh", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "主要负责人移动电话不能超过100个字符(1个汉字记两个字符)!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "主要负责人移动电话号码格式不正确!")
    private String zyfzryddh;

    @Schema(description = "主要负责人电子邮箱", name = "zyfzrdzyx", implementation = String.class, maxLength = 100)
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$", message = "主要负责人电子邮箱格式不正确!")
    private String zyfzrdzyx;

    @Schema(description = "安全负责人", name = "aqfzr", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全负责人不能超过100个字符(1个汉字记两个字符)!")
    private String aqfzr;

    @Schema(description = "安全负责人固定电话", name = "aqfzrgddh", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全负责人固定电话不能超过100个字符(1个汉字记两个字符)!")
    @Pattern(regexp = "^0\\d{2,3}-?\\d{7,8}$", message = "安全负责人固定电话格式不正确!")
    private String aqfzrgddh;

    @Schema(description = "安全负责人移动电话", name = "aqfzryddh", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全负责人移动电话不能超过100个字符(1个汉字记两个字符)!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "安全负责人移动电话号码格式不正确!")
    private String aqfzryddh;

    @Schema(description = "安全负责人电子邮箱", name = "aqfzrdzyx", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全负责人电子邮箱不能超过100个字符(1个汉字记两个字符)!")
    @Pattern(regexp = "^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "安全负责人电子邮箱格式不正确!")
    private String aqfzrdzyx;

    @Schema(description = "经济类型大类", name = "jjlxdl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "经济类型大类不能为空!")
    @Size(max = 50, message = "经济类型大类不能超过50个字符(1个汉字记两个字符)!")
    private String jjlxdl;

    @Schema(description = "经济类型小类", name = "jjlxxl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "经济类型小类不能为空!")
    @Size(max = 50, message = "经济类型小类不能超过50个字符(1个汉字记两个字符)!")
    private String jjlxxl;

    @Schema(description = "行业类别门类", name = "hylbml", implementation = String.class, maxLength = 50)
    @NotBlank(message = "行业类别门类不能为空!")
    @Size(max = 50, message = "行业类别门类不能超过50个字符(1个汉字记两个字符)!")
    private String hylbml;

    @Schema(description = "行业类别大类", name = "hylbdl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "行业类别大类不能为空!")
    @Size(max = 50, message = "行业类别大类不能超过50个字符(1个汉字记两个字符)!")
    private String hylbdl;

    @Schema(description = "行业类别中类", name = "hylbzl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "行业类别中类不能为空!")
    @Size(max = 50, message = "行业类别中类不能超过50个字符(1个汉字记两个字符)!")
    private String hylbzl;

    @Schema(description = "行业类别小类", name = "hylbxl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "行业类别小类不能为空!")
    @Size(max = 50, message = "行业类别小类不能超过50个字符(1个汉字记两个字符)!")
    private String hylbxl;

    @Schema(description = "行业监管大类", name = "hyjgdl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "行业监管大类不能为空!")
    @Size(max = 50, message = "行业监管大类不能超过50个字符(1个汉字记两个字符)!")
    private String hyjgdl;

    @Schema(description = "行业监管小类", name = "hyjgxl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "行业监管小类不能为空!")
    @Size(max = 50, message = "行业监管小类不能超过50个字符(1个汉字记两个字符)!")
    private String hyjgxl;

    @Schema(description = "专项治理类别", name = "zxzllb", implementation = String.class, maxLength = 50)
    @NotBlank(message = "专项治理类别不能为空!")
    @Size(max = 50, message = "专项治理类别不能超过50个字符(1个汉字记两个字符)!")
    private String zxzllb;

    @Schema(description = "是否为国有企业", name = "sfwgyqy", implementation = Integer.class, maxLength = 1)
    private Integer sfwgyqy;

    @Schema(description = "隶属关系", name = "lsgx", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "隶属关系不能超过50个字符(1个汉字记两个字符)!")
    private String lsgx;

    @Schema(description = "经营范围", name = "jyfw", implementation = String.class)
    private String jyfw;

    @Schema(description = "经营状态", name = "jyzt", implementation = Integer.class)
    @NotNull(message = "经营状态不能为空")
    @EnumValueConstraint(enumClass = JyztEnum.class, message = "经营状态类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer jyzt;

    @Schema(description = "注册资金（万元）", name = "zczj", implementation = Double.class, maxLength = 20)
    private Double zczj;

    @Schema(description = "占地面积（亩）", name = "zdmj", implementation = Double.class, maxLength = 20)
    private Double zdmj;

    @Schema(description = "从业人员数量", name = "cyrysl", implementation = Integer.class, maxLength = 8)
    @NotNull(message = "从业人员数量不能为空")
    private Integer cyrysl;

    @Schema(description = "特种作业人员数量", name = "tzzyrysl", implementation = Integer.class, maxLength = 8)
    @NotNull(message = "特种作业人员数量不能为空")
    private Integer tzzyrysl;

    @Schema(description = "专职安全生产管理人员数量", name = "zzaqscglry", implementation = Integer.class, maxLength = 8)
    @NotNull(message = "专职安全生产管理人员数量不能为空")
    private Integer zzaqscglry;

    @Schema(description = "兼职安全生产管理人员数量", name = "jzaqscglry", implementation = Integer.class, maxLength = 8)
    @NotNull(message = "兼职安全生产管理人员数量不能为空")
    private Integer jzaqscglry;

    @Schema(description = "专职应急管理人员数量", name = "zzyjglry", implementation = Integer.class, maxLength = 8)
    @NotNull(message = "专职应急管理人员数量不能为空")
    private Integer zzyjglry;

    @Schema(description = "注册安全工程师人员数量", name = "zcaqgcsrs", implementation = Integer.class, maxLength = 8)
    @NotNull(message = "注册安全工程师人员数量不能为空")
    private Integer zcaqgcsrs;

    @Schema(description = "是否有专门安全机构", name = "sfyzmaqjg", implementation = String.class, maxLength = 1)
    @Size(max = 1, message = "是否有专门安全机构不能超过1个字符(1个汉字记两个字符)!")
    private String sfyzmaqjg;

    @Schema(description = "安全管理机构名称", name = "aqgljgmc", implementation = String.class, maxLength = 300)
    @Size(max = 300, message = "安全管理机构名称不能超过300个字符(1个汉字记两个字符)!")
    private String aqgljgmc;

    @Schema(description = "安全管理机构职责", name = "aqgljgzz", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "安全管理机构职责不能超过1000个字符(1个汉字记两个字符)!")
    private String aqgljgzz;

    @Schema(description = "安全管理机构成员数量", name = "aagljgcysl", implementation = Integer.class, maxLength = 8)
    private Integer aagljgcysl;

    @Schema(description = "是否有专职安全人员", name = "sfyzzaqry", implementation = String.class, maxLength = 1)
    @Size(max = 1, message = "是否有专职安全人员不能超过1个字符(1个汉字记两个字符)!")
    private String sfyzzaqry;

    @Schema(description = "规模情况", name = "gmqk", implementation = Integer.class)
    @NotNull(message = "规模情况不能为空")
    @EnumValueConstraint(enumClass = GmqkEnum.class, message = "规模情况类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer gmqk;

    @Schema(description = "企业规模", name = "gygm", implementation = String.class, maxLength = 12)
    @NotBlank(message = "企业规模不能为空!")
    @Size(max = 12, message = "企业规模不能超过12个字符(1个汉字记两个字符)!")
    private String gygm;

    @Schema(description = "是否有母公司", name = "sfymgs", implementation = String.class, maxLength = 1)
    @Size(max = 1, message = "是否有母公司不能超过1个字符(1个汉字记两个字符)!")
    private String sfymgs;

    @Schema(description = "母公司名称", name = "mgsmc", implementation = String.class, maxLength = 300)
    @Size(max = 300, message = "母公司名称不能超过300个字符(1个汉字记两个字符)!")
    private String mgsmc;

    @Schema(description = "集团公司名称", name = "jtgsmc", implementation = String.class, maxLength = 300)
    @Size(max = 300, message = "集团公司名称不能超过300个字符(1个汉字记两个字符)!")
    private String jtgsmc;

    @Schema(description = "安全标准化等级", name = "bzhdj", implementation = String.class, maxLength = 20)
    @NotBlank(message = "安全标准化等级不能为空!")
    @Size(max = 20, message = "安全标准化等级不能超过20个字符(1个汉字记两个字符)!")
    private String bzhdj;

    @Schema(description = "标准化证书有效期起始日期", name = "bzhzsyxqqsrq", implementation = LocalDateTime.class)
    private LocalDateTime bzhzsyxqqsrq;

    @Schema(description = "标准化证书有效期终止日期", name = "bzhzsyxqzzrq", implementation = LocalDateTime.class)
    private LocalDateTime bzhzsyxqzzrq;

    @Schema(description = "安全监管等级", name = "aqjgdj", implementation = String.class, maxLength = 20)
    @NotBlank(message = "安全监管等级不能为空!")
    @Size(max = 20, message = "安全监管等级不能超过20个字符(1个汉字记两个字符)!")
    private String aqjgdj;

    @Schema(description = "是否构成重大危险源", name = "sfczzdwxy", implementation = String.class, maxLength = 1)
    @Size(max = 1, message = "是否构成重大危险源不能超过1个字符(1个汉字记两个字符)!")
    private String sfczzdwxy;

    @Schema(description = "重大危险源最高等级", name = "zdwxyzgdj", implementation = String.class, maxLength = 12)
    @Size(max = 12, message = "重大危险源最高等级不能超过12个字符(1个汉字记两个字符)!")
    private String zdwxyzgdj;

    @Schema(description = "企业平面图", name = "qypmt", implementation = String.class)
    private String qypmt;

    @Schema(description = "企业营业执照", name = "qyyyzz", implementation = String.class)
    private String qyyyzz;

    @Schema(description = "企业照片", name = "qyzp", implementation = String.class)
    private String qyzp;

    @Schema(description = "经度（度）", name = "jd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "经度（度）不能为空")
    private Double jd;

    @Schema(description = "纬度（度）", name = "wd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "纬度（度）不能为空")
    private Double wd;

    @Schema(description = "备注", name = "bz", implementation = String.class)
    private String bz;

}
