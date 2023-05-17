package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TPxjgEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 培训结果表(t_pxjg)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训结果表 参数接收类", name = "TPxjgDTO")
public class TPxjgDTO extends TPxjgEntity {
}
