package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TPxzlxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 培训资料信息表(t_pxzlxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训资料信息表 数据展示类", name = "TPxzlxxVO")
public class TPxzlxxVO extends TPxzlxxEntity {
}
