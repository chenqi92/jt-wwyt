package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TAqpxjcjlEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全培训奖惩记录表(t_aqpxjcjl)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全培训奖惩记录表 参数接收类", name = "TAqpxjcjlDTO")
public class TAqpxjcjlDTO extends TAqpxjcjlEntity {
}
