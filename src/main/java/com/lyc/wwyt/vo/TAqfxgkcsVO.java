package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TAqfxgkcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全风险管控措施表结构(t_aqfxgkcs)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全风险管控措施表结构 数据展示类", name = "TAqfxgkcsVO")
public class TAqfxgkcsVO extends TAqfxgkcsEntity {
}
