package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqpxjcjlDao;
import com.lyc.wwyt.entity.TAqpxjcjlEntity;
import com.lyc.wwyt.dto.TAqpxjcjlDTO;
import com.lyc.wwyt.vo.TAqpxjcjlVO;
import com.lyc.wwyt.service.TAqpxjcjlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全培训奖惩记录表(t_aqpxjcjl)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:55
 */
@Service("tAqpxjcjlService")
@RequiredArgsConstructor
public class TAqpxjcjlServiceImpl extends ServiceImpl<TAqpxjcjlDao, TAqpxjcjlEntity> implements TAqpxjcjlService {

    private final TAqpxjcjlDao tAqpxjcjlDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TAqpxjcjlVO> selectList() {
        return this.tAqpxjcjlDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tAqpxjcjlDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqpxjcjlVO> selectPage(Page<TAqpxjcjlDTO> page, TAqpxjcjlDTO tAqpxjcjlDTO) {
        return this.tAqpxjcjlDao.selectList(page, tAqpxjcjlDTO);
    }
}
