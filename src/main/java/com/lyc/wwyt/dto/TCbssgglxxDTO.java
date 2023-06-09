package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TCbssgglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商施工管理信息表(t_cbssgglxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商施工管理信息表 参数接收类", name = "TCbssgglxxDTO")
public class TCbssgglxxDTO extends TCbssgglxxEntity {
}
