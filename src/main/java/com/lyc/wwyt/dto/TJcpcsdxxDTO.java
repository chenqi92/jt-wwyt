package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TJcpcsdxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 检查频次设定信息表(t_jcpcsdxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:16:27
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "检查频次设定信息表 参数接收类", name = "TJcpcsdxxDTO")
public class TJcpcsdxxDTO extends TJcpcsdxxEntity {
}
