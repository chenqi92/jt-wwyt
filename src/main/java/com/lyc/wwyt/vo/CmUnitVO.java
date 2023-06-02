package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.CmUnitEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (cm_unit)VO
 *
 * @author chenqi
 * @since 2023-06-02 14:06:06
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = " 数据展示类", name = "CmUnitVO")
public class CmUnitVO extends CmUnitEntity {
}
