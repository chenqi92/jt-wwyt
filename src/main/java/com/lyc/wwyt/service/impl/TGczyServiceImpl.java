package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TGczyDao;
import com.lyc.wwyt.entity.TGczyEntity;
import com.lyc.wwyt.dto.TGczyDTO;
import com.lyc.wwyt.vo.TGczyVO;
import com.lyc.wwyt.service.TGczyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 高处作业信息表(t_gczy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:48
 */
@Service("tGczyService")
@RequiredArgsConstructor
public class TGczyServiceImpl extends ServiceImpl<TGczyDao, TGczyEntity> implements TGczyService {

    private final TGczyDao tGczyDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TGczyVO> selectList() {
        return this.tGczyDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tGczyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TGczyVO> selectPage(Page<TGczyDTO> page, TGczyDTO tGczyDTO) {
        return this.tGczyDao.selectList(page, tGczyDTO);
    }
}
