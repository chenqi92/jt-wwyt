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
 * @since 2023-05-18 15:54:40
 */
@Service("tDzzyService")
@RequiredArgsConstructor
public class TDzzyServiceImpl extends ServiceImpl<TDzzyDao, TDzzyEntity> implements TDzzyService {

    private final TDzzyDao tDzzyDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDzzyVO> selectList() {
        return this.tDzzyDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tDzzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDzzyVO> selectPage(Page<TDzzyDTO> page, TDzzyDTO tDzzyDTO) {
        return this.tDzzyDao.selectList(page, tDzzyDTO);
    }
}
