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
 * @date 2019-07-30 10:25:00
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("cm_unit")
public class CmUnitEntity extends BaseEntity {

    /**
     * 单位ID
     */
    @TableId(type = IdType.AUTO)
    private Long unitId;
    /**
     * 名称
     */
    private String name;
    /**
     * 单位编号
     */
    private String unitCode;
    /**
     * 简称
     */
    private String shortName;
    /**
     * 地址
     */
    private String address;
    /**
     * 社会统一信用代码
     */
    private String socialCreditCode;
    /**
     * 单位类型(0.单位 1.园区)
     */
    private Integer isPark;
    /**
     * 父类园区id
     */
    private Long parentId;
    /**
     * 法定代表人
     */
    private String legalRepresentative;
    /**
     * 法定联系人
     */
    private String statutoryContact;
    /**
     * 实际控制人
     */
    private String actualController;
    /**
     * 实际控制人联系方式
     */
    private String actualControllerContact;
    /**
     * 环保负责人
     */
    private String headOfEnvironment;
    /**
     * 环保负责人联系方式
     */
    private String headOfEnvironmentContact;
    /**
     * 环保技术负责人
     */
    private String technicalHeadOfEnvironment;
    /**
     * 环保技术负责人联系方式
     */
    private String technicalHeadOfEnvironmentContact;
    /**
     * 环保总监
     */
    private String managerOfEnvironment;
    /**
     * 环保总监联系方式
     */
    private String managerOfEnvironmentContact;
    /**
     * 安全负责人
     */
    private String headOfSafe;
    /**
     * 安全负责人联系方式
     */
    private String headOfSafeContact;
    /**
     * 安全技术负责人
     */
    private String technicalHeadOfSafe;
    /**
     * 安全技术负责人联系方式
     */
    private String technicalHeadOfSafeContact;
    /**
     * 安全总监
     */
    private String managerOfSafe;
    /**
     * 安全总监联系方式
     */
    private String managerOfSafeContact;
    /**
     * 报警是否分级推送（0.不推送 1.推送）
     */
    private Integer alarmPush;
    /**
     * 专职安全人员数目
     */
    private Integer fullTimeSafeNum;
    /**
     * 主营业务收入
     */
    private String mainBusinessincome;
    /**
     * 从业人员数目
     */
    private Integer employeeNum;
    /**
     * 行业类型
     */
    private Integer industryType;
    /**
     * 主要原料
     */
    private String mainRawMaterials;
    /**
     * 主要产品
     */
    private String mainProduct;
    /**
     * 重大危险源等级
     */
    private Integer hazardLevel;
    /**
     * 企业风险等级(政府填写)
     */
    private Integer enRiskLevel;
    /**
     * 安全风险评估报告(政府填写)
     */
    private String safeRiskAssessReport;
    /**
     * 最近环保事故日期
     */
    private Date lastEnvironmentDate;
    /**
     * 最近安全事故日期
     */
    private Date lastSafeDate;
    /**
     * 安全
     */
    private String safe;
    /**
     * 应急
     */
    private String emergency;
    /**
     * 环保
     */
    private String environ;
    /**
     * 封管
     */
    private String locks;
    /**
     * 经信
     */
    private String energy;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 1：生产
     * 2：限产
     * 3：停产
     */
    private Integer produceStatus;
    /**
     *
     */
    private String unifiedCode;

    private String introduce;

    private String twoDoorUrl;

    private Integer sort;

    private Integer isChemical;

    private String provinceEnterpriseId;

    private String provinceGatewayId;

    /**
     * 占地面积 ㎡
     */
    private String floorArea;
    /**
     * 建筑面积 ㎡
     */
    private String buildingArea;
    /**
     * 企业范围框的坐标
     */
    private String coordinates;

    /**
     * 车位总数
     */
    private Integer seatTotal;


    /**
     * 车位已使用数量
     */
    private Integer seatUsedCount;

    private Integer inParkUnit;
    /**
     * 五位一体 重大危险源链接
     */
    private String wwyt1Url;
    /**
     * 五位一体 有毒可燃监测链接
     */
    private String wwyt2Url;
    /**
     * 五位一体 安全风险分区链接
     */
    private String wwyt3Url;
    /**
     * 五位一体 人员在岗在位链接
     */
    private String wwyt4Url;
    /**
     * 五位一体 生产全流程链接
     */
    private String wwyt5Url;
}
