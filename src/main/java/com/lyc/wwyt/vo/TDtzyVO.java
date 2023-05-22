package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDtzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动土作业信息表(t_dtzy)VO
 *
 * @author lhh
 * @since 2023-05-22 14:13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动土作业信息表 数据展示类", name = "TDtzyVO")
public class TDtzyVO extends TDtzyEntity {
}
