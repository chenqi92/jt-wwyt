package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDlzySplzDao;
import com.lyc.wwyt.entity.TDlzySplzEntity;
import com.lyc.wwyt.dto.TDlzySplzDTO;
import com.lyc.wwyt.vo.TDlzySplzVO;
import com.lyc.wwyt.service.TDlzySplzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 断路作业审批流转记录表(t_dlzy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:41
 */
@Service("tDlzySplzService")
@RequiredArgsConstructor
public class TDlzySplzServiceImpl extends ServiceImpl<TDlzySplzDao, TDlzySplzEntity> implements TDlzySplzService {

    private final TDlzySplzDao tDlzySplzDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDlzySplzVO> queryPage(Page<TDlzySplzDTO> page, TDlzySplzDTO tDlzySplzDTO) {
        return this.tDlzySplzDao.queryList(page, tDlzySplzDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDlzySplzDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDlzySplzVO> queryList(TDlzySplzDTO tDlzySplzDTO) {
        return this.tDlzySplzDao.queryList(tDlzySplzDTO);
    }
}
