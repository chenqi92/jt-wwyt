package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TLsydzyQtfxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电气体分析数据表(t_lsydzy_qtfx)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:55:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电气体分析数据表 参数接收类", name = "TLsydzyQtfxDTO")
public class TLsydzyQtfxDTO extends TLsydzyQtfxEntity {
}
