package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TSxkjzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业信息表(t_sxkjzy)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:55:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业信息表 参数接收类", name = "TSxkjzyDTO")
public class TSxkjzyDTO extends TSxkjzyEntity {
}
