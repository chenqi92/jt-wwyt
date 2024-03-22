package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TQyryxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业人员信息表(t_qyryxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:32
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业人员信息表 参数接收类", name = "TQyryxxDTO")
public class TQyryxxDTO extends TQyryxxEntity {
}
