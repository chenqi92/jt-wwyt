package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TQyryxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业人员信息表(t_qyryxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:32
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "企业人员信息表 数据展示类", name = "TQyryxxVO")
public class TQyryxxVO extends TQyryxxEntity {
}
