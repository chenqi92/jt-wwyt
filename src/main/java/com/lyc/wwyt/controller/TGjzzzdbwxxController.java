package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TGjzzzdbwxxEntity;
import com.lyc.wwyt.service.TGjzzzdbwxxService;
import com.lyc.wwyt.dto.TGjzzzdbwxxDTO;
import com.lyc.wwyt.vo.TGjzzzdbwxxVO;
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
 * 关键装置重点部位信息表(t_gjzzzdbwxx)表控制层
 *
 * @author lhh
 * @since 2023-05-17 17:22:12
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_gjzzzdbwxx")
@Tag(name = "关键装置重点部位信息表", description = "关键装置重点部位信息表 管理")
@OpenAPIDefinition(info = @Info(title = "关键装置重点部位信息表 Api", version = "v1", description = "关键装置重点部位信息表 管理"))
public class TGjzzzdbwxxController {

    /**
     * 服务对象
     */
    private final TGjzzzdbwxxService tGjzzzdbwxxService;

    /**
     * 关键装置重点部位信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "关键装置重点部位信息表数据新增或修改", summary = "多条关键装置重点部位信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("关键装置重点部位信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TGjzzzdbwxxDTO> list) {
        List<TGjzzzdbwxxEntity> entityList = new ArrayList<>(list);
        this.tGjzzzdbwxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有关键装置重点部位信息表     *
     *
     * @return List<TGjzzzdbwxxEntity> 当前账户下所有关键装置重点部位信息表
     */
    @Operation(description = "查询关键装置重点部位信息表信息表数据", summary = "查询关键装置重点部位信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TGjzzzdbwxxVO> selectAll() {
        return this.tGjzzzdbwxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有关键装置重点部位信息表     *
     *
     * @return List<TGjzzzdbwxxDTO> 分页当前账户下所有关键装置重点部位信息表
     */
    @Operation(description = "分页关键装置重点部位信息表信息表数据", summary = "分页查询关键装置重点部位信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TGjzzzdbwxxVO> selectPage(@ParameterObject Page<TGjzzzdbwxxDTO> page, @ParameterObject TGjzzzdbwxxDTO tGjzzzdbwxxDTO) {
        return this.tGjzzzdbwxxService.selectPage(page, tGjzzzdbwxxDTO);
    }

}
