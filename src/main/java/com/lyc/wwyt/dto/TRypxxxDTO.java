package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TRypxxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 人员培训信息表(t_rypxxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:34:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "人员培训信息表 参数接收类", name = "TRypxxxDTO")
public class TRypxxxDTO extends TRypxxxEntity {
}
