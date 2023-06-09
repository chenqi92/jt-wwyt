package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.CmUnitDao;
import com.lyc.wwyt.dto.CmUnitDTO;
import com.lyc.wwyt.entity.CmUnitEntity;
import com.lyc.wwyt.service.CmUnitService;
import com.lyc.wwyt.vo.CmUnitVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (cm_unit)表服务实现类
 *
 * @author chenqi
 * @since 2023-06-02 14:06:06
 */
@Service("cmUnitService")
@RequiredArgsConstructor
public class CmUnitServiceImpl extends ServiceImpl<CmUnitDao, CmUnitEntity> implements CmUnitService {

    private final CmUnitDao cmUnitDao;

    /**
     * 分页查询所有数据
     *
     * @param page      分页参数
     * @param cmUnitDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<CmUnitVO> queryPage(Page<CmUnitDTO> page, CmUnitDTO cmUnitDTO) {
        return this.cmUnitDao.queryList(page, cmUnitDTO);
    }

    /**
     * 查询所有数据
     *
     * @param cmUnitDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<CmUnitVO> queryList(CmUnitDTO cmUnitDTO) {
        return this.cmUnitDao.queryList(cmUnitDTO);
    }
}
