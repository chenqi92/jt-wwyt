package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TCbsxgzsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商相关证书表(t_cbsxgzs)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商相关证书表 参数接收类", name = "TCbsxgzsDTO")
public class TCbsxgzsDTO extends TCbsxgzsEntity {
}
