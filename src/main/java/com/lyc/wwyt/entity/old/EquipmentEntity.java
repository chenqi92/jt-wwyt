package com.lyc.wwyt.entity.old;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author gdky
 * @date 2019-07-31 11:08:38
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sc_equipment")
public class EquipmentEntity extends BaseEntity {

    private String tId;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 设备名称
     */
    private String name;
    /**
     * 设备编号
     */
    private String equipCode;
    /**
     * 设备型号
     */
    private String modal;
    /**
     * 部门
     */
    private Long departId;
    /**
     * 设备位置
     */
    private String address;
    /**
     * 制造厂家
     */
    private String manufacturer;
    /**
     * 产品编号
     */
    private String proNum;
    /**
     * 登记证号
     */
    private String registNum;
    /**
     * 制造时间
     */
    private Date makeTime;
    /**
     * 使用年限
     */
    private Integer useTime;
    /**
     * 下次检测时间
     */
    private Date nextCheckTime;
    /**
     * 负责人
     */
    private String leadPerson;
    /**
     * 负责人联系方式
     */
    private String leadPersonConduct;
    /**
     * 单位ID
     */
    private Long unitId;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 三维地图使用的ID
     */
    private Long mapId;
    /**
     * 附件统一编码
     */
    private String unifiedCode;
    /**
     * 材质
     */
    private String texture;
    /**
     * 投入时间
     */
    private Date useDate;
    /**
     * 介绍
     */
    private String introduce;
    /**
     * 设计规范
     */
    private String designRule;
    /**
     * 使用状态（0.未使用 1.使用）
     */
    private Integer useStatus;
    /**
     * 工艺稳定性
     */
    private String processStability;
    /**
     * 所在位置
     */
    private String siteCode;
    /**
     * 设备类型 2：特种设备 1:公辅工程 3:生产设备
     */
    private Integer equipType;
    /**
     * 长度
     */
    private Double equipLength;
    /**
     * 设备直径
     */
    private Double equipDia;
    /**
     * 占地面积
     */
    private Double equipArea;
    /**
     * 设备容积
     */
    private Double equipPlot;
    /**
     * 温度最小值
     */
    private Double temperatureMin;
    /**
     * 温度最大值
     */
    private Double temperatureMax;
    /**
     * 大气压最小值
     */
    private Double pressureMin;
    /**
     * 大气压最大值
     */
    private Double pressureMax;
    /**
     * 是否特种装备标识
     */
    private Integer isSpecialFlg;
    /**
     * 特种设备类型
     */
    private Integer specialType;

    private Integer cycle;
    /**
     * 设计单位
     */
    private String designUnit;
    /**
     * 操作压力
     */
    private String operatingPressure;

    /**
     * 损伤因素
     */
    private String damageFactors;
    /**
     * 腐蚀程度
     */
    private String corrosionDegree;
    /**
     *介质
     */
    private String medium;
    /**
     * 维修周期
     */
    private Integer repairCycle;

    /**
     * 关联环评项目
     */
    private Long eiaProject;

}
