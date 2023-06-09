package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TSxkjzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业审批流转记录表(t_sxkjzy_splz)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业审批流转记录表 参数接收类", name = "TSxkjzySplzDTO")
public class TSxkjzySplzDTO extends TSxkjzySplzEntity {
}
