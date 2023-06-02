package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TAqjcjlEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全检查记录表(t_aqjcjl)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全检查记录表 数据展示类", name = "TAqjcjlVO")
public class TAqjcjlVO extends TAqjcjlEntity {
}
