package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjylpjxxDao;
import com.lyc.wwyt.entity.TYjylpjxxEntity;
import com.lyc.wwyt.dto.TYjylpjxxDTO;
import com.lyc.wwyt.vo.TYjylpjxxVO;
import com.lyc.wwyt.service.TYjylpjxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 应急演练评价表（t_yjylpjxx）(t_yjylpjxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:53
 */
@Service("tYjylpjxxService")
@RequiredArgsConstructor
public class TYjylpjxxServiceImpl extends ServiceImpl<TYjylpjxxDao, TYjylpjxxEntity> implements TYjylpjxxService {

    private final TYjylpjxxDao tYjylpjxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TYjylpjxxVO> selectList() {
        return this.tYjylpjxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjylpjxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjylpjxxVO> selectPage(Page<TYjylpjxxDTO> page, TYjylpjxxDTO tYjylpjxxDTO) {
        return this.tYjylpjxxDao.selectList(page, tYjylpjxxDTO);
    }
}
