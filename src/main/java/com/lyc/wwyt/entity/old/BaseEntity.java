package com.lyc.wwyt.entity.old;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 企业_基础信息表
 *
 * @author lyc
 * @date 2019-04-18 16:57:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    /**
     * 标记(0:正常,1:逻辑删除)
     * TableLogic 逻辑删除
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlg = 0;
    /**
     * 创建时间
     */
    @Schema(description = "创建时间", name = "createTime", implementation = LocalDateTime.class, hidden = true)
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新时间
     */
    @Schema(description = "创建时间", name = "updateTime", implementation = LocalDateTime.class, hidden = true)
    @TableField(fill = FieldFill.INSERT)
    private Date updateTime;
    /**
     * 创建人id
     */
    @Schema(description = "创建人", name = "createId", implementation = String.class, hidden = true)
    @TableField(fill = FieldFill.INSERT)
    private Long createId;
    /**
     * 更新人id
     */
    @Schema(description = "最后修改人", name = "updateId", implementation = String.class, hidden = true)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateId;
}
