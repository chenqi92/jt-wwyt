package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScssxxDao;
import com.lyc.wwyt.dto.TScssxxDTO;
import com.lyc.wwyt.entity.TScssxxEntity;
import com.lyc.wwyt.service.TScssxxService;
import com.lyc.wwyt.vo.TScssxxVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 生产设施信息表(t_scssxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@Service("tScssxxService")
@RequiredArgsConstructor
public class TScssxxServiceImpl extends ServiceImpl<TScssxxDao, TScssxxEntity> implements TScssxxService {

    private final TScssxxDao tScssxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tScssxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScssxxVO> queryPage(Page<TScssxxDTO> page, TScssxxDTO tScssxxDTO) {
        return this.tScssxxDao.queryList(page, tScssxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tScssxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TScssxxVO> queryList(TScssxxDTO tScssxxDTO) {
        return this.tScssxxDao.queryList(tScssxxDTO);
    }
}
