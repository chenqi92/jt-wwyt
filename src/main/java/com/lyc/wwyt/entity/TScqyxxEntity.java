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
 * 生产区域信息表(t_scqyxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产区域信息表", name = "t_scqyxx")
@TableName("t_scqyxx")
public class TScqyxxEntity extends BaseEntity {

    private static final long serialVersionUID = -66210597806069583L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "区域名称", name = "qymc", implementation = String.class, maxLength = 50)
    @NotBlank(message = "区域名称不能为空!")
    @Size(max = 50, message = "区域名称不能超过50个字符(1个汉字记两个字符)!")
    private String qymc;

    @Schema(description = "所属部门", name = "ssbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "所属部门不能为空!")
    @Size(max = 200, message = "所属部门不能超过200个字符(1个汉字记两个字符)!")
    private String ssbm;

    @Schema(description = "区域位号", name = "qywh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "区域位号不能为空!")
    @Size(max = 50, message = "区域位号不能超过50个字符(1个汉字记两个字符)!")
    private String qywh;

    @Schema(description = "区域等级", name = "qydj", implementation = String.class, maxLength = 50)
    @NotBlank(message = "区域等级不能为空!")
    @Size(max = 50, message = "区域等级不能超过50个字符(1个汉字记两个字符)!")
    private String qydj;

    @Schema(description = "负责人", name = "fzr", implementation = String.class, maxLength = 50)
    @NotBlank(message = "负责人不能为空!")
    @Size(max = 50, message = "负责人不能超过50个字符(1个汉字记两个字符)!")
    private String fzr;

    @Schema(description = "负责人部门", name = "fzrbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "负责人部门不能为空!")
    @Size(max = 200, message = "负责人部门不能超过200个字符(1个汉字记两个字符)!")
    private String fzrbm;

    @Schema(description = "负责人工号", name = "fzrgh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "负责人工号不能为空!")
    @Size(max = 50, message = "负责人工号不能超过50个字符(1个汉字记两个字符)!")
    private String fzrgh;

    @Schema(description = "负责人联系电话", name = "fzrlxdh", implementation = String.class, maxLength = 50)
    @NotBlank(message = "负责人联系电话不能为空!")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "负责人联系电话号码格式不正确!")
    private String fzrlxdh;

    @Schema(description = "备注", name = "bz", implementation = String.class, maxLength = 50)
    @Size(max = 50, message = "备注不能超过50个字符(1个汉字记两个字符)!")
    private String bz;

}
