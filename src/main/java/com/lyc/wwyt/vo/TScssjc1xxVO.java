package com.lyc.wwyt.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScssjc1xxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施检测信息(t_scssjc1xx)VO
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施检测信息 数据展示类", name = "TScssjc1xxVO")
public class TScssjc1xxVO extends TScssjc1xxEntity {
}
