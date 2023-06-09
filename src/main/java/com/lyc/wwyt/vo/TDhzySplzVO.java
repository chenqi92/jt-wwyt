package com.lyc.wwyt.vo;


import com.lyc.wwyt.entity.TDhzySplzEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 动火作业作业审批流转记录表(t_dhzy_splz)VO
 *
 * @author lhh
 * @since 2023-05-22 14:13:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "动火作业作业审批流转记录表 数据展示类", name = "TDhzySplzVO")
public class TDhzySplzVO extends TDhzySplzEntity {
}
