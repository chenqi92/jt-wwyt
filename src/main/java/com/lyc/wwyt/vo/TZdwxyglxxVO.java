package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TZdwxyglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 重大危险源管理信息表(t_zdwxyglxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "重大危险源管理信息表 数据展示类", name = "TZdwxyglxxVO")
public class TZdwxyglxxVO extends TZdwxyglxxEntity {
}
