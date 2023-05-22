package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyc.wwyt.entity.TSxkjzyEntity;
import com.lyc.wwyt.dto.TSxkjzyDTO;
import com.lyc.wwyt.vo.TSxkjzyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 受限空间作业信息表(t_sxkjzy)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@Mapper
public interface TSxkjzyDao extends BaseMapper<TSxkjzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tSxkjzyDTO 查询参数
     * @return IPage<TSxkjzyVO>
     */
    IPage<TSxkjzyVO> queryList(Page<TSxkjzyDTO> page, @Param("tSxkjzyDTO") TSxkjzyDTO tSxkjzyDTO);

    /**
     * 查询所有数据
     *
     * @param tSxkjzyDTO 查询参数
     * @return List<TSxkjzyVO>
     */
    List<TSxkjzyVO> queryList(@Param("tSxkjzyDTO") TSxkjzyDTO tSxkjzyDTO);
}
