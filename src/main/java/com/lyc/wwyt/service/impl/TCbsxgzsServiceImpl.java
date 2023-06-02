package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbsxgzsDao;
import com.lyc.wwyt.dto.TCbsxgzsDTO;
import com.lyc.wwyt.entity.TCbsxgzsEntity;
import com.lyc.wwyt.service.TCbsxgzsService;
import com.lyc.wwyt.vo.TCbsxgzsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 承包商相关证书表(t_cbsxgzs)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-19 14:56:45
 */
@Service("tCbsxgzsService")
@RequiredArgsConstructor
public class TCbsxgzsServiceImpl extends ServiceImpl<TCbsxgzsDao, TCbsxgzsEntity> implements TCbsxgzsService {

    private final TCbsxgzsDao tCbsxgzsDao;

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbsxgzsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbsxgzsVO> queryPage(Page<TCbsxgzsDTO> page, TCbsxgzsDTO tCbsxgzsDTO) {
        return this.tCbsxgzsDao.queryList(page, tCbsxgzsDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tCbsxgzsDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TCbsxgzsVO> queryList(TCbsxgzsDTO tCbsxgzsDTO) {
        return this.tCbsxgzsDao.queryList(tCbsxgzsDTO);
    }
}
