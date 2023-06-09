package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TCbspdglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商评定管理信息表(t_cbspdglxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商评定管理信息表 参数接收类", name = "TCbspdglxxDTO")
public class TCbspdglxxDTO extends TCbspdglxxEntity {
}
