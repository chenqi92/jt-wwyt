package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYhpcjlDao;
import com.lyc.wwyt.entity.TYhpcjlEntity;
import com.lyc.wwyt.dto.TYhpcjlDTO;
import com.lyc.wwyt.vo.TYhpcjlVO;
import com.lyc.wwyt.service.TYhpcjlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 隐患排查记录表(t_yhpcjl)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:45
 */
@Service("tYhpcjlService")
@RequiredArgsConstructor
public class TYhpcjlServiceImpl extends ServiceImpl<TYhpcjlDao, TYhpcjlEntity> implements TYhpcjlService {

    private final TYhpcjlDao tYhpcjlDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TYhpcjlVO> selectList() {
        return this.tYhpcjlDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tYhpcjlDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYhpcjlVO> selectPage(Page<TYhpcjlDTO> page, TYhpcjlDTO tYhpcjlDTO) {
        return this.tYhpcjlDao.selectList(page, tYhpcjlDTO);
    }
}
