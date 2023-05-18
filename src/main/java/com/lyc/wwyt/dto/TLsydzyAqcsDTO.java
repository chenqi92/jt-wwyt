package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TLsydzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电安全措施表(t_lsydzy_aqcs)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电安全措施表 参数接收类", name = "TLsydzyAqcsDTO")
public class TLsydzyAqcsDTO extends TLsydzyAqcsEntity {
}
