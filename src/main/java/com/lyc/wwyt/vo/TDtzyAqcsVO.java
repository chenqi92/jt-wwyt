package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDtzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动土作业安全措施表(t_dtzy_aqcs)VO
 *
 * @author lhh
 * @since 2023-05-22 14:13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动土作业安全措施表 数据展示类", name = "TDtzyAqcsVO")
public class TDtzyAqcsVO extends TDtzyAqcsEntity {
}
