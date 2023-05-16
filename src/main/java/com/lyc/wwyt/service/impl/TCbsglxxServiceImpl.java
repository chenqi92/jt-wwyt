package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TCbsglxxDao;
import com.lyc.wwyt.dto.TCbsglxxDTO;
import com.lyc.wwyt.entity.TCbsglxxEntity;
import com.lyc.wwyt.service.TCbsglxxService;
import com.lyc.wwyt.vo.TCbsglxxVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 承包商管理信息表(t_cbsglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-12 15:32:04
 */
@Service("tCbsglxxService")
@AllArgsConstructor
public class TCbsglxxServiceImpl extends ServiceImpl<TCbsglxxDao, TCbsglxxEntity> implements TCbsglxxService {

    private final TCbsglxxDao tCbsglxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TCbsglxxVO> selectList() {
        return this.tCbsglxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param cbsglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TCbsglxxVO> selectPage(Page<TCbsglxxDTO> page, TCbsglxxDTO cbsglxxDTO) {
        return this.tCbsglxxDao.selectList(page, cbsglxxDTO);
    }
}
