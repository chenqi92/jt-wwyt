package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TSxkjzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业信息表(t_sxkjzy)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业信息表 数据展示类", name = "TSxkjzyVO")
public class TSxkjzyVO extends TSxkjzyEntity {
}
