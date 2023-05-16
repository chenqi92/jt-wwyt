package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TPxhdxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 培训活动信息表(t_pxhdxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训活动信息表 数据展示类", name = "TPxhdxxVO")
public class TPxhdxxVO extends TPxhdxxEntity {
}
