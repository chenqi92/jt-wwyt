package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYhzlxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 隐患治理信息表(t_yhzlxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "隐患治理信息表 数据展示类", name = "TYhzlxxVO")
public class TYhzlxxVO extends TYhzlxxEntity {
}
