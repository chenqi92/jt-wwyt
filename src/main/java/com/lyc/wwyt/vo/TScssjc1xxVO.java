package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TScssjc1xxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生产设施检测信息(t_scssjc1xx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "生产设施检测信息 数据展示类", name = "TScssjc1xxVO")
public class TScssjc1xxVO extends TScssjc1xxEntity {
}
