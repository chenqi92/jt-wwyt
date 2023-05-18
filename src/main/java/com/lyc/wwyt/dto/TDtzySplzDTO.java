package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDtzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动土作业审批流转记录表(t_dtzy_splz)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动土作业审批流转记录表 参数接收类", name = "TDtzySplzDTO")
public class TDtzySplzDTO extends TDtzySplzEntity {
}
