package com.lyc.wwyt.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 标签扩展管理信息表(t_bqkzglxx)表实体类
 *
 * @author lhh
 * @since 2023-05-18 16:32:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "标签扩展管理信息表", name = "t_bqkzglxx")
@TableName("t_bqkzglxx")
public class TBqkzglxxEntity extends BaseEntity {

    private static final long serialVersionUID = 959510324957089247L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码必须为18位!")
    private String tyshxydm;

    @Schema(description = "基站编码", name = "jzbm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "基站编码不能为空!")
    @Size(max = 100, message = "基站编码不能超过100个字符(1个汉字记两个字符)!")
    private String jzbm;

    @Schema(description = "电量阈值", name = "dlfz", implementation = String.class, maxLength = 100)
    @NotBlank(message = "电量阈值不能为空!")
    @Size(max = 100, message = "电量阈值不能超过100个字符(1个汉字记两个字符)!")
    private String dlfz;

    @Schema(description = "最后进入时间", name = "zhjrsj", implementation = LocalDateTime.class)
    @NotNull(message = "最后进入时间不能为空")
    private LocalDateTime zhjrsj;

    @Schema(description = "最后出去时间", name = "zhcqsj", implementation = LocalDateTime.class)
    @NotNull(message = "最后出去时间不能为空")
    private LocalDateTime zhcqsj;

    @Schema(description = "最后读取的房间编号", name = "zhdqfjbh", implementation = String.class, maxLength = 100)
    @NotBlank(message = "最后读取的房间编号不能为空!")
    @Size(max = 100, message = "最后读取的房间编号不能超过100个字符(1个汉字记两个字符)!")
    private String zhdqfjbh;

    @Schema(description = "标签编码", name = "bqbm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "标签编码不能为空!")
    @Size(max = 100, message = "标签编码不能超过100个字符(1个汉字记两个字符)!")
    private String bqbm;

    @Schema(description = "使用对象编号", name = "sydxbm", implementation = String.class, maxLength = 100)
    @NotBlank(message = "使用对象编号不能为空!")
    @Size(max = 100, message = "使用对象编号不能超过100个字符(1个汉字记两个字符)!")
    private String sydxbm;

    @Schema(description = "使用状态", name = "syzt", implementation = Integer.class)
    @NotNull(message = "使用状态不能为空")
    private Integer syzt;

    @Schema(description = "标签类型", name = "bqlx", implementation = Object.class)
    private Object bqlx;

}
