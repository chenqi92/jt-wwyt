package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TRypxxxDao;
import com.lyc.wwyt.entity.TRypxxxEntity;
import com.lyc.wwyt.dto.TRypxxxDTO;
import com.lyc.wwyt.vo.TRypxxxVO;
import com.lyc.wwyt.service.TRypxxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 人员培训信息表(t_rypxxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:44
 */
@Service("tRypxxxService")
@RequiredArgsConstructor
public class TRypxxxServiceImpl extends ServiceImpl<TRypxxxDao, TRypxxxEntity> implements TRypxxxService {

    private final TRypxxxDao tRypxxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tRypxxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TRypxxxVO> queryPage(Page<TRypxxxDTO> page, TRypxxxDTO tRypxxxDTO) {
        return this.tRypxxxDao.queryList(page, tRypxxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tRypxxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TRypxxxVO> queryList(TRypxxxDTO tRypxxxDTO) {
        return this.tRypxxxDao.queryList(tRypxxxDTO);
    }
}
