package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqfxfxdyDao;
import com.lyc.wwyt.dto.TAqfxfxdyDTO;
import com.lyc.wwyt.entity.TAqfxfxdyEntity;
import com.lyc.wwyt.service.TAqfxfxdyService;
import com.lyc.wwyt.vo.TAqfxfxdyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 安全风险分析单元表(t_aqfxfxdy)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:40
 */
@Service("tAqfxfxdyService")
@RequiredArgsConstructor
public class TAqfxfxdyServiceImpl extends ServiceImpl<TAqfxfxdyDao, TAqfxfxdyEntity> implements TAqfxfxdyService {

    private final TAqfxfxdyDao tAqfxfxdyDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqfxfxdyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqfxfxdyVO> queryPage(Page<TAqfxfxdyDTO> page, TAqfxfxdyDTO tAqfxfxdyDTO) {
        return this.tAqfxfxdyDao.queryList(page, tAqfxfxdyDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tAqfxfxdyDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TAqfxfxdyVO> queryList(TAqfxfxdyDTO tAqfxfxdyDTO) {
        return this.tAqfxfxdyDao.queryList(tAqfxfxdyDTO);
    }
}
