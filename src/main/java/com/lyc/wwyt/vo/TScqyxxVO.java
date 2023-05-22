package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TScqyxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产区域信息表(t_scqyxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产区域信息表 数据展示类", name = "TScqyxxVO")
public class TScqyxxVO extends TScqyxxEntity {
}
