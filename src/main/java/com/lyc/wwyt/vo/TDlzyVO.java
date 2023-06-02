package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDlzyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 断路作业信息表(t_dlzy)VO
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业信息表 数据展示类", name = "TDlzyVO")
public class TDlzyVO extends TDlzyEntity {
}
