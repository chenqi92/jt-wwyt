package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDwxbglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 定位信标管理信息表(t_dwxbglxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "定位信标管理信息表 参数接收类", name = "TDwxbglxxDTO")
public class TDwxbglxxDTO extends TDwxbglxxEntity {
}
