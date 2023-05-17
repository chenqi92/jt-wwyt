package com.lyc.wwyt.entity;

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
 * 取证培训档案表(t_qzpxda)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "取证培训档案表", name = "t_qzpxda")
@TableName("t_qzpxda")
public class TQzpxdaEntity extends BaseEntity {

    private static final long serialVersionUID = -86195648646889115L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "姓名", name = "name", implementation = String.class, maxLength = 50)
    @NotBlank(message = "姓名不能为空!")
    @Size(max = 50, message = "姓名不能超过50个字符(1个汉字记两个字符)!")
    private String name;

    @Schema(description = "职务", name = "post", implementation = String.class, maxLength = 50)
    @NotBlank(message = "职务不能为空!")
    @Size(max = 50, message = "职务不能超过50个字符(1个汉字记两个字符)!")
    private String post;

    @Schema(description = "证书类型", name = "certificateType", implementation = String.class, maxLength = 200)
    @NotBlank(message = "证书类型不能为空!")
    @Size(max = 200, message = "证书类型不能超过200个字符(1个汉字记两个字符)!")
    private String certificateType;

    @Schema(description = "发证机关", name = "issuingAuthority", implementation = String.class, maxLength = 200)
    @NotBlank(message = "发证机关不能为空!")
    @Size(max = 200, message = "发证机关不能超过200个字符(1个汉字记两个字符)!")
    private String issuingAuthority;

    @Schema(description = "证书描述", name = "describe", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "证书描述不能超过500个字符(1个汉字记两个字符)!")
    private String describe;

    @Schema(description = "证书文件附件(上传路径)", name = "file", implementation = String.class, maxLength = 500)
    @NotBlank(message = "证书文件附件(上传路径)不能为空!")
    @Size(max = 500, message = "证书文件附件(上传路径)不能超过500个字符(1个汉字记两个字符)!")
    private String file;

    @Schema(description = "证书名称", name = "certificateName", implementation = String.class, maxLength = 200)
    @NotBlank(message = "证书名称不能为空!")
    @Size(max = 200, message = "证书名称不能超过200个字符(1个汉字记两个字符)!")
    private String certificateName;

    @Schema(description = "证书编号", name = "certificateNo", implementation = String.class, maxLength = 200)
    @NotBlank(message = "证书编号不能为空!")
    @Size(max = 200, message = "证书编号不能超过200个字符(1个汉字记两个字符)!")
    private String certificateNo;

    @Schema(description = "有效期", name = "validate", implementation = LocalDateTime.class)
    @NotNull(message = "有效期不能为空")
    private LocalDateTime validate;

}
