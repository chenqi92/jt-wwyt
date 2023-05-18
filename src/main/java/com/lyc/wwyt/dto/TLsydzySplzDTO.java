package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TLsydzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电作业审批流转记录表(t_lsydzy_splz)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:55:02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电作业审批流转记录表 参数接收类", name = "TLsydzySplzDTO")
public class TLsydzySplzDTO extends TLsydzySplzEntity {
}
