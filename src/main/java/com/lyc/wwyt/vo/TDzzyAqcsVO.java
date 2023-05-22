package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDzzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 吊装作业安全措施表(t_dzzy_aqcs)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "吊装作业安全措施表 数据展示类", name = "TDzzyAqcsVO")
public class TDzzyAqcsVO extends TDzzyAqcsEntity {
}
