package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TAqfxsjDao;
import com.lyc.wwyt.entity.TAqfxsjEntity;
import com.lyc.wwyt.dto.TAqfxsjDTO;
import com.lyc.wwyt.vo.TAqfxsjVO;
import com.lyc.wwyt.service.TAqfxsjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 安全风险事件表(t_aqfxsj)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-17 16:22:39
 */
@Service("tAqfxsjService")
@RequiredArgsConstructor
public class TAqfxsjServiceImpl extends ServiceImpl<TAqfxsjDao, TAqfxsjEntity> implements TAqfxsjService {

    private final TAqfxsjDao tAqfxsjDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tAqfxsjDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TAqfxsjVO> queryPage(Page<TAqfxsjDTO> page, TAqfxsjDTO tAqfxsjDTO) {
        return this.tAqfxsjDao.queryList(page, tAqfxsjDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tAqfxsjDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TAqfxsjVO> queryList(TAqfxsjDTO tAqfxsjDTO) {
        return this.tAqfxsjDao.queryList(tAqfxsjDTO);
    }
}
