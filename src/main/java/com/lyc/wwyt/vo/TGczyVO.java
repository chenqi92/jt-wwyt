package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TGczyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 高处作业信息表(t_gczy)VO
 *
 * @author lhh
 * @since 2023-05-22 14:16:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "高处作业信息表 数据展示类", name = "TGczyVO")
public class TGczyVO extends TGczyEntity {
}
