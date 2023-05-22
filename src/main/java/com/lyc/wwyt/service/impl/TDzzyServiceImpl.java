package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDzzyDao;
import com.lyc.wwyt.entity.TDzzyEntity;
import com.lyc.wwyt.dto.TDzzyDTO;
import com.lyc.wwyt.vo.TDzzyVO;
import com.lyc.wwyt.service.TDzzyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 吊装作业信息表(t_dzzy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:16:24
 */
@Service("tDzzyService")
@RequiredArgsConstructor
public class TDzzyServiceImpl extends ServiceImpl<TDzzyDao, TDzzyEntity> implements TDzzyService {

    private final TDzzyDao tDzzyDao;

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDzzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDzzyVO> queryPage(Page<TDzzyDTO> page, TDzzyDTO tDzzyDTO) {
        return this.tDzzyDao.queryList(page, tDzzyDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tDzzyDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TDzzyVO> queryList(TDzzyDTO tDzzyDTO) {
        return this.tDzzyDao.queryList(tDzzyDTO);
    }
}
