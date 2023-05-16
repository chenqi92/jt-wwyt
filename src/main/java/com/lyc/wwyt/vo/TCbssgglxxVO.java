package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TCbssgglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商施工管理信息表(t_cbssgglxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商施工管理信息表 数据展示类", name = "TCbssgglxxVO")
public class TCbssgglxxVO extends TCbssgglxxEntity {
}
