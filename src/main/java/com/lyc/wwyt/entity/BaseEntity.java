package com.lyc.wwyt.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 类 BaseEntity 审计相关字段
 *
 * @author ChenQi
 * @date 2023/5/10
 */
@Data
public class BaseEntity {

    @Schema(description = "创建时间", name = "createTime", implementation = LocalDateTime.class, hidden = true)
    @TableField(fill = FieldFill.INSERT)
    @ExcelIgnore
    private LocalDateTime createTime;

    @Schema(description = "创建人", name = "createBy", implementation = String.class, hidden = true)
    @TableField(fill = FieldFill.INSERT)
    @ExcelIgnore
    private String createBy;

    @Schema(description = "最后修改时间", name = "updateTime", implementation = LocalDateTime.class, hidden = true)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ExcelIgnore
    private LocalDateTime updateTime;

    @Schema(description = "最后修改人", name = "updateBy", implementation = String.class, hidden = true)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ExcelIgnore
    private String updateBy;

    @TableLogic
    @Schema(description = "删除标识", name = "deleteMark", implementation = Integer.class, hidden = true)
    @TableField(fill = FieldFill.INSERT)
    @ExcelIgnore
    private Integer deleteMark;
}
