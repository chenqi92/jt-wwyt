package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TSxkjzyDao;
import com.lyc.wwyt.entity.TSxkjzyEntity;
import com.lyc.wwyt.dto.TSxkjzyDTO;
import com.lyc.wwyt.vo.TSxkjzyVO;
import com.lyc.wwyt.service.TSxkjzyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 受限空间作业信息表(t_sxkjzy)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:55:10
 */
@Service("tSxkjzyService")
@RequiredArgsConstructor
public class TSxkjzyServiceImpl extends ServiceImpl<TSxkjzyDao, TSxkjzyEntity> implements TSxkjzyService {

    private final TSxkjzyDao tSxkjzyDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TSxkjzyVO> selectList() {
        return this.tSxkjzyDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tSxkjzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TSxkjzyVO> selectPage(Page<TSxkjzyDTO> page, TSxkjzyDTO tSxkjzyDTO) {
        return this.tSxkjzyDao.selectList(page, tSxkjzyDTO);
    }
}
