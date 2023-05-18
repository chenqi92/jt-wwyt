package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TMbcdzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 盲板抽堵作业审批流转记录表(t_mbcdzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-18 15:55:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "盲板抽堵作业审批流转记录表 数据展示类", name = "TMbcdzySplzVO")
public class TMbcdzySplzVO extends TMbcdzySplzEntity {
}
