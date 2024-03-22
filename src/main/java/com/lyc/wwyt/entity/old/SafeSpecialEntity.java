package com.lyc.wwyt.entity.old;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author gdky
 * @date 2019-07-30 10:48:05
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sc_special_operation")
public class SafeSpecialEntity extends BaseEntity {

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 地址
     */
    private String address;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 申请部门
     */
    private Long applyDepartId;
    /**
     * 申请人
     */
    private String applyPerson;
    /**
     * 作业人
     */
    private String operator;
    /**
     * 作业开始时间
     */
    private Date startTime;
    /**
     * 作业结束时间
     */
    private Date endTime;
    /**
     * 审批人
     */
    private String approver;
    /**
     * 外来施工单位名称
     */
    private String outsiderUnitName;
    /**
     * 外来施工单位人员
     */
    private String outsiderUnitPersonName;
    /**
     * 人员工种类别
     */
    private Integer staffType;
    /**
     * 作业类型级别
     */
    private Integer staffTypeLevel;
    /**
     * 人员工种证号
     */
    private String staffNum;

    private String unifiedCode;
    /**
     * 是否批准
     */
    private Integer isApproval;

    private String code;

    /**
     * 公司
     */
    private long unitId;

    private Integer operatorUnitType;

    private Long operatorPersonId;

    private Long operatorUnitId;

    private String tId;

    private String checkPerson;

    private Date checkTime;

    private String checkContent;

    private String feedbackPerson;

    private Date feedbackTime;

    private String feedbackContent;

    private Integer checkStatus;

    private Integer checkType;
}
