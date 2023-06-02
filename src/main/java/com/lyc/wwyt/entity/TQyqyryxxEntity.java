package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.FXDJEnum;
import com.lyc.wwyt.enums.QylxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 人员在岗在位信息表(t_qyqyryxx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 16:32:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "人员在岗在位信息表", name = "t_qyqyryxx")
@TableName("t_qyqyryxx")
public class TQyqyryxxEntity extends BaseEntity {

    private static final long serialVersionUID = 627674339820592214L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "区域类型", name = "regiontype", implementation = Integer.class)
    @NotNull(message = "区域类型不能为空")
    @EnumValueConstraint(enumClass = QylxEnum.class, message = "区域类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer regiontype;

    @Schema(description = "区域名称", name = "regionname", implementation = String.class, maxLength = 100)
    @NotBlank(message = "区域名称不能为空!")
    @Size(max = 100, message = "区域名称不能超过100个字符(1个汉字记两个字符)!")
    private String regionname;

    @Schema(description = "四色图区域id", name = "sstid", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "四色图区域id不能超过100个字符(1个汉字记两个字符)!")
    private String sstid;

    @Schema(description = "风险等级", name = "sstfxdj", implementation = String.class)
    @EnumValueConstraint(enumClass = FXDJEnum.class, message = "风险等级不在指定范围内,请根据字典表定义重新输入!")
    private String sstfxdj;

    @Schema(description = "四色图区域名称", name = "sstqymc", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "四色图区域名称不能超过100个字符(1个汉字记两个字符)!")
    private String sstqymc;

    @Schema(description = "身份证号码", name = "zjhm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "身份证号码不能为空!")
    @Pattern(regexp = "^(^[1-9]\\\\d{5}(18|19|20)\\\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\\\d{3}[0-9Xx]|\\\\d{8}(0[1-9]|1[0-2])([0-2]\\\\d|3[0-1])\\\\d{2}$)|(^[1-9]\\\\d{5}\\\\d{2}(0[1-9]|1[0-2])([0-2]\\\\d|3[0-1])\\\\d{3}$)\n", message = "身份证号码格式不正确!")
    private String zjhm;

    @Schema(description = "人员姓名", name = "ryxm", implementation = String.class, maxLength = 20)
    @NotBlank(message = "人员姓名不能为空!")
    @Size(max = 20, message = "人员姓名不能超过20个字符(1个汉字记两个字符)!")
    private String ryxm;

    @Schema(description = "所属单位", name = "ssdw", implementation = String.class, maxLength = 100)
    @NotBlank(message = "所属单位不能为空!")
    @Size(max = 100, message = "所属单位不能超过100个字符(1个汉字记两个字符)!")
    private String ssdw;

    @Schema(description = "企业编码", name = "companyCode", implementation = Integer.class, maxLength = 9)
    @NotNull(message = "企业编码不能为空")
    private Integer companyCode;

}
