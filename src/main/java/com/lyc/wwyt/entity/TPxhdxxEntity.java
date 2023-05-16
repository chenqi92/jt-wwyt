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
 * 培训活动信息表(t_pxhdxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训活动信息表", name = "t_pxhdxx")
@TableName("t_pxhdxx")
public class TPxhdxxEntity extends BaseEntity {

    private static final long serialVersionUID = 802479053833034726L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "培训类别", name = "pxlb", implementation = String.class, maxLength = 50)
    @NotBlank(message = "培训类别不能为空!")
    @Size(max = 50, message = "培训类别不能超过50个字符(1个汉字记两个字符)!")
    private String pxlb;

    @Schema(description = "培训学时", name = "pxxs", implementation = Object.class)
    @NotNull(message = "培训学时不能为空")
    private Object pxxs;

    @Schema(description = "培训日期", name = "pxrq", implementation = LocalDate.class)
    @NotNull(message = "培训日期不能为空")
    private LocalDate pxrq;

    @Schema(description = "培训单位", name = "pxdw", implementation = String.class, maxLength = 200)
    @NotBlank(message = "培训单位不能为空!")
    @Size(max = 200, message = "培训单位不能超过200个字符(1个汉字记两个字符)!")
    private String pxdw;

    @Schema(description = "培训讲师", name = "pxjs", implementation = String.class, maxLength = 50)
    @NotBlank(message = "培训讲师不能为空!")
    @Size(max = 50, message = "培训讲师不能超过50个字符(1个汉字记两个字符)!")
    private String pxjs;

    @Schema(description = "培训简介", name = "pxjj", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "培训简介不能超过100个字符(1个汉字记两个字符)!")
    private String pxjj;

    @Schema(description = "参加人数", name = "cjrs", implementation = Object.class)
    @NotNull(message = "参加人数不能为空")
    private Object cjrs;

    @Schema(description = "及格分数", name = "jgfs", implementation = Double.class, maxLength = 10)
    @NotNull(message = "及格分数不能为空")
    private Double jgfs;

    @Schema(description = "培训地点", name = "pxdd", implementation = String.class, maxLength = 50)
    @NotBlank(message = "培训地点不能为空!")
    @Size(max = 50, message = "培训地点不能超过50个字符(1个汉字记两个字符)!")
    private String pxdd;

    @Schema(description = "考核单位", name = "khdw", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "考核单位不能超过50个字符(1个汉字记两个字符)!")
    private String khdw;

    @Schema(description = "培训费用", name = "pxfy", implementation = Double.class, maxLength = 10)
    private Double pxfy;

    @Schema(description = "参加人员姓名", name = "cjry", implementation = String.class, maxLength = 500)
    @NotBlank(message = "参加人员姓名不能为空!")
    @Size(max = 500, message = "参加人员姓名不能超过500个字符(1个汉字记两个字符)!")
    private String cjry;

    @Schema(description = "签到表", name = "qdb", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "签到表不能超过1000个字符(1个汉字记两个字符)!")
    private String qdb;

    @Schema(description = "现场照片", name = "xczp", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "现场照片不能超过1000个字符(1个汉字记两个字符)!")
    private String xczp;

}
