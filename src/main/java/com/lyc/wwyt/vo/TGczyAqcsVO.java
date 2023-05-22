package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TGczyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 高处作业信息安全措施表(t_gczy_aqcs)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "高处作业信息安全措施表 数据展示类", name = "TGczyAqcsVO")
public class TGczyAqcsVO extends TGczyAqcsEntity {
}
