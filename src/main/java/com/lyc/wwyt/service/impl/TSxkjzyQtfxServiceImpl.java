package com.lyc.wwyt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.wwyt.dao.TSxkjzyQtfxDao;
import com.lyc.wwyt.entity.TSxkjzyQtfxEntity;
import com.lyc.wwyt.dto.TSxkjzyQtfxDTO;
import com.lyc.wwyt.vo.TSxkjzyQtfxVO;
import com.lyc.wwyt.service.TSxkjzyQtfxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * 受限空间作业气体分析数据表(t_sxkjzy_qtfx)表服务实现类
 *
 * @author lhh
 * @since 2023-05-18 15:55:15
 */
@Service("tSxkjzyQtfxService")
@RequiredArgsConstructor
public class TSxkjzyQtfxServiceImpl extends ServiceImpl<TSxkjzyQtfxDao, TSxkjzyQtfxEntity> implements TSxkjzyQtfxService {

    private final TSxkjzyQtfxDao tSxkjzyQtfxDao;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @Override
    public List<TSxkjzyQtfxVO> selectList() {
        return this.tSxkjzyQtfxDao.selectList();
    }

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzyQtfxDTO 查询参数
     * @return 指定页码和条数的数据
     */
    @Override
    public IPage<TSxkjzyQtfxVO> selectPage(Page<TSxkjzyQtfxDTO> page, TSxkjzyQtfxDTO tSxkjzyQtfxDTO) {
        return this.tSxkjzyQtfxDao.selectList(page, tSxkjzyQtfxDTO);
    }
}
