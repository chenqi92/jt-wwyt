package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TMbcdzySplzDao;
import com.lyc.wwyt.entity.TMbcdzySplzEntity;
import com.lyc.wwyt.dto.TMbcdzySplzDTO;
import com.lyc.wwyt.vo.TMbcdzySplzVO;
import com.lyc.wwyt.service.TMbcdzySplzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 盲板抽堵作业审批流转记录表(t_mbcdzy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:55:08
 */
@Service("tMbcdzySplzService")
@RequiredArgsConstructor
public class TMbcdzySplzServiceImpl extends ServiceImpl<TMbcdzySplzDao, TMbcdzySplzEntity> implements TMbcdzySplzService {

    private final TMbcdzySplzDao tMbcdzySplzDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TMbcdzySplzVO> selectList() {
        return this.tMbcdzySplzDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tMbcdzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TMbcdzySplzVO> selectPage(Page<TMbcdzySplzDTO> page, TMbcdzySplzDTO tMbcdzySplzDTO) {
        return this.tMbcdzySplzDao.selectList(page, tMbcdzySplzDTO);
    }
}
