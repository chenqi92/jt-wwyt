package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDtzyDao;
import com.lyc.wwyt.entity.TDtzyEntity;
import com.lyc.wwyt.dto.TDtzyDTO;
import com.lyc.wwyt.vo.TDtzyVO;
import com.lyc.wwyt.service.TDtzyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 动土作业信息表(t_dtzy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:54:33
 */
@Service("tDtzyService")
@RequiredArgsConstructor
public class TDtzyServiceImpl extends ServiceImpl<TDtzyDao, TDtzyEntity> implements TDtzyService {

    private final TDtzyDao tDtzyDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDtzyVO> selectList() {
        return this.tDtzyDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDtzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDtzyVO> selectPage(Page<TDtzyDTO> page, TDtzyDTO tDtzyDTO) {
        return this.tDtzyDao.selectList(page, tDtzyDTO);
    }
}
