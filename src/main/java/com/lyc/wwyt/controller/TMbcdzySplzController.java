package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TMbcdzySplzEntity;
import com.lyc.wwyt.service.TMbcdzySplzService;
import com.lyc.wwyt.dto.TMbcdzySplzDTO;
import com.lyc.wwyt.vo.TMbcdzySplzVO;
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
 * 盲板抽堵作业审批流转记录表(t_mbcdzy_splz)表控制层
 *
 * @author lhh
 * @since 2023-05-18 15:55:09
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_mbcdzy_splz")
@Tag(name = "盲板抽堵作业审批流转记录表", description = "盲板抽堵作业审批流转记录表 管理")
@OpenAPIDefinition(info = @Info(title = "盲板抽堵作业审批流转记录表 Api", version = "v1", description = "盲板抽堵作业审批流转记录表 管理"))
public class TMbcdzySplzController {

    /**
     * 服务对象
     */
    private final TMbcdzySplzService tMbcdzySplzService;

    /**
     * 盲板抽堵作业审批流转记录表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "盲板抽堵作业审批流转记录表数据新增或修改", summary = "多条盲板抽堵作业审批流转记录表数据新增或修改", tags = {"数据保存"})
    @SysLog("盲板抽堵作业审批流转记录表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TMbcdzySplzDTO> list) {
        List<TMbcdzySplzEntity> entityList = new ArrayList<>(list);
        this.tMbcdzySplzService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有盲板抽堵作业审批流转记录表     *
     *
     * @return List<TMbcdzySplzEntity> 当前账户下所有盲板抽堵作业审批流转记录表
     */
    @Operation(description = "查询盲板抽堵作业审批流转记录表信息表数据", summary = "查询盲板抽堵作业审批流转记录表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TMbcdzySplzVO> selectAll() {
        return this.tMbcdzySplzService.selectList();
    }

    /**
     * 分页查询当前账户下所有盲板抽堵作业审批流转记录表     *
     *
     * @return List<TMbcdzySplzDTO> 分页当前账户下所有盲板抽堵作业审批流转记录表
     */
    @Operation(description = "分页盲板抽堵作业审批流转记录表信息表数据", summary = "分页查询盲板抽堵作业审批流转记录表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TMbcdzySplzVO> selectPage(@ParameterObject Page<TMbcdzySplzDTO> page, @ParameterObject TMbcdzySplzDTO tMbcdzySplzDTO) {
        return this.tMbcdzySplzService.selectPage(page, tMbcdzySplzDTO);
    }

}
