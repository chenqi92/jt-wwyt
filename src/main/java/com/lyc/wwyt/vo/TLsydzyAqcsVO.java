package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TLsydzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 临时用电安全措施表(t_lsydzy_aqcs)VO
 *
 * @author lhh
 * @since 2023-05-18 15:54:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "临时用电安全措施表 数据展示类", name = "TLsydzyAqcsVO")
public class TLsydzyAqcsVO extends TLsydzyAqcsEntity {
}
