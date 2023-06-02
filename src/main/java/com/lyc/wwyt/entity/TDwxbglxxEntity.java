package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.CrkbjEnum;
import com.lyc.wwyt.enums.DwxblxEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 定位信标管理信息表(t_dwxbglxx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 16:32:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "定位信标管理信息表", name = "t_dwxbglxx")
@TableName("t_dwxbglxx")
public class TDwxbglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 648101317532733364L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "区域id", name = "szqy", implementation = String.class, maxLength = 36)
    @NotBlank(message = "区域id不能为空!")
    @Size(max = 36, message = "区域id不能超过36个字符(1个汉字记两个字符)!")
    private String szqy;

    @Schema(description = "标签名称", name = "bqmz", implementation = String.class, maxLength = 200)
    @Size(max = 200, message = "标签名称不能超过200个字符(1个汉字记两个字符)!")
    private String bqmz;

    @Schema(description = "信标编码", name = "xbbm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "信标编码不能为空!")
    @Size(max = 100, message = "信标编码不能超过100个字符(1个汉字记两个字符)!")
    private String xbbm;

    @Schema(description = "定位信标类型", name = "dwxblx", implementation = Integer.class)
    @NotNull(message = "定位信标类型不能为空")
    @EnumValueConstraint(enumClass = DwxblxEnum.class, message = "定位信标类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer dwxblx;

    @Schema(description = "出入口标记", name = "crkbj", implementation = String.class)
    @NotNull(message = "出入口标记不能为空")
    @EnumValueConstraint(enumClass = CrkbjEnum.class, message = "出入口标记类型不在指定范围内,请根据字典表定义重新输入!")
    private String crkbj;

    @Schema(description = "楼层", name = "lc", implementation = Double.class, maxLength = 2)
    @NotNull(message = "楼层不能为空")
    private Double lc;

    @Schema(description = "高度", name = "gd", implementation = Double.class, maxLength = 5)
    private Double gd;

    @Schema(description = "位置描述", name = "wzms", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "位置描述不能超过1000个字符(1个汉字记两个字符)!")
    private String wzms;

    @Schema(description = "经度（度）", name = "jd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "经度（度）不能为空")
    private Double jd;

    @Schema(description = "纬度（度）", name = "wd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "纬度（度）不能为空")
    private Double wd;

}
