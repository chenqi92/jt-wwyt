package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TAqfxgkcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全风险管控措施表结构(t_aqfxgkcs)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全风险管控措施表结构 参数接收类", name = "TAqfxgkcsDTO")
public class TAqfxgkcsDTO extends TAqfxgkcsEntity {
}
