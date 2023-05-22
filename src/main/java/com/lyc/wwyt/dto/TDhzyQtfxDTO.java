package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDhzyQtfxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业气体分析数据表(t_dhzy_qtfx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业气体分析数据表 参数接收类", name = "TDhzyQtfxDTO")
public class TDhzyQtfxDTO extends TDhzyQtfxEntity {
}
