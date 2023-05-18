package com.lyc.wwyt.entity;

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
 * 检查频次设定信息表(t_jcpcsdxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "检查频次设定信息表", name = "t_jcpcsdxx")
@TableName("t_jcpcsdxx")
public class TJcpcsdxxEntity extends BaseEntity {

    private static final long serialVersionUID = -22690221898185894L;

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

    @Schema(description = "所在部门", name = "szbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "所在部门不能为空!")
    @Size(max = 200, message = "所在部门不能超过200个字符(1个汉字记两个字符)!")
    private String szbm;

    @Schema(description = "岗位", name = "gw", implementation = String.class, maxLength = 200)
    @NotBlank(message = "岗位不能为空!")
    @Size(max = 200, message = "岗位不能超过200个字符(1个汉字记两个字符)!")
    private String gw;

    @Schema(description = "检查项目", name = "jcxm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "检查项目不能为空!")
    @Size(max = 200, message = "检查项目不能超过200个字符(1个汉字记两个字符)!")
    private String jcxm;

    @Schema(description = "检查频次", name = "jcpc", implementation = String.class, maxLength = 20)
    @NotBlank(message = "检查频次不能为空!")
    @Size(max = 20, message = "检查频次不能超过20个字符(1个汉字记两个字符)!")
    private String jcpc;

    @Schema(description = "检查次数", name = "jccs", implementation = Double.class, maxLength = 10)
    @NotNull(message = "检查次数不能为空")
    private Double jccs;

}
