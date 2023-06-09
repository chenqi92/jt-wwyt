package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TRypxxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 人员培训信息表(t_rypxxx)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:34:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "人员培训信息表 数据展示类", name = "TRypxxxVO")
public class TRypxxxVO extends TRypxxxEntity {
}
