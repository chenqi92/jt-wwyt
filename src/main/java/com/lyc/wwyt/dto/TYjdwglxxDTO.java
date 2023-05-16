package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYjdwglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急队伍管理信息表(t_yjdwglxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急队伍管理信息表 参数接收类", name = "TYjdwglxxDTO")
public class TYjdwglxxDTO extends TYjdwglxxEntity {
}
