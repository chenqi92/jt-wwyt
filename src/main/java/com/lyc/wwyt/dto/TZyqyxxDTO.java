package com.lyc.wwyt.dto;


import com.lyc.wwyt.entity.TZyqyxxEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 作业区域信息表(t_zyqyxx)DTO
 *
 * @author lhh
 * @since 2023-05-22 14:22:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "作业区域信息表 参数接收类", name = "TZyqyxxDTO")
public class TZyqyxxDTO extends TZyqyxxEntity {
}
