package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYjwzglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急物资管理信息表(t_yjwzglxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急物资管理信息表 参数接收类", name = "TYjwzglxxDTO")
public class TYjwzglxxDTO extends TYjwzglxxEntity {
}
