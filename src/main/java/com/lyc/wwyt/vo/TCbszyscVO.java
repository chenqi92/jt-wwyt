package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TCbszyscEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商安全作业规程审查表(t_cbszysc)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商安全作业规程审查表 数据展示类", name = "TCbszyscVO")
public class TCbszyscVO extends TCbszyscEntity {
}
