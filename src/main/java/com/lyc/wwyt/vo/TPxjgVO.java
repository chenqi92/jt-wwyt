package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TPxjgEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 培训结果表(t_pxjg)VO
 *
 * @author chenqi
 * @since 2023-05-16 16:33:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "培训结果表 数据展示类", name = "TPxjgVO")
public class TPxjgVO extends TPxjgEntity {
}
