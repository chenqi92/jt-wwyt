package com.lyc.wwyt.config;

import lombok.Builder;
import lombok.Data;

/**
 * 类 ErrorMsg
 *
 * @author ChenQi
 * @date 2023/5/12
 */
@Builder
@Data
public class ErrorMsg {

    /**
     * 错误信息主键
     */
    private String uuid;

    /**
     * 错误信息提示
     */
    private String msg;
}
