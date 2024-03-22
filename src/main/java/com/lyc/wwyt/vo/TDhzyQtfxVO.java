package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDhzyQtfxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业气体分析数据表(t_dhzy_qtfx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业气体分析数据表 数据展示类", name = "TDhzyQtfxVO")
public class TDhzyQtfxVO extends TDhzyQtfxEntity {
}
