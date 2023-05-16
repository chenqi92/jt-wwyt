package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbsxgzsDao;
import com.lyc.wwyt.entity.TCbsxgzsEntity;
import com.lyc.wwyt.dto.TCbsxgzsDTO;
import com.lyc.wwyt.vo.TCbsxgzsVO;
import com.lyc.wwyt.service.TCbsxgzsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 承包商相关证书表(t_cbsxgzs)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:55
 */
@Service("tCbsxgzsService")
@RequiredArgsConstructor
public class TCbsxgzsServiceImpl extends ServiceImpl<TCbsxgzsDao, TCbsxgzsEntity> implements TCbsxgzsService {

    private final TCbsxgzsDao tCbsxgzsDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TCbsxgzsVO> selectList() {
        return this.tCbsxgzsDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page        分页参数
     * @param tCbsxgzsDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbsxgzsVO> selectPage(Page<TCbsxgzsDTO> page, TCbsxgzsDTO tCbsxgzsDTO) {
        return this.tCbsxgzsDao.selectList(page, tCbsxgzsDTO);
    }
}
