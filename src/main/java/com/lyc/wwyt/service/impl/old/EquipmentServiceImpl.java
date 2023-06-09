package com.lyc.wwyt.service.impl.old;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.old.EquipmentDao;
import com.lyc.wwyt.entity.old.EquipmentEntity;
import com.lyc.wwyt.service.old.EquipmentService;
import org.springframework.stereotype.Service;


@Service("equipmentService")
public class EquipmentServiceImpl extends ServiceImpl<EquipmentDao, EquipmentEntity> implements EquipmentService {

}
