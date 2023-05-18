package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TLsydzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电作业审批流转记录表(t_lsydzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-18 15:55:03
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电作业审批流转记录表 数据展示类", name = "TLsydzySplzVO")
public class TLsydzySplzVO extends TLsydzySplzEntity {
}
