package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDwjcxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 点位检查信息表(t_dwjcxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "点位检查信息表 数据展示类", name = "TDwjcxxVO")
public class TDwjcxxVO extends TDwjcxxEntity {
}
