package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDwjzglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 定位基站管理信息表(t_dwjzglxx)VO
 *
 * @author lhh
 * @since 2023-05-18 16:32:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "定位基站管理信息表 数据展示类", name = "TDwjzglxxVO")
public class TDwjzglxxVO extends TDwjzglxxEntity {
}