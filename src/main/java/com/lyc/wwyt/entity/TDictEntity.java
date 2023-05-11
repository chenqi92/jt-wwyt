package com.lyc.wwyt.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 五位一体_字典表(t_dict)表实体类
 *
 * @author chenqi
 * @since 2023-05-10 17:47:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(title = "五位一体_字典表", name = "TDictEntity")
@TableName("t_dict")
public class TDictEntity extends BaseEntity {

    private static final long serialVersionUID = 682831154560890200L;

    @TableId(value = "id")
    @NotBlank
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class)
    private String id;

    @Schema(description = "字典名称", name = "name", implementation = String.class)
    @NotBlank
    private String name;

    @Schema(description = "字典类型", name = "type", implementation = String.class)
    @NotBlank
    private String type;

    @Schema(description = "字典码", name = "code", implementation = String.class)
    @NotBlank
    private String code;

    @Schema(description = "字典值", name = "value", implementation = String.class)
    @NotBlank
    private String value;

    @Schema(description = "排序", name = "orderNum", implementation = Integer.class)
    @NotNull
    @Min(1)
    private Integer orderNum;
}
