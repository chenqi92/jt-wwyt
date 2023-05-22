package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TScsswxxxDao;
import com.lyc.wwyt.entity.TScsswxxxEntity;
import com.lyc.wwyt.dto.TScsswxxxDTO;
import com.lyc.wwyt.vo.TScsswxxxVO;
import com.lyc.wwyt.service.TScsswxxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 生产设施维修信息(t_scsswxxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-22 14:22:36
 */
@Service("tScsswxxxService")
@RequiredArgsConstructor
public class TScsswxxxServiceImpl extends ServiceImpl<TScsswxxxDao, TScsswxxxEntity> implements TScsswxxxService {

    private final TScsswxxxDao tScsswxxxDao;

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tScsswxxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TScsswxxxVO> queryPage(Page<TScsswxxxDTO> page, TScsswxxxDTO tScsswxxxDTO) {
        return this.tScsswxxxDao.queryList(page, tScsswxxxDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tScsswxxxDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TScsswxxxVO> queryList(TScsswxxxDTO tScsswxxxDTO) {
        return this.tScsswxxxDao.queryList(tScsswxxxDTO);
    }
}
