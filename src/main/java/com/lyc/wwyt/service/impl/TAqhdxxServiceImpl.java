package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqhdxxDao;
import com.lyc.wwyt.entity.TAqhdxxEntity;
import com.lyc.wwyt.dto.TAqhdxxDTO;
import com.lyc.wwyt.vo.TAqhdxxVO;
import com.lyc.wwyt.service.TAqhdxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全活动信息表(t_aqhdxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@Service("tAqhdxxService")
@RequiredArgsConstructor
public class TAqhdxxServiceImpl extends ServiceImpl<TAqhdxxDao, TAqhdxxEntity> implements TAqhdxxService {

    private final TAqhdxxDao tAqhdxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TAqhdxxVO> selectList() {
        return this.tAqhdxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqhdxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqhdxxVO> selectPage(Page<TAqhdxxDTO> page, TAqhdxxDTO tAqhdxxDTO) {
        return this.tAqhdxxDao.selectList(page, tAqhdxxDTO);
    }
}
