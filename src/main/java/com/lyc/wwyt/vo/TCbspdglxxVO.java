package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TCbspdglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商评定管理信息表(t_cbspdglxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商评定管理信息表 数据展示类", name = "TCbspdglxxVO")
public class TCbspdglxxVO extends TCbspdglxxEntity {
}
