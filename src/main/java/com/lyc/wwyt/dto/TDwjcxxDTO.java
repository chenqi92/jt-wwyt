package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDwjcxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 点位检查信息表(t_dwjcxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:16:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "点位检查信息表 参数接收类", name = "TDwjcxxDTO")
public class TDwjcxxDTO extends TDwjcxxEntity {
}
