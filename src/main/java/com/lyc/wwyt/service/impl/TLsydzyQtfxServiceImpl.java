package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TLsydzyQtfxDao;
import com.lyc.wwyt.entity.TLsydzyQtfxEntity;
import com.lyc.wwyt.dto.TLsydzyQtfxDTO;
import com.lyc.wwyt.vo.TLsydzyQtfxVO;
import com.lyc.wwyt.service.TLsydzyQtfxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 临时用电气体分析数据表(t_lsydzy_qtfx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:59
 */
@Service("tLsydzyQtfxService")
@RequiredArgsConstructor
public class TLsydzyQtfxServiceImpl extends ServiceImpl<TLsydzyQtfxDao, TLsydzyQtfxEntity> implements TLsydzyQtfxService {

    private final TLsydzyQtfxDao tLsydzyQtfxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TLsydzyQtfxVO> selectList() {
        return this.tLsydzyQtfxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tLsydzyQtfxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TLsydzyQtfxVO> selectPage(Page<TLsydzyQtfxDTO> page, TLsydzyQtfxDTO tLsydzyQtfxDTO) {
        return this.tLsydzyQtfxDao.selectList(page, tLsydzyQtfxDTO);
    }
}
