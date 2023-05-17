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
import java.time.LocalDateTime;

/**
 * 承包商相关证书表(t_cbsxgzs)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商相关证书表", name = "t_cbsxgzs")
@TableName("t_cbsxgzs")
public class TCbsxgzsEntity extends BaseEntity {

    private static final long serialVersionUID = 353903745744888798L;

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

    @Schema(description = "资质证书名称", name = "name", implementation = String.class, maxLength = 100)
    @NotBlank(message = "资质证书名称不能为空!")
    @Size(max = 100, message = "资质证书名称不能超过100个字符(1个汉字记两个字符)!")
    private String name;

    @Schema(description = "级别", name = "level", implementation = String.class, maxLength = 100)
    @NotBlank(message = "级别不能为空!")
    @Size(max = 100, message = "级别不能超过100个字符(1个汉字记两个字符)!")
    private String level;

    @Schema(description = "许可内容", name = "content", implementation = String.class)
    @NotNull(message = "许可内容不能为空")
    private String content;

    @Schema(description = "许可有效期始", name = "startTime", implementation = LocalDateTime.class)
    @NotNull(message = "许可有效期始不能为空")
    private LocalDateTime startTime;

    @Schema(description = "许可有效期止", name = "dueTime", implementation = LocalDateTime.class)
    @NotNull(message = "许可有效期止不能为空")
    private LocalDateTime dueTime;

    @Schema(description = "上传附件", name = "appendix", implementation = String.class, maxLength = 1000)
    @NotBlank(message = "上传附件不能为空!")
    @Size(max = 1000, message = "上传附件不能超过1000个字符(1个汉字记两个字符)!")
    private String appendix;

    @Schema(description = "资质证书编号", name = "no", implementation = String.class, maxLength = 200)
    @NotBlank(message = "资质证书编号不能为空!")
    @Size(max = 200, message = "资质证书编号不能超过200个字符(1个汉字记两个字符)!")
    private String no;

}
