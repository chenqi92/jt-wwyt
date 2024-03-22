package com.lyc.wwyt.vo;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.Data;

/**
 * 类 TableInfoVO
 *
 * @author ChenQi
 * @date 2023/5/18
 */
@Hidden
@Data
public class TableInfoVO {

    /**
     * 表字段对应的传输参数的表示方式
     */
    private String code;

    /**
     * 实际表中的列名称
     */
    private String name;

    /**
     * 字段备注，防止可能使用的情况
     */
    private String comment;
}
