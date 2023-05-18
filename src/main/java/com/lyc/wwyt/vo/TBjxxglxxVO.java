package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TBjxxglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 报警信息管理信息表(t_bjxxglxx)VO
 *
 * @author lhh
 * @since 2023-05-18 16:32:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "报警信息管理信息表 数据展示类", name = "TBjxxglxxVO")
public class TBjxxglxxVO extends TBjxxglxxEntity {
}
