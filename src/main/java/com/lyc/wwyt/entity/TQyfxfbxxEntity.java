package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 企业安全风险分布信息表(t_qyfxfbxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业安全风险分布信息表", name = "t_qyfxfbxx")
@TableName("t_qyfxfbxx")
public class TQyfxfbxxEntity extends BaseEntity {

    private static final long serialVersionUID = 486936263074671378L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    /**
     * Base64格式的尺寸约为原始数据的4/3
     */
    @Schema(description = "安全风险空间分布图(图片的base64 编码)", name = "img", implementation = String.class)
    @NotBlank(message = "安全风险空间分布图不能为空")
    @Pattern(regexp = "^data:image/(?:png|jpeg|jpg);base64,([a-zA-Z0-9+/]{4})*([a-zA-Z0-9+/]{2}==|[a-zA-Z0-9+/]{3}=|[a-zA-Z0-9+/]{4})$", message = "图片格式必须为png或者jpg!")
    @Size(max = 7340032, message = "图片大小不能大于5M!")
    private String img;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Pattern(regexp = "^\\d{9}$", message = "企业编码为小于9位的数字字符串!")
    private String companyCode;

}
