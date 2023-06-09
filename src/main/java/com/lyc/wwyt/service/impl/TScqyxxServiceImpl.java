package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScqyxxDao;
import com.lyc.wwyt.dto.TScqyxxDTO;
import com.lyc.wwyt.entity.TScqyxxEntity;
import com.lyc.wwyt.service.TScqyxxService;
import com.lyc.wwyt.vo.TScqyxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 生产区域信息表(t_scqyxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:33
 */
@Service("tScqyxxService")
@RequiredArgsConstructor
public class TScqyxxServiceImpl extends ServiceImpl<TScqyxxDao, TScqyxxEntity> implements TScqyxxService {

    private final TScqyxxDao tScqyxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tScqyxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScqyxxVO> queryPage(Page<TScqyxxDTO> page, TScqyxxDTO tScqyxxDTO) {
        return this.tScqyxxDao.queryList(page, tScqyxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tScqyxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TScqyxxVO> queryList(TScqyxxDTO tScqyxxDTO) {
        return this.tScqyxxDao.queryList(tScqyxxDTO);
    }
}
