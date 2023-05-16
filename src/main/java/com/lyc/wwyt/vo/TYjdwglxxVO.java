package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYjdwglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急队伍管理信息表(t_yjdwglxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急队伍管理信息表 数据展示类", name = "TYjdwglxxVO")
public class TYjdwglxxVO extends TYjdwglxxEntity {
}
