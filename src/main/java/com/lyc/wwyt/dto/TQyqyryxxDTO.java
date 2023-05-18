package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TQyqyryxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 人员在岗在位信息表(t_qyqyryxx)DTO
 *
 * @author lhh
 * @since 2023-05-18 16:32:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "人员在岗在位信息表 参数接收类", name = "TQyqyryxxDTO")
public class TQyqyryxxDTO extends TQyqyryxxEntity {
}
