package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TAqfxsjEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全风险事件表(t_aqfxsj)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全风险事件表 参数接收类", name = "TAqfxsjDTO")
public class TAqfxsjDTO extends TAqfxsjEntity {
}
