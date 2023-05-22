package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScssjcxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施检查信息(t_scssjcxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施检查信息 参数接收类", name = "TScssjcxxDTO")
public class TScssjcxxDTO extends TScssjcxxEntity {
}
