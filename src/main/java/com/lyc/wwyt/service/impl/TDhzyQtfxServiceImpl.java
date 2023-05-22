package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDhzyQtfxDao;
import com.lyc.wwyt.entity.TDhzyQtfxEntity;
import com.lyc.wwyt.dto.TDhzyQtfxDTO;
import com.lyc.wwyt.vo.TDhzyQtfxVO;
import com.lyc.wwyt.service.TDhzyQtfxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 动火作业气体分析数据表(t_dhzy_qtfx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:08
 */
@Service("tDhzyQtfxService")
@RequiredArgsConstructor
public class TDhzyQtfxServiceImpl extends ServiceImpl<TDhzyQtfxDao, TDhzyQtfxEntity> implements TDhzyQtfxService {

    private final TDhzyQtfxDao tDhzyQtfxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzyQtfxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDhzyQtfxVO> queryPage(Page<TDhzyQtfxDTO> page, TDhzyQtfxDTO tDhzyQtfxDTO) {
        return this.tDhzyQtfxDao.queryList(page, tDhzyQtfxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDhzyQtfxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDhzyQtfxVO> queryList(TDhzyQtfxDTO tDhzyQtfxDTO) {
        return this.tDhzyQtfxDao.queryList(tDhzyQtfxDTO);
    }
}
