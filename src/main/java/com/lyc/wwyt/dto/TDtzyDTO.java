package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDtzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动土作业信息表(t_dtzy)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动土作业信息表 参数接收类", name = "TDtzyDTO")
public class TDtzyDTO extends TDtzyEntity {
}
