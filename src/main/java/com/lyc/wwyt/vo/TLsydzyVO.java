package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TLsydzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电信息表(t_lsydzy)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电信息表 数据展示类", name = "TLsydzyVO")
public class TLsydzyVO extends TLsydzyEntity {
}
