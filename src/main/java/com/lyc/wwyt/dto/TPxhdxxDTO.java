package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TPxhdxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 培训活动信息表(t_pxhdxx)DTO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训活动信息表 参数接收类", name = "TPxhdxxDTO")
public class TPxhdxxDTO extends TPxhdxxEntity {
}
