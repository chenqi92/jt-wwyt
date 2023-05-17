package com.lyc.wwyt.dto;

import com.lyc.wwyt.entity.TCbsglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商管理信息表(t_cbsglxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 15:40:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商管理信息表 参数接收类", name = "TCbsglxxDTO")
public class TCbsglxxDTO extends TCbsglxxEntity {
}
