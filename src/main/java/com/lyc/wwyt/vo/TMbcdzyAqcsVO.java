package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TMbcdzyAqcsEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 盲板抽堵安全措施表(t_mbcdzy_aqcs)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:31
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "盲板抽堵安全措施表 数据展示类", name = "TMbcdzyAqcsVO")
public class TMbcdzyAqcsVO extends TMbcdzyAqcsEntity {
}
