package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDwjzglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 定位基站管理信息表(t_dwjzglxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "定位基站管理信息表 参数接收类", name = "TDwjzglxxDTO")
public class TDwjzglxxDTO extends TDwjzglxxEntity {
}
