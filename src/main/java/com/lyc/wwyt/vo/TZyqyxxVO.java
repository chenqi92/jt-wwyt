package com.lyc.wwyt.vo;


import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TZyqyxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 作业区域信息表(t_zyqyxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "作业区域信息表 数据展示类", name = "TZyqyxxVO")
public class TZyqyxxVO extends TZyqyxxEntity {
}
