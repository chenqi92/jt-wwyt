package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TYjyljhxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急演练计划信息表(t_yjyljhxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急演练计划信息表 参数接收类", name = "TYjyljhxxDTO")
public class TYjyljhxxDTO extends TYjyljhxxEntity {
}
