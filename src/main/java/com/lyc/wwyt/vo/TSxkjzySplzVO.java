package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TSxkjzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 受限空间作业审批流转记录表(t_sxkjzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-22 14:22:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "受限空间作业审批流转记录表 数据展示类", name = "TSxkjzySplzVO")
public class TSxkjzySplzVO extends TSxkjzySplzEntity {
}
