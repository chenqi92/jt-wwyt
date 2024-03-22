package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.FXDJEnum;
import com.lyc.wwyt.enums.GYFXDJEnum;
import com.lyc.wwyt.enums.KZFXDJEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 风险四色图信息表(t_fxsstxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "风险四色图信息表", name = "t_fxsstxx")
@TableName("t_fxsstxx")
public class TFxsstxxEntity extends BaseEntity {

    private static final long serialVersionUID = -93036454759730291L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "风险分区编号", name = "fxfqbm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "风险分区编号不能为空!")
    @Size(max = 100, message = "风险分区编号不能超过100个字符(1个汉字记两个字符)!")
    private String fxfqbm;

    @Schema(description = "风险分区名称", name = "fxfqmc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "风险分区名称不能为空!")
    @Size(max = 100, message = "风险分区名称不能超过100个字符(1个汉字记两个字符)!")
    private String fxfqmc;

    @Schema(description = "风险等级", name = "fxdj", implementation = String.class, maxLength = 8)
    @EnumValueConstraint(enumClass = FXDJEnum.class)
    private String fxdj;

    @Schema(description = "风险坐标范围(WGS-84坐标系，示例：（x1,y1;x2,y2;….），x、y为经纬度)", name = "fxzbfw", implementation = String.class, maxLength = 500)
    @NotBlank(message = "风险坐标范围不能为空!")
    @Size(max = 500, message = "风险坐标范围不能超过500个字符(1个汉字记两个字符)!")
    private String fxzbfw;

    @Schema(description = "固有风险等级", name = "gyfxdj", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = GYFXDJEnum.class)
    private String gyfxdj;

    @Schema(description = "控制风险等级", name = "kzfxdj", implementation = String.class, maxLength = 10)
    @EnumValueConstraint(enumClass = KZFXDJEnum.class)
    private String kzfxdj;

    @Schema(description = "风险校正因素", name = "fxjzys", implementation = String.class, maxLength = 100)
    @NotBlank(message = "风险校正因素不能为空!")
    @Size(max = 100, message = "风险校正因素不能超过100个字符(1个汉字记两个字符)!")
    private String fxjzys;

    @Schema(description = "风险校正等级", name = "fxjzdj", implementation = String.class, maxLength = 100)
    @NotBlank(message = "风险校正等级不能为空!")
    @Size(max = 100, message = "风险校正等级不能超过100个字符(1个汉字记两个字符)!")
    private String fxjzdj;

    @Schema(description = "所在部门", name = "szbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "所在部门不能为空!")
    @Size(max = 200, message = "所在部门不能超过200个字符(1个汉字记两个字符)!")
    private String szbm;

    @Schema(description = "评价人", name = "zrr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "评价人不能为空!")
    @Size(max = 100, message = "评价人不能超过100个字符(1个汉字记两个字符)!")
    private String zrr;

    @Schema(description = "复评日期", name = "fprq", implementation = LocalDate.class)
    private LocalDate fprq;

    @Schema(description = "企业编码", name = "companyCode", implementation = Long.class)
    @NotNull(message = "企业编码不能为空")
    private Long companyCode;

}
