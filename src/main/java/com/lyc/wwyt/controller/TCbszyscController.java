package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TCbszyscEntity;
import com.lyc.wwyt.service.TCbszyscService;
import com.lyc.wwyt.dto.TCbszyscDTO;
import com.lyc.wwyt.vo.TCbszyscVO;
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
 * 承包商安全作业规程审查表(t_cbszysc)表控制层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:54
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_cbszysc")
@Tag(name = "承包商安全作业规程审查表", description = "承包商安全作业规程审查表 管理")
@OpenAPIDefinition(info = @Info(title = "承包商安全作业规程审查表 Api", version = "v1", description = "承包商安全作业规程审查表 管理"))
public class TCbszyscController {

    /**
     * 服务对象
     */
    private final TCbszyscService tCbszyscService;

    /**
     * 承包商安全作业规程审查表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "承包商安全作业规程审查表数据新增或修改", summary = "多条承包商安全作业规程审查表数据新增或修改", tags = {"数据保存"})
    @SysLog("承包商安全作业规程审查表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TCbszyscDTO> list) {
        List<TCbszyscEntity> entityList = new ArrayList<>(list);
        this.tCbszyscService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有承包商安全作业规程审查表     *
     *
     * @return List<TCbszyscEntity> 当前账户下所有承包商安全作业规程审查表
     */
    @Operation(description = "查询承包商安全作业规程审查表信息表数据", summary = "查询承包商安全作业规程审查表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TCbszyscVO> selectAll() {
        return this.tCbszyscService.selectList();
    }

    /**
     * 分页查询当前账户下所有承包商安全作业规程审查表     *
     *
     * @return List<TCbszyscDTO> 分页当前账户下所有承包商安全作业规程审查表
     */
    @Operation(description = "分页承包商安全作业规程审查表信息表数据", summary = "分页查询承包商安全作业规程审查表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TCbszyscVO> selectPage(@ParameterObject Page<TCbszyscDTO> page, @ParameterObject TCbszyscDTO tCbszyscDTO) {
        return this.tCbszyscService.selectPage(page, tCbszyscDTO);
    }

}
