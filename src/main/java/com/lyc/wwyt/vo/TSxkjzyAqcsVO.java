package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TSxkjzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业安全措施表(t_sxkjzy_aqcs)VO
 *
 * @author lhh
 * @since 2023-05-18 15:55:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业安全措施表 数据展示类", name = "TSxkjzyAqcsVO")
public class TSxkjzyAqcsVO extends TSxkjzyAqcsEntity {
}
