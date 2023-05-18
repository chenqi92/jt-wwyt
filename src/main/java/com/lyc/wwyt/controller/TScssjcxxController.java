package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TScssjcxxEntity;
import com.lyc.wwyt.service.TScssjcxxService;
import com.lyc.wwyt.dto.TScssjcxxDTO;
import com.lyc.wwyt.vo.TScssjcxxVO;
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
 * 生产设施检查信息(t_scssjcxx)表控制层
 *
 * @author lhh
 * @since 2023-05-17 17:22:11
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_scssjcxx")
@Tag(name = "生产设施检查信息", description = "生产设施检查信息 管理")
@OpenAPIDefinition(info = @Info(title = "生产设施检查信息 Api", version = "v1", description = "生产设施检查信息 管理"))
public class TScssjcxxController {

    /**
     * 服务对象
     */
    private final TScssjcxxService tScssjcxxService;

    /**
     * 生产设施检查信息新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "生产设施检查信息数据新增或修改", summary = "多条生产设施检查信息数据新增或修改", tags = {"数据保存"})
    @SysLog("生产设施检查信息数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TScssjcxxDTO> list) {
        List<TScssjcxxEntity> entityList = new ArrayList<>(list);
        this.tScssjcxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有生产设施检查信息     *
     *
     * @return List<TScssjcxxEntity> 当前账户下所有生产设施检查信息
     */
    @Operation(description = "查询生产设施检查信息信息表数据", summary = "查询生产设施检查信息信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TScssjcxxVO> selectAll() {
        return this.tScssjcxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有生产设施检查信息     *
     *
     * @return List<TScssjcxxDTO> 分页当前账户下所有生产设施检查信息
     */
    @Operation(description = "分页生产设施检查信息信息表数据", summary = "分页查询生产设施检查信息信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TScssjcxxVO> selectPage(@ParameterObject Page<TScssjcxxDTO> page, @ParameterObject TScssjcxxDTO tScssjcxxDTO) {
        return this.tScssjcxxService.selectPage(page, tScssjcxxDTO);
    }

}
