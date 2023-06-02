package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TQzpxdaEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 取证培训档案表(t_qzpxda)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "取证培训档案表 参数接收类", name = "TQzpxdaDTO")
public class TQzpxdaDTO extends TQzpxdaEntity {
}
