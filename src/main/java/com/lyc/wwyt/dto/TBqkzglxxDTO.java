package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TBqkzglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标签扩展管理信息表(t_bqkzglxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "标签扩展管理信息表 参数接收类", name = "TBqkzglxxDTO")
public class TBqkzglxxDTO extends TBqkzglxxEntity {
}
