package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TZdwxyglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 重大危险源管理信息表(t_zdwxyglxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "重大危险源管理信息表 参数接收类", name = "TZdwxyglxxDTO")
public class TZdwxyglxxDTO extends TZdwxyglxxEntity {
}
