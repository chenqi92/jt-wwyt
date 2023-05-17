package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.DwjbEnum;
import com.lyc.wwyt.enums.RYXBEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 应急队伍管理信息表(t_yjdwglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急队伍管理信息表", name = "t_yjdwglxx")
@TableName("t_yjdwglxx")
public class TYjdwglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 174704124953254851L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "队伍名称", name = "dwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "队伍名称不能为空!")
    @Size(max = 100, message = "队伍名称不能超过100个字符(1个汉字记两个字符)!")
    private String dwmc;

    @Schema(description = "队伍级别(1：公司；2：分厂-车间；3：工序-班组等)", name = "dwjb", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = DwjbEnum.class)
    private String dwjb;

    @Schema(description = "队伍负责人", name = "dwfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "队伍负责人不能为空!")
    @Size(max = 100, message = "队伍负责人不能超过100个字符(1个汉字记两个字符)!")
    private String dwfzr;

    @Schema(description = "负责人部门", name = "fzrbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "负责人部门不能为空!")
    @Size(max = 200, message = "负责人部门不能超过200个字符(1个汉字记两个字符)!")
    private String fzrbm;

    @Schema(description = "负责人手机", name = "fzrsj", implementation = String.class, maxLength = 11)
    @NotBlank(message = "负责人手机不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "负责人手机号码格式不正确!")
    private String fzrsj;

    @Schema(description = "固定电话(格式：区号-电话号码)", name = "gddh", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "固定电话(格式：区号-电话号码)不能超过50个字符(1个汉字记两个字符)!")
    private String gddh;

    @Schema(description = "队伍描述", name = "dwms", implementation = String.class)
    private String dwms;

    @Schema(description = "人员工号", name = "rygh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "人员工号不能为空!")
    @Size(max = 50, message = "人员工号不能超过50个字符(1个汉字记两个字符)!")
    private String rygh;

    @Schema(description = "人员名称", name = "rymc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "人员名称不能为空!")
    @Size(max = 100, message = "人员名称不能超过100个字符(1个汉字记两个字符)!")
    private String rymc;

    @Schema(description = "人员性别(1：男；2：女)", name = "ryxb", implementation = String.class, maxLength = 2)
    @EnumValueConstraint(enumClass = RYXBEnum.class)
    private String ryxb;

    @Schema(description = "手机号码", name = "sjhm", implementation = String.class, maxLength = 11)
    @NotBlank(message = "手机号码不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "手机号码格式不正确!")
    private String sjhm;

    @Schema(description = "职位", name = "zw", implementation = String.class, maxLength = 100)
    @NotBlank(message = "职位不能为空!")
    @Size(max = 100, message = "职位不能超过100个字符(1个汉字记两个字符)!")
    private String zw;

    @Schema(description = "相关附件(上传附件路径地址)", name = "xgfj", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "相关附件不能超过100个字符(1个汉字记两个字符)!")
    private String xgfj;

}
