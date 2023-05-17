package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TQzpxdaEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 取证培训档案表(t_qzpxda)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "取证培训档案表 数据展示类", name = "TQzpxdaVO")
public class TQzpxdaVO extends TQzpxdaEntity {
}
