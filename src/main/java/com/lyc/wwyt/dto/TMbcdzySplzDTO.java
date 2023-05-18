package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TMbcdzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 盲板抽堵作业审批流转记录表(t_mbcdzy_splz)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:55:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "盲板抽堵作业审批流转记录表 参数接收类", name = "TMbcdzySplzDTO")
public class TMbcdzySplzDTO extends TMbcdzySplzEntity {
}
