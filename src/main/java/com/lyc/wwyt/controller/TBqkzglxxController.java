package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TBqkzglxxEntity;
import com.lyc.wwyt.service.TBqkzglxxService;
import com.lyc.wwyt.dto.TBqkzglxxDTO;
import com.lyc.wwyt.vo.TBqkzglxxVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * 标签扩展管理信息表(t_bqkzglxx)表控制层
 *
 * @author lhh
 * @since 2023-05-18 16:32:21
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_bqkzglxx")
@Tag(name = "标签扩展管理信息表", description = "标签扩展管理信息表 管理")
@OpenAPIDefinition(info = @Info(title = "标签扩展管理信息表 Api", version = "v1", description = "标签扩展管理信息表 管理"))
public class TBqkzglxxController {

    /**
     * 服务对象
     */
    private final TBqkzglxxService tBqkzglxxService;

    /**
     * 标签扩展管理信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "标签扩展管理信息表数据新增或修改", summary = "多条标签扩展管理信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("标签扩展管理信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TBqkzglxxDTO> list) {
        List<TBqkzglxxEntity> entityList = new ArrayList<>(list);
        this.tBqkzglxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有标签扩展管理信息表     *
     *
     * @return List<TBqkzglxxEntity> 当前账户下所有标签扩展管理信息表
     */
    @Operation(description = "查询标签扩展管理信息表信息表数据", summary = "查询标签扩展管理信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TBqkzglxxVO> selectAll() {
        return this.tBqkzglxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有标签扩展管理信息表     *
     *
     * @return List<TBqkzglxxDTO> 分页当前账户下所有标签扩展管理信息表
     */
    @Operation(description = "分页标签扩展管理信息表信息表数据", summary = "分页查询标签扩展管理信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TBqkzglxxVO> selectPage(@ParameterObject Page<TBqkzglxxDTO> page, @ParameterObject TBqkzglxxDTO tBqkzglxxDTO) {
        return this.tBqkzglxxService.selectPage(page, tBqkzglxxDTO);
    }

}
