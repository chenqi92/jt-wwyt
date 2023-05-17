package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TAqhdxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全活动信息表(t_aqhdxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全活动信息表 参数接收类", name = "TAqhdxxDTO")
public class TAqhdxxDTO extends TAqhdxxEntity {
}
