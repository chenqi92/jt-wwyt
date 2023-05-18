package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDhzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业作业审批流转记录表(t_dhzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-18 15:54:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业作业审批流转记录表 数据展示类", name = "TDhzySplzVO")
public class TDhzySplzVO extends TDhzySplzEntity {
}
