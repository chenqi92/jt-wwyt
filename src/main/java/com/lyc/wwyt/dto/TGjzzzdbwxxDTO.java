package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TGjzzzdbwxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关键装置重点部位信息表(t_gjzzzdbwxx)DTO
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "关键装置重点部位信息表 参数接收类", name = "TGjzzzdbwxxDTO")
public class TGjzzzdbwxxDTO extends TGjzzzdbwxxEntity {
}
