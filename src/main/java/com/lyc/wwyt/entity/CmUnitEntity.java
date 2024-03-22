package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * (cm_unit)表实体类
 *
 * @author chenqi
 * @since 2023-06-02 14:06:06
 */
@Data
@Schema(description = "", name = "cm_unit")
@TableName("cm_unit")
public class CmUnitEntity {

    private static final long serialVersionUID = -63592801582624988L;

    @TableId(value = "unit_id")
    @NotBlank(message = "主键不能为空!")
    @Schema(description = "自增主键", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private Long unitId;

    @Schema(description = "名称", name = "name", implementation = String.class, maxLength = 100)
    @NotBlank(message = "名称不能为空!")
    @Size(max = 100, message = "名称不能超过100个字符(1个汉字记两个字符)!")
    private String name;

    @Schema(description = "单位编号", name = "unitCode", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "单位编号不能超过100个字符(1个汉字记两个字符)!")
    private String unitCode;

    @Schema(description = "简称", name = "shortName", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "简称不能超过100个字符(1个汉字记两个字符)!")
    private String shortName;

    @Schema(description = "地址", name = "address", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "地址不能超过100个字符(1个汉字记两个字符)!")
    private String address;

    @Schema(description = "社会统一信用代码", name = "socialCreditCode", implementation = String.class, maxLength = 20)
    @NotBlank(message = "社会统一信用代码不能为空!")
    @Size(max = 20, message = "社会统一信用代码不能超过20个字符(1个汉字记两个字符)!")
    private String socialCreditCode;

    @Schema(description = "单位类型(0.单位 1.园区)", name = "isPark", implementation = Integer.class, maxLength = 2)
    @NotNull(message = "单位类型(0.单位 1.园区)不能为空")
    private Integer isPark;

    @Schema(description = "父类园区id", name = "parentId", implementation = Long.class, maxLength = 20)
    @NotNull(message = "父类园区id不能为空")
    private Long parentId;

    @Schema(description = "法定代表人", name = "legalRepresentative", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "法定代表人不能超过100个字符(1个汉字记两个字符)!")
    private String legalRepresentative;

    @Schema(description = "法人联系方式", name = "statutoryContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "法人联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String statutoryContact;

    @Schema(description = "实际控制人", name = "actualController", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "实际控制人不能超过100个字符(1个汉字记两个字符)!")
    private String actualController;

    @Schema(description = "实际控制人联系方式", name = "actualControllerContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "实际控制人联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String actualControllerContact;

    @Schema(description = "环保负责人", name = "headOfEnvironment", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "环保负责人不能超过100个字符(1个汉字记两个字符)!")
    private String headOfEnvironment;

    @Schema(description = "环保负责人联系方式", name = "headOfEnvironmentContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "环保负责人联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String headOfEnvironmentContact;

    @Schema(description = "环保技术负责人", name = "technicalHeadOfEnvironment", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "环保技术负责人不能超过100个字符(1个汉字记两个字符)!")
    private String technicalHeadOfEnvironment;

    @Schema(description = "环保技术负责人联系方式", name = "technicalHeadOfEnvironmentContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "环保技术负责人联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String technicalHeadOfEnvironmentContact;

    @Schema(description = "环保总监", name = "managerOfEnvironment", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "环保总监不能超过100个字符(1个汉字记两个字符)!")
    private String managerOfEnvironment;

    @Schema(description = "环保总监联系方式", name = "managerOfEnvironmentContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "环保总监联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String managerOfEnvironmentContact;

    @Schema(description = "安全负责人", name = "headOfSafe", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全负责人不能超过100个字符(1个汉字记两个字符)!")
    private String headOfSafe;

    @Schema(description = "安全负责人联系方式", name = "headOfSafeContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "安全负责人联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String headOfSafeContact;

    @Schema(description = "安全技术负责人", name = "technicalHeadOfSafe", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全技术负责人不能超过100个字符(1个汉字记两个字符)!")
    private String technicalHeadOfSafe;

    @Schema(description = "安全技术负责人联系方式", name = "technicalHeadOfSafeContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "安全技术负责人联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String technicalHeadOfSafeContact;

    @Schema(description = "安全总监", name = "managerOfSafe", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全总监不能超过100个字符(1个汉字记两个字符)!")
    private String managerOfSafe;

    @Schema(description = "环保总监联系方式", name = "managerOfSafeContact", implementation = String.class, maxLength = 15)
    @Size(max = 15, message = "环保总监联系方式不能超过15个字符(1个汉字记两个字符)!")
    private String managerOfSafeContact;

    @Schema(description = "报警是否分级推送（0.不推送 1.推送）", name = "alarmPush", implementation = Integer.class, maxLength = 2)
    private Integer alarmPush;

    @Schema(description = "专职安全人员数目", name = "fullTimeSafeNum", implementation = Integer.class, maxLength = 8)
    private Integer fullTimeSafeNum;

    @Schema(description = "主营业务收入", name = "mainBusinessincome", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "主营业务收入不能超过100个字符(1个汉字记两个字符)!")
    private String mainBusinessincome;

    @Schema(description = "从业人员数目", name = "employeeNum", implementation = Integer.class, maxLength = 8)
    private Integer employeeNum;

    @Schema(description = "行业类型 1化工,2炼油,3冶金,4能源,5轻工,6石化,7环境,8医药,9环保,10其他", name = "industryType", implementation = Integer.class, maxLength = 2)
    private Integer industryType;

    @Schema(description = "主要原料", name = "mainRawMaterials", implementation = String.class, maxLength = 5000)
    @Size(max = 5000, message = "主要原料不能超过5000个字符(1个汉字记两个字符)!")
    private String mainRawMaterials;

    @Schema(description = "主要产品", name = "mainProduct", implementation = String.class, maxLength = 5000)
    @Size(max = 5000, message = "主要产品不能超过5000个字符(1个汉字记两个字符)!")
    private String mainProduct;

    @Schema(description = "重大危险源等级", name = "hazardLevel", implementation = Integer.class, maxLength = 2)
    private Integer hazardLevel;

    @Schema(description = "企业风险等级(政府填写)", name = "enRiskLevel", implementation = Integer.class, maxLength = 2)
    private Integer enRiskLevel;

    @Schema(description = "安全风险评估报告(政府填写)", name = "safeRiskAssessReport", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "安全风险评估报告(政府填写)不能超过100个字符(1个汉字记两个字符)!")
    private String safeRiskAssessReport;

    @Schema(description = "最近环保事故日期", name = "lastEnvironmentDate", implementation = LocalDate.class)
    private LocalDate lastEnvironmentDate;

    @Schema(description = "最近安全事故日期", name = "lastSafeDate", implementation = LocalDate.class)
    private LocalDate lastSafeDate;

    @Schema(description = "安全描述", name = "safe", implementation = String.class)
    private String safe;

    @Schema(description = "应急描述", name = "emergency", implementation = String.class)
    private String emergency;

    @Schema(description = "环保描述", name = "environ", implementation = String.class)
    private String environ;

    @Schema(description = "封管描述", name = "locks", implementation = String.class)
    private String locks;

    @Schema(description = "经信描述", name = "energy", implementation = String.class)
    private String energy;

    @Schema(description = "纬度", name = "latitude", implementation = Double.class, maxLength = 10)
    private Double latitude;

    @Schema(description = "经度", name = "longitude", implementation = Double.class, maxLength = 10)
    private Double longitude;

    @Schema(description = "0：在建   1：生产     2：限产     3：停产   4：关停", name = "produceStatus", implementation = Integer.class, maxLength = 2)
    private Integer produceStatus;

    @Schema(description = "", name = "unifiedCode", implementation = String.class, maxLength = 32)
    @NotBlank(message = "${column.comment}不能为空!")
    @Size(max = 32, message = "不能超过32个字符(1个汉字记两个字符)!")
    private String unifiedCode;

    @Schema(description = "0：正常 1逻辑删除", name = "delFlg", implementation = Integer.class, maxLength = 2)
    @NotNull(message = "0：正常 1逻辑删除不能为空")
    private Integer delFlg;

    @Schema(description = "创建人id", name = "createId", implementation = Long.class, maxLength = 20)
    @NotNull(message = "创建人id不能为空")
    private Long createId;

    @Schema(description = "更新人id", name = "updateId", implementation = Long.class, maxLength = 20)
    @NotNull(message = "更新人id不能为空")
    private Long updateId;

    @Schema(description = "", name = "introduce", implementation = String.class)
    private String introduce;

    @Schema(description = "二道门人员定位系统url", name = "twoDoorUrl", implementation = String.class, maxLength = 500)
    @Size(max = 500, message = "二道门人员定位系统url不能超过500个字符(1个汉字记两个字符)!")
    private String twoDoorUrl;

    @Schema(description = "", name = "isCount", implementation = Integer.class, maxLength = 2)
    private Integer isCount;

    @Schema(description = "", name = "sort", implementation = Integer.class, maxLength = 4)
    private Integer sort;

    @Schema(description = "是否为化工企业 1是 0 否", name = "isChemical", implementation = Integer.class, maxLength = 2)
    private Integer isChemical;

    @Schema(description = "省安监企业编码", name = "provinceEnterpriseId", implementation = String.class, maxLength = 32)
    @Size(max = 32, message = "省安监企业编码不能超过32个字符(1个汉字记两个字符)!")
    private String provinceEnterpriseId;

    @Schema(description = "省安监网关编码", name = "provinceGatewayId", implementation = String.class, maxLength = 32)
    @Size(max = 32, message = "省安监网关编码不能超过32个字符(1个汉字记两个字符)!")
    private String provinceGatewayId;

    @Schema(description = "占地面积 平方米", name = "floorArea", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "占地面积 平方米不能超过255个字符(1个汉字记两个字符)!")
    private String floorArea;

    @Schema(description = "建筑面积 平方米", name = "buildingArea", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "建筑面积 平方米不能超过255个字符(1个汉字记两个字符)!")
    private String buildingArea;

    @Schema(description = "企业范围框的坐标", name = "coordinates", implementation = String.class, maxLength = 512)
    @Size(max = 512, message = "企业范围框的坐标不能超过512个字符(1个汉字记两个字符)!")
    private String coordinates;

    @Schema(description = "车位总数", name = "seatTotal", implementation = Integer.class, maxLength = 10)
    private Integer seatTotal;

    @Schema(description = "车位已使用数量", name = "seatUsedCount", implementation = Integer.class, maxLength = 10)
    private Integer seatUsedCount;

    @Schema(description = "1：东区、2：西区", name = "areaDivision", implementation = Long.class, maxLength = 20)
    private Long areaDivision;

    @Schema(description = "", name = "inParkUnit", implementation = Integer.class, maxLength = 2)
    @NotNull(message = "不能为空")
    private Integer inParkUnit;

    @Schema(description = "五位一体 重大危险源链接", name = "wwyt1Url", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "五位一体 重大危险源链接不能超过255个字符(1个汉字记两个字符)!")
    private String wwyt1Url;

    @Schema(description = "五位一体 有毒可燃监测链接", name = "wwyt2Url", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "五位一体 有毒可燃监测链接不能超过255个字符(1个汉字记两个字符)!")
    private String wwyt2Url;

    @Schema(description = "五位一体 安全风险分区链接", name = "wwyt3Url", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "五位一体 安全风险分区链接不能超过255个字符(1个汉字记两个字符)!")
    private String wwyt3Url;

    @Schema(description = "五位一体 人员在岗在位链接", name = "wwyt4Url", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "五位一体 人员在岗在位链接不能超过255个字符(1个汉字记两个字符)!")
    private String wwyt4Url;

    @Schema(description = "五位一体 生产全流程链接", name = "wwyt5Url", implementation = String.class, maxLength = 255)
    @Size(max = 255, message = "五位一体 生产全流程链接不能超过255个字符(1个汉字记两个字符)!")
    private String wwyt5Url;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
