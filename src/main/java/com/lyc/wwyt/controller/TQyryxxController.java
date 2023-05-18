package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TQyryxxEntity;
import com.lyc.wwyt.service.TQyryxxService;
import com.lyc.wwyt.dto.TQyryxxDTO;
import com.lyc.wwyt.vo.TQyryxxVO;
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
 * 企业人员信息表(t_qyryxx)表控制层
 *
 * @author lhh
 * @since 2023-05-17 11:20:42
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_qyryxx")
@Tag(name = "企业人员信息表", description = "企业人员信息表 管理")
@OpenAPIDefinition(info = @Info(title = "企业人员信息表 Api", version = "v1", description = "企业人员信息表 管理"))
public class TQyryxxController {

    /**
     * 服务对象
     */
    private final TQyryxxService tQyryxxService;

    /**
     * 企业人员信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "企业人员信息表数据新增或修改", summary = "多条企业人员信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("企业人员信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TQyryxxDTO> list) {
        List<TQyryxxEntity> entityList = new ArrayList<>(list);
        this.tQyryxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有企业人员信息表     *
     *
     * @return List<TQyryxxEntity> 当前账户下所有企业人员信息表
     */
    @Operation(description = "查询企业人员信息表信息表数据", summary = "查询企业人员信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TQyryxxVO> selectAll() {
        return this.tQyryxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有企业人员信息表     *
     *
     * @return List<TQyryxxDTO> 分页当前账户下所有企业人员信息表
     */
    @Operation(description = "分页企业人员信息表信息表数据", summary = "分页查询企业人员信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TQyryxxVO> selectPage(@ParameterObject Page<TQyryxxDTO> page, @ParameterObject TQyryxxDTO tQyryxxDTO) {
        return this.tQyryxxService.selectPage(page, tQyryxxDTO);
    }

}
