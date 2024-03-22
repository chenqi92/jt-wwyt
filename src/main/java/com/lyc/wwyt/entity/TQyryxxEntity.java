package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.RylxEnum;
import com.lyc.wwyt.enums.XbEnum;
import com.lyc.wwyt.enums.ZjlxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 企业人员信息表(t_qyryxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 11:20:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业人员信息表", name = "t_qyryxx")
@TableName("t_qyryxx")
public class TQyryxxEntity extends BaseEntity {

    private static final long serialVersionUID = -33957784405520897L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "姓名", name = "xm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "姓名不能为空!")
    @Size(max = 100, message = "姓名不能超过100个字符(1个汉字记两个字符)!")
    private String xm;

    @Schema(description = "性别", name = "xb", implementation = String.class, maxLength = 2)
    @NotBlank(message = "性别不能为空!")
    @EnumValueConstraint(enumClass = XbEnum.class, message = "性别类型不在指定范围内,请根据字典表定义重新输入!")
    private String xb;

    @Schema(description = "人员类型", name = "rylx", implementation = String.class, maxLength = 50)
    @NotBlank(message = "人员类型不能为空!")
    @EnumValueConstraint(enumClass = RylxEnum.class, message = "人员类型不在指定范围内,请根据字典表定义重新输入!")
    private String rylx;

    @Schema(description = "民族", name = "mz", implementation = String.class, maxLength = 20)
    @NotBlank(message = "民族不能为空!")
    @Size(max = 20, message = "民族不能超过20个字符(1个汉字记两个字符)!")
    private String mz;

    @Schema(description = "最高学历", name = "zgxl", implementation = String.class, maxLength = 20)
    @Size(max = 20, message = "最高学历不能超过20个字符(1个汉字记两个字符)!")
    private String zgxl;

    @Schema(description = "专业", name = "zy", implementation = String.class, maxLength = 20)
    @Size(max = 20, message = "专业不能超过20个字符(1个汉字记两个字符)!")
    private String zy;

    @Schema(description = "工作经历", name = "gzjl", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "工作经历不能超过500个字符(1个汉字记两个字符)!")
    private String gzjl;

    @Schema(description = "最后毕业院校", name = "zhbyyx", implementation = String.class, maxLength = 20)
    @Size(max = 20, message = "最后毕业院校不能超过20个字符(1个汉字记两个字符)!")
    private String zhbyyx;

    @Schema(description = "证件类型", name = "zjlx", implementation = String.class, maxLength = 20)
    @NotBlank(message = "证件类型不能为空!")
    @EnumValueConstraint(enumClass = ZjlxEnum.class, message = "人员类型不在指定范围内,请根据字典表定义重新输入!")
    private String zjlx;

    @Schema(description = "证件号码", name = "zjhm", implementation = String.class, maxLength = 50)
    @NotBlank(message = "证件号码不能为空!")
    @Size(max = 50, message = "证件号码不能超过50个字符(1个汉字记两个字符)!")
    private String zjhm;

    @Schema(description = "进入本单位日期", name = "jrbdwrq", implementation = LocalDate.class)
    private LocalDate jrbdwrq;

    @Schema(description = "备注", name = "bz", implementation = String.class)
    private String bz;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companyCode;

}
