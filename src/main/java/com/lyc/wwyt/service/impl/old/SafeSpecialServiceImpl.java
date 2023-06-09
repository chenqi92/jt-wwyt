package com.lyc.wwyt.service.impl.old;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.old.SafeSpecialDao;
import com.lyc.wwyt.entity.old.SafeSpecialEntity;
import com.lyc.wwyt.service.old.SafeSpecialService;
import org.springframework.stereotype.Service;


@Service("specialSafeService")
public class SafeSpecialServiceImpl extends ServiceImpl<SafeSpecialDao, SafeSpecialEntity> implements SafeSpecialService {

}
