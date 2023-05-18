package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TPxjhxxEntity;
import com.lyc.wwyt.service.TPxjhxxService;
import com.lyc.wwyt.dto.TPxjhxxDTO;
import com.lyc.wwyt.vo.TPxjhxxVO;
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
 * 培训计划信息表(t_pxjhxx)表控制层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:47
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_pxjhxx")
@Tag(name = "培训计划信息表", description = "培训计划信息表 管理")
@OpenAPIDefinition(info = @Info(title = "培训计划信息表 Api", version = "v1", description = "培训计划信息表 管理"))
public class TPxjhxxController {

    /**
     * 服务对象
     */
    private final TPxjhxxService tPxjhxxService;

    /**
     * 培训计划信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "培训计划信息表数据新增或修改", summary = "多条培训计划信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("培训计划信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TPxjhxxDTO> list) {
        List<TPxjhxxEntity> entityList = new ArrayList<>(list);
        this.tPxjhxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有培训计划信息表信息
     *
     * @return List<TPxjhxxEntity> 当前账户下所有培训计划信息表信息
     */
    @Operation(description = "查询培训计划信息表信息表数据", summary = "查询培训计划信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TPxjhxxVO> selectAll(@ParameterObject TPxjhxxDTO tPxjhxxDTO) {
        return this.tPxjhxxService.queryList(tPxjhxxDTO);
    }

    /**
     * 分页查询当前账户下所有培训计划信息表信息
     *
     * @return List<TPxjhxxDTO> 分页当前账户下所有培训计划信息表信息
     */
    @Operation(description = "分页培训计划信息表信息表数据", summary = "分页查询培训计划信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TPxjhxxVO> selectPage(@ParameterObject Page<TPxjhxxDTO> page, @ParameterObject TPxjhxxDTO tPxjhxxDTO) {
        return this.tPxjhxxService.queryPage(page, tPxjhxxDTO);
    }

}