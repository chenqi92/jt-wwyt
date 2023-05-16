package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TYhpcrwxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 隐患排查任务信息表(t_yhpcrwxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "隐患排查任务信息表 数据展示类", name = "TYhpcrwxxVO")
public class TYhpcrwxxVO extends TYhpcrwxxEntity {
}
