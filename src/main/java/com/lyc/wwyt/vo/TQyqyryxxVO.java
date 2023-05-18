package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TQyqyryxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 人员在岗在位信息表(t_qyqyryxx)VO
 *
 * @author lhh
 * @since 2023-05-18 16:32:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "人员在岗在位信息表 数据展示类", name = "TQyqyryxxVO")
public class TQyqyryxxVO extends TQyqyryxxEntity {
}
