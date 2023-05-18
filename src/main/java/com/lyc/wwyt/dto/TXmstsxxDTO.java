package com.lyc.wwyt.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.lyc.wwyt.entity.TXmstsxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 项目三同时信息表(t_xmstsxx)DTO
 *
 * @author lhh
 * @since 2023-05-17 17:19:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "项目三同时信息表 参数接收类", name = "TXmstsxxDTO")
public class TXmstsxxDTO extends TXmstsxxEntity {
}