package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TSxkjzyQtfxEntity;
import com.lyc.wwyt.dto.TSxkjzyQtfxDTO;
import com.lyc.wwyt.vo.TSxkjzyQtfxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 受限空间作业气体分析数据表(t_sxkjzy_qtfx)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@Mapper
public interface TSxkjzyQtfxDao extends BaseMapper<TSxkjzyQtfxEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzyQtfxDTO 查询参数
     * @return IPage<TSxkjzyQtfxVO>
     */
    IPage<TSxkjzyQtfxVO> queryList(Page<TSxkjzyQtfxDTO> page, @Param("tSxkjzyQtfxDTO") TSxkjzyQtfxDTO tSxkjzyQtfxDTO);

    /**
     * 查询所有数据
     *
     * @param tSxkjzyQtfxDTO 查询参数
     * @return List<TSxkjzyQtfxVO>
     */
    List<TSxkjzyQtfxVO> queryList(@Param("tSxkjzyQtfxDTO") TSxkjzyQtfxDTO tSxkjzyQtfxDTO);
}
