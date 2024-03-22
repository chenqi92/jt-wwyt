package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.ZylxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * 高处作业审批流转记录表(t_gczy_splz)表实体类
 *
 * @author lhh
 * @since 2023-05-18 15:54:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "高处作业审批流转记录表", name = "t_gczy_splz")
@TableName("t_gczy_splz")
public class TGczySplzEntity extends BaseEntity {

    private static final long serialVersionUID = -18113866358470496L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "关联作业ID", name = "zyid", implementation = String.class, maxLength = 36)
    @NotBlank(message = "关联作业ID不能为空!")
    @Size(max = 36, message = "关联作业ID不能超过36个字符(1个汉字记两个字符)!")
    private String zyid;

    @Schema(description = "关联作业类型", name = "zylx", implementation = Object.class)
    @NotNull(message = "关联作业类型不能为空")
    @EnumValueConstraint(enumClass = ZylxEnum.class, message = "关联作业类型不在指定范围内,请根据字典表定义重新输入!")
    private Object zylx;

    @Schema(description = "流程节点名称", name = "lcjd", implementation = String.class, maxLength = 50)
    @NotBlank(message = "流程节点名称不能为空!")
    @Size(max = 50, message = "流程节点名称不能超过50个字符(1个汉字记两个字符)!")
    private String lcjd;

    @Schema(description = "处理人员名称", name = "clry", implementation = String.class, maxLength = 200)
    @NotBlank(message = "处理人员名称不能为空!")
    @Size(max = 200, message = "处理人员名称不能超过200个字符(1个汉字记两个字符)!")
    private String clry;

    @Schema(description = "处理意见", name = "clyj", implementation = String.class, maxLength = 200)
    @NotBlank(message = "处理意见不能为空!")
    @Size(max = 200, message = "处理意见不能超过200个字符(1个汉字记两个字符)!")
    private String clyj;

    @Schema(description = "处理时间", name = "clsj", implementation = LocalDateTime.class)
    @NotNull(message = "处理时间不能为空")
    private LocalDateTime clsj;

    @Schema(description = "签名图片", name = "qmtp", implementation = String.class)
    private String qmtp;

}
