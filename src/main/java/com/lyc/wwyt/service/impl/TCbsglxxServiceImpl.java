package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbsglxxDao;
import com.lyc.wwyt.entity.TCbsglxxEntity;
import com.lyc.wwyt.service.TCbsglxxService;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

/**
 * 承包商管理信息表(t_cbsglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-12 15:32:04
 */
@Service("tCbsglxxService")
@AllArgsConstructor
public class TCbsglxxServiceImpl extends ServiceImpl<TCbsglxxDao, TCbsglxxEntity> implements TCbsglxxService {

    private final TCbsglxxDao tCbsglxxDao;

}
