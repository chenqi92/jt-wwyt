package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDhzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业作业审批流转记录表(t_dhzy_splz)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业作业审批流转记录表 参数接收类", name = "TDhzySplzDTO")
public class TDhzySplzDTO extends TDhzySplzEntity {
}
