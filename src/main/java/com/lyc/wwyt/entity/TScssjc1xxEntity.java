package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.JcztEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 生产设施检测信息(t_scssjc1xx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施检测信息", name = "t_scssjc1xx")
@TableName("t_scssjc1xx")
public class TScssjc1xxEntity extends BaseEntity {

    private static final long serialVersionUID = -63716611326473802L;

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

    @Schema(description = "检测人", name = "jcr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "检测人不能为空!")
    @Size(max = 100, message = "检测人不能超过100个字符(1个汉字记两个字符)!")
    private String jcr;

    @Schema(description = "检测日期", name = "jcrq", implementation = LocalDate.class)
    @NotNull(message = "检测日期不能为空")
    private LocalDate jcrq;

    @Schema(description = "检测人单位", name = "jcrdw", implementation = String.class, maxLength = 200)
    @NotBlank(message = "检测人单位不能为空!")
    @Size(max = 200, message = "检测人单位不能超过200个字符(1个汉字记两个字符)!")
    private String jcrdw;

    @Schema(description = "检测内容", name = "jcnr", implementation = String.class, maxLength = 500)
    @NotBlank(message = "检测内容不能为空!")
    @Size(max = 500, message = "检测内容不能超过500个字符(1个汉字记两个字符)!")
    private String jcnr;

    @Schema(description = "检测结果", name = "jcjg", implementation = String.class, maxLength = 500)
    @NotBlank(message = "检测结果不能为空!")
    @Size(max = 500, message = "检测结果不能超过500个字符(1个汉字记两个字符)!")
    private String jcjg;

    @Schema(description = "检测状态", name = "jczt", implementation = Integer.class)
    @NotNull(message = "检测状态不能为空")
    @EnumValueConstraint(enumClass = JcztEnum.class, message = "检测状态类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer jczt;

}
