package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.ScsswxxxWxztEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * 生产设施维修信息(t_scsswxxx)表实体类
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施维修信息", name = "t_scsswxxx")
@TableName("t_scsswxxx")
public class TScsswxxxEntity extends BaseEntity {

    private static final long serialVersionUID = 785330609661540591L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "生产设施 id", name = "scssid", implementation = String.class, maxLength = 36)
    @NotBlank(message = "生产设施 id不能为空!")
    @Size(max = 36, message = "生产设施 id不能超过36个字符(1个汉字记两个字符)!")
    private String scssid;

    @Schema(description = "设施异常项", name = "ssycx", implementation = String.class)
    @NotNull(message = "设施异常项不能为空")
    private String ssycx;

    @Schema(description = "维修状态", name = "wxzt", implementation = Integer.class)
    @NotNull(message = "维修状态不能为空")
    @EnumValueConstraint(enumClass = ScsswxxxWxztEnum.class, message = "维修状态类型不在指定范围内,请根据字典表定义重新输入!")
    private Integer wxzt;

    @Schema(description = "维修情况", name = "wxqk", implementation = String.class)
    @NotNull(message = "维修情况不能为空")
    private String wxqk;

    @Schema(description = "维修负责人", name = "wxfzr", implementation = String.class, maxLength = 100)
    @NotBlank(message = "维修负责人不能为空!")
    @Size(max = 100, message = "维修负责人不能超过100个字符(1个汉字记两个字符)!")
    private String wxfzr;

    @Schema(description = "维修负责人单位", name = "wxfzrdw", implementation = String.class, maxLength = 200)
    @NotBlank(message = "维修负责人单位不能为空!")
    @Size(max = 200, message = "维修负责人单位不能超过200个字符(1个汉字记两个字符)!")
    private String wxfzrdw;

    @Schema(description = "维修开始日期", name = "wxksrq", implementation = LocalDate.class)
    @NotNull(message = "维修开始日期不能为空")
    private LocalDate wxksrq;

    @Schema(description = "维修结束日期", name = "wxjsrq", implementation = LocalDate.class)
    @NotNull(message = "维修结束日期不能为空")
    private LocalDate wxjsrq;

    @Schema(description = "维修标准附件", name = "wxbzfj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "维修标准附件不能超过1000个字符(1个汉字记两个字符)!")
    private String wxbzfj;

}
