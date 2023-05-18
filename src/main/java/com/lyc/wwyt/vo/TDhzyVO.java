package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDhzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业信息表(t_dhzy)VO
 *
 * @author lhh
 * @since 2023-05-18 15:54:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业信息表 数据展示类", name = "TDhzyVO")
public class TDhzyVO extends TDhzyEntity {
}
