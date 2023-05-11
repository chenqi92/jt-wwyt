package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TLogDao;
import com.lyc.wwyt.entity.TLogEntity;
import com.lyc.wwyt.service.TLogService;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

/**
 * 日志表(t_log)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-11 09:41:45
 */
@Service("tLogService")
@AllArgsConstructor
public class TLogServiceImpl extends ServiceImpl<TLogDao, TLogEntity> implements TLogService {

    private final TLogDao tLogDao;

}
