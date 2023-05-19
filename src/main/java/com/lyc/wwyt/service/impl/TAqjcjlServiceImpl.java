package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqjcjlDao;
import com.lyc.wwyt.entity.TAqjcjlEntity;
import com.lyc.wwyt.dto.TAqjcjlDTO;
import com.lyc.wwyt.vo.TAqjcjlVO;
import com.lyc.wwyt.service.TAqjcjlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全检查记录表(t_aqjcjl)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:40
 */
@Service("tAqjcjlService")
@RequiredArgsConstructor
public class TAqjcjlServiceImpl extends ServiceImpl<TAqjcjlDao, TAqjcjlEntity> implements TAqjcjlService {

    private final TAqjcjlDao tAqjcjlDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqjcjlDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqjcjlVO> queryPage(Page<TAqjcjlDTO> page, TAqjcjlDTO tAqjcjlDTO) {
        return this.tAqjcjlDao.queryList(page, tAqjcjlDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tAqjcjlDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TAqjcjlVO> queryList(TAqjcjlDTO tAqjcjlDTO) {
        return this.tAqjcjlDao.queryList(tAqjcjlDTO);
    }
}
