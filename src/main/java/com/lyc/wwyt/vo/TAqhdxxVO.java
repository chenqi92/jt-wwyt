package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TAqhdxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全活动信息表(t_aqhdxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全活动信息表 数据展示类", name = "TAqhdxxVO")
public class TAqhdxxVO extends TAqhdxxEntity {
}
