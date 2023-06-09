package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TJcpcsdxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 检查频次设定信息表(t_jcpcsdxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "检查频次设定信息表 数据展示类", name = "TJcpcsdxxVO")
public class TJcpcsdxxVO extends TJcpcsdxxEntity {
}
