package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TXmstsxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 项目三同时信息表(t_xmstsxx)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "项目三同时信息表 数据展示类", name = "TXmstsxxVO")
public class TXmstsxxVO extends TXmstsxxEntity {
}
