package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TSxkjzyQtfxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业气体分析数据表(t_sxkjzy_qtfx)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:55:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业气体分析数据表 参数接收类", name = "TSxkjzyQtfxDTO")
public class TSxkjzyQtfxDTO extends TSxkjzyQtfxEntity {
}
