package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TMbcdzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 盲板抽堵信息表(t_mbcdzy)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "盲板抽堵信息表 数据展示类", name = "TMbcdzyVO")
public class TMbcdzyVO extends TMbcdzyEntity {
}
