package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScsstyxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施停用信息(t_scsstyxx)DTO
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施停用信息 参数接收类", name = "TScsstyxxDTO")
public class TScsstyxxDTO extends TScsstyxxEntity {
}
