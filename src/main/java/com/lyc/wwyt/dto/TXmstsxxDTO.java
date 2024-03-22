package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TXmstsxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 项目三同时信息表(t_xmstsxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "项目三同时信息表 参数接收类", name = "TXmstsxxDTO")
public class TXmstsxxDTO extends TXmstsxxEntity {
}
