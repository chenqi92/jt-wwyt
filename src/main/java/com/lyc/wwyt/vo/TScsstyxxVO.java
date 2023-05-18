package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScsstyxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施停用信息(t_scsstyxx)VO
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施停用信息 数据展示类", name = "TScsstyxxVO")
public class TScsstyxxVO extends TScsstyxxEntity {
}
