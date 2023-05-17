package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYhpcjlEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 隐患排查记录表(t_yhpcjl)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "隐患排查记录表 数据展示类", name = "TYhpcjlVO")
public class TYhpcjlVO extends TYhpcjlEntity {
}
