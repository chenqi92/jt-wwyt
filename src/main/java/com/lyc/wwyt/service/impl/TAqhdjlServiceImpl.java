package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqhdjlDao;
import com.lyc.wwyt.entity.TAqhdjlEntity;
import com.lyc.wwyt.dto.TAqhdjlDTO;
import com.lyc.wwyt.vo.TAqhdjlVO;
import com.lyc.wwyt.service.TAqhdjlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全活动记录表(t_aqhdjl)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:57
 */
@Service("tAqhdjlService")
@RequiredArgsConstructor
public class TAqhdjlServiceImpl extends ServiceImpl<TAqhdjlDao, TAqhdjlEntity> implements TAqhdjlService {

    private final TAqhdjlDao tAqhdjlDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TAqhdjlVO> selectList() {
        return this.tAqhdjlDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqhdjlDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqhdjlVO> selectPage(Page<TAqhdjlDTO> page, TAqhdjlDTO tAqhdjlDTO) {
        return this.tAqhdjlDao.selectList(page, tAqhdjlDTO);
    }
}
