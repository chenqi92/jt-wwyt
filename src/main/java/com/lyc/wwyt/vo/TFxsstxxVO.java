package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TFxsstxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 风险四色图信息表(t_fxsstxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "风险四色图信息表 数据展示类", name = "TFxsstxxVO")
public class TFxsstxxVO extends TFxsstxxEntity {
}
