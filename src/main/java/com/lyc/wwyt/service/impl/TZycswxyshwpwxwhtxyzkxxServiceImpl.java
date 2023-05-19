package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TZycswxyshwpwxwhtxyzkxxDao;
import com.lyc.wwyt.entity.TZycswxyshwpwxwhtxyzkxxEntity;
import com.lyc.wwyt.dto.TZycswxyshwpwxwhtxyzkxxDTO;
import com.lyc.wwyt.vo.TZycswxyshwpwxwhtxyzkxxVO;
import com.lyc.wwyt.service.TZycswxyshwpwxwhtxyzkxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 作业场所岗位风险应知卡信息表(t_zycswxyshwpwxwhtxyzkxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:50
 */
@Service("tZycswxyshwpwxwhtxyzkxxService")
@RequiredArgsConstructor
public class TZycswxyshwpwxwhtxyzkxxServiceImpl extends ServiceImpl<TZycswxyshwpwxwhtxyzkxxDao, TZycswxyshwpwxwhtxyzkxxEntity> implements TZycswxyshwpwxwhtxyzkxxService {

    private final TZycswxyshwpwxwhtxyzkxxDao tZycswxyshwpwxwhtxyzkxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page                       分页参数
     * @param tZycswxyshwpwxwhtxyzkxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TZycswxyshwpwxwhtxyzkxxVO> queryPage(Page<TZycswxyshwpwxwhtxyzkxxDTO> page, TZycswxyshwpwxwhtxyzkxxDTO tZycswxyshwpwxwhtxyzkxxDTO) {
        return this.tZycswxyshwpwxwhtxyzkxxDao.queryList(page, tZycswxyshwpwxwhtxyzkxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tZycswxyshwpwxwhtxyzkxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TZycswxyshwpwxwhtxyzkxxVO> queryList(TZycswxyshwpwxwhtxyzkxxDTO tZycswxyshwpwxwhtxyzkxxDTO) {
        return this.tZycswxyshwpwxwhtxyzkxxDao.queryList(tZycswxyshwpwxwhtxyzkxxDTO);
    }
}
