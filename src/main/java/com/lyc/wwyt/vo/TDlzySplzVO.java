package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDlzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 断路作业审批流转记录表(t_dlzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-18 15:54:32
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业审批流转记录表 数据展示类", name = "TDlzySplzVO")
public class TDlzySplzVO extends TDlzySplzEntity {
}
