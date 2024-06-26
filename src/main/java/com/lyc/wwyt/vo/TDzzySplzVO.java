package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDzzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 吊装作业审批流转记录表(t_dzzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "吊装作业审批流转记录表 数据展示类", name = "TDzzySplzVO")
public class TDzzySplzVO extends TDzzySplzEntity {
}
