package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDictDao;
import com.lyc.wwyt.entity.TDictEntity;
import com.lyc.wwyt.service.TDictService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 五位一体_字典表(t_dict)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-10 17:47:13
 */
@Service("tDictService")
@AllArgsConstructor
public class TDictServiceImpl extends ServiceImpl<TDictDao, TDictEntity> implements TDictService {

    private final TDictDao tDictDao;

}
