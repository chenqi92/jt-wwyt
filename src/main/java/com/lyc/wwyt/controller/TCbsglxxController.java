package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TCbsglxxEntity;
import com.lyc.wwyt.service.TCbsglxxService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 承包商管理信息表(t_cbsglxx)表控制层
 *
 * @author chenqi
 * @since 2023-05-12 15:32:04
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_cbsglxx")
@Tag(name = "承包商管理", description = "承包商管理信息表 管理")
public class TCbsglxxController {

    /**
     * 服务对象
     */
    private final TCbsglxxService tCbsglxxService;

    /**
     * 承包商管理信息新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "承包商管理信息表数据新增或修改", summary = "多条承包商管理信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("承包商管理信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TCbsglxxEntity> list) {
        this.tCbsglxxService.saveOrUpdateBatch(list);
    }

    /**
     * 查询当前账户下所有承包商信息
     *
     * @return List<TCbsglxxEntity> 当前账户下所有承包商信息
     */
    @Operation(description = "修改承包商管理信息表", summary = "修改承包商管理信息表", tags = {"查询所有数据"})
    @SysLog("修改承包商管理信息表")
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TCbsglxxEntity> updateById() {
        return this.tCbsglxxService.list();
    }
}
