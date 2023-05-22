package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TMbcdzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 盲板抽堵信息表(t_mbcdzy)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "盲板抽堵信息表 参数接收类", name = "TMbcdzyDTO")
public class TMbcdzyDTO extends TMbcdzyEntity {
}
