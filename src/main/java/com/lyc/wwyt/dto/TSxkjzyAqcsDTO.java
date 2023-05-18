package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TSxkjzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业安全措施表(t_sxkjzy_aqcs)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:55:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业安全措施表 参数接收类", name = "TSxkjzyAqcsDTO")
public class TSxkjzyAqcsDTO extends TSxkjzyAqcsEntity {
}
