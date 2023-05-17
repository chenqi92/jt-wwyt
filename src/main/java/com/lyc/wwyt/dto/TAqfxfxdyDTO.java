package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TAqfxfxdyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全风险分析单元表(t_aqfxfxdy)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全风险分析单元表 参数接收类", name = "TAqfxfxdyDTO")
public class TAqfxfxdyDTO extends TAqfxfxdyEntity {
}
