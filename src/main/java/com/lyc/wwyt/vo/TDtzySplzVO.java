package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDtzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动土作业审批流转记录表(t_dtzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-18 15:54:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动土作业审批流转记录表 数据展示类", name = "TDtzySplzVO")
public class TDtzySplzVO extends TDtzySplzEntity {
}
