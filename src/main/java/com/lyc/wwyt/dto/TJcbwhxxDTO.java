package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TJcbwhxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全检查表维护信息表结构(t_jcbwhxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全检查表维护信息表结构 参数接收类", name = "TJcbwhxxDTO")
public class TJcbwhxxDTO extends TJcbwhxxEntity {
}
