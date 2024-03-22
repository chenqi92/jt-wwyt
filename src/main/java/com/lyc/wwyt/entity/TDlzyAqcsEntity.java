package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.ZylxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 断路作业安全措施表(t_dlzy_aqcs)表实体类
 *
 * @author lhh
 * @since 2023-05-18 15:54:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业安全措施表", name = "t_dlzy_aqcs")
@TableName("t_dlzy_aqcs")
public class TDlzyAqcsEntity extends BaseEntity {

    private static final long serialVersionUID = -47297268843924326L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "关联作业ID", name = "zyid", implementation = String.class, maxLength = 36)
    @NotBlank(message = "关联作业ID不能为空!")
    @Size(max = 36, message = "关联作业ID不能超过36个字符(1个汉字记两个字符)!")
    private String zyid;

    @Schema(description = "关联作业类型 ", name = "zylx", implementation = String.class, maxLength = 1)
    @NotBlank(message = "关联作业类型 不能为空!")
    @EnumValueConstraint(enumClass = ZylxEnum.class, message = "关联作业类型不在指定范围内,请根据字典表定义重新输入!")
    private String zylx;

    @Schema(description = "序号 01~99", name = "xh", implementation = String.class, maxLength = 2)
    @NotBlank(message = "序号 01~99不能为空!")
    @Size(max = 2, message = "序号 01~99不能超过2个字符(1个汉字记两个字符)!")
    private String xh;

    @Schema(description = "安全措施内容", name = "aqcsnr", implementation = String.class, maxLength = 200)
    @NotBlank(message = "安全措施内容不能为空!")
    @Size(max = 200, message = "安全措施内容不能超过200个字符(1个汉字记两个字符)!")
    private String aqcsnr;

    @Schema(description = "是否涉及 0，1", name = "sfsj", implementation = String.class, maxLength = 1)
    @NotBlank(message = "是否涉及 0，1不能为空!")
    @Size(max = 1, message = "是否涉及 0，1不能超过1个字符(1个汉字记两个字符)!")
    private String sfsj;

    @Schema(description = "确认人", name = "qrr", implementation = String.class, maxLength = 50)
    @NotBlank(message = "确认人不能为空!")
    @Size(max = 50, message = "确认人不能超过50个字符(1个汉字记两个字符)!")
    private String qrr;

    @Schema(description = "签名图片", name = "qmtp", implementation = String.class)
    private String qmtp;

}
