package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TYjyljhxxEntity;
import com.lyc.wwyt.service.TYjyljhxxService;
import com.lyc.wwyt.dto.TYjyljhxxDTO;
import com.lyc.wwyt.vo.TYjyljhxxVO;
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
 * 应急演练计划信息表(t_yjyljhxx)表控制层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:45
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_yjyljhxx")
@Tag(name = "应急演练计划信息表", description = "应急演练计划信息表 管理")
@OpenAPIDefinition(info = @Info(title = "应急演练计划信息表 Api", version = "v1", description = "应急演练计划信息表 管理"))
public class TYjyljhxxController {

    /**
     * 服务对象
     */
    private final TYjyljhxxService tYjyljhxxService;

    /**
     * 应急演练计划信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "应急演练计划信息表数据新增或修改", summary = "多条应急演练计划信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("应急演练计划信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TYjyljhxxDTO> list) {
        List<TYjyljhxxEntity> entityList = new ArrayList<>(list);
        this.tYjyljhxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有应急演练计划信息表信息
     *
     * @return List<TYjyljhxxEntity> 当前账户下所有应急演练计划信息表信息
     */
    @Operation(description = "查询应急演练计划信息表信息表数据", summary = "查询应急演练计划信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TYjyljhxxVO> selectAll(@ParameterObject TYjyljhxxDTO tYjyljhxxDTO) {
        return this.tYjyljhxxService.queryList(tYjyljhxxDTO);
    }

    /**
     * 分页查询当前账户下所有应急演练计划信息表信息
     *
     * @return List<TYjyljhxxDTO> 分页当前账户下所有应急演练计划信息表信息
     */
    @Operation(description = "分页应急演练计划信息表信息表数据", summary = "分页查询应急演练计划信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TYjyljhxxVO> selectPage(@ParameterObject Page<TYjyljhxxDTO> page, @ParameterObject TYjyljhxxDTO tYjyljhxxDTO) {
        return this.tYjyljhxxService.queryPage(page, tYjyljhxxDTO);
    }

}
