package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDlzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 断路作业安全措施表(t_dlzy_aqcs)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业安全措施表 参数接收类", name = "TDlzyAqcsDTO")
public class TDlzyAqcsDTO extends TDlzyAqcsEntity {
}
