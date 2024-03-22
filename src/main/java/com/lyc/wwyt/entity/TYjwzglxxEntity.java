package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.SmzqEnum;
import com.lyc.wwyt.enums.WzflEnum;
import com.lyc.wwyt.enums.WzztEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.*;
import java.time.LocalDate;

/**
 * 应急物资管理信息表(t_yjwzglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急物资管理信息表", name = "t_yjwzglxx")
@TableName("t_yjwzglxx")
public class TYjwzglxxEntity extends BaseEntity {

    private static final long serialVersionUID = -59510481256892699L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "物资名称", name = "wzmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "物资名称不能为空!")
    @Size(max = 100, message = "物资名称不能超过100个字符(1个汉字记两个字符)!")
    private String wzmc;

    @Schema(description = "物资编号", name = "wzbh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "物资编号不能为空!")
    @Size(max = 50, message = "物资编号不能超过50个字符(1个汉字记两个字符)!")
    private String wzbh;

    @Schema(description = "物资用途", name = "wzyt", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "物资用途不能超过500个字符(1个汉字记两个字符)!")
    private String wzyt;

    @Schema(description = "物资型号", name = "wzxh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "物资型号不能为空!")
    @Size(max = 100, message = "物资型号不能超过100个字符(1个汉字记两个字符)!")
    private String wzxh;

    @Schema(description = "负责部门", name = "fzbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "负责部门不能为空!")
    @Size(max = 200, message = "负责部门不能超过200个字符(1个汉字记两个字符)!")
    private String fzbm;

    @Schema(description = "物资分类", name = "wzfl", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = WzflEnum.class)
    private String wzfl;

    @Schema(description = "存放位置", name = "cfwz", implementation = String.class, maxLength = 50)
    @NotBlank(message = "存放位置不能为空!")
    @Size(max = 50, message = "存放位置不能超过50个字符(1个汉字记两个字符)!")
    private String cfwz;

    @Schema(description = "存储数量", name = "ccsl", implementation = String.class, maxLength = 50)
    @NotBlank(message = "存储数量不能为空!")
    @Size(max = 50, message = "存储数量不能超过50个字符(1个汉字记两个字符)!")
    private String ccsl;

    @Schema(description = "生产日期", name = "scrq", implementation = LocalDate.class)
    @NotNull(message = "生产日期不能为空")
    private LocalDate scrq;

    @Schema(description = "使用期限(单位：月)", name = "syqy", implementation = Integer.class)
    @NotNull(message = "使用期限(单位：月)不能为空")
    @Min(value = 0, message = "超出使用期限允许范围内!")
    @Max(value = 99, message = "超出使用期限允许范围内!")
    private Integer syqy;

    @Schema(description = "生命周期", name = "smzq", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = SmzqEnum.class)
    private String smzq;

    @Schema(description = "物资状态", name = "wzzt", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = WzztEnum.class)
    private String wzzt;

    @Schema(description = "投用日期", name = "tyrq", implementation = LocalDate.class)
    @NotNull(message = "投用日期不能为空")
    private LocalDate tyrq;

    @Schema(description = "使用说明", name = "sysm", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "使用说明不能超过1000个字符(1个汉字记两个字符)!")
    private String sysm;

}
