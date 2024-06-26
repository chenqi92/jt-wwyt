package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TYjwzglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应急物资管理信息表(t_yjwzglxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "应急物资管理信息表 数据展示类", name = "TYjwzglxxVO")
public class TYjwzglxxVO extends TYjwzglxxEntity {
}
