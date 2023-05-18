package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TMbcdzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 盲板抽堵安全措施表(t_mbcdzy_aqcs)DTO
 *
 * @author lhh
 * @since 2023-05-18 15:55:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "盲板抽堵安全措施表 参数接收类", name = "TMbcdzyAqcsDTO")
public class TMbcdzyAqcsDTO extends TMbcdzyAqcsEntity {
}
