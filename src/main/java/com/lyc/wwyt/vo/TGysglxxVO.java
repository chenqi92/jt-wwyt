package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TGysglxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 供应商管理信息表(t_gysglxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "供应商管理信息表 数据展示类", name = "TGysglxxVO")
public class TGysglxxVO extends TGysglxxEntity {
}
