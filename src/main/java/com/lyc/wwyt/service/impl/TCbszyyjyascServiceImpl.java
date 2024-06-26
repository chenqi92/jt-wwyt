package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbszyyjyascDao;
import com.lyc.wwyt.dto.TCbszyyjyascDTO;
import com.lyc.wwyt.entity.TCbszyyjyascEntity;
import com.lyc.wwyt.service.TCbszyyjyascService;
import com.lyc.wwyt.vo.TCbszyyjyascVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 承包商作业应急预案审查表(t_cbszyyjyasc)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:40
 */
@Service("tCbszyyjyascService")
@RequiredArgsConstructor
public class TCbszyyjyascServiceImpl extends ServiceImpl<TCbszyyjyascDao, TCbszyyjyascEntity> implements TCbszyyjyascService {

    private final TCbszyyjyascDao tCbszyyjyascDao;

    /**
     * 分页查询所有数据
     *
     * @param page            分页参数
     * @param tCbszyyjyascDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbszyyjyascVO> queryPage(Page<TCbszyyjyascDTO> page, TCbszyyjyascDTO tCbszyyjyascDTO) {
        return this.tCbszyyjyascDao.queryList(page, tCbszyyjyascDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tCbszyyjyascDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TCbszyyjyascVO> queryList(TCbszyyjyascDTO tCbszyyjyascDTO) {
        return this.tCbszyyjyascDao.queryList(tCbszyyjyascDTO);
    }
}
