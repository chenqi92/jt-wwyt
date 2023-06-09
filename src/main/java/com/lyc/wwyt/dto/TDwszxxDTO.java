package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDwszxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 点位设置信息表(t_dwszxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "点位设置信息表 参数接收类", name = "TDwszxxDTO")
public class TDwszxxDTO extends TDwszxxEntity {
}
