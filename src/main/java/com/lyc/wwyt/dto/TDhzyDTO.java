package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDhzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业信息表(t_dhzy)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业信息表 参数接收类", name = "TDhzyDTO")
public class TDhzyDTO extends TDhzyEntity {
}
