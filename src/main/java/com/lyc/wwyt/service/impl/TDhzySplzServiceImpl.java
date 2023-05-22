package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDhzySplzDao;
import com.lyc.wwyt.entity.TDhzySplzEntity;
import com.lyc.wwyt.dto.TDhzySplzDTO;
import com.lyc.wwyt.vo.TDhzySplzVO;
import com.lyc.wwyt.service.TDhzySplzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 动火作业作业审批流转记录表(t_dhzy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@Service("tDhzySplzService")
@RequiredArgsConstructor
public class TDhzySplzServiceImpl extends ServiceImpl<TDhzySplzDao, TDhzySplzEntity> implements TDhzySplzService {

    private final TDhzySplzDao tDhzySplzDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDhzySplzVO> queryPage(Page<TDhzySplzDTO> page, TDhzySplzDTO tDhzySplzDTO) {
        return this.tDhzySplzDao.queryList(page, tDhzySplzDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDhzySplzDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDhzySplzVO> queryList(TDhzySplzDTO tDhzySplzDTO) {
        return this.tDhzySplzDao.queryList(tDhzySplzDTO);
    }
}
