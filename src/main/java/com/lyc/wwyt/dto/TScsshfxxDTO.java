package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScsshfxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设备恢复信息(t_scsshfxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设备恢复信息 参数接收类", name = "TScsshfxxDTO")
public class TScsshfxxDTO extends TScsshfxxEntity {
}
