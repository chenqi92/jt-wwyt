package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScssbyxxDao;
import com.lyc.wwyt.entity.TScssbyxxEntity;
import com.lyc.wwyt.dto.TScssbyxxDTO;
import com.lyc.wwyt.vo.TScssbyxxVO;
import com.lyc.wwyt.service.TScssbyxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 生产设施保养信息(t_scssbyxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-17 17:22:10
 */
@Service("tScssbyxxService")
@RequiredArgsConstructor
public class TScssbyxxServiceImpl extends ServiceImpl<TScssbyxxDao, TScssbyxxEntity> implements TScssbyxxService {

    private final TScssbyxxDao tScssbyxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TScssbyxxVO> selectList() {
        return this.tScssbyxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScssbyxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScssbyxxVO> selectPage(Page<TScssbyxxDTO> page, TScssbyxxDTO tScssbyxxDTO) {
        return this.tScssbyxxDao.selectList(page, tScssbyxxDTO);
    }
}
