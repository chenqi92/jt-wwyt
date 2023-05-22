package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDhzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业安全措施表(t_dhzy_aqcs)VO
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业安全措施表 数据展示类", name = "TDhzyAqcsVO")
public class TDhzyAqcsVO extends TDhzyAqcsEntity {
}
