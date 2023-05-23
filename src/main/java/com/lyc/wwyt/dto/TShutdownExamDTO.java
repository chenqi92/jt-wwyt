package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TShutdownExamEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 开停车大检修(t_shutdown_exam)DTO
 *
 * @author chenqi
 * @since 2023-05-23 11:07:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "开停车大检修 参数接收类", name = "TShutdownExamDTO")
public class TShutdownExamDTO extends TShutdownExamEntity {
}
