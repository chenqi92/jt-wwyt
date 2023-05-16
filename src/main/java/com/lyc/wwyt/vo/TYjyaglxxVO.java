package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYjyaglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急预案管理信息表(t_yjyaglxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急预案管理信息表 数据展示类", name = "TYjyaglxxVO")
public class TYjyaglxxVO extends TYjyaglxxEntity {
}
