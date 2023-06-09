package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDtzySplzDao;
import com.lyc.wwyt.dto.TDtzySplzDTO;
import com.lyc.wwyt.entity.TDtzySplzEntity;
import com.lyc.wwyt.service.TDtzySplzService;
import com.lyc.wwyt.vo.TDtzySplzVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 动土作业审批流转记录表(t_dtzy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:42
 */
@Service("tDtzySplzService")
@RequiredArgsConstructor
public class TDtzySplzServiceImpl extends ServiceImpl<TDtzySplzDao, TDtzySplzEntity> implements TDtzySplzService {

    private final TDtzySplzDao tDtzySplzDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDtzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDtzySplzVO> queryPage(Page<TDtzySplzDTO> page, TDtzySplzDTO tDtzySplzDTO) {
        return this.tDtzySplzDao.queryList(page, tDtzySplzDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDtzySplzDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDtzySplzVO> queryList(TDtzySplzDTO tDtzySplzDTO) {
        return this.tDtzySplzDao.queryList(tDtzySplzDTO);
    }
}
