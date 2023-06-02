package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TCbswzjlxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商违章记录信息表(t_cbswzjlxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商违章记录信息表 参数接收类", name = "TCbswzjlxxDTO")
public class TCbswzjlxxDTO extends TCbswzjlxxEntity {
}
