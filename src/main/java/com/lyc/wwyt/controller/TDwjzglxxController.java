package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TDwjzglxxEntity;
import com.lyc.wwyt.service.TDwjzglxxService;
import com.lyc.wwyt.dto.TDwjzglxxDTO;
import com.lyc.wwyt.vo.TDwjzglxxVO;
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
 * 定位基站管理信息表(t_dwjzglxx)表控制层
 *
 * @author lhh
 * @since 2023-05-18 16:32:17
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_dwjzglxx")
@Tag(name = "定位基站管理信息表", description = "定位基站管理信息表 管理")
@OpenAPIDefinition(info = @Info(title = "定位基站管理信息表 Api", version = "v1", description = "定位基站管理信息表 管理"))
public class TDwjzglxxController {

    /**
     * 服务对象
     */
    private final TDwjzglxxService tDwjzglxxService;

    /**
     * 定位基站管理信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "定位基站管理信息表数据新增或修改", summary = "多条定位基站管理信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("定位基站管理信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TDwjzglxxDTO> list) {
        List<TDwjzglxxEntity> entityList = new ArrayList<>(list);
        this.tDwjzglxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有定位基站管理信息表     *
     *
     * @return List<TDwjzglxxEntity> 当前账户下所有定位基站管理信息表
     */
    @Operation(description = "查询定位基站管理信息表信息表数据", summary = "查询定位基站管理信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TDwjzglxxVO> selectAll() {
        return this.tDwjzglxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有定位基站管理信息表     *
     *
     * @return List<TDwjzglxxDTO> 分页当前账户下所有定位基站管理信息表
     */
    @Operation(description = "分页定位基站管理信息表信息表数据", summary = "分页查询定位基站管理信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TDwjzglxxVO> selectPage(@ParameterObject Page<TDwjzglxxDTO> page, @ParameterObject TDwjzglxxDTO tDwjzglxxDTO) {
        return this.tDwjzglxxService.selectPage(page, tDwjzglxxDTO);
    }

}
