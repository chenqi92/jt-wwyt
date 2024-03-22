package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 定位基站管理信息表(t_dwjzglxx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 16:32:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "定位基站管理信息表", name = "t_dwjzglxx")
@TableName("t_dwjzglxx")
public class TDwjzglxxEntity extends BaseEntity {

    private static final long serialVersionUID = -49639718695382102L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "基站编号", name = "jzbh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "基站编号不能为空!")
    @Size(max = 100, message = "基站编号不能超过100个字符(1个汉字记两个字符)!")
    private String jzbh;

    @Schema(description = "基站名称", name = "jzmc", implementation = String.class, maxLength = 200)
    @NotBlank(message = "基站名称不能为空!")
    @Size(max = 200, message = "基站名称不能超过200个字符(1个汉字记两个字符)!")
    private String jzmc;

    @Schema(description = "描述", name = "ms", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "描述不能超过1000个字符(1个汉字记两个字符)!")
    private String ms;

    @Schema(description = "经度（度）", name = "jd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "经度（度）不能为空")
    private Double jd;

    @Schema(description = "纬度（度）", name = "wd", implementation = Double.class, maxLength = 10)
    @NotNull(message = "纬度（度）不能为空")
    private Double wd;

}
