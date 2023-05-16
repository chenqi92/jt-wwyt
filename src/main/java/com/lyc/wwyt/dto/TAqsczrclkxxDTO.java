package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TAqsczrclkxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全生产责任承诺卡信息表(t_aqsczrclkxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全生产责任承诺卡信息表 参数接收类", name = "TAqsczrclkxxDTO")
public class TAqsczrclkxxDTO extends TAqsczrclkxxEntity {
}
