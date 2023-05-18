package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TDhzyQtfxEntity;
import com.lyc.wwyt.service.TDhzyQtfxService;
import com.lyc.wwyt.dto.TDhzyQtfxDTO;
import com.lyc.wwyt.vo.TDhzyQtfxVO;
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
 * 动火作业气体分析数据表(t_dhzy_qtfx)表控制层
 *
 * @author lhh
 * @since 2023-05-18 15:54:23
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_dhzy_qtfx")
@Tag(name = "动火作业气体分析数据表", description = "动火作业气体分析数据表 管理")
@OpenAPIDefinition(info = @Info(title = "动火作业气体分析数据表 Api", version = "v1", description = "动火作业气体分析数据表 管理"))
public class TDhzyQtfxController {

    /**
     * 服务对象
     */
    private final TDhzyQtfxService tDhzyQtfxService;

    /**
     * 动火作业气体分析数据表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "动火作业气体分析数据表数据新增或修改", summary = "多条动火作业气体分析数据表数据新增或修改", tags = {"数据保存"})
    @SysLog("动火作业气体分析数据表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TDhzyQtfxDTO> list) {
        List<TDhzyQtfxEntity> entityList = new ArrayList<>(list);
        this.tDhzyQtfxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有动火作业气体分析数据表     *
     *
     * @return List<TDhzyQtfxEntity> 当前账户下所有动火作业气体分析数据表
     */
    @Operation(description = "查询动火作业气体分析数据表信息表数据", summary = "查询动火作业气体分析数据表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TDhzyQtfxVO> selectAll() {
        return this.tDhzyQtfxService.selectList();
    }

    /**
     * 分页查询当前账户下所有动火作业气体分析数据表     *
     *
     * @return List<TDhzyQtfxDTO> 分页当前账户下所有动火作业气体分析数据表
     */
    @Operation(description = "分页动火作业气体分析数据表信息表数据", summary = "分页查询动火作业气体分析数据表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TDhzyQtfxVO> selectPage(@ParameterObject Page<TDhzyQtfxDTO> page, @ParameterObject TDhzyQtfxDTO tDhzyQtfxDTO) {
        return this.tDhzyQtfxService.selectPage(page, tDhzyQtfxDTO);
    }

}
