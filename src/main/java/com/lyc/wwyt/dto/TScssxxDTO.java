package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TScssxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施信息表(t_scssxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施信息表 参数接收类", name = "TScssxxDTO")
public class TScssxxDTO extends TScssxxEntity {
}
