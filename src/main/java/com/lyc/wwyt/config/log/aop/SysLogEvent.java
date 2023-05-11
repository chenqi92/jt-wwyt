package com.lyc.wwyt.config.log.aop;

import com.lyc.wwyt.config.log.dto.SysLogDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 类 SysLogEvent
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Getter
@AllArgsConstructor
public class SysLogEvent {

    private final SysLogDto sysLog;
}
