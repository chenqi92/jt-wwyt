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
 * 生产设施停用信息(t_scsstyxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施停用信息", name = "t_scsstyxx")
@TableName("t_scsstyxx")
public class TScsstyxxEntity extends BaseEntity {

    private static final long serialVersionUID = 711031272974340788L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "生产设施 t_scssxx 的 id", name = "scssid", implementation = String.class, maxLength = 8)
    @NotBlank(message = "生产设施 t_scssxx 的 id不能为空!")
    @Size(max = 8, message = "生产设施 t_scssxx 的 id不能超过8个字符(1个汉字记两个字符)!")
    private String scssid;

    @Schema(description = "停用理由", name = "tyly", implementation = String.class)
    @NotNull(message = "停用理由不能为空")
    private String tyly;

    @Schema(description = "停用后措施", name = "tyhcs", implementation = String.class)
    @NotNull(message = "停用后措施不能为空")
    private String tyhcs;

    @Schema(description = "实际停用日期", name = "sjtyrq", implementation = LocalDate.class)
    @NotNull(message = "实际停用日期不能为空")
    private LocalDate sjtyrq;

    @Schema(description = "停用提交人", name = "tytjr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "停用提交人不能为空!")
    @Size(max = 100, message = "停用提交人不能超过100个字符(1个汉字记两个字符)!")
    private String tytjr;

    @Schema(description = "停用提交日期", name = "tytjrq", implementation = LocalDate.class)
    @NotNull(message = "停用提交日期不能为空")
    private LocalDate tytjrq;

}
