package com.lyc.wwyt.enums;

import com.lyc.wwyt.config.check.CodeEnum;

/**
 * 文件类型
 *
 * @author ChenQi
 * @date 2023/5/15
 */
public enum WjlxEnum implements CodeEnum {
    // 文档
    DOCUMENT("文档", "1"),
    // 视频
    VIDEO("视频", "2"),
    // 语音
    AUDIO("语音", "3"),
    // 其他
    OTHER("其他", "4");

    private final String code;
    private final String value;

    WjlxEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return value;
    }
}
