package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TCbszyyjyascEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商作业应急预案审查表(t_cbszyyjyasc)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商作业应急预案审查表 参数接收类", name = "TCbszyyjyascDTO")
public class TCbszyyjyascDTO extends TCbszyyjyascEntity {
}
