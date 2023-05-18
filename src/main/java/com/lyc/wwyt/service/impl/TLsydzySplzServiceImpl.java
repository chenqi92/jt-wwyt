package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TLsydzySplzDao;
import com.lyc.wwyt.entity.TLsydzySplzEntity;
import com.lyc.wwyt.dto.TLsydzySplzDTO;
import com.lyc.wwyt.vo.TLsydzySplzVO;
import com.lyc.wwyt.service.TLsydzySplzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 临时用电作业审批流转记录表(t_lsydzy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:55:01
 */
@Service("tLsydzySplzService")
@RequiredArgsConstructor
public class TLsydzySplzServiceImpl extends ServiceImpl<TLsydzySplzDao, TLsydzySplzEntity> implements TLsydzySplzService {

    private final TLsydzySplzDao tLsydzySplzDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TLsydzySplzVO> selectList() {
        return this.tLsydzySplzDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TLsydzySplzVO> selectPage(Page<TLsydzySplzDTO> page, TLsydzySplzDTO tLsydzySplzDTO) {
        return this.tLsydzySplzDao.selectList(page, tLsydzySplzDTO);
    }
}
