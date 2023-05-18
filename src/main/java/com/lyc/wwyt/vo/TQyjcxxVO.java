package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TQyjcxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业基础信息表(t_qyjcxx)VO
 *
 * @author lhh
 * @since 2023-05-17 11:20:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业基础信息表 数据展示类", name = "TQyjcxxVO")
public class TQyjcxxVO extends TQyjcxxEntity {
}
