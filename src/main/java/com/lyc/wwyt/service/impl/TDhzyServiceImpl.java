package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDhzyDao;
import com.lyc.wwyt.entity.TDhzyEntity;
import com.lyc.wwyt.dto.TDhzyDTO;
import com.lyc.wwyt.vo.TDhzyVO;
import com.lyc.wwyt.service.TDhzyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 动火作业信息表(t_dhzy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:13:07
 */
@Service("tDhzyService")
@RequiredArgsConstructor
public class TDhzyServiceImpl extends ServiceImpl<TDhzyDao, TDhzyEntity> implements TDhzyService {

    private final TDhzyDao tDhzyDao;

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDhzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDhzyVO> queryPage(Page<TDhzyDTO> page, TDhzyDTO tDhzyDTO) {
        return this.tDhzyDao.queryList(page, tDhzyDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDhzyDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDhzyVO> queryList(TDhzyDTO tDhzyDTO) {
        return this.tDhzyDao.queryList(tDhzyDTO);
    }
}
