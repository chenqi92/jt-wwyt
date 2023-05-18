package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDwszxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 点位设置信息表(t_dwszxx)VO
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "点位设置信息表 数据展示类", name = "TDwszxxVO")
public class TDwszxxVO extends TDwszxxEntity {
}
