package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TSxkjzyQtfxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业气体分析数据表(t_sxkjzy_qtfx)VO
 *
 * @author lhh
 * @since 2023-05-18 15:55:17
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业气体分析数据表 数据展示类", name = "TSxkjzyQtfxVO")
public class TSxkjzyQtfxVO extends TSxkjzyQtfxEntity {
}
