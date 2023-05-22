package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDlzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 断路作业信息表(t_dlzy)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业信息表 参数接收类", name = "TDlzyDTO")
public class TDlzyDTO extends TDlzyEntity {
}
