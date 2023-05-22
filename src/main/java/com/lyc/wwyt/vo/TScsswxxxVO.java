package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScsswxxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施维修信息(t_scsswxxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施维修信息 数据展示类", name = "TScsswxxxVO")
public class TScsswxxxVO extends TScsswxxxEntity {
}
