package com.lyc.wwyt.config.log.listener;

import com.lyc.wwyt.config.log.aop.SysLogEvent;
import com.lyc.wwyt.entity.TLogEntity;
import com.lyc.wwyt.service.TLogService;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 类 TLogListener
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@AllArgsConstructor
@Component
public class SysLogListener {

    private final TLogService logService;

    @Async
    @Order
    @EventListener(SysLogEvent.class)
    public void saveSysLog(SysLogEvent event) {
        TLogEntity logEntity = new TLogEntity(event.getSysLog());
        logService.save(logEntity);
    }
}
