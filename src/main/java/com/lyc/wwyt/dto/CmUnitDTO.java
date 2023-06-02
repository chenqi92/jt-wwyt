package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.CmUnitEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (cm_unit)DTO
 *
 * @author chenqi
 * @since 2023-06-02 14:06:06
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = " 参数接收类", name = "CmUnitDTO")
public class CmUnitDTO extends CmUnitEntity {
}
