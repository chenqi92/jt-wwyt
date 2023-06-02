package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDzzySplzDao;
import com.lyc.wwyt.dto.TDzzySplzDTO;
import com.lyc.wwyt.entity.TDzzySplzEntity;
import com.lyc.wwyt.service.TDzzySplzService;
import com.lyc.wwyt.vo.TDzzySplzVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 吊装作业审批流转记录表(t_dzzy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:16:25
 */
@Service("tDzzySplzService")
@RequiredArgsConstructor
public class TDzzySplzServiceImpl extends ServiceImpl<TDzzySplzDao, TDzzySplzEntity> implements TDzzySplzService {

    private final TDzzySplzDao tDzzySplzDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDzzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDzzySplzVO> queryPage(Page<TDzzySplzDTO> page, TDzzySplzDTO tDzzySplzDTO) {
        return this.tDzzySplzDao.queryList(page, tDzzySplzDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDzzySplzDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDzzySplzVO> queryList(TDzzySplzDTO tDzzySplzDTO) {
        return this.tDzzySplzDao.queryList(tDzzySplzDTO);
    }
}
