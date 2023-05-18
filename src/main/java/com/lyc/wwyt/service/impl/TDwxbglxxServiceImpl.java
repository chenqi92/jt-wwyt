package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TDwxbglxxDao;
import com.lyc.wwyt.entity.TDwxbglxxEntity;
import com.lyc.wwyt.dto.TDwxbglxxDTO;
import com.lyc.wwyt.vo.TDwxbglxxVO;
import com.lyc.wwyt.service.TDwxbglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 定位信标管理信息表(t_dwxbglxx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 16:32:19
 */
@Service("tDwxbglxxService")
@RequiredArgsConstructor
public class TDwxbglxxServiceImpl extends ServiceImpl<TDwxbglxxDao, TDwxbglxxEntity> implements TDwxbglxxService {

    private final TDwxbglxxDao tDwxbglxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TDwxbglxxVO> selectList() {
        return this.tDwxbglxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tDwxbglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TDwxbglxxVO> selectPage(Page<TDwxbglxxDTO> page, TDwxbglxxDTO tDwxbglxxDTO) {
        return this.tDwxbglxxDao.selectList(page, tDwxbglxxDTO);
    }
}
