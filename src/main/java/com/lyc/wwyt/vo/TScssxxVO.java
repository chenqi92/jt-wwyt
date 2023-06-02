package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TScssxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施信息表(t_scssxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施信息表 数据展示类", name = "TScssxxVO")
public class TScssxxVO extends TScssxxEntity {
}
