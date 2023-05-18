package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TCbszyyjyascEntity;
import com.lyc.wwyt.service.TCbszyyjyascService;
import com.lyc.wwyt.dto.TCbszyyjyascDTO;
import com.lyc.wwyt.vo.TCbszyyjyascVO;
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
 * 承包商作业应急预案审查表(t_cbszyyjyasc)表控制层
 *
 * @author chenqi
 * @since 2023-05-17 16:22:41
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_cbszyyjyasc")
@Tag(name = "承包商作业应急预案审查表", description = "承包商作业应急预案审查表 管理")
@OpenAPIDefinition(info = @Info(title = "承包商作业应急预案审查表 Api", version = "v1", description = "承包商作业应急预案审查表 管理"))
public class TCbszyyjyascController {

    /**
     * 服务对象
     */
    private final TCbszyyjyascService tCbszyyjyascService;

    /**
     * 承包商作业应急预案审查表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "承包商作业应急预案审查表数据新增或修改", summary = "多条承包商作业应急预案审查表数据新增或修改", tags = {"数据保存"})
    @SysLog("承包商作业应急预案审查表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TCbszyyjyascDTO> list) {
        List<TCbszyyjyascEntity> entityList = new ArrayList<>(list);
        this.tCbszyyjyascService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有承包商作业应急预案审查表信息
     *
     * @return List<TCbszyyjyascEntity> 当前账户下所有承包商作业应急预案审查表信息
     */
    @Operation(description = "查询承包商作业应急预案审查表信息表数据", summary = "查询承包商作业应急预案审查表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TCbszyyjyascVO> selectAll(@ParameterObject TCbszyyjyascDTO tCbszyyjyascDTO) {
        return this.tCbszyyjyascService.queryList(tCbszyyjyascDTO);
    }

    /**
     * 分页查询当前账户下所有承包商作业应急预案审查表信息
     *
     * @return List<TCbszyyjyascDTO> 分页当前账户下所有承包商作业应急预案审查表信息
     */
    @Operation(description = "分页承包商作业应急预案审查表信息表数据", summary = "分页查询承包商作业应急预案审查表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TCbszyyjyascVO> selectPage(@ParameterObject Page<TCbszyyjyascDTO> page, @ParameterObject TCbszyyjyascDTO tCbszyyjyascDTO) {
        return this.tCbszyyjyascService.queryPage(page, tCbszyyjyascDTO);
    }

}