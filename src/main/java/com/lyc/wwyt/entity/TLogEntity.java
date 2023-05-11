package com.lyc.wwyt.entity;


import cn.hutool.core.convert.Convert;
import com.baomidou.mybatisplus.annotation.*;
import com.lyc.wwyt.config.log.dto.SysLogDto;
import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 日志表(t_log)表实体类
 *
 * @author chenqi
 * @since 2023-05-11 09:41:45
 */
@Data
@ApiModel(value = "日志表")
@TableName("t_log")
public class TLogEntity {

    private static final long serialVersionUID = -52774006880708910L;

    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "编号")
    private Long id;

    @Schema(description = "类型", name = "type", implementation = String.class)
    private String type;

    @Schema(description = "方法注释", name = "title", implementation = String.class)
    private String title;

    @Schema(description = "服务id,多服务部署时区分多个服务", name = "serviceId", implementation = String.class)
    private String serviceId;

    @Schema(description = "远程ip", name = "remoteAddr", implementation = String.class)
    private String remoteAddr;

    @Schema(description = "用户代理", name = "userAgent", implementation = String.class)
    private String userAgent;

    @Schema(description = "请求的接口地址", name = "requestUri", implementation = String.class)
    private String requestUri;

    @Schema(description = "执行方法", name = "method", implementation = String.class)
    private String method;

    @Schema(description = "参数", name = "params", implementation = String.class)
    private String params;

    @Schema(description = "执行时间", name = "time", implementation = Object.class)
    private Object time;

    @Schema(description = "异常说明", name = "exception", implementation = String.class)
    private String exception;

    @Schema(description = "创建时间", name = "createTime", implementation = LocalDateTime.class)
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @Schema(description = "创建人", name = "createBy", implementation = String.class)
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    public TLogEntity(SysLogDto sysLog) {
        this.method = sysLog.getMethod();
        this.exception = sysLog.getException();
        this.params = sysLog.getParams();
        this.time = Convert.toLong(sysLog.getTime(), 0L);
        this.remoteAddr = sysLog.getRemoteAddr();
        this.requestUri = sysLog.getRequestUri();
        this.title = sysLog.getTitle();
        this.type = sysLog.getType();
        this.userAgent = sysLog.getUserAgent();
        this.createBy = sysLog.getUserName();
        this.createTime = LocalDateTime.now();
    }
}
