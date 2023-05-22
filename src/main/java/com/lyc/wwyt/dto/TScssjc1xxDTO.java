package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScssjc1xxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施检测信息(t_scssjc1xx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施检测信息 参数接收类", name = "TScssjc1xxDTO")
public class TScssjc1xxDTO extends TScssjc1xxEntity {
}
