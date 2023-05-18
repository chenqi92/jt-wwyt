package com.lyc.wwyt.controller;

import cn.allbs.idempotent.annotation.Idempotent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyc.wwyt.config.log.annotation.SysLog;
import com.lyc.wwyt.entity.TXmstsxxEntity;
import com.lyc.wwyt.service.TXmstsxxService;
import com.lyc.wwyt.dto.TXmstsxxDTO;
import com.lyc.wwyt.vo.TXmstsxxVO;
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
 * 项目三同时信息表(t_xmstsxx)表控制层
 *
 * @author lhh
 * @since 2023-05-17 17:19:44
 */
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/api/wwyt/t_xmstsxx")
@Tag(name = "项目三同时信息表", description = "项目三同时信息表 管理")
@OpenAPIDefinition(info = @Info(title = "项目三同时信息表 Api", version = "v1", description = "项目三同时信息表 管理"))
public class TXmstsxxController {

    /**
     * 服务对象
     */
    private final TXmstsxxService tXmstsxxService;

    /**
     * 项目三同时信息表新增或修改
     *
     * @param list 承包商管理信息表
     * @return R
     */
    @Operation(description = "项目三同时信息表数据新增或修改", summary = "多条项目三同时信息表数据新增或修改", tags = {"数据保存"})
    @SysLog("项目三同时信息表数据新增或修改")
    @PostMapping
    public void save(@RequestBody @Valid List<TXmstsxxDTO> list) {
        List<TXmstsxxEntity> entityList = new ArrayList<>(list);
        this.tXmstsxxService.saveOrUpdateBatch(entityList);
    }

    /**
     * 查询当前账户下所有项目三同时信息表     *
     *
     * @return List<TXmstsxxEntity> 当前账户下所有项目三同时信息表
     */
    @Operation(description = "查询项目三同时信息表信息表数据", summary = "查询项目三同时信息表信息表数据", tags = {"查询所有数据"})
    @GetMapping
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")
    public List<TXmstsxxVO> selectAll() {
        return this.tXmstsxxService.selectList();
    }

    /**
     * 分页查询当前账户下所有项目三同时信息表     *
     *
     * @return List<TXmstsxxDTO> 分页当前账户下所有项目三同时信息表
     */
    @Operation(description = "分页项目三同时信息表信息表数据", summary = "分页查询项目三同时信息表信息表数据", tags = {"分页查询所有数据"})
    @GetMapping("page")
    @Parameters({@Parameter(description = "当前页", name = "current", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class)), @Parameter(description = "当前页条数", name = "size", in = ParameterIn.QUERY, required = true, schema = @Schema(implementation = Integer.class))})
    @Idempotent(expireTime = 180, info = "3分钟内最多请求一次!", key = "#page.current")
    public IPage<TXmstsxxVO> selectPage(@ParameterObject Page<TXmstsxxDTO> page, @ParameterObject TXmstsxxDTO tXmstsxxDTO) {
        return this.tXmstsxxService.selectPage(page, tXmstsxxDTO);
    }

}