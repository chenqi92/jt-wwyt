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
 * @since 2023-05-18 15:54:31
 */
@Service("tDlzySplzService")
@RequiredArgsConstructor
public class TDlzySplzServiceImpl extends ServiceImpl<TDlzySplzDao, TDlzySplzEntity> implements TDlzySplzService {

    private final TDlzySplzDao tDlzySplzDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDlzySplzVO> selectList() {
        return this.tDlzySplzDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDlzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDlzySplzVO> selectPage(Page<TDlzySplzDTO> page, TDlzySplzDTO tDlzySplzDTO) {
        return this.tDlzySplzDao.selectList(page, tDlzySplzDTO);
    }
}
