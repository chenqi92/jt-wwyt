package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.entity.TSxkjzyEntity;
import com.lyc.wwyt.dto.TSxkjzyDTO;
import com.lyc.wwyt.vo.TSxkjzyVO;

import java.util.List;

/**
 * 受限空间作业信息表(t_sxkjzy)表服务接口
 *
 * @author lhh
 * @since 2023-05-18 15:55:10
 */
public interface TSxkjzyService extends IService<TSxkjzyEntity> {

    /**
     * 查询所有数据
     *
     * @return List<TSxkjzyVO>
     */
    List<TSxkjzyVO> selectList();

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tSxkjzyDTO 查询参数
     * @return IPage<TSxkjzyVO> tSxkjzyDTO
     */
    IPage<TSxkjzyVO> selectPage(Page<TSxkjzyDTO> page, TSxkjzyDTO tSxkjzyDTO);
}
