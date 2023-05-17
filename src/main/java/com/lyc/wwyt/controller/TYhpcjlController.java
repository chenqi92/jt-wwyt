package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TYhpcjlEntity;
import com.lyc.wwyt.service.TYhpcjlService;
import com.lyc.wwyt.dto.TYhpcjlDTO;
import com.lyc.wwyt.vo.TYhpcjlVO;
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
 * 隐患排查记录表(t_yhpcjl)表控制层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:42
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_yhpcjl")
@Tag(name = "隐患排查记录表", description = "隐患排查记录表 管理")
@OpenAPIDefinition(info = @Info(title = "隐患排查记录表 Api", version = "v1", description = "隐患排查记录表 管理"))
public class TYhpcjlController {

    /**
     * 服务对象
     */
    private final TYhpcjlService tYhpcjlService;

    /**
     * 隐患排查记录表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "隐患排查记录表数据新增或修改", summary = "多条隐患排查记录表数据新增或修改", tags = {"数据保存"})
    @SysLog("隐患排查记录表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TYhpcjlDTO> list) {
        List<TYhpcjlEntity> entityList = new ArrayList<>(list);
        this.tYhpcjlService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有隐患排查记录表信息
     *
     * @return List<TYhpcjlEntity> 当前账户下所有隐患排查记录表信息
     */
    @Operation(description = "查询隐患排查记录表信息表数据", summary = "查询隐患排查记录表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TYhpcjlVO> selectAll(@ParameterObject TYhpcjlDTO tYhpcjlDTO) {
        return this.tYhpcjlService.queryList(tYhpcjlDTO);
    }

    /**
     * 分页查询当前账户下所有隐患排查记录表信息
     *
     * @return List<TYhpcjlDTO> 分页当前账户下所有隐患排查记录表信息
     */
    @Operation(description = "分页隐患排查记录表信息表数据", summary = "分页查询隐患排查记录表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TYhpcjlVO> selectPage(@ParameterObject Page<TYhpcjlDTO> page, @ParameterObject TYhpcjlDTO tYhpcjlDTO) {
        return this.tYhpcjlService.queryPage(page, tYhpcjlDTO);
    }

}
