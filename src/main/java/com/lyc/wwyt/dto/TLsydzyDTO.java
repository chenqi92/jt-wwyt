package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TLsydzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电信息表(t_lsydzy)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电信息表 参数接收类", name = "TLsydzyDTO")
public class TLsydzyDTO extends TLsydzyEntity {
}
