package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TPxjgDao;
import com.lyc.wwyt.entity.TPxjgEntity;
import com.lyc.wwyt.dto.TPxjgDTO;
import com.lyc.wwyt.vo.TPxjgVO;
import com.lyc.wwyt.service.TPxjgService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 培训结果表(t_pxjg)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:47
 */
@Service("tPxjgService")
@RequiredArgsConstructor
public class TPxjgServiceImpl extends ServiceImpl<TPxjgDao, TPxjgEntity> implements TPxjgService {

    private final TPxjgDao tPxjgDao;

    /**
     * 分页查询所有数据
     *
     * @param page     分页参数
     * @param tPxjgDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TPxjgVO> queryPage(Page<TPxjgDTO> page, TPxjgDTO tPxjgDTO) {
        return this.tPxjgDao.queryList(page, tPxjgDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tPxjgDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TPxjgVO> queryList(TPxjgDTO tPxjgDTO) {
        return this.tPxjgDao.queryList(tPxjgDTO);
    }
}
