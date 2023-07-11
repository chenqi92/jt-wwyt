package com.lyc.wwyt.task;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * 类 SearchParam
 *
 * @author ChenQi
 * @date 2023/6/30
 */
@Data
@Builder
public class SearchParam {

    /**
     * 需要查询的表
     */
    private String serviceId;

    /**
     * 开始时间
     */
    private LocalDate startTime;

    /**
     * 结束时间
     */
    private LocalDate endTime;

    /**
     * 查询企业信息，多个企业以逗号隔开
     */
    private String orgCode;
}
