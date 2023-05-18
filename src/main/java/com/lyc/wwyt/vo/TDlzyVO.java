package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TDlzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 断路作业信息表(t_dlzy)VO
 *
 * @author lhh
 * @since 2023-05-18 15:54:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业信息表 数据展示类", name = "TDlzyVO")
public class TDlzyVO extends TDlzyEntity {
}
