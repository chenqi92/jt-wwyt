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
 * 培训计划信息表(t_pxjhxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训计划信息表", name = "t_pxjhxx")
@TableName("t_pxjhxx")
public class TPxjhxxEntity extends BaseEntity {

    private static final long serialVersionUID = -35249891516998400L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "计划名称", name = "jjmc", implementation = String.class, maxLength = 200)
    @NotBlank(message = "计划名称不能为空!")
    @Size(max = 200, message = "计划名称不能超过200个字符(1个汉字记两个字符)!")
    private String jjmc;

    @Schema(description = "制定日期", name = "zdrq", implementation = LocalDate.class)
    @NotNull(message = "制定日期不能为空")
    private LocalDate zdrq;

    @Schema(description = "实施日期", name = "jhssrq", implementation = LocalDate.class)
    @NotNull(message = "实施日期不能为空")
    private LocalDate jhssrq;

    @Schema(description = "培训内容", name = "pxnr", implementation = String.class)
    private String pxnr;

    @Schema(description = "编制人", name = "bzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "编制人不能为空!")
    @Size(max = 100, message = "编制人不能超过100个字符(1个汉字记两个字符)!")
    private String bzr;

    @Schema(description = "编制部门", name = "bzbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "编制部门不能为空!")
    @Size(max = 200, message = "编制部门不能超过200个字符(1个汉字记两个字符)!")
    private String bzbm;

    @Schema(description = "附件", name = "fj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "附件不能超过1000个字符(1个汉字记两个字符)!")
    private String fj;

    @Schema(description = "培训部门", name = "zrbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "培训部门不能为空!")
    @Size(max = 200, message = "培训部门不能超过200个字符(1个汉字记两个字符)!")
    private String zrbm;

    @Schema(description = "培训讲师", name = "zrr", implementation = String.class, maxLength = 50)
    @NotBlank(message = "培训讲师不能为空!")
    @Size(max = 50, message = "培训讲师不能超过50个字符(1个汉字记两个字符)!")
    private String zrr;

    @Schema(description = "完成日期", name = "wcrq", implementation = LocalDate.class)
    @NotNull(message = "完成日期不能为空")
    private LocalDate wcrq;

    @Schema(description = "计划年度", name = "jhnd", implementation = Integer.class)
    @NotNull(message = "计划年度不能为空")
    private Integer jhnd;

    @Schema(description = "培训类型", name = "pxlx", implementation = String.class, maxLength = 20)
    @NotBlank(message = "培训类型不能为空!")
    @Size(max = 20, message = "培训类型不能超过20个字符(1个汉字记两个字符)!")
    private String pxlx;

}
