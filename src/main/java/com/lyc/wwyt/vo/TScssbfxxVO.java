package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TScssbfxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设备报废信息(t_scssbfxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设备报废信息 数据展示类", name = "TScssbfxxVO")
public class TScssbfxxVO extends TScssbfxxEntity {
}
