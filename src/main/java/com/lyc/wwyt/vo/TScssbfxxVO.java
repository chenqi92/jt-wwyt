package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScssbfxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设备报废信息(t_scssbfxx)VO
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设备报废信息 数据展示类", name = "TScssbfxxVO")
public class TScssbfxxVO extends TScssbfxxEntity {
}