package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDzzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 吊装作业信息表(t_dzzy)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "吊装作业信息表 数据展示类", name = "TDzzyVO")
public class TDzzyVO extends TDzzyEntity {
}
