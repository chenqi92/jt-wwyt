package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYjyaglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急预案管理信息表(t_yjyaglxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急预案管理信息表 参数接收类", name = "TYjyaglxxDTO")
public class TYjyaglxxDTO extends TYjyaglxxEntity {
}
