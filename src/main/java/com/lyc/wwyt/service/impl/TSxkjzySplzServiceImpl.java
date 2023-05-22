package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TSxkjzySplzDao;
import com.lyc.wwyt.entity.TSxkjzySplzEntity;
import com.lyc.wwyt.dto.TSxkjzySplzDTO;
import com.lyc.wwyt.vo.TSxkjzySplzVO;
import com.lyc.wwyt.service.TSxkjzySplzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 受限空间作业审批流转记录表(t_sxkjzy_splz)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:38
 */
@Service("tSxkjzySplzService")
@RequiredArgsConstructor
public class TSxkjzySplzServiceImpl extends ServiceImpl<TSxkjzySplzDao, TSxkjzySplzEntity> implements TSxkjzySplzService {

    private final TSxkjzySplzDao tSxkjzySplzDao;

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzySplzDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TSxkjzySplzVO> queryPage(Page<TSxkjzySplzDTO> page, TSxkjzySplzDTO tSxkjzySplzDTO) {
        return this.tSxkjzySplzDao.queryList(page, tSxkjzySplzDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tSxkjzySplzDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TSxkjzySplzVO> queryList(TSxkjzySplzDTO tSxkjzySplzDTO) {
        return this.tSxkjzySplzDao.queryList(tSxkjzySplzDTO);
    }
}
