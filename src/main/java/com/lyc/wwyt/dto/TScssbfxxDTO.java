package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TScssbfxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设备报废信息(t_scssbfxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设备报废信息 参数接收类", name = "TScssbfxxDTO")
public class TScssbfxxDTO extends TScssbfxxEntity {
}
