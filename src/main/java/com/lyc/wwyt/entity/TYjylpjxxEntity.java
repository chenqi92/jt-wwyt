package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.PjztEnum;
import com.lyc.wwyt.enums.SfzgEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 应急演练评价表（t_yjylpjxx）(t_yjylpjxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急演练评价表（t_yjylpjxx）", name = "t_yjylpjxx")
@TableName("t_yjylpjxx")
public class TYjylpjxxEntity extends BaseEntity {

    private static final long serialVersionUID = -74082873488233984L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "演练计划ID", name = "yljh", implementation = String.class, maxLength = 36)
    @NotBlank(message = "演练计划ID不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    private String yljh;

    @Schema(description = "实际演练日期", name = "sjylrq", implementation = LocalDate.class)
    @NotNull(message = "实际演练日期不能为空")
    private LocalDate sjylrq;

    @Schema(description = "演练实施人员(多选)", name = "ylssry", implementation = String.class, maxLength = 100)
    @NotBlank(message = "演练实施人员不能为空!")
    @Size(max = 100, message = "演练实施人员不能超过100个字符(1个汉字记两个字符)!")
    private String ylssry;

    @Schema(description = "主要参演人员(多选)", name = "zycyry", implementation = String.class, maxLength = 100)
    @NotBlank(message = "主要参演人员不能为空!")
    @Size(max = 100, message = "主要参演人员不能超过100个字符(1个汉字记两个字符)!")
    private String zycyry;

    @Schema(description = "其它参演部门(多选)", name = "qtcybm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "其它参演部门不能为空!")
    @Size(max = 200, message = "其它参演部门不能超过200个字符(1个汉字记两个字符)!")
    private String qtcybm;

    @Schema(description = "演练内容", name = "ylnr", implementation = String.class)
    @NotNull(message = "演练内容不能为空")
    private String ylnr;

    @Schema(description = "演练目的", name = "ylmd", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "演练目的不能超过500个字符(1个汉字记两个字符)!")
    private String ylmd;

    @Schema(description = "演练过程", name = "ylgc", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "演练过程不能超过500个字符(1个汉字记两个字符)!")
    private String ylgc;

    @Schema(description = "演练小结", name = "ylxj", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "演练小结不能超过500个字符(1个汉字记两个字符)!")
    private String ylxj;

    @Schema(description = "不足因素描述", name = "bzysms", implementation = String.class, maxLength = 500)
    @NotBlank(message = "不足因素描述不能为空!")
    @Size(max = 500, message = "不足因素描述不能超过500个字符(1个汉字记两个字符)!")
    private String bzysms;

    @Schema(description = "是否整改(0:否,1:是)", name = "sfzg", implementation = Integer.class)
    @EnumValueConstraint(enumClass = SfzgEnum.class)
    private Integer sfzg;

    @Schema(description = "评价意见", name = "pjyj", implementation = String.class, maxLength = 500)
    @NotBlank(message = "评价意见不能为空!")
    @Size(max = 500, message = "评价意见不能超过500个字符(1个汉字记两个字符)!")
    private String pjyj;

    @Schema(description = "评价状态(1:评价中;2:已评价)", name = "pjzt", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = PjztEnum.class)
    private String pjzt;

    @Schema(description = "相关附件(上传附件的路径地址)", name = "xgfj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "相关附件不能超过1000个字符(1个汉字记两个字符)!")
    private String xgfj;

}
