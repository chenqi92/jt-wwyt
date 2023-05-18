package com.lyc.wwyt.dto;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDzzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 吊装作业信息表(t_dzzy)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "吊装作业信息表 参数接收类", name = "TDzzyDTO")
public class TDzzyDTO extends TDzzyEntity {
}
