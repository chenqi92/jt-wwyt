package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.GldxlxEnum;
import com.lyc.wwyt.enums.QyfxdjEnum;
import com.lyc.wwyt.enums.ZyqylxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 作业区域信息表(t_zyqyxx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 16:44:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "作业区域信息表", name = "t_zyqyxx")
@TableName("t_zyqyxx")
public class TZyqyxxEntity extends BaseEntity {

    private static final long serialVersionUID = -68354043488562414L;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "区域编号", name = "yqbh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "区域编号不能为空!")
    @Size(max = 100, message = "区域编号不能超过100个字符(1个汉字记两个字符)!")
    private String yqbh;

    @Schema(description = "区域名称", name = "qymc", implementation = String.class, maxLength = 100)
    @NotBlank(message = "区域名称不能为空!")
    @Size(max = 100, message = "区域名称不能超过100个字符(1个汉字记两个字符)!")
    private String qymc;

    @Schema(description = "区域类型", name = "qylx", implementation = String.class)
    @NotNull(message = "区域类型不能为空")
    @EnumValueConstraint(enumClass = ZyqylxEnum.class, message = "区域类型不在指定范围内,请根据字典表定义重新输入!")
    private String qylx;

    @Schema(description = "区域楼层", name = "qylc", implementation = Integer.class, maxLength = 2)
    private Integer qylc;

    @Schema(description = "区域高度", name = "qygd", implementation = Integer.class, maxLength = 5)
    private Integer qygd;

    @Schema(description = "区域风险等级", name = "qyfxdj", implementation = String.class)
    @NotNull(message = "区域风险等级不能为空")
    @EnumValueConstraint(enumClass = QyfxdjEnum.class, message = "区域风险等级不在指定范围内,请根据字典表定义重新输入!")
    private String qyfxdj;

    @Schema(description = "关联对象类型", name = "gldxlx", implementation = String.class)
    @EnumValueConstraint(enumClass = GldxlxEnum.class, message = "关联对象类型不在指定范围内,请根据字典表定义重新输入!")
    private String gldxlx;

    @Schema(description = "关联对象编号", name = "gldxbh", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "关联对象编号不能超过100个字符(1个汉字记两个字符)!")
    private String gldxbh;

    @Schema(description = "关联对象名称", name = "gldxmc", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "关联对象名称不能超过100个字符(1个汉字记两个字符)!")
    private String gldxmc;

    @Schema(description = "是否重点监管区域 (0：否；1：是)", name = "sfzdjgqy", implementation = Integer.class, maxLength = 1)
    @NotNull(message = "是否重点监管区域 (0：否；1：是)不能为空")
    private Integer sfzdjgqy;

    @Schema(description = "区域是否属于生产区 (0：非生产区；1：生产区)", name = "qysfsyscq", implementation = Integer.class, maxLength = 1)
    @NotNull(message = "区域是否属于生产区 (0：非生产区；1：生产区)不能为空")
    private Integer qysfsyscq;

    @Schema(description = "区域范围", name = "qyfw", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "区域范围不能超过100个字符(1个汉字记两个字符)!")
    private String qyfw;

    @Schema(description = "区域所在部门", name = "qyszbm", implementation = String.class, maxLength = 200)
    @NotBlank(message = "区域所在部门不能为空!")
    @Size(max = 200, message = "区域所在部门不能超过200个字符(1个汉字记两个字符)!")
    private String qyszbm;

    @Schema(description = "区域最大人数", name = "zdrs", implementation = Integer.class, maxLength = 5)
    @NotNull(message = "区域最大人数不能为空")
    private Integer zdrs;

    @Schema(description = "经度位置信息", name = "jd", implementation = String.class, maxLength = 200)
    @NotBlank(message = "经度位置信息不能为空!")
    @Size(max = 200, message = "经度位置信息不能超过200个字符(1个汉字记两个字符)!")
    private String jd;

    @Schema(description = "纬度位置信息", name = "wd", implementation = String.class, maxLength = 200)
    @NotBlank(message = "纬度位置信息不能为空!")
    @Size(max = 200, message = "纬度位置信息不能超过200个字符(1个汉字记两个字符)!")
    private String wd;

}
