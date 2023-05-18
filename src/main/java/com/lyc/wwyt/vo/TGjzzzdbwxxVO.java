package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TGjzzzdbwxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关键装置重点部位信息表(t_gjzzzdbwxx)VO
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "关键装置重点部位信息表 数据展示类", name = "TGjzzzdbwxxVO")
public class TGjzzzdbwxxVO extends TGjzzzdbwxxEntity {
}