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
 * @since 2023-05-18 15:54:25
 */
@Service("tDhzySplzService")
@RequiredArgsConstructor
public class TDhzySplzServiceImpl extends ServiceImpl<TDhzySplzDao, TDhzySplzEntity> implements TDhzySplzService {

    private final TDhzySplzDao tDhzySplzDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDhzySplzVO> selectList() {
        return this.tDhzySplzDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDhzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDhzySplzVO> selectPage(Page<TDhzySplzDTO> page, TDhzySplzDTO tDhzySplzDTO) {
        return this.tDhzySplzDao.selectList(page, tDhzySplzDTO);
    }
}
