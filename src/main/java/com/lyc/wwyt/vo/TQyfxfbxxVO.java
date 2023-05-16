package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TQyfxfbxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业安全风险分布信息表(t_qyfxfbxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业安全风险分布信息表 数据展示类", name = "TQyfxfbxxVO")
public class TQyfxfbxxVO extends TQyfxfbxxEntity {
}
