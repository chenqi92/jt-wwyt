package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDtzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动土作业安全措施表(t_dtzy_aqcs)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动土作业安全措施表 参数接收类", name = "TDtzyAqcsDTO")
public class TDtzyAqcsDTO extends TDtzyAqcsEntity {
}
