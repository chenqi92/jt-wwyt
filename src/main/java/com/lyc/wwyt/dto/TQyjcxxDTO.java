package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TQyjcxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业基础信息表(t_qyjcxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:32
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业基础信息表 参数接收类", name = "TQyjcxxDTO")
public class TQyjcxxDTO extends TQyjcxxEntity {
}
