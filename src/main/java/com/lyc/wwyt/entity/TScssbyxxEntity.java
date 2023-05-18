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
 * 生产设施保养信息(t_scssbyxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施保养信息", name = "t_scssbyxx")
@TableName("t_scssbyxx")
public class TScssbyxxEntity extends BaseEntity {

    private static final long serialVersionUID = -28066307614916575L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "生产设施 id", name = "scssid", implementation = String.class, maxLength = 36)
    @NotBlank(message = "生产设施 id不能为空!")
    @Size(max = 36, message = "生产设施 id不能超过36个字符(1个汉字记两个字符)!")
    private String scssid;

    @Schema(description = "保养情况", name = "byqk", implementation = String.class)
    @NotNull(message = "保养情况不能为空")
    private String byqk;

    @Schema(description = "保养负责人", name = "byfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "保养负责人不能为空!")
    @Size(max = 100, message = "保养负责人不能超过100个字符(1个汉字记两个字符)!")
    private String byfzr;

    @Schema(description = "保养日期", name = "byrq", implementation = LocalDate.class)
    @NotNull(message = "保养日期不能为空")
    private LocalDate byrq;

    @Schema(description = "保养负责人单位", name = "bafzrdw", implementation = String.class, maxLength = 200)
    @NotBlank(message = "保养负责人单位不能为空!")
    @Size(max = 200, message = "保养负责人单位不能超过200个字符(1个汉字记两个字符)!")
    private String bafzrdw;

    @Schema(description = "保养标准附件", name = "bybzfj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "保养标准附件不能超过1000个字符(1个汉字记两个字符)!")
    private String bybzfj;

}
