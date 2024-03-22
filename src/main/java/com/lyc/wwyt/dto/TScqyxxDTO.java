package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TScqyxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产区域信息表(t_scqyxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产区域信息表 参数接收类", name = "TScqyxxDTO")
public class TScqyxxDTO extends TScqyxxEntity {
}
