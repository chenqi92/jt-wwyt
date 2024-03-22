package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.ZylxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 受限空间作业安全措施表(t_sxkjzy_aqcs)表实体类
 *
 * @author lhh
 * @since 2023-05-18 15:55:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业安全措施表", name = "t_sxkjzy_aqcs")
@TableName("t_sxkjzy_aqcs")
public class TSxkjzyAqcsEntity extends BaseEntity {

    private static final long serialVersionUID = -17440100617585230L;

    @Schema(description = "主键ID", name = "id", implementation = String.class, maxLength = 36)
    @NotBlank(message = "主键ID不能为空!")
    @Size(max = 36, message = "主键ID不能超过36个字符(1个汉字记两个字符)!")
    private String id;

    @Schema(description = "关联作业ID", name = "zyid", implementation = String.class, maxLength = 36)
    @NotBlank(message = "关联作业ID不能为空!")
    @Size(max = 36, message = "关联作业ID不能超过36个字符(1个汉字记两个字符)!")
    private String zyid;

    @Schema(description = "关联作业类型", name = "zylx", implementation = Object.class)
    @NotNull(message = "关联作业类型不能为空")
    @EnumValueConstraint(enumClass = ZylxEnum.class, message = "关联作业类型不在指定范围内,请根据字典表定义重新输入!")
    private Object zylx;

    @Schema(description = "序号", name = "xh", implementation = String.class, maxLength = 2)
    @NotBlank(message = "序号不能为空!")
    @Size(max = 2, message = "序号不能超过2个字符(1个汉字记两个字符)!")
    private String xh;

    @Schema(description = "安全措施内容", name = "aqcsnr", implementation = String.class, maxLength = 200)
    @NotBlank(message = "安全措施内容不能为空!")
    @Size(max = 200, message = "安全措施内容不能超过200个字符(1个汉字记两个字符)!")
    private String aqcsnr;

    @Schema(description = "是否涉及", name = "sfsj", implementation = Integer.class)
    @NotNull(message = "是否涉及不能为空")
    private Integer sfsj;

    @Schema(description = "确认人", name = "qrr", implementation = String.class, maxLength = 50)
    @NotBlank(message = "确认人不能为空!")
    @Size(max = 50, message = "确认人不能超过50个字符(1个汉字记两个字符)!")
    private String qrr;

    @Schema(description = "签名图片", name = "qmtp", implementation = String.class)
    private String qmtp;

}
