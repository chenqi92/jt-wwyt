package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TGczyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 高处作业信息安全措施表(t_gczy_aqcs)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "高处作业信息安全措施表 参数接收类", name = "TGczyAqcsDTO")
public class TGczyAqcsDTO extends TGczyAqcsEntity {
}
