package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TYjczkxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急处置卡信息表：t_yjczkxx(t_yjczkxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急处置卡信息表：t_yjczkxx 参数接收类", name = "TYjczkxxDTO")
public class TYjczkxxDTO extends TYjczkxxEntity {
}
