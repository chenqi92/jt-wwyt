package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TPxjhxxDao;
import com.lyc.wwyt.entity.TPxjhxxEntity;
import com.lyc.wwyt.dto.TPxjhxxDTO;
import com.lyc.wwyt.vo.TPxjhxxVO;
import com.lyc.wwyt.service.TPxjhxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 培训计划信息表(t_pxjhxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:47
 */
@Service("tPxjhxxService")
@RequiredArgsConstructor
public class TPxjhxxServiceImpl extends ServiceImpl<TPxjhxxDao, TPxjhxxEntity> implements TPxjhxxService {

    private final TPxjhxxDao tPxjhxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxjhxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TPxjhxxVO> queryPage(Page<TPxjhxxDTO> page, TPxjhxxDTO tPxjhxxDTO) {
        return this.tPxjhxxDao.queryList(page, tPxjhxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tPxjhxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TPxjhxxVO> queryList(TPxjhxxDTO tPxjhxxDTO) {
        return this.tPxjhxxDao.queryList(tPxjhxxDTO);
    }
}
