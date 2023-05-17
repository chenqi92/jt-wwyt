package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.PXTJEnum;
import com.lyc.wwyt.enums.PxjgEnum;
import com.lyc.wwyt.enums.XgpgEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.*;
import java.time.LocalDate;

/**
 * 人员培训信息表(t_rypxxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "人员培训信息表", name = "t_rypxxx")
@TableName("t_rypxxx")
public class TRypxxxEntity extends BaseEntity {

    private static final long serialVersionUID = -90562357356449917L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "证书名称", name = "zsmc", implementation = String.class, maxLength = 200)
    @NotBlank(message = "证书名称不能为空!")
    @Size(max = 200, message = "证书名称不能超过200个字符(1个汉字记两个字符)!")
    private String zsmc;

    @Schema(description = "证书编号", name = "zsbh", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "证书编号不能超过200个字符(1个汉字记两个字符)!")
    private String zsbh;

    @Schema(description = "取证日期", name = "qzrq", implementation = LocalDate.class)
    @NotNull(message = "取证日期不能为空")
    private LocalDate qzrq;

    @Schema(description = "到期日期", name = "dqrq", implementation = LocalDate.class)
    @NotNull(message = "到期日期不能为空")
    private LocalDate dqrq;

    @Schema(description = "培训有效期(单位月)", name = "pxyxq", implementation = Double.class, maxLength = 4)
    @NotNull(message = "培训有效期不能为空")
    @Digits(integer = 2, fraction = 2, message = "培训有效期超出限制范围!")
    @Min(value = 0, message = "培训有效期不能小于0!")
    private Double pxyxq;

    @Schema(description = "培训人姓名", name = "pxrxm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "培训人姓名不能为空!")
    @Size(max = 100, message = "培训人姓名不能超过100个字符(1个汉字记两个字符)!")
    private String pxrxm;

    @Schema(description = "培训途径", name = "pxtj", implementation = Integer.class)
    @EnumValueConstraint(enumClass = PXTJEnum.class)
    private Integer pxtj;

    @Schema(description = "培训成绩", name = "pxcj", implementation = Double.class, maxLength = 10)
    @NotNull(message = "培训成绩不能为空")
    @Digits(integer = 8, fraction = 2, message = "培训成绩超出限制范围!")
    @Min(value = 0, message = "培训成绩不能小于0!")
    private Double pxcj;

    @Schema(description = "培训结果", name = "pxjg", implementation = Integer.class)
    @EnumValueConstraint(enumClass = PxjgEnum.class)
    private Integer pxjg;

    @Schema(description = "效果评估", name = "xgpg", implementation = Integer.class)
    @EnumValueConstraint(enumClass = XgpgEnum.class)
    private Integer xgpg;

}
