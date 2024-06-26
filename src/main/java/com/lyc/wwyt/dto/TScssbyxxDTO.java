package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TScssbyxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施保养信息(t_scssbyxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施保养信息 参数接收类", name = "TScssbyxxDTO")
public class TScssbyxxDTO extends TScssbyxxEntity {
}
