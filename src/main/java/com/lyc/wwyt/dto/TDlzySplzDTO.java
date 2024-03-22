package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TDlzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 断路作业审批流转记录表(t_dlzy_splz)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "断路作业审批流转记录表 参数接收类", name = "TDlzySplzDTO")
public class TDlzySplzDTO extends TDlzySplzEntity {
}
