package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TCbswzjlxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 承包商违章记录信息表(t_cbswzjlxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "承包商违章记录信息表 数据展示类", name = "TCbswzjlxxVO")
public class TCbswzjlxxVO extends TCbswzjlxxEntity {
}
