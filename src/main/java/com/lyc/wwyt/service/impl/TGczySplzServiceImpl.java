package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TGczySplzDao;
import com.lyc.wwyt.dto.TGczySplzDTO;
import com.lyc.wwyt.entity.TGczySplzEntity;
import com.lyc.wwyt.service.TGczySplzService;
import com.lyc.wwyt.vo.TGczySplzVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 高处作业审批流转记录表(t_gczy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:16:26
 */
@Service("tGczySplzService")
@RequiredArgsConstructor
public class TGczySplzServiceImpl extends ServiceImpl<TGczySplzDao, TGczySplzEntity> implements TGczySplzService {

    private final TGczySplzDao tGczySplzDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tGczySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TGczySplzVO> queryPage(Page<TGczySplzDTO> page, TGczySplzDTO tGczySplzDTO) {
        return this.tGczySplzDao.queryList(page, tGczySplzDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tGczySplzDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TGczySplzVO> queryList(TGczySplzDTO tGczySplzDTO) {
        return this.tGczySplzDao.queryList(tGczySplzDTO);
    }
}
