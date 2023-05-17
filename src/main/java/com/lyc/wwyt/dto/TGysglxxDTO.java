package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TGysglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 供应商管理信息表(t_gysglxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "供应商管理信息表 参数接收类", name = "TGysglxxDTO")
public class TGysglxxDTO extends TGysglxxEntity {
}
