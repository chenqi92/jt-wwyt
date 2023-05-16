package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYjczkxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急处置卡信息表：t_yjczkxx(t_yjczkxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急处置卡信息表：t_yjczkxx 数据展示类", name = "TYjczkxxVO")
public class TYjczkxxVO extends TYjczkxxEntity {
}
