package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TLsydzyQtfxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电气体分析数据表(t_lsydzy_qtfx)VO
 *
 * @author lhh
 * @since 2023-05-18 15:55:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电气体分析数据表 数据展示类", name = "TLsydzyQtfxVO")
public class TLsydzyQtfxVO extends TLsydzyQtfxEntity {
}
