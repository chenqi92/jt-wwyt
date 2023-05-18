package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TDwszxxEntity;
import com.lyc.wwyt.service.TDwszxxService;
import com.lyc.wwyt.dto.TDwszxxDTO;
import com.lyc.wwyt.vo.TDwszxxVO;
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
 * 点位设置信息表(t_dwszxx)表控制层
 *
 * @author lhh
 * @since 2023-05-17 17:22:13
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_dwszxx")
@Tag(name = "点位设置信息表", description = "点位设置信息表 管理")
@OpenAPIDefinition(info = @Info(title = "点位设置信息表 Api", version = "v1", description = "点位设置信息表 管理"))
public class TDwszxxController {

    /**
     * 服务对象
     */
    private final TDwszxxService tDwszxxService;

    /**
     * 点位设置信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "点位设置信息表数据新增或修改", summary = "多条点位设置信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("点位设置信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TDwszxxDTO> list) {
        List<TDwszxxEntity> entityList = new ArrayList<>(list);
        this.tDwszxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有点位设置信息表     *
     *
     * @return List<TDwszxxEntity> 当前账户下所有点位设置信息表
     */
    @Operation(description = "查询点位设置信息表信息表数据", summary = "查询点位设置信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TDwszxxVO> selectAll() {
        return this.tDwszxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有点位设置信息表     *
     *
     * @return List<TDwszxxDTO> 分页当前账户下所有点位设置信息表
     */
    @Operation(description = "分页点位设置信息表信息表数据", summary = "分页查询点位设置信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TDwszxxVO> selectPage(@ParameterObject Page<TDwszxxDTO> page, @ParameterObject TDwszxxDTO tDwszxxDTO) {
        return this.tDwszxxService.selectPage(page, tDwszxxDTO);
    }

}
