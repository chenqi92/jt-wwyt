package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TYhzlxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 隐患治理信息表(t_yhzlxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "隐患治理信息表 参数接收类", name = "TYhzlxxDTO")
public class TYhzlxxDTO extends TYhzlxxEntity {
}
