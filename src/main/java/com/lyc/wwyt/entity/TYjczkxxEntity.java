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

/**
 * 应急处置卡信息表：t_yjczkxx(t_yjczkxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急处置卡信息表：t_yjczkxx", name = "t_yjczkxx")
@TableName("t_yjczkxx")
public class TYjczkxxEntity extends BaseEntity {

    private static final long serialVersionUID = -65851205765998410L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "应急卡名称", name = "yjkmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "应急卡名称不能为空!")
    @Size(max = 100, message = "应急卡名称不能超过100个字符(1个汉字记两个字符)!")
    private String yjkmc;

    @Schema(description = "关联岗位名称", name = "glgwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "关联岗位名称不能为空!")
    @Size(max = 100, message = "关联岗位名称不能超过100个字符(1个汉字记两个字符)!")
    private String glgwmc;

    @Schema(description = "处置卡编号", name = "czkbh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "处置卡编号不能为空!")
    @Size(max = 50, message = "处置卡编号不能超过50个字符(1个汉字记两个字符)!")
    private String czkbh;

    @Schema(description = "事故风险", name = "sgfx", implementation = String.class)
    @NotNull(message = "事故风险不能为空")
    private String sgfx;

    @Schema(description = "发生场所", name = "fscs", implementation = String.class, maxLength = 100)
    @NotBlank(message = "发生场所不能为空!")
    @Size(max = 100, message = "发生场所不能超过100个字符(1个汉字记两个字符)!")
    private String fscs;

    @Schema(description = "工艺说明(图片的base64编码)", name = "gysm", implementation = String.class)
    @Pattern(regexp = "^data:image/(?:png|jpeg|jpg);base64,([a-zA-Z0-9+/]{4})*([a-zA-Z0-9+/]{2}==|[a-zA-Z0-9+/]{3}=|[a-zA-Z0-9+/]{4})$", message = "图片格式必须为png或者jpg!")
    private String gysm;

    @Schema(description = "事故特征", name = "sgtz", implementation = String.class)
    private String sgtz;

    @Schema(description = "危害描述", name = "whms", implementation = String.class)
    @NotNull(message = "危害描述不能为空")
    private String whms;

    @Schema(description = "步骤说明", name = "bzsm", implementation = String.class)
    private String bzsm;

    @Schema(description = "处置措施", name = "czcs", implementation = String.class)
    @NotNull(message = "处置措施不能为空")
    private String czcs;

    @Schema(description = "主要责任人", name = "zyzrr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "主要责任人不能为空!")
    @Size(max = 100, message = "主要责任人不能超过100个字符(1个汉字记两个字符)!")
    private String zyzrr;

    @Schema(description = "注意事项", name = "zysx", implementation = String.class)
    private String zysx;

    @Schema(description = "内部应急电话", name = "nbyjdh", implementation = String.class, maxLength = 20)
    @NotBlank(message = "内部应急电话不能为空!")
    @Size(max = 20, message = "内部应急电话不能超过20个字符(1个汉字记两个字符)!")
    private String nbyjdh;

    @Schema(description = "外部应急电话", name = "wbyjdh", implementation = String.class, maxLength = 20)
    @NotBlank(message = "外部应急电话不能为空!")
    @Size(max = 20, message = "外部应急电话不能超过20个字符(1个汉字记两个字符)!")
    private String wbyjdh;

    @Schema(description = "附件(应急处置卡相关图片base64 编码)", name = "fj", implementation = String.class)
    @NotNull(message = "附件不能为空")
    @Pattern(regexp = "^data:image/(?:png|jpeg|jpg);base64,([a-zA-Z0-9+/]{4})*([a-zA-Z0-9+/]{2}==|[a-zA-Z0-9+/]{3}=|[a-zA-Z0-9+/]{4})$", message = "图片格式必须为png或者jpg!")
    @Size(max = 7340032, message = "图片大小不能大于5M!")
    private String fj;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Pattern(regexp = "^\\d{9}$", message = "企业编码为小于9位的数字字符串!")
    private String companyCode;

}
