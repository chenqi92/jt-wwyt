package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TSxkjzyQtfxEntity;
import com.lyc.wwyt.dto.TSxkjzyQtfxDTO;
import com.lyc.wwyt.vo.TSxkjzyQtfxVO;

import java.util.List;

/**
 * 受限空间作业气体分析数据表(t_sxkjzy_qtfx)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:55:15
 */
public interface TSxkjzyQtfxService extends IService<TSxkjzyQtfxEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TSxkjzyQtfxVO>
     */
    List<TSxkjzyQtfxVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzyQtfxDTO 查询参数
     * @return IPage<TSxkjzyQtfxVO> tSxkjzyQtfxDTO
     */
    IPage<TSxkjzyQtfxVO> selectPage(Page<TSxkjzyQtfxDTO> page, TSxkjzyQtfxDTO tSxkjzyQtfxDTO);
}
