package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.ScCheckEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全_安全风险、隐患管理(sc_check)VO
 *
 * @author chenqi
 * @since 2023-06-01 17:53:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全_安全风险、隐患管理 数据展示类", name = "ScCheckVO")
public class ScCheckVO extends ScCheckEntity {
}
