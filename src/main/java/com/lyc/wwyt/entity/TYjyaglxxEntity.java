package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.YAJBEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 应急预案管理信息表(t_yjyaglxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急预案管理信息表", name = "t_yjyaglxx")
@TableName("t_yjyaglxx")
public class TYjyaglxxEntity extends BaseEntity {

    private static final long serialVersionUID = -79404422315671832L;

    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, maxLength = 36)
    @NotBlank(message = "主键UUID(32位或者36位字符)不能为空!")
    @Size(max = 36, message = "主键UUID(32位或者36位字符)不能超过36个字符(1个汉字记两个字符)!")
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "预案名称", name = "yamc", implementation = String.class, maxLength = 200)
    @NotBlank(message = "预案名称不能为空!")
    @Size(max = 200, message = "预案名称不能超过200个字符(1个汉字记两个字符)!")
    private String yamc;

    @Schema(description = "适用部门", name = "sybm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "适用部门不能为空!")
    @Size(max = 200, message = "适用部门不能超过200个字符(1个汉字记两个字符)!")
    private String sybm;

    @Schema(description = "预案类型", name = "yalx", implementation = String.class, maxLength = 100)
    @NotBlank(message = "预案类型不能为空!")
    @Size(max = 100, message = "预案类型不能超过100个字符(1个汉字记两个字符)!")
    private String yalx;

    @Schema(description = "危险源关联", name = "wxygl", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "危险源关联不能超过200个字符(1个汉字记两个字符)!")
    private String wxygl;

    @Schema(description = "预案级别", name = "yajb", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = YAJBEnum.class)
    private String yajb;

    @Schema(description = "编写人", name = "bxr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "编写人不能为空!")
    @Size(max = 100, message = "编写人不能超过100个字符(1个汉字记两个字符)!")
    private String bxr;

    @Schema(description = "编写部门", name = "bxbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "编写部门不能为空!")
    @Size(max = 200, message = "编写部门不能超过200个字符(1个汉字记两个字符)!")
    private String bxbm;

    @Schema(description = "发布实施日期", name = "fbssrq", implementation = LocalDate.class)
    @NotNull(message = "发布实施日期不能为空")
    private LocalDate fbssrq;

    @Schema(description = "预案附件(上传附件的路径地址)", name = "yafj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "预案附件不能超过1000个字符(1个汉字记两个字符)!")
    private String yafj;

    @Schema(description = "备案时间", name = "basj", implementation = LocalDateTime.class)
    private LocalDateTime basj;

    @Schema(description = "备案回执附件(上传附件的路径地址)", name = "bahzfj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "备案回执附件不能超过1000个字符(1个汉字记两个字符)!")
    private String bahzfj;

}
