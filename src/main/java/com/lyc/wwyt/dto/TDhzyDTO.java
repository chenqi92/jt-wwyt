package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDhzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业信息表(t_dhzy)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业信息表 参数接收类", name = "TDhzyDTO")
public class TDhzyDTO extends TDhzyEntity {
}
