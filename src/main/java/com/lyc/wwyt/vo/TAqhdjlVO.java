package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TAqhdjlEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全活动记录表(t_aqhdjl)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全活动记录表 数据展示类", name = "TAqhdjlVO")
public class TAqhdjlVO extends TAqhdjlEntity {
}
