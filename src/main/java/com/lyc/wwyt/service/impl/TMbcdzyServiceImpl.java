package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TMbcdzyDao;
import com.lyc.wwyt.entity.TMbcdzyEntity;
import com.lyc.wwyt.dto.TMbcdzyDTO;
import com.lyc.wwyt.vo.TMbcdzyVO;
import com.lyc.wwyt.service.TMbcdzyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 盲板抽堵信息表(t_mbcdzy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:30
 */
@Service("tMbcdzyService")
@RequiredArgsConstructor
public class TMbcdzyServiceImpl extends ServiceImpl<TMbcdzyDao, TMbcdzyEntity> implements TMbcdzyService {

    private final TMbcdzyDao tMbcdzyDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tMbcdzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TMbcdzyVO> queryPage(Page<TMbcdzyDTO> page, TMbcdzyDTO tMbcdzyDTO) {
        return this.tMbcdzyDao.queryList(page, tMbcdzyDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tMbcdzyDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TMbcdzyVO> queryList(TMbcdzyDTO tMbcdzyDTO) {
        return this.tMbcdzyDao.queryList(tMbcdzyDTO);
    }
}
