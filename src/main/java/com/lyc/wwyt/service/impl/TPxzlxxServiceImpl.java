package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TPxzlxxDao;
import com.lyc.wwyt.entity.TPxzlxxEntity;
import com.lyc.wwyt.dto.TPxzlxxDTO;
import com.lyc.wwyt.vo.TPxzlxxVO;
import com.lyc.wwyt.service.TPxzlxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 培训资料信息表(t_pxzlxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:42
 */
@Service("tPxzlxxService")
@RequiredArgsConstructor
public class TPxzlxxServiceImpl extends ServiceImpl<TPxzlxxDao, TPxzlxxEntity> implements TPxzlxxService {

    private final TPxzlxxDao tPxzlxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxzlxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TPxzlxxVO> queryPage(Page<TPxzlxxDTO> page, TPxzlxxDTO tPxzlxxDTO) {
        return this.tPxzlxxDao.queryList(page, tPxzlxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tPxzlxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TPxzlxxVO> queryList(TPxzlxxDTO tPxzlxxDTO) {
        return this.tPxzlxxDao.queryList(tPxzlxxDTO);
    }
}
