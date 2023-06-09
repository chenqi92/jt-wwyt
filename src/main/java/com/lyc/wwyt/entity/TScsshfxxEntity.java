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
 * 生产设备恢复信息(t_scsshfxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设备恢复信息", name = "t_scsshfxx")
@TableName("t_scsshfxx")
public class TScsshfxxEntity extends BaseEntity {

    private static final long serialVersionUID = -90291186078119172L;

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

    @Schema(description = "恢复理由", name = "hfly", implementation = String.class)
    @NotNull(message = "恢复理由不能为空")
    private String hfly;

    @Schema(description = "恢复填报日期", name = "hftbrq", implementation = LocalDate.class)
    @NotNull(message = "恢复填报日期不能为空")
    private LocalDate hftbrq;

    @Schema(description = "实际恢复日期", name = "sjhfrq", implementation = LocalDate.class)
    @NotNull(message = "实际恢复日期不能为空")
    private LocalDate sjhfrq;

}
