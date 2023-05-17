package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TYjdwglxxDao;
import com.lyc.wwyt.entity.TYjdwglxxEntity;
import com.lyc.wwyt.dto.TYjdwglxxDTO;
import com.lyc.wwyt.vo.TYjdwglxxVO;
import com.lyc.wwyt.service.TYjdwglxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 应急队伍管理信息表(t_yjdwglxx)表服务实现类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:40
 */
@Service("tYjdwglxxService")
@RequiredArgsConstructor
public class TYjdwglxxServiceImpl extends ServiceImpl<TYjdwglxxDao, TYjdwglxxEntity> implements TYjdwglxxService {

    private final TYjdwglxxDao tYjdwglxxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TYjdwglxxVO> selectList() {
        return this.tYjdwglxxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页参数
     * @param tYjdwglxxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TYjdwglxxVO> selectPage(Page<TYjdwglxxDTO> page, TYjdwglxxDTO tYjdwglxxDTO) {
        return this.tYjdwglxxDao.selectList(page, tYjdwglxxDTO);
    }
}
