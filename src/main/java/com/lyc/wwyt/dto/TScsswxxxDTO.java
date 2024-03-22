package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TScsswxxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施维修信息(t_scsswxxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施维修信息 参数接收类", name = "TScsswxxxDTO")
public class TScsswxxxDTO extends TScsswxxxEntity {
}
