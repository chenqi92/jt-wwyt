package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TPxhdxxDao;
import com.lyc.wwyt.entity.TPxhdxxEntity;
import com.lyc.wwyt.dto.TPxhdxxDTO;
import com.lyc.wwyt.vo.TPxhdxxVO;
import com.lyc.wwyt.service.TPxhdxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 培训活动信息表(t_pxhdxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:51
 */
@Service("tPxhdxxService")
@RequiredArgsConstructor
public class TPxhdxxServiceImpl extends ServiceImpl<TPxhdxxDao, TPxhdxxEntity> implements TPxhdxxService {

    private final TPxhdxxDao tPxhdxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TPxhdxxVO> selectList() {
        return this.tPxhdxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tPxhdxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TPxhdxxVO> selectPage(Page<TPxhdxxDTO> page, TPxhdxxDTO tPxhdxxDTO) {
        return this.tPxhdxxDao.selectList(page, tPxhdxxDTO);
    }
}
