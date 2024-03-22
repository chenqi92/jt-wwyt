package com.lyc.wwyt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.wwyt.dto.TSxkjzyAqcsDTO;
import com.lyc.wwyt.entity.TSxkjzyAqcsEntity;
import com.lyc.wwyt.vo.TSxkjzyAqcsVO;

import java.util.List;

/**
 * 受限空间作业安全措施表(t_sxkjzy_aqcs)表服务接口
 *
 * @author lhh
 * @since 2023-05-22 14:22:37
 */
public interface TSxkjzyAqcsService extends IService<TSxkjzyAqcsEntity> {

    /**
     * 分页查询所有数据
     *
     * @param page           分页参数
     * @param tSxkjzyAqcsDTO 查询参数
     * @return IPage<TSxkjzyAqcsVO> tSxkjzyAqcsDTO
     */
    IPage<TSxkjzyAqcsVO> queryPage(Page<TSxkjzyAqcsDTO> page, TSxkjzyAqcsDTO tSxkjzyAqcsDTO);

    /**
     * 查询所有数据
     *
     * @param tSxkjzyAqcsDTO 查询参数
     * @return List<TSxkjzyAqcsVO>
     */
    List<TSxkjzyAqcsVO> queryList(TSxkjzyAqcsDTO tSxkjzyAqcsDTO);
}
