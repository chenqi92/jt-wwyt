package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDzzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 吊装作业审批流转记录表(t_dzzy_splz)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "吊装作业审批流转记录表 参数接收类", name = "TDzzySplzDTO")
public class TDzzySplzDTO extends TDzzySplzEntity {
}
