package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDwxbglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 定位信标管理信息表(t_dwxbglxx)DTO
 *
 * @author lhh
 * @since 2023-05-18 16:32:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "定位信标管理信息表 参数接收类", name = "TDwxbglxxDTO")
public class TDwxbglxxDTO extends TDwxbglxxEntity {
}