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
 * 隐患排查记录表(t_yhpcjl)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "隐患排查记录表", name = "t_yhpcjl")
@TableName("t_yhpcjl")
public class TYhpcjlEntity extends BaseEntity {

    private static final long serialVersionUID = 951429813192401339L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "隐患排查任务ID", name = "checkTaskId", implementation = String.class, maxLength = 36)
    @NotBlank(message = "隐患排查任务ID不能为空!")
    @Size(max = 36, message = "隐患排查任务ID不能超过36个字符(1个汉字记两个字符)!")
    private String checkTaskId;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(max = 18, message = "统一社会信用代码不能超过18个字符(1个汉字记两个字符)!")
    private String tyshxydm;

    @Schema(description = "排查时间", name = "checkTime", implementation = LocalDateTime.class)
    @NotNull(message = "排查时间不能为空")
    private LocalDateTime checkTime;

    @Schema(description = "排查结果(正常:0;存在隐患:1;未排查:2;其他:3 )", name = "checkStatus", implementation = String.class, maxLength = 1)
    @NotBlank(message = "排查结果(正常:0;存在隐患:1;未排查:2;其他:3 )不能为空!")
    @Size(max = 1, message = "排查结果(正常:0;存在隐患:1;未排查:2;其他:3 )不能超过1个字符(1个汉字记两个字符)!")
    private String checkStatus;

    @Schema(description = "创建人手机号", name = "createByMobile", implementation = String.class, maxLength = 20)
    @NotBlank(message = "创建人手机号不能为空!")
    @Size(max = 20, message = "创建人手机号不能超过20个字符(1个汉字记两个字符)!")
    private String createByMobile;

    @Schema(description = "最后修改人手机号", name = "updateByMobile", implementation = String.class, maxLength = 20)
    @NotBlank(message = "最后修改人手机号不能为空!")
    @Size(max = 20, message = "最后修改人手机号不能超过20个字符(1个汉字记两个字符)!")
    private String updateByMobile;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Size(max = 9, message = "企业编码不能超过9个字符(1个汉字记两个字符)!")
    private String companyCode;

}
