package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.YlfsEnum;
import com.lyc.wwyt.enums.YljbEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 应急演练计划信息表(t_yjyljhxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急演练计划信息表", name = "t_yjyljhxx")
@TableName("t_yjyljhxx")
public class TYjyljhxxEntity extends BaseEntity {

    private static final long serialVersionUID = 475710723368547403L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "演练名称", name = "ylmc", implementation = String.class, maxLength = 200)
    @NotBlank(message = "演练名称不能为空!")
    @Size(max = 200, message = "演练名称不能超过200个字符(1个汉字记两个字符)!")
    private String ylmc;

    @Schema(description = "演练地点", name = "yldd", implementation = String.class, maxLength = 200)
    @NotBlank(message = "演练地点不能为空!")
    @Size(max = 200, message = "演练地点不能超过200个字符(1个汉字记两个字符)!")
    private String yldd;

    @Schema(description = "主办部门", name = "zbbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "主办部门不能为空!")
    @Size(max = 200, message = "主办部门不能超过200个字符(1个汉字记两个字符)!")
    private String zbbm;

    @Schema(description = "演练方式：1-综合；2-桌面；3-专项", name = "ylfs", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = YlfsEnum.class)
    private String ylfs;

    @Schema(description = "应急预案主键UUID", name = "yjya", implementation = String.class, maxLength = 36)
    @NotBlank(message = "应急预案主键UUID不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    private String yjya;

    @Schema(description = "演练级别：1-公司级；2-分厂级；3-车间级", name = "yljb", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = YljbEnum.class)
    private String yljb;

    @Schema(description = "计划定制日期", name = "jhdzrq", implementation = LocalDate.class)
    @NotNull(message = "计划定制日期不能为空")
    private LocalDate jhdzrq;

    @Schema(description = "计划演练日期", name = "jhylrq", implementation = LocalDate.class)
    @NotNull(message = "计划演练日期不能为空")
    private LocalDate jhylrq;

    @Schema(description = "计划定制人", name = "jhzdr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "计划定制人不能为空!")
    @Size(max = 100, message = "计划定制人不能超过100个字符(1个汉字记两个字符)!")
    private String jhzdr;

    @Schema(description = "备注", name = "bz", implementation = String.class)
    private String bz;

    @Schema(description = "相关附件(上传附件的路径地址)", name = "xgfj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "相关附件不能超过1000个字符(1个汉字记两个字符)!")
    private String xgfj;

}
