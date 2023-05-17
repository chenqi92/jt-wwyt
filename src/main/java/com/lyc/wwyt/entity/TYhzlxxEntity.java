package com.lyc.wwyt.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lyc.wwyt.config.check.EnumValueConstraint;
import com.lyc.wwyt.enums.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 隐患治理信息表(t_yhzlxx)表实体类
 *
 * @author chenqi
 * @since 2023-05-16 16:33:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "隐患治理信息表", name = "t_yhzlxx")
@TableName("t_yhzlxx")
public class TYhzlxxEntity extends BaseEntity {

    private static final long serialVersionUID = 663582297203388073L;

    @TableId(value = "id")
    @NotBlank(message = "主键不能为空!")
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    @Schema(description = "主键UUID(32位或者36位字符)", name = "id", implementation = String.class, minLength = 32, maxLength = 36)
    private String id;

    @Schema(description = "统一社会信用代码", name = "tyshxydm", implementation = String.class, maxLength = 18)
    @NotBlank(message = "统一社会信用代码不能为空!")
    @Size(min = 18, max = 18, message = "统一社会信用代码为18位数字字母混合字符串!")
    private String tyshxydm;

    @Schema(description = "隐患名称", name = "dangerName", implementation = String.class, maxLength = 300)
    @NotBlank(message = "隐患名称不能为空!")
    @Size(max = 300, message = "隐患名称不能超过300个字符(1个汉字记两个字符)!")
    private String dangerName;

    @Schema(description = "风险分析对象编码（危险源编码）", name = "hazardCode", implementation = String.class, maxLength = 36)
    @Size(max = 36, message = "风险分析对象编码（危险源编码）不能超过36个字符(1个汉字记两个字符)!")
    private String hazardCode;

    @Schema(description = "管控措施ID", name = "riskMeasureId", implementation = String.class, maxLength = 36)
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    private String riskMeasureId;

    @Schema(description = "隐患排查记录ID", name = "recordId", implementation = String.class, maxLength = 36)
    @Pattern(regexp = "^(.{32}|.{36})$", message = "长度必须是32位或者36位的字符!")
    private String recordId;

    @Schema(description = "隐患等级（一般隐患：0；重大隐患：1）", name = "dangerLevel", implementation = Integer.class)
    @EnumValueConstraint(enumClass = DangerLevelEnum.class)
    private Integer dangerLevel;

    @Schema(description = "登记时间", name = "registTime", implementation = LocalDateTime.class)
    @NotNull(message = "登记时间不能为空")
    private LocalDateTime registTime;

    @Schema(description = "登记人姓名", name = "registrant", implementation = String.class, maxLength = 100)
    @NotBlank(message = "登记人姓名不能为空!")
    @Size(max = 100, message = "登记人姓名不能超过100个字符(1个汉字记两个字符)!")
    private String registrant;

    @Schema(description = "隐患来源（检查来源分类）", name = "dangerSrc", implementation = String.class, maxLength = 4)
    @EnumValueConstraint(enumClass = DangerSrcEnum.class)
    private String dangerSrc;

    @Schema(description = "治理类型（即查即改：0、限期整改：1）", name = "dangerManageType", implementation = Integer.class)
    @EnumValueConstraint(enumClass = DangerManageTypeEnum.class)
    private Integer dangerManageType;

    @Schema(description = "隐患类型（安全：1；工艺：2；电气：3；仪表：4；消防：5；总图：6；设备：7；其他：8）", name = "hazardDangerType", implementation = Integer.class)
    @EnumValueConstraint(enumClass = HazardDangerTypeEnum.class)
    private Integer hazardDangerType;

    @Schema(description = "隐患描述", name = "dangerDesc", implementation = String.class)
    @NotNull(message = "隐患描述不能为空")
    private String dangerDesc;

    @Schema(description = "原因分析", name = "dangerReason", implementation = String.class)
    private String dangerReason;

    @Schema(description = "控制措施", name = "controlMeasures", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "控制措施不能超过1000个字符(1个汉字记两个字符)!")
    private String controlMeasures;

    @Schema(description = "整改资金", name = "cost", implementation = String.class, maxLength = 100)
    @Size(max = 100, message = "整改资金不能超过100个字符(1个汉字记两个字符)!")
    private String cost;

    @Schema(description = "整改责任人", name = "liablePerson", implementation = String.class, maxLength = 100)
    @NotBlank(message = "整改责任人不能为空!")
    @Size(max = 100, message = "整改责任人不能超过100个字符(1个汉字记两个字符)!")
    private String liablePerson;

    @Schema(description = "隐患治理期限", name = "dangerManageDeadline", implementation = LocalDate.class)
    @NotNull(message = "隐患治理期限不能为空")
    private LocalDate dangerManageDeadline;

    @Schema(description = "验收人姓名", name = "checkAcceptPerson", implementation = String.class, maxLength = 50)
    @NotBlank(message = "验收人姓名不能为空!")
    @Size(max = 50, message = "验收人姓名不能超过50个字符(1个汉字记两个字符)!")
    private String checkAcceptPerson;

    @Schema(description = "验收时间", name = "checkAcceptTime", implementation = LocalDate.class)
    @NotNull(message = "验收时间不能为空")
    private LocalDate checkAcceptTime;

    @Schema(description = "验收情况描述", name = "checkAcceptComment", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "验收情况描述不能超过1000个字符(1个汉字记两个字符)!")
    private String checkAcceptComment;

    @Schema(description = "隐患状态（整改中：0；待验收：1；已验收：9）", name = "dangerState", implementation = Integer.class)
    @EnumValueConstraint(enumClass = DangerStateEnum.class)
    private Integer dangerState;

    @Schema(description = "人物管理分类（1：人的不安全行为；2：物的不安全状态；3：管理上的缺陷）", name = "managementClassification", implementation = Integer.class)
    @EnumValueConstraint(enumClass = ManagementClassificationEnum.class)
    private Integer managementClassification;

    @Schema(description = "发生环节", name = "occurrenceLink", implementation = Integer.class)
    @EnumValueConstraint(enumClass = OccurrenceLinkEnum.class)
    private Integer occurrenceLink;

    @Schema(description = "隐患照片(base64 编码)", name = "attachments1", implementation = Object.class)
    @Pattern(regexp = "^data:image/(?:png|jpeg|jpg);base64,([a-zA-Z0-9+/]{4})*([a-zA-Z0-9+/]{2}==|[a-zA-Z0-9+/]{3}=|[a-zA-Z0-9+/]{4})$", message = "图片格式必须为png或者jpg!")
    @Size(max = 7340032, message = "图片大小不能大于5M!")
    private Object attachments1;

    @Schema(description = "隐患整改照片(base64 编码)", name = "attachments2", implementation = Object.class)
    @Pattern(regexp = "^data:image/(?:png|jpeg|jpg);base64,([a-zA-Z0-9+/]{4})*([a-zA-Z0-9+/]{2}==|[a-zA-Z0-9+/]{3}=|[a-zA-Z0-9+/]{4})$", message = "图片格式必须为png或者jpg!")
    @Size(max = 7340032, message = "图片大小不能大于5M!")
    private Object attachments2;

    @Schema(description = "附件", name = "fj", implementation = String.class, maxLength = 1000)
    @Size(max = 1000, message = "附件不能超过1000个字符(1个汉字记两个字符)!")
    private String fj;

    @Schema(description = "企业编码", name = "companyCode", implementation = String.class, maxLength = 9)
    @NotBlank(message = "企业编码不能为空!")
    @Pattern(regexp = "^\\d{9}$", message = "企业编码为小于9位的数字字符串!")
    private String companyCode;

}
