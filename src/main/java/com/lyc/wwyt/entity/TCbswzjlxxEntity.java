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
 * 承包商违章记录信息表(t_cbswzjlxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商违章记录信息表", name = "t_cbswzjlxx")
@TableName("t_cbswzjlxx")
public class TCbswzjlxxEntity extends BaseEntity {

    private static final long serialVersionUID = 359156450724664088L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "承包商ID(承包商t_cbsglxx表id)", name = "sscbs", implementation = String.class, maxLength = 36)
    @NotBlank(message = "承包商ID不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    private String sscbs;

    @Schema(description = "项目名称", name = "xmmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "项目名称不能为空!")
    @Size(max = 100, message = "项目名称不能超过100个字符(1个汉字记两个字符)!")
    private String xmmc;

    @Schema(description = "违章日期", name = "wzrq", implementation = LocalDate.class)
    @NotNull(message = "违章日期不能为空")
    private LocalDate wzrq;

    @Schema(description = "处理结果", name = "cljg", implementation = String.class, maxLength = 100)
    @NotBlank(message = "处理结果不能为空!")
    @Size(max = 100, message = "处理结果不能超过100个字符(1个汉字记两个字符)!")
    private String cljg;

    @Schema(description = "违章人姓名", name = "wzrxm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "违章人姓名不能为空!")
    @Size(max = 100, message = "违章人姓名不能超过100个字符(1个汉字记两个字符)!")
    private String wzrxm;

}
