package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TPxjyxgpjjlDao;
import com.lyc.wwyt.entity.TPxjyxgpjjlEntity;
import com.lyc.wwyt.dto.TPxjyxgpjjlDTO;
import com.lyc.wwyt.vo.TPxjyxgpjjlVO;
import com.lyc.wwyt.service.TPxjyxgpjjlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 培训教育效果评价记录表(t_pxjyxgpjjl)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@Service("tPxjyxgpjjlService")
@RequiredArgsConstructor
public class TPxjyxgpjjlServiceImpl extends ServiceImpl<TPxjyxgpjjlDao, TPxjyxgpjjlEntity> implements TPxjyxgpjjlService {

    private final TPxjyxgpjjlDao tPxjyxgpjjlDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TPxjyxgpjjlVO> selectList() {
        return this.tPxjyxgpjjlDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tPxjyxgpjjlDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TPxjyxgpjjlVO> selectPage(Page<TPxjyxgpjjlDTO> page, TPxjyxgpjjlDTO tPxjyxgpjjlDTO) {
        return this.tPxjyxgpjjlDao.selectList(page, tPxjyxgpjjlDTO);
    }
}
