package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 培训教育效果评价记录表(t_pxjyxgpjjl)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训教育效果评价记录表", name = "t_pxjyxgpjjl")
@TableName("t_pxjyxgpjjl")
public class TPxjyxgpjjlEntity extends BaseEntity {

    private static final long serialVersionUID = 641957664605807487L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "员工ID", name = "employeeId", implementation = String.class, maxLength = 8)
    @NotBlank(message = "员工ID不能为空!")
    @Size(max = 8, message = "员工ID不能超过8个字符(1个汉字记两个字符)!")
    @Pattern(regexp = "^\\d{8}$", message = "员工ID只能由不超过8位的数字组成!")
    private String employeeId;

    @Schema(description = "员工姓名", name = "name", implementation = String.class, maxLength = 50)
    @NotBlank(message = "员工姓名不能为空!")
    @Size(max = 50, message = "员工姓名不能超过50个字符(1个汉字记两个字符)!")
    private String name;

    @Schema(description = "培训计划名称", name = "planName", implementation = String.class, maxLength = 100)
    @NotBlank(message = "培训计划名称不能为空!")
    @Size(max = 100, message = "培训计划名称不能超过100个字符(1个汉字记两个字符)!")
    private String planName;

    @Schema(description = "评估分数", name = "score", implementation = String.class, maxLength = 5)
    @NotBlank(message = "评估分数不能为空!")
    @Size(max = 5, message = "评估分数不能超过5个字符(1个汉字记两个字符)!")
    private String score;

    @Schema(description = "评估等级", name = "level", implementation = String.class, maxLength = 10)
    @NotBlank(message = "评估等级不能为空!")
    @Size(max = 10, message = "评估等级不能超过10个字符(1个汉字记两个字符)!")
    private String level;

    @Schema(description = "改进建议", name = "suggest", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "改进建议不能超过500个字符(1个汉字记两个字符)!")
    private String suggest;

}
