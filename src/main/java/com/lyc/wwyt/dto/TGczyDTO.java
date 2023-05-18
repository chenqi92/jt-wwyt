package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TGczyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 高处作业信息表(t_gczy)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "高处作业信息表 参数接收类", name = "TGczyDTO")
public class TGczyDTO extends TGczyEntity {
}
