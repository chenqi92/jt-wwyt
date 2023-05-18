package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TGczySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 高处作业审批流转记录表(t_gczy_splz)VO
 *
 * @author lhh
 * @since 2023-05-18 15:54:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "高处作业审批流转记录表 数据展示类", name = "TGczySplzVO")
public class TGczySplzVO extends TGczySplzEntity {
}
