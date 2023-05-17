package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TPxjhxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 培训计划信息表(t_pxjhxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训计划信息表 参数接收类", name = "TPxjhxxDTO")
public class TPxjhxxDTO extends TPxjhxxEntity {
}
