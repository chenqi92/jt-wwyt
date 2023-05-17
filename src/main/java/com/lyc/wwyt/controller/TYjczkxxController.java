package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TYjczkxxEntity;
import com.lyc.wwyt.service.TYjczkxxService;
import com.lyc.wwyt.dto.TYjczkxxDTO;
import com.lyc.wwyt.vo.TYjczkxxVO;
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
 * 应急处置卡信息表：t_yjczkxx(t_yjczkxx)表控制层
 *
 * @author chenqi
 * @since 2023-05-16 16:33:39
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_yjczkxx")
@Tag(name = "应急处置卡信息表：t_yjczkxx", description = "应急处置卡信息表：t_yjczkxx 管理")
@OpenAPIDefinition(info = @Info(title = "应急处置卡信息表：t_yjczkxx Api", version = "v1", description = "应急处置卡信息表：t_yjczkxx 管理"))
public class TYjczkxxController {

    /**
     * 服务对象
     */
    private final TYjczkxxService tYjczkxxService;

    /**
     * 应急处置卡信息表：t_yjczkxx新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "应急处置卡信息表：t_yjczkxx数据新增或修改", summary = "多条应急处置卡信息表：t_yjczkxx数据新增或修改", tags = {"数据保存"})
    @SysLog("应急处置卡信息表：t_yjczkxx数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TYjczkxxDTO> list) {
        List<TYjczkxxEntity> entityList = new ArrayList<>(list);
        this.tYjczkxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有应急处置卡信息表：t_yjczkxx     *
     *
     * @return List<TYjczkxxEntity> 当前账户下所有应急处置卡信息表：t_yjczkxx
     */
    @Operation(description = "查询应急处置卡信息表：t_yjczkxx信息表数据", summary = "查询应急处置卡信息表：t_yjczkxx信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TYjczkxxVO> selectAll() {
        return this.tYjczkxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有应急处置卡信息表：t_yjczkxx     *
     *
     * @return List<TYjczkxxDTO> 分页当前账户下所有应急处置卡信息表：t_yjczkxx
     */
    @Operation(description = "分页应急处置卡信息表：t_yjczkxx信息表数据", summary = "分页查询应急处置卡信息表：t_yjczkxx信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TYjczkxxVO> selectPage(@ParameterObject Page<TYjczkxxDTO> page, @ParameterObject TYjczkxxDTO tYjczkxxDTO) {
        return this.tYjczkxxService.selectPage(page, tYjczkxxDTO);
    }

}
