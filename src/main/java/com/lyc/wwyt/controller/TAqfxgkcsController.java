package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TAqfxgkcsEntity;
import com.lyc.wwyt.service.TAqfxgkcsService;
import com.lyc.wwyt.dto.TAqfxgkcsDTO;
import com.lyc.wwyt.vo.TAqfxgkcsVO;
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
 * 安全风险管控措施表结构(t_aqfxgkcs)表控制层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:52
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_aqfxgkcs")
@Tag(name = "安全风险管控措施表结构", description = "安全风险管控措施表结构 管理")
@OpenAPIDefinition(info = @Info(title = "安全风险管控措施表结构 Api", version = "v1", description = "安全风险管控措施表结构 管理"))
public class TAqfxgkcsController {

    /**
     * 服务对象
     */
    private final TAqfxgkcsService tAqfxgkcsService;

    /**
     * 安全风险管控措施表结构新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "安全风险管控措施表结构数据新增或修改", summary = "多条安全风险管控措施表结构数据新增或修改", tags = {"数据保存"})
    @SysLog("安全风险管控措施表结构数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TAqfxgkcsDTO> list) {
        List<TAqfxgkcsEntity> entityList = new ArrayList<>(list);
        this.tAqfxgkcsService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有安全风险管控措施表结构     *
     *
     * @return List<TAqfxgkcsEntity> 当前账户下所有安全风险管控措施表结构
     */
    @Operation(description = "查询安全风险管控措施表结构信息表数据", summary = "查询安全风险管控措施表结构信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TAqfxgkcsVO> selectAll() {
        return this.tAqfxgkcsService.selectList();
    }

    /**
     * 分页查询当前账户下所有安全风险管控措施表结构     *
     *
     * @return List<TAqfxgkcsDTO> 分页当前账户下所有安全风险管控措施表结构
     */
    @Operation(description = "分页安全风险管控措施表结构信息表数据", summary = "分页查询安全风险管控措施表结构信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TAqfxgkcsVO> selectPage(@ParameterObject Page<TAqfxgkcsDTO> page, @ParameterObject TAqfxgkcsDTO tAqfxgkcsDTO) {
        return this.tAqfxgkcsService.selectPage(page, tAqfxgkcsDTO);
    }

}
