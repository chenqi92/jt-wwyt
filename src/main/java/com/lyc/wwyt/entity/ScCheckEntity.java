package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.enums.CheckMethodEnum;
import com.lyc.wwyt.enums.DangerLevelEnum;
import com.lyc.wwyt.enums.DangerStateEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 安全_安全风险、隐患管理(sc_check)表实体类
 *
 * @author chenqi
 * @since 2023-06-01 17:50:57
 */
@Data
@Schema(description = "安全_安全风险、隐患管理", name = "sc_check")
@TableName("sc_check")
public class ScCheckEntity {

    private static final long serialVersionUID = -69415799337104633L;

    @TableId(value = "id", type = IdType.AUTO)
    @NotBlank(message = "主键不能为空!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private Long id;

    @Schema(description = "企业ID", name = "unitId", implementation = Long.class, maxLength = 20)
    @NotNull(message = "企业ID不能为空")
    private Long unitId;

    @Schema(description = "被检查部位", name = "checkPart", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "被检查部位不能超过100个字符(1个汉字记两个字符)!")
    private String checkPart;

    @Schema(description = "检查时间", name = "checkTime", implementation = LocalDateTime.class)
    private LocalDateTime checkTime;

    @Schema(description = "检查人员", name = "checkPerson", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "检查人员不能超过100个字符(1个汉字记两个字符)!")
    private String checkPerson;

    @Schema(description = "检查组长联系方式", name = "conduct", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "检查组长联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String conduct;

    @Schema(description = "检查类型", name = "checkType", implementation = Integer.class, maxLength = 2)
    private Integer checkType;

    @Schema(description = "复查时间", name = "recheckTime", implementation = LocalDateTime.class)
    private LocalDateTime recheckTime;

    @Schema(description = "复查人员", name = "recheckPerson", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "复查人员不能超过100个字符(1个汉字记两个字符)!")
    private String recheckPerson;

    @Schema(description = "隐患级别", name = "riskLevel", implementation = Integer.class, maxLength = 2)
    private Integer riskLevel;

    @Schema(description = "整改责任部门", name = "departId", implementation = Long.class, maxLength = 20)
    private Long departId;

    @Schema(description = "整改责任人", name = "leadPerson", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "整改责任人不能超过100个字符(1个汉字记两个字符)!")
    private String leadPerson;

    @Schema(description = "整改责任人联系方式", name = "leadPersonConduct", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "整改责任人联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String leadPersonConduct;

    @Schema(description = "整改完成时间", name = "planFinishTime", implementation = LocalDateTime.class)
    private LocalDateTime planFinishTime;

    @Schema(description = "整改状态", name = "rectificationStatus", implementation = Integer.class, maxLength = 2)
    private Integer rectificationStatus;

    @Schema(description = "整改投入资金（万元）", name = "rectificationMoney", implementation = Double.class, maxLength = 10)
    private Double rectificationMoney;

    @Schema(description = "隐患描述", name = "description", implementation = String.class)
    private String description;

    @Schema(description = "整改措施方案", name = "methods", implementation = String.class)
    private String methods;

    @Schema(description = "上报状态", name = "declareStatus", implementation = Integer.class, maxLength = 2)
    private Integer declareStatus;

    @Schema(description = "审核意见", name = "declareOpinion", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "审核意见不能超过500个字符(1个汉字记两个字符)!")
    private String declareOpinion;

    @Schema(description = "1：自查 2：监督部门检查", name = "checkMethod", implementation = Integer.class, maxLength = 2)
    @NotNull(message = "1：自查 2：监督部门检查不能为空")
    private Integer checkMethod;

    @Schema(description = "附件统一编码", name = "unifiedCode", implementation = String.class, maxLength = 32)
    @NotBlank(message = "附件统一编码不能为空!")
    @Size(max = 32, message = "附件统一编码不能超过32个字符(1个汉字记两个字符)!")
    private String unifiedCode;

    @Schema(description = "0：正常 1：逻辑删除", name = "delFlg", implementation = Integer.class, maxLength = 2)
    @NotNull(message = "0：正常 1：逻辑删除不能为空")
    private Integer delFlg;

    @Schema(description = "创建人id", name = "createId", implementation = Long.class, maxLength = 20)
    @NotNull(message = "创建人id不能为空")
    private Long createId;

    @Schema(description = "更新人id", name = "updateId", implementation = Long.class, maxLength = 20)
    @NotNull(message = "更新人id不能为空")
    private Long updateId;

    @Schema(description = "检查部门", name = "checkDepart", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "检查部门不能超过255个字符(1个汉字记两个字符)!")
    private String checkDepart;

    @Schema(description = "复查部门", name = "recheckDepart", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "复查部门不能超过255个字符(1个汉字记两个字符)!")
    private String recheckDepart;

    @Schema(description = "1：隐患    2：风险 ", name = "type", implementation = Integer.class, maxLength = 2)
    private Integer type;

    @Schema(description = "隐患数量", name = "safeNum", implementation = Integer.class, maxLength = 11)
    private Integer safeNum;

    @Schema(description = "未整改数量", name = "leftNum", implementation = Integer.class, maxLength = 11)
    private Integer leftNum;

    @Schema(description = "高危工艺", name = "processId", implementation = Long.class, maxLength = 20)
    private Long processId;

    @Schema(description = "监控化学品", name = "chemicalId", implementation = Long.class, maxLength = 20)
    private Long chemicalId;

    @Schema(description = "重大危险源", name = "sourceId", implementation = Long.class, maxLength = 20)
    private Long sourceId;

    @Schema(description = "是否督办  0:否    1:是", name = "handleType", implementation = Integer.class, maxLength = 2)
    private Integer handleType;

    @Schema(description = "五位一体中隐患治理主键", name = "tYhzlxxId", implementation = String.class, maxLength = 36)
    @Size(max = 36, message = "五位一体中隐患治理主键不能超过36个字符(1个汉字记两个字符)!")
    private String tYhzlxxId;

    @Schema(description = "督办日期", name = "handleTime", implementation = LocalDateTime.class)
    private LocalDateTime handleTime;

    @Schema(description = "督办通知书上传", name = "handleFile", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "督办通知书上传不能超过1000个字符(1个汉字记两个字符)!")
    private String handleFile;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public ScCheckEntity() {
        
    }

    public ScCheckEntity(TYhzlxxEntity tYhzlxx) {
        this.tYhzlxxId = tYhzlxx.getId();
        this.checkPart = tYhzlxx.getDangerName();
        this.checkTime = tYhzlxx.getRegistTime();
        this.checkPerson = tYhzlxx.getRegistrant();
        this.riskLevel = DangerLevelEnum.getRiskLevel(tYhzlxx.getDangerLevel().toString());
        this.description = tYhzlxx.getDangerDesc();
        this.leadPerson = tYhzlxx.getLiablePerson();
        this.planFinishTime = LocalDateTime.of(tYhzlxx.getDangerManageDeadline(), LocalTime.MIN);
        this.rectificationStatus = DangerStateEnum.getRectificationStatus(tYhzlxx.getDangerState().toString());
        this.methods = tYhzlxx.getControlMeasures();
        this.declareOpinion = tYhzlxx.getCheckAcceptComment();
        this.type = 1;
        this.checkType = CheckMethodEnum.QYZC.getValue();
        this.declareStatus = 1;
        this.delFlg = 0;
        this.createTime = LocalDateTime.now();
        this.updateTime = LocalDateTime.now();
    }

}
