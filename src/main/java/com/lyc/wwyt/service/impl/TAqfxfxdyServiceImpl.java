package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqfxfxdyDao;
import com.lyc.wwyt.entity.TAqfxfxdyEntity;
import com.lyc.wwyt.dto.TAqfxfxdyDTO;
import com.lyc.wwyt.vo.TAqfxfxdyVO;
import com.lyc.wwyt.service.TAqfxfxdyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全风险分析单元表(t_aqfxfxdy)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
@Service("tAqfxfxdyService")
@RequiredArgsConstructor
public class TAqfxfxdyServiceImpl extends ServiceImpl<TAqfxfxdyDao, TAqfxfxdyEntity> implements TAqfxfxdyService {

    private final TAqfxfxdyDao tAqfxfxdyDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TAqfxfxdyVO> selectList() {
        return this.tAqfxfxdyDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqfxfxdyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqfxfxdyVO> selectPage(Page<TAqfxfxdyDTO> page, TAqfxfxdyDTO tAqfxfxdyDTO) {
        return this.tAqfxfxdyDao.selectList(page, tAqfxfxdyDTO);
    }
}
