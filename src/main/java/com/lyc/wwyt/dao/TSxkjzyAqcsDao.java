package com.lyc.wwyt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.dto.TSxkjzyAqcsDTO;
import com.lyc.wwyt.entity.TSxkjzyAqcsEntity;
import com.lyc.wwyt.vo.TSxkjzyAqcsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 受限空间作业安全措施表(t_sxkjzy_aqcs)表数据库访问层
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
@Mapper
public interface TSxkjzyAqcsDao extends BaseMapper<TSxkjzyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzyAqcsDTO 查询参数
     * @return IPage<TSxkjzyAqcsVO>
     */
    IPage<TSxkjzyAqcsVO> queryList(Page<TSxkjzyAqcsDTO> page, @Param("tSxkjzyAqcsDTO") TSxkjzyAqcsDTO tSxkjzyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tSxkjzyAqcsDTO 查询参数
     * @return List<TSxkjzyAqcsVO>
     */
    List<TSxkjzyAqcsVO> queryList(@Param("tSxkjzyAqcsDTO") TSxkjzyAqcsDTO tSxkjzyAqcsDTO);
}
