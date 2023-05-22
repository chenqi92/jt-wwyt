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
 * @since 2023-05-22 14:22:37
 */
public interface TSxkjzyService extends IService<TSxkjzyEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page       分页参数
     * @param tSxkjzyDTO 查询参数
     * @return IPage<TSxkjzyVO> tSxkjzyDTO
     */
    IPage<TSxkjzyVO> queryPage(Page<TSxkjzyDTO> page, TSxkjzyDTO tSxkjzyDTO);

    /**
     * 查询所有数据
     *
     * @param tSxkjzyDTO 查询参数
     * @return List<TSxkjzyVO>
     */
    List<TSxkjzyVO> queryList(TSxkjzyDTO tSxkjzyDTO);
}
