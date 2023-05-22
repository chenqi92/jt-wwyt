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
 * @since 2023-05-22 14:22:37
 */
@Service("tSxkjzyService")
@RequiredArgsConstructor
public class TSxkjzyServiceImpl extends ServiceImpl<TSxkjzyDao, TSxkjzyEntity> implements TSxkjzyService {

    private final TSxkjzyDao tSxkjzyDao;

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tSxkjzyDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TSxkjzyVO> queryPage(Page<TSxkjzyDTO> page, TSxkjzyDTO tSxkjzyDTO) {
        return this.tSxkjzyDao.queryList(page, tSxkjzyDTO);
    }

    /**
     * 查询所有数据
     *
     * @param tSxkjzyDTO 查询参数
     * @return 所有数据
     */
    @Override
    public List<TSxkjzyVO> queryList(TSxkjzyDTO tSxkjzyDTO) {
        return this.tSxkjzyDao.queryList(tSxkjzyDTO);
    }
}
