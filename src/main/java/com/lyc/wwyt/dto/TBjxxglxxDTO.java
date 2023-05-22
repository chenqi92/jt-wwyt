package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TBjxxglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 报警信息管理信息表(t_bjxxglxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "报警信息管理信息表 参数接收类", name = "TBjxxglxxDTO")
public class TBjxxglxxDTO extends TBjxxglxxEntity {
}
