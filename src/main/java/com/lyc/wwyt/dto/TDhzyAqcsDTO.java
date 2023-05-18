package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDhzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业安全措施表(t_dhzy_aqcs)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:54:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业安全措施表 参数接收类", name = "TDhzyAqcsDTO")
public class TDhzyAqcsDTO extends TDhzyAqcsEntity {
}
