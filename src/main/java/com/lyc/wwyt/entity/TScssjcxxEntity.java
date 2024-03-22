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
 * 生产设施检查信息(t_scssjcxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施检查信息", name = "t_scssjcxx")
@TableName("t_scssjcxx")
public class TScssjcxxEntity extends BaseEntity {

    private static final long serialVersionUID = -77577735825526824L;

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

    @Schema(description = "检查内容", name = "jcnr", implementation = String.class)
    @NotNull(message = "检查内容不能为空")
    private String jcnr;

    @Schema(description = "负责部门", name = "fzbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "负责部门不能为空!")
    @Size(max = 200, message = "负责部门不能超过200个字符(1个汉字记两个字符)!")
    private String fzbm;

    @Schema(description = "检查指标", name = "jczb", implementation = String.class, maxLength = 100)
    @NotBlank(message = "检查指标不能为空!")
    @Size(max = 100, message = "检查指标不能超过100个字符(1个汉字记两个字符)!")
    private String jczb;

    @Schema(description = "预警值", name = "yjz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "预警值不能为空!")
    @Size(max = 100, message = "预警值不能超过100个字符(1个汉字记两个字符)!")
    private String yjz;

    @Schema(description = "联锁值", name = "lsz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "联锁值不能为空!")
    @Size(max = 100, message = "联锁值不能超过100个字符(1个汉字记两个字符)!")
    private String lsz;

    @Schema(description = "检查人", name = "jcr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "检查人不能为空!")
    @Size(max = 100, message = "检查人不能超过100个字符(1个汉字记两个字符)!")
    private String jcr;

    @Schema(description = "检查日期", name = "jcrq", implementation = LocalDate.class)
    @NotNull(message = "检查日期不能为空")
    private LocalDate jcrq;

    @Schema(description = "检查人部门", name = "jcrbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "检查人部门不能为空!")
    @Size(max = 200, message = "检查人部门不能超过200个字符(1个汉字记两个字符)!")
    private String jcrbm;

    @Schema(description = "检查结果", name = "jcjg", implementation = String.class, maxLength = 500)
    @NotBlank(message = "检查结果不能为空!")
    @Size(max = 500, message = "检查结果不能超过500个字符(1个汉字记两个字符)!")
    private String jcjg;

    @Schema(description = "检查状态", name = "jczt", implementation = Integer.class)
    @NotNull(message = "检查状态不能为空")
    @EnumValueConstraint(enumClass = JcztEnum.class, message = "检查状态类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer jczt;

    @Schema(description = "附件名称", name = "fjmc", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "附件名称不能超过500个字符(1个汉字记两个字符)!")
    private String fjmc;

    @Schema(description = "附件", name = "fj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "附件不能超过1000个字符(1个汉字记两个字符)!")
    private String fj;

}
