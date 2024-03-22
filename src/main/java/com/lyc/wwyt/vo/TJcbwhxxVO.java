package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TJcbwhxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 安全检查表维护信息表结构(t_jcbwhxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "安全检查表维护信息表结构 数据展示类", name = "TJcbwhxxVO")
public class TJcbwhxxVO extends TJcbwhxxEntity {
}
