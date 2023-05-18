package com.lyc.wwyt.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.DwlxEnum;
import com.lyc.wwyt.enums.ScsswxxxWxztEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 点位设置信息表(t_dwszxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "点位设置信息表", name = "t_dwszxx")
@TableName("t_dwszxx")
public class TDwszxxEntity extends BaseEntity {

    private static final long serialVersionUID = 840270896337150964L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "点位名称", name = "dwmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "点位名称不能为空!")
    @Size(max = 100, message = "点位名称不能超过100个字符(1个汉字记两个字符)!")
    private String dwmc;

    @Schema(description = "所在部门", name = "szbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "所在部门不能为空!")
    @Size(max = 200, message = "所在部门不能超过200个字符(1个汉字记两个字符)!")
    private String szbm;

    @Schema(description = "点位类型", name = "dwlx", implementation = Integer.class)
    @NotNull(message = "点位类型不能为空")
    @EnumValueConstraint(enumClass = DwlxEnum.class, message = "点位类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer dwlx;

    @Schema(description = "点位编号", name = "dwbh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "点位编号不能为空!")
    @Size(max = 100, message = "点位编号不能超过100个字符(1个汉字记两个字符)!")
    private String dwbh;

    @Schema(description = "备注", name = "bz", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "备注不能超过100个字符(1个汉字记两个字符)!")
    private String bz;

}
