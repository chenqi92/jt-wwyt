package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 生产设备报废信息(t_scssbfxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设备报废信息", name = "t_scssbfxx")
@TableName("t_scssbfxx")
public class TScssbfxxEntity extends BaseEntity {

    private static final long serialVersionUID = -34930034797222041L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "生产设施id", name = "scssid", implementation = String.class, maxLength = 8)
    @NotBlank(message = "生产设施id不能为空!")
    @Size(max = 8, message = "生产设施id不能超过8个字符(1个汉字记两个字符)!")
    private String scssid;

    @Schema(description = "报废理由", name = "bfly", implementation = String.class)
    @NotNull(message = "报废理由不能为空")
    private String bfly;

    @Schema(description = "报废填报日期", name = "bftbrq", implementation = LocalDate.class)
    @NotNull(message = "报废填报日期不能为空")
    private LocalDate bftbrq;

    @Schema(description = "实际报废日期", name = "sjbfrq", implementation = LocalDate.class)
    @NotNull(message = "实际报废日期不能为空")
    private LocalDate sjbfrq;

}
