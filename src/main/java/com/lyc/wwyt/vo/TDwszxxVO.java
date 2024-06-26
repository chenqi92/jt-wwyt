package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDwszxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 点位设置信息表(t_dwszxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "点位设置信息表 数据展示类", name = "TDwszxxVO")
public class TDwszxxVO extends TDwszxxEntity {
}
