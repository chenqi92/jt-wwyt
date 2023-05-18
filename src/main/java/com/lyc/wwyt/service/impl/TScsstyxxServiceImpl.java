package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScsstyxxDao;
import com.lyc.wwyt.entity.TScsstyxxEntity;
import com.lyc.wwyt.dto.TScsstyxxDTO;
import com.lyc.wwyt.vo.TScsstyxxVO;
import com.lyc.wwyt.service.TScsstyxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 生产设施停用信息(t_scsstyxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@Service("tScsstyxxService")
@RequiredArgsConstructor
public class TScsstyxxServiceImpl extends ServiceImpl<TScsstyxxDao, TScsstyxxEntity> implements TScsstyxxService {

    private final TScsstyxxDao tScsstyxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TScsstyxxVO> selectList() {
        return this.tScsstyxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsstyxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScsstyxxVO> selectPage(Page<TScsstyxxDTO> page, TScsstyxxDTO tScsstyxxDTO) {
        return this.tScsstyxxDao.selectList(page, tScsstyxxDTO);
    }
}
