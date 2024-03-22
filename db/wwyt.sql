SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_aqfxfxdy
-- ----------------------------
DROP TABLE IF EXISTS `t_aqfxfxdy`;
CREATE TABLE `t_aqfxfxdy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险单元ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `HAZARD_CODE` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险分析对象编码（重大危险源）',
  `HAZARD_CODE1` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险分析对象编码（非重大危险源）',
  `HAZARD_DEP` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '责任部门',
  `HAZARD_LIABLE_PERSON` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '责任人',
  `RISK_UNIT_NAME` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险分析单元名称',
  `RISK_CLASS` tinyint(1) NOT NULL COMMENT '风险等级',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '安全风险分析单元表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_aqfxgkcs
-- ----------------------------
DROP TABLE IF EXISTS `t_aqfxgkcs`;
CREATE TABLE `t_aqfxgkcs`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管控措施ID',
  `RISK_EVENT_ID` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险事件ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `DATA_SRC` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管控方式',
  `RISK_MEASURE_DESC` varchar(4000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管控措施描述',
  `CLASSIFY1` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管控措施分类1',
  `CLASSIFY2` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管控措施分类2',
  `CLASSIFY3` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管控措施分类3',
  `TROUBLESHOOT_CONTENT` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患排查内容',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '安全风险管控措施表结构' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_aqfxsj
-- ----------------------------
DROP TABLE IF EXISTS `t_aqfxsj`;
CREATE TABLE `t_aqfxsj`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险事件ID',
  `RISK_UNIT_ID` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险单元ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `RISK_EVENT_NAME` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险事件名称',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '安全风险事件表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_aqhdjl
-- ----------------------------
DROP TABLE IF EXISTS `t_aqhdjl`;
CREATE TABLE `t_aqhdjl`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '活动名称',
  `DEPARTMENT_ID` bigint(8) NOT NULL COMMENT '召集部门',
  `LOCATION` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '地点',
  `TIME` datetime(0) NOT NULL COMMENT '活动时间',
  `CONVENER` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '召集人',
  `LEVEL` tinyint(1) NOT NULL COMMENT '活动级别',
  `CONTENT` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '活动内容',
  `MEMBER` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '参加人员',
  `STATE` tinyint(1) NOT NULL COMMENT '状态',
  `RESOURCE` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '活动照片、视频',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '安全活动记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_aqhdxx
-- ----------------------------
DROP TABLE IF EXISTS `t_aqhdxx`;
CREATE TABLE `t_aqhdxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `HDBT` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '活动标题',
  `HDRQ` date NOT NULL COMMENT '活动日期',
  `HDDD` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '活动地点',
  `HDZCR` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '活动主持人',
  `ZBBM` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主办部门',
  `ZYCYRY` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主要参与人员',
  `SFFB` tinyint(2) NOT NULL COMMENT '是否发布',
  `HDNR` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '活动内容',
  `HDQKYZJ` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '活动情况与总结',
  `FJ` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '安全活动信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_aqjcjl
-- ----------------------------
DROP TABLE IF EXISTS `t_aqjcjl`;
CREATE TABLE `t_aqjcjl`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全检查记录ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `JCBT` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查标题',
  `JCDBH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查单编号',
  `JCR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '记录人员',
  `JCRQ` date NOT NULL COMMENT '检查日期',
  `JCZCY` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查组成员',
  `SJDX` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '受检对象',
  `JCLX` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查类型',
  `JCXM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查项目',
  `JCNR` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查内容',
  `JCJL` char(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查结论',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '安全检查记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_aqpxjcjl
-- ----------------------------
DROP TABLE IF EXISTS `t_aqpxjcjl`;
CREATE TABLE `t_aqpxjcjl`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `CONTENT` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '奖惩内容',
  `DATE` date NOT NULL COMMENT '奖惩日期',
  `FEE` bigint(10) NOT NULL COMMENT '奖惩费用',
  `BASIS` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '奖惩依据',
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '被奖惩者名称',
  `TYPE` tinyint(1) NOT NULL COMMENT '奖惩类型',
  `OPERATOR_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '审批人',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '安全培训奖惩记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_aqsczrclkxx
-- ----------------------------
DROP TABLE IF EXISTS `t_aqsczrclkxx`;
CREATE TABLE `t_aqsczrclkxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '承诺卡ID',
  `TYSHXYDM` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `CNR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '承诺人',
  `ZGLD` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主管领导',
  `GWMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '岗位名称',
  `CNSX` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '承诺事项',
  `CNRQ` date NOT NULL COMMENT '承诺日期',
  `FJ` mediumblob NOT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '安全生产责任承诺卡信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_bjxxglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_bjxxglxx`;
CREATE TABLE `t_bjxxglxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `BJQYBH` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报警区域id',
  `BJRYXM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报警人员姓名',
  `BJRYWZJD` decimal(10, 6) NOT NULL COMMENT '报警人员位置经度（度）',
  `BJRYWZWD` decimal(10, 6) NOT NULL COMMENT '报警人员位置纬度（度）',
  `BJSJ` datetime(0) NOT NULL COMMENT '报警时间',
  `BJLX` enum('1','2','3','4','5','6') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报警类型',
  `BJCZSJ` datetime(0) NULL DEFAULT NULL COMMENT '报警处置时间',
  `BJCZRY` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '报警处置人员',
  `BJCZJG` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '报警处置结果',
  `BJJL` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '告警记录',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '报警信息管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_bqkzglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_bqkzglxx`;
CREATE TABLE `t_bqkzglxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `JZBM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '基站编码',
  `DLFZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '电量阈值',
  `ZHJRSJ` datetime(0) NOT NULL COMMENT '最后进入时间',
  `ZHCQSJ` datetime(0) NOT NULL COMMENT '最后出去时间',
  `ZHDQFJBH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后读取的房间编号',
  `BQBM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '标签编码',
  `SYDXBM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '使用对象编号',
  `SYZT` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '使用状态',
  `BQLX` enum('1','2','3','4','5','6') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标签类型',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '标签扩展管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cbsglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_cbsglxx`;
CREATE TABLE `t_cbsglxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `CBSDWMC` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商单位名称',
  `DWXZ` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '单位性质',
  `CBSLB` tinyint(2) NOT NULL COMMENT '承包商类别',
  `CBSLX` tinyint(2) NOT NULL COMMENT '承包商类型',
  `JYFW` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '经营范围',
  `CBSDH` char(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商电话',
  `YX` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '邮箱',
  `CBSTYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商统一社会信用代码',
  `YYZZZH` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '营业执照字号',
  `SFZHMD` tinyint(1) NOT NULL COMMENT '是否在黑名单',
  `XYFJMC` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '协议附件名称',
  `XYFJMCFJ` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '协议附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '承包商管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cbspdglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_cbspdglxx`;
CREATE TABLE `t_cbspdglxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `BT` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '标题',
  `BKHCBS` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商ID',
  `KHBM` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '考核部门',
  `KHRQ` date NOT NULL COMMENT '考核日期',
  `ZF` bigint(10) NOT NULL COMMENT '总分',
  `KHJG` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '考核结果',
  `SPQLB` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '审批前类别',
  `SPRDLB` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '审批认定类别',
  `CBSSZCQ` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商所在厂区',
  `CBSZCZT` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商在厂状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '承包商评定管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cbssgglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_cbssgglxx`;
CREATE TABLE `t_cbssgglxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `SSCBS` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商ID',
  `SGDWYYDJ` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '施工队伍营业等级',
  `ZRSQDRQ` date NOT NULL COMMENT '责任书签订日期',
  `ZRSDQRQ` date NOT NULL COMMENT '责任书到期日期',
  `TZSBAZXKZ` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '特种设备安装许可证',
  `SGDWFZR` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '施工队伍负责人',
  `SGDWFZRLXDH` char(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '施工队负责人联系电话',
  `SGDWFZRSFZ` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '施工队伍负责人身份证',
  `AQFZR` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '安全负责人',
  `AQFZRLXDH` char(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '安全负责人联系电话',
  `AQFZRSFZ` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '安全负责人身份证',
  `JCRQ` date NOT NULL COMMENT '进厂日期',
  `KHRZ` date NOT NULL COMMENT '考核日期',
  `SGDWJJ` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '施工单位简介',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '承包商施工管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cbswzjlxx
-- ----------------------------
DROP TABLE IF EXISTS `t_cbswzjlxx`;
CREATE TABLE `t_cbswzjlxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `SSCBS` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商ID',
  `XMMC` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '项目名称',
  `WZRQ` date NOT NULL COMMENT '违章日期',
  `CLJG` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '处理结果',
  `WZRXM` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '违章人姓名',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '承包商违章记录信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cbsxgzs
-- ----------------------------
DROP TABLE IF EXISTS `t_cbsxgzs`;
CREATE TABLE `t_cbsxgzs`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `SSCBS` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商ID',
  `NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '资质证书名称',
  `LEVEL` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '级别',
  `CONTENT` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '许可内容',
  `START_TIME` datetime(0) NOT NULL COMMENT '许可有效期始',
  `DUE_TIME` datetime(0) NOT NULL COMMENT '许可有效期止',
  `APPENDIX` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '上传附件',
  `NO` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '资质证书编号',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '承包商相关证书表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cbszysc
-- ----------------------------
DROP TABLE IF EXISTS `t_cbszysc`;
CREATE TABLE `t_cbszysc`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `CONTRACTOR_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商名称',
  `JOB_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '作业名称',
  `CONTENT` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '作业规程内容',
  `PROBLEM_ANALYSIS` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '存在问题分析',
  `IMPROVEMENTS` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '改进意见',
  `RECTIFICATION_TIME` datetime(0) NOT NULL COMMENT '整改时间',
  `ASSESSOR` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '评审人员',
  `REVIEW_TIME` datetime(0) NOT NULL COMMENT '评审时间',
  `APPENDIX` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '承包商安全作业规程审查表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cbszyyjyasc
-- ----------------------------
DROP TABLE IF EXISTS `t_cbszyyjyasc`;
CREATE TABLE `t_cbszyyjyasc`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `CONTRACTOR_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '承包商名称',
  `JOB_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '作业名称',
  `CONTENT` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '作业规程内容',
  `PROBLEM_ANALYSIS` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '存在问题分析',
  `IMPROVEMENTS` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '改进意见',
  `RECTIFICATION_TIME` datetime(0) NOT NULL COMMENT '整改时间',
  `ASSESSOR` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '评审人员',
  `REVIEW_TIME` datetime(0) NOT NULL COMMENT '评审时间',
  `APPENDIX` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '承包商作业应急预案审查表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cgqxx
-- ----------------------------
DROP TABLE IF EXISTS `t_cgqxx`;
CREATE TABLE `t_cgqxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `CGQMC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '储罐区名称',
  `ZCQDWZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '在厂区的位置',
  `SCHJGNQ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所处环境功能区',
  `CGQMJ` decimal(5, 1) NOT NULL COMMENT '储罐区面积',
  `YWWY` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '有无围堰',
  `WYSWMJ` decimal(5, 1) NULL DEFAULT NULL COMMENT '围堰所围面积',
  `CGGS` smallint(5) NOT NULL COMMENT '储罐个数',
  `CCWZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '储存物质',
  `CGQZRL` decimal(5, 1) NOT NULL COMMENT '储罐区总容积',
  `CGCCL` decimal(5, 1) NOT NULL COMMENT '常规储存量',
  `LGJZXJJ` decimal(5, 1) NOT NULL COMMENT '两罐间最小间距',
  `YWXFTD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '有无消防通道',
  `ZXFS` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装卸方式',
  `ZXWXHXPZL` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装卸危险化学品种类',
  `SSWXHXPZDWXY` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属危险化学品重大危险源单元',
  `XCZP` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '现场照片',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` tinyint(14) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` tinyint(14) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cgxx
-- ----------------------------
DROP TABLE IF EXISTS `t_cgxx`;
CREATE TABLE `t_cgxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `CGMC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '储罐名称',
  `SSGQHZZ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属罐区或装置',
  `SSWXHXPZDWXYDY` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属危险化学品重大危险源单元',
  `CGWH` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '储罐编号',
  `CGMJ` decimal(5, 1) NOT NULL COMMENT '储罐容积',
  `CGXS` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '储罐形式',
  `CGJG` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '储罐结构',
  `CGWZFL` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '储罐位置分类',
  `CCJZ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '存储介质',
  `WXHWBH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '危险货物编号',
  `WZZT` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '物质状态',
  `WZLB` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '物质类别',
  `SJCL` decimal(5, 1) NOT NULL COMMENT '设计储量',
  `SJYL` decimal(5, 1) NOT NULL COMMENT '设计压力',
  `CZYLSX` decimal(5, 1) NOT NULL COMMENT '操作压力上限',
  `CZWDSX` decimal(5, 1) NOT NULL COMMENT '操作温度上限',
  `SJCZYL` decimal(5, 1) NOT NULL COMMENT '实际操作压力',
  `SJCZWD` decimal(5, 1) NOT NULL COMMENT '实际操作温度',
  `GZWDQJ` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '工作温度区间',
  `SJYWGD` decimal(5, 1) NOT NULL COMMENT '设计液位高度',
  `TCRQ` tinyint(8) NOT NULL COMMENT '投产日期',
  `JCLFS` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '进出料方式',
  `YWWY` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '有无围堰',
  `WYSWMJ` decimal(5, 1) NULL DEFAULT NULL COMMENT '围堰所围面积',
  `XCZP` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '现场照片',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` tinyint(14) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` tinyint(14) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_ckqxx
-- ----------------------------
DROP TABLE IF EXISTS `t_ckqxx`;
CREATE TABLE `t_ckqxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `KQBH` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '库区编号',
  `KQMC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '库区名称',
  `ZCQDWZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '在厂区的位置',
  `SCHJGNQ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所处环境功能区',
  `KQMJ` tinyint(2) NOT NULL COMMENT '库区面积',
  `KFGS` tinyint(2) NOT NULL COMMENT '库房个数',
  `XLKFZXJJ` smallint(5) NULL DEFAULT NULL COMMENT '相邻库房最小间距',
  `SSWHPZDWXYBM` char(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属危险化学品重大危险源编码',
  `XCZP` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '现场照片',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` tinyint(14) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` tinyint(14) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_cod_supply
-- ----------------------------
DROP TABLE IF EXISTS `t_cod_supply`;
CREATE TABLE `t_cod_supply`  (
  `dataID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据主键ID',
  `code` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编码',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `parentcode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父级编码',
  `pinyin` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拼音',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `fullCode` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '全编码',
  `fullName` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '全名称',
  `enumName` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '枚举名',
  `color` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '颜色',
  `statuscode` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态',
  `ix` int(11) NOT NULL COMMENT '排序',
  `rem` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `createrID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `createTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updaterID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `updateTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `sjzt` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据状态',
  PRIMARY KEY (`dataID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '【字典】应急物资分类与编码(GB/T 38565-2020)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dhzy
-- ----------------------------
DROP TABLE IF EXISTS `t_dhzy`;
CREATE TABLE `t_dhzy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `zynr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业内容',
  `zywz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业位置',
  `dhzyjb` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '动火作业级别',
  `dhfs` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '动火方式',
  `zyryxx` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作业人员信息',
  `zydwlx` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '删除标识',
  `companyCode` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '动火作业信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dhzy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_dhzy_aqcs`;
CREATE TABLE `t_dhzy_aqcs`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `xh` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全措施内容',
  `sfsj` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '动火作业安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dhzy_qtfx
-- ----------------------------
DROP TABLE IF EXISTS `t_dhzy_qtfx`;
CREATE TABLE `t_dhzy_qtfx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','6') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `qtlx` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '气体类型',
  `qtmc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '代表性气体名称',
  `fxjg` decimal(4, 2) NOT NULL COMMENT '分析结果',
  `jgdw` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分析结果单位',
  `fxr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分析人',
  `fxsj` datetime(0) NOT NULL COMMENT '分析时间',
  `cyfxbw` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '采样分析部位',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '动火作业气体分析数据表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dhzy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_dhzy_splz`;
CREATE TABLE `t_dhzy_splz`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` datetime(0) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '动火作业作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dict
-- ----------------------------
DROP TABLE IF EXISTS `t_dict`;
CREATE TABLE `t_dict`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典名称',
  `type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典类型',
  `code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典码',
  `value` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典值',
  `order_num` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '排序',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `type`(`type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '五位一体_字典表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dlzy
-- ----------------------------
DROP TABLE IF EXISTS `t_dlzy`;
CREATE TABLE `t_dlzy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `dlyy` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '断路原因',
  `xgdwbm` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '涉及相关单位（部门）',
  `zydwlx` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `dlddsyt` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '断路地段示意图',
  `zyfwFs` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '相关说明',
  `bzrmc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '编制人名称',
  `bzsj` datetime(0) NULL DEFAULT NULL COMMENT '编制时间',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `companyCode` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '断路作业信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dlzy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_dlzy_aqcs`;
CREATE TABLE `t_dlzy_aqcs`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型 1，2，3，4，5，6，7，8',
  `xh` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号 01~99',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全措施内容',
  `sfsj` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及 0，1',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '断路作业安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dlzy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_dlzy_splz`;
CREATE TABLE `t_dlzy_splz`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型 1，2，3，4，5，6，7，8',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` datetime(0) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '断路作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dtzy
-- ----------------------------
DROP TABLE IF EXISTS `t_dtzy`;
CREATE TABLE `t_dtzy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `zynr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业内容',
  `zywz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业位置',
  `zydwlx` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `zyfwFs` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作业范围、方式',
  `zyjt` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '作业简图',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `companyCode` decimal(9, 0) NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '动土作业信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dtzy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_dtzy_aqcs`;
CREATE TABLE `t_dtzy_aqcs`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型 1，2，3，4，5，6，7，8',
  `xh` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号 01~99',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全措施内容',
  `sfsj` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及 0，1',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '动土作业安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dtzy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_dtzy_splz`;
CREATE TABLE `t_dtzy_splz`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型 1，2，3，4，5，6，7，8',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` datetime(0) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '动土作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dwjcxx
-- ----------------------------
DROP TABLE IF EXISTS `t_dwjcxx`;
CREATE TABLE `t_dwjcxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `RWMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '任务名称',
  `XJR` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检人',
  `SZGW` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在岗位',
  `SZBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在部门',
  `JCPC` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检频次',
  `XJSCQY` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检生产区域',
  `XJSBSS` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检设备设施',
  `XJDWBH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检点位编号',
  `XJSJ` datetime(0) NOT NULL COMMENT '巡检时间',
  `XJBZ` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检标准',
  `XJYHJB` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检隐患级别',
  `XJYHMS` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '巡检隐患描述',
  `XJYHZP` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '巡检隐患照片',
  `ZGR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '整改人',
  `HSSJ` datetime(0) NULL DEFAULT NULL COMMENT '核实时间',
  `HSJG` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '核实结果',
  `HSR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '核实人',
  `CZCS` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '处置措施',
  `CZSJ` datetime(0) NULL DEFAULT NULL COMMENT '处置时间',
  `CZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '处置人',
  `CZJG` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处置结果',
  `FCSJ` datetime(0) NOT NULL COMMENT '复查时间',
  `CHJG` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '复查结果',
  `CHR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '复查人',
  `BZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '点位检查信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dwjzglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_dwjzglxx`;
CREATE TABLE `t_dwjzglxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `JZBH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '基站编号',
  `JZMC` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '基站名称',
  `MS` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '定位基站管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dwszxx
-- ----------------------------
DROP TABLE IF EXISTS `t_dwszxx`;
CREATE TABLE `t_dwszxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `DWMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '点位名称',
  `SZBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在部门',
  `DWLX` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '点位类型',
  `DWBH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '点位编号',
  `BZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '点位设置信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dwxbglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_dwxbglxx`;
CREATE TABLE `t_dwxbglxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SZQY` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域id',
  `BQMZ` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标签名称',
  `XBBM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '信标编码',
  `DWXBLX` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '定位信标类型',
  `CRKBJ` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '出入口标记',
  `LC` decimal(2, 0) NOT NULL COMMENT '楼层',
  `GD` decimal(5, 0) NULL DEFAULT NULL COMMENT '高度',
  `WZMS` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '位置描述',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '定位信标管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dzzy
-- ----------------------------
DROP TABLE IF EXISTS `t_dzzy`;
CREATE TABLE `t_dzzy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `zynr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业内容',
  `zywz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业位置',
  `djmc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '吊具名称',
  `dwzl` decimal(4, 0) NOT NULL COMMENT '吊物质量（t）',
  `zyjb` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业级别',
  `zyryxx` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作业人员信息',
  `ssr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '司索人',
  `dzzhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '吊装指挥人',
  `zydwlx` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `companyCode` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '吊装作业信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dzzy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_dzzy_aqcs`;
CREATE TABLE `t_dzzy_aqcs`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `xh` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全措施内容',
  `sfsj` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '吊装作业安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dzzy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_dzzy_splz`;
CREATE TABLE `t_dzzy_splz`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` datetime(0) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '吊装作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_fxsstxx
-- ----------------------------
DROP TABLE IF EXISTS `t_fxsstxx`;
CREATE TABLE `t_fxsstxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险四色图ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `FXFQBM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险分区编号',
  `FXFQMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险分区名称',
  `FXDJ` char(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险等级',
  `FXZBFW` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险坐标范围',
  `GYFXDJ` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '固有风险等级',
  `KZFXDJ` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '控制风险等级',
  `FXJZYS` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险校正因素',
  `FXJZDJ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险校正等级',
  `SZBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在部门',
  `ZRR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '评价人',
  `FPRQ` date NULL DEFAULT NULL COMMENT '复评日期',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` int(9) NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '风险四色图信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_gczy
-- ----------------------------
DROP TABLE IF EXISTS `t_gczy`;
CREATE TABLE `t_gczy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `zynr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业内容',
  `zywz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业位置',
  `zygd` decimal(3, 0) NOT NULL COMMENT '作业高度（米）',
  `zyjb` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业级别',
  `zyryxx` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作业人员信息',
  `zydwlx` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `companyCode` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '高处作业信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_gczy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_gczy_aqcs`;
CREATE TABLE `t_gczy_aqcs`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `xh` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全措施内容',
  `sfsj` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '高处作业信息安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_gczy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_gczy_splz`;
CREATE TABLE `t_gczy_splz`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` datetime(0) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '高处作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_gjzzzdbwxx
-- ----------------------------
DROP TABLE IF EXISTS `t_gjzzzdbwxx`;
CREATE TABLE `t_gjzzzdbwxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `ZZBWMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置/部位名称',
  `SSBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属部门',
  `JTWZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '具体位置',
  `FZRXM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人姓名',
  `LXR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '联系人',
  `LRR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '录入人',
  `ZRR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '责任人',
  `ZZBWFL` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置部位分类',
  `JCZQ` decimal(10, 0) NOT NULL COMMENT '检查周期',
  `XGYJYA` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '相关应急预案',
  `ZYWXYHYS` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主要危险有害因素',
  `YDZFX` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '易导致风险',
  `YJCZCS` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '应急处置措施',
  `XCZP` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '现场照片',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `BZ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '关键装置重点部位信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_gysglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_gysglxx`;
CREATE TABLE `t_gysglxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `GYSGSMC` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '供应商公司名称',
  `GYSLX` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '供应商类型',
  `GSDZ` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '公司地址',
  `LXR` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '联系人',
  `LXDH` char(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '联系电话',
  `GYSFXPJ` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '供应商风险评级',
  `GYSLB` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '供应商类别',
  `YZBM` char(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '邮政编码',
  `JYFW` varchar(2000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '经营范围',
  `GSMS` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '公司描述',
  `KHRQ` date NOT NULL COMMENT '考核日期',
  `ZF` bigint(11) NOT NULL COMMENT '总分',
  `KHJG` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '考核结果',
  `ZSMC` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证书名称',
  `ZSBH` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证书编号',
  `SFYYXQ` tinyint(1) NOT NULL COMMENT '是否有有效期',
  `QZRQ` date NOT NULL COMMENT '取证日期',
  `DQRQ` date NOT NULL COMMENT '到期日期',
  `BT` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '标题',
  `KHBM` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '考核部门',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '供应商管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jcbwhxx
-- ----------------------------
DROP TABLE IF EXISTS `t_jcbwhxx`;
CREATE TABLE `t_jcbwhxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全检查项ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `JCLX` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查类型',
  `JCXM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查项目',
  `JCFS` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查方式',
  `JCNR` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查内容',
  `JCYJ` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查依据',
  `BZ` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '安全检查表维护信息表结构' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jcpcsdxx
-- ----------------------------
DROP TABLE IF EXISTS `t_jcpcsdxx`;
CREATE TABLE `t_jcpcsdxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `XM` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `SZBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在部门',
  `GW` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '岗位',
  `JCXM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查项目',
  `JCPC` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查频次',
  `JCCS` decimal(10, 0) NOT NULL COMMENT '检查次数',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '检查频次设定信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_kfxx
-- ----------------------------
DROP TABLE IF EXISTS `t_kfxx`;
CREATE TABLE `t_kfxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `KQBH` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '库区编号',
  `KQMC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '库区名称',
  `ZCQDWZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '在厂区的位置',
  `SCHJGNQ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所处环境功能区',
  `KQMJ` tinyint(2) NOT NULL COMMENT '库区面积',
  `KFGS` tinyint(2) NOT NULL COMMENT '库房个数',
  `XLKFZXJJ` smallint(5) NULL DEFAULT NULL COMMENT '相邻库房最小间距',
  `SSWHPZDWXYBM` char(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属危险化学品重大危险源编码',
  `XCZP` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '现场照片',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` tinyint(14) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` tinyint(14) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_log
-- ----------------------------
DROP TABLE IF EXISTS `t_log`;
CREATE TABLE `t_log`  (
  `id` bigint(64) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `type` char(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT '0' COMMENT '类型',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '方法注释',
  `service_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '服务id,用于部署多个服务时区分为哪个服务',
  `remote_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '请求ip',
  `user_agent` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户代理',
  `request_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '请求接口地址',
  `method` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '执行方法',
  `params` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '请求参数',
  `time` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '执行时间',
  `exception` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '异常说明',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `t_log_create_date`(`create_time`) USING BTREE,
  INDEX `t_log_request_uri`(`request_uri`) USING BTREE,
  INDEX `t_log_type`(`type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_lsydzy
-- ----------------------------
DROP TABLE IF EXISTS `t_lsydzy`;
CREATE TABLE `t_lsydzy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `zynr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业内容',
  `zywz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业位置',
  `jrdYdgl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '电源接入点及许可用电功率',
  `sbmEdgl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用电设备名称及额定功率',
  `gzdy` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '工作电压',
  `ydr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用电人',
  `zyryxx` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作业人员信息',
  `zydwlx` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `companyCode` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '临时用电信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_lsydzy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_lsydzy_aqcs`;
CREATE TABLE `t_lsydzy_aqcs`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `xh` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全措施内容',
  `sfsj` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '临时用电安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_lsydzy_qtfx
-- ----------------------------
DROP TABLE IF EXISTS `t_lsydzy_qtfx`;
CREATE TABLE `t_lsydzy_qtfx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `qtlx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '气体类型',
  `qtmc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '代表性气体名称',
  `fxjg` decimal(4, 2) NOT NULL COMMENT '分析结果',
  `jgdw` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分析结果单位',
  `fxr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分析人',
  `fxsj` tinyint(14) NOT NULL COMMENT '分析时间',
  `cyfxbw` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '采样分析部位',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '临时用电气体分析数据表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_lsydzy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_lsydzy_splz`;
CREATE TABLE `t_lsydzy_splz`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` tinyint(14) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '临时用电作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_mbcdzy
-- ----------------------------
DROP TABLE IF EXISTS `t_mbcdzy`;
CREATE TABLE `t_mbcdzy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `zylb` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业类别',
  `zywz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业位置',
  `gdjz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管道介质',
  `gdwd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管道温度',
  `gdyl` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管道压力',
  `mbcz` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '盲板材质',
  `mbgg` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '盲板规格',
  `zyryxx` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作业人员信息',
  `zydwlx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `mbwztbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '盲板位置图编号',
  `mbwzt` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '盲板位置图',
  `bzrmc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '编制人名称',
  `bzsj` datetime(0) NULL DEFAULT NULL COMMENT '编制时间',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `companyCode` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '盲板抽堵信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_mbcdzy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_mbcdzy_aqcs`;
CREATE TABLE `t_mbcdzy_aqcs`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `xh` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全措施内容',
  `sfsj` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '盲板抽堵安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_mbcdzy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_mbcdzy_splz`;
CREATE TABLE `t_mbcdzy_splz`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型 1，2，3，4，5，6，7，8',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` datetime(0) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '盲板抽堵作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_pxhdxx
-- ----------------------------
DROP TABLE IF EXISTS `t_pxhdxx`;
CREATE TABLE `t_pxhdxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `PXLB` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训类别',
  `PXXS` int(10) UNSIGNED NOT NULL COMMENT '培训学时',
  `PXRQ` date NOT NULL COMMENT '培训日期',
  `PXDW` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训单位',
  `PXJS` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训讲师',
  `PXJJ` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '培训简介',
  `CJRS` int(10) UNSIGNED NOT NULL COMMENT '参加人数',
  `JGFS` decimal(10, 2) NOT NULL COMMENT '及格分数',
  `PXDD` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训地点',
  `KHDW` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '考核单位',
  `PXFY` decimal(10, 2) NULL DEFAULT NULL COMMENT '培训费用',
  `CJRY` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '参加人员姓名',
  `QDB` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '签到表',
  `XCZP` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '现场照片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '培训活动信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_pxjg
-- ----------------------------
DROP TABLE IF EXISTS `t_pxjg`;
CREATE TABLE `t_pxjg`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID（32位或者36位字符）',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `THEME` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训主题',
  `ACTIVITY` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训活动',
  `MEMBER` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训人员',
  `RESULT` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训结果',
  `START_TIME` datetime(0) NOT NULL COMMENT '培训开始时间',
  `END_TIME` datetime(0) NOT NULL COMMENT '培训结束时间',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '培训结果表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_pxjhxx
-- ----------------------------
DROP TABLE IF EXISTS `t_pxjhxx`;
CREATE TABLE `t_pxjhxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `JJMC` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '计划名称',
  `ZDRQ` date NOT NULL COMMENT '制定日期',
  `JHSSRQ` date NOT NULL COMMENT '实施日期',
  `PXNR` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '培训内容',
  `BZR` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '编制人',
  `BZBM` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '编制部门',
  `FJ` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '附件',
  `ZRBM` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训部门',
  `ZRR` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训讲师',
  `WCRQ` date NOT NULL COMMENT '完成日期',
  `JHND` int(4) NOT NULL COMMENT '计划年度',
  `PXLX` char(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训类型',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '培训计划信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_pxjyxgpjjl
-- ----------------------------
DROP TABLE IF EXISTS `t_pxjyxgpjjl`;
CREATE TABLE `t_pxjyxgpjjl`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `EMPLOYEE_ID` char(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '员工ID',
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '员工姓名',
  `PLAN_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训计划名称',
  `SCORE` char(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '评估分数',
  `LEVEL` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '评估等级',
  `SUGGEST` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '改进建议',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '培训教育效果评价记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_pxzlxx
-- ----------------------------
DROP TABLE IF EXISTS `t_pxzlxx`;
CREATE TABLE `t_pxzlxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `ZLBT` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '资料标题',
  `SSLB` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '所属类别',
  `SCR` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '上传人',
  `SCRQ` datetime(0) NOT NULL COMMENT '上传日期',
  `GJZ` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '关键字',
  `WJLX` char(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '文件类型',
  `JCJJ` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '教程简介',
  `ZLFJ` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '资料附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '培训资料信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_qtsbssxx
-- ----------------------------
DROP TABLE IF EXISTS `t_qtsbssxx`;
CREATE TABLE `t_qtsbssxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `DJR` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '登记人',
  `DJRQ` tinyint(8) NOT NULL COMMENT '登记日期',
  `DJBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '登记部门',
  `SBMC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备名称',
  `SBWH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备位号',
  `SBLX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备类型',
  `SBZL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备种类',
  `SSBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属部门',
  `GD` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '工段',
  `SBZT` tinyint(2) NOT NULL COMMENT '设备状态',
  `SFBF` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否报废',
  `AZWZ` tinyint(8) NULL DEFAULT NULL COMMENT '安装位置',
  `GJXFL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关键性分类',
  `TZSB` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '特种设备',
  `SCRQ` tinyint(8) NOT NULL COMMENT '生产日期',
  `AZRQ` tinyint(8) NOT NULL COMMENT '安装日期',
  `TYRQ` tinyint(8) NOT NULL COMMENT '投用日期',
  `SYNX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '使用年限',
  `GDZCBH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '固定资产编号',
  `SBZL_1` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设备重量',
  `SCCJ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产厂家',
  `ANDW` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安装单位',
  `GGXH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '规格型号',
  `CCXH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '出厂序号',
  `SBTX` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设备特性',
  `SFXJ` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否巡检',
  `SFJC` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否检测',
  `create_time` tinyint(14) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` tinyint(14) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_qyfxfbxx
-- ----------------------------
DROP TABLE IF EXISTS `t_qyfxfbxx`;
CREATE TABLE `t_qyfxfbxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全风险空间分布图ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `IMG` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全风险空间分布图',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '企业安全风险分布信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_qyjcxx
-- ----------------------------
DROP TABLE IF EXISTS `t_qyjcxx`;
CREATE TABLE `t_qyjcxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `QYMC` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业名称',
  `XZQY` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '行政区划',
  `SZS1` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在省',
  `SZS2` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在市',
  `SZX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在县（市、区）',
  `SZXZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在乡镇（街道）',
  `SZC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所在村（社区）',
  `SZYQ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所在园区（开发区）',
  `GSZCDZ` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '工商注册地址',
  `SCJYDZ` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产经营地址',
  `YZBM` tinyint(6) UNSIGNED ZEROFILL NOT NULL COMMENT '邮政编码',
  `CLRQ` datetime(0) NOT NULL COMMENT '成立日期',
  `FDDBR` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '法定代表人',
  `QYGDDH` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业固定电话',
  `AQZBDH` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全值班电话',
  `DZYX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '电子邮箱',
  `LXQQH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系QQ号',
  `GFWZDZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '官方网站地址',
  `DWCZ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '单位传真',
  `ZYFZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主要负责人',
  `ZYFZRGDDH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主要负责人固定电话',
  `ZYFZRYDDH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主要负责人移动电话',
  `ZYFZRDZYX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主要负责人电子邮箱',
  `AQFZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全负责人',
  `AQFZRGDDH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全负责人固定电话',
  `AQFZRYDDH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全负责人移动电话',
  `AQFZRDZYX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全负责人电子邮箱',
  `JJLXDL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '经济类型大类',
  `JJLXXL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '经济类型小类',
  `HYLBML` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '行业类别门类',
  `HYLBDL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '行业类别大类',
  `HYLBZL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '行业类别中类',
  `HYLBXL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '行业类别小类',
  `HYJGDL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '行业监管大类',
  `HYJGXL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '行业监管小类',
  `ZXZLLB` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '专项治理类别',
  `SFWGYQY` tinyint(1) NULL DEFAULT NULL COMMENT '是否为国有企业',
  `LSGX` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '隶属关系',
  `JYFW` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '经营范围',
  `JYZT` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '经营状态',
  `ZCZJ` decimal(20, 4) NULL DEFAULT NULL COMMENT '注册资金（万元）',
  `ZDMJ` decimal(20, 4) NULL DEFAULT NULL COMMENT '占地面积（亩）',
  `CYRYSL` tinyint(8) NOT NULL COMMENT '从业人员数量',
  `TZZYRYSL` tinyint(8) NOT NULL COMMENT '特种作业人员数量',
  `ZZAQSCGLRY` tinyint(8) NOT NULL COMMENT '专职安全生产管理人员数量',
  `JZAQSCGLRY` tinyint(8) NOT NULL COMMENT '兼职安全生产管理人员数量',
  `ZZYJGLRY` tinyint(8) NOT NULL COMMENT '专职应急管理人员数量',
  `ZCAQGCSRS` tinyint(8) NOT NULL COMMENT '注册安全工程师人员数量',
  `SFYZMAQJG` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否有专门安全机构',
  `AQGLJGMC` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全管理机构名称',
  `AQGLJGZZ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全管理机构职责',
  `AAGLJGCYSL` tinyint(8) NULL DEFAULT NULL COMMENT '安全管理机构成员数量',
  `SFYZZAQRY` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否有专职安全人员',
  `GMQK` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '规模情况',
  `GYGM` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业规模',
  `SFYMGS` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否有母公司',
  `MGSMC` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '母公司名称',
  `JTGSMC` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '集团公司名称',
  `BZHDJ` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全标准化等级',
  `BZHZSYXQQSRQ` datetime(0) NULL DEFAULT NULL COMMENT '标准化证书有效期起始日期',
  `BZHZSYXQZZRQ` datetime(0) NULL DEFAULT NULL COMMENT '标准化证书有效期终止日期',
  `AQJGDJ` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全监管等级',
  `SFCZZDWXY` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否构成重大危险源',
  `ZDWXYZGDJ` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '重大危险源最高等级',
  `QYPMT` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '企业平面图',
  `QYYYZZ` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '企业营业执照',
  `QYZP` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '企业照片',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `BZ` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '企业基础信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_qyqyryxx
-- ----------------------------
DROP TABLE IF EXISTS `t_qyqyryxx`;
CREATE TABLE `t_qyqyryxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `regionType` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域类型',
  `regionName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域名称',
  `sstId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '四色图区域id',
  `sstfxdj` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险等级',
  `sstqymc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '四色图区域名称',
  `zjhm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份证号码',
  `ryxm` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '人员姓名',
  `ssdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属单位',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  `company_code` int(9) NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '人员在岗在位信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_qyqyryxx_location
-- ----------------------------
DROP TABLE IF EXISTS `t_qyqyryxx_location`;
CREATE TABLE `t_qyqyryxx_location`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sst_id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '空间分布图id',
  `x` double(7, 2) NULL DEFAULT NULL COMMENT '所在位置x点',
  `y` double(7, 2) NULL DEFAULT NULL COMMENT '所在位置y点',
  `floor` int(255) NULL DEFAULT 1 COMMENT '所在楼层',
  `del_flg` tinyint(2) NOT NULL DEFAULT 0 COMMENT '0：正常\r\n            1：逻辑删除',
  `create_id` bigint(20) NOT NULL COMMENT '创建人id',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_id` bigint(20) NOT NULL COMMENT '更新人id',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_qyryxx
-- ----------------------------
DROP TABLE IF EXISTS `t_qyryxx`;
CREATE TABLE `t_qyryxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `xm` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `xb` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '性别',
  `rylx` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '人员类型',
  `mz` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '民族',
  `zgxl` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '最高学历',
  `zy` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '专业',
  `gzjl` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经历',
  `zhbyyx` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '最后毕业院校',
  `zjlx` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '证件类型',
  `zjhm` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '证件号码',
  `jrbdwrq` date NULL DEFAULT NULL COMMENT '进入本单位日期',
  `bz` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `company_code` varchar(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '企业人员信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_qzpxda
-- ----------------------------
DROP TABLE IF EXISTS `t_qzpxda`;
CREATE TABLE `t_qzpxda`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '姓名',
  `POST` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '职务',
  `CERTIFICATE_TYPE` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证书类型',
  `ISSUING_AUTHORITY` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '发证机关',
  `DESCRIBE` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '证书描述',
  `FILE` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证书文件附件',
  `CERTIFICATE_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证书名称',
  `CERTIFICATE_NO` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证书编号',
  `VALIDATE` datetime(0) NOT NULL COMMENT '有效期',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '取证培训档案表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_rypxxx
-- ----------------------------
DROP TABLE IF EXISTS `t_rypxxx`;
CREATE TABLE `t_rypxxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `ZSMC` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证书名称',
  `ZSBH` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '证书编号',
  `QZRQ` date NOT NULL COMMENT '取证日期',
  `DQRQ` date NOT NULL COMMENT '到期日期',
  `PXYXQ` decimal(4, 2) NOT NULL COMMENT '培训有效期',
  `PXRXM` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '培训人姓名',
  `PXTJ` tinyint(2) NOT NULL COMMENT '培训途径',
  `PXCJ` decimal(10, 2) NOT NULL COMMENT '培训成绩',
  `PXJG` tinyint(2) NOT NULL COMMENT '培训结果',
  `XGPG` tinyint(2) NULL DEFAULT NULL COMMENT '效果评估',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '人员培训信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scqyxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scqyxx`;
CREATE TABLE `t_scqyxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `QYMC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域名称',
  `SSBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属部门',
  `QYWH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域位号',
  `QYDJ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域等级',
  `FZR` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人',
  `FZRBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人部门',
  `FZRGH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人工号',
  `FZRLXDH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人联系电话',
  `BZ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` decimal(2, 0) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产区域信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scssbfxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scssbfxx`;
CREATE TABLE `t_scssbfxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SCSSID` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产设施id',
  `BFLY` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报废理由',
  `BFTBRQ` date NOT NULL COMMENT '报废填报日期',
  `SJBFRQ` date NOT NULL COMMENT '实际报废日期',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设备报废信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scssbyxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scssbyxx`;
CREATE TABLE `t_scssbyxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SCSSID` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产设施 id',
  `BYQK` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '保养情况',
  `BYFZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '保养负责人',
  `BYRQ` date NOT NULL COMMENT '保养日期',
  `BAFZRDW` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '保养负责人单位',
  `BYBZFJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '保养标准附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设施保养信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scsshfxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scsshfxx`;
CREATE TABLE `t_scsshfxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SCSSID` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产设施id',
  `HFLY` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '恢复理由',
  `HFTBRQ` date NOT NULL COMMENT '恢复填报日期',
  `SJHFRQ` date NOT NULL COMMENT '实际恢复日期',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设备恢复信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scssjc1xx
-- ----------------------------
DROP TABLE IF EXISTS `t_scssjc1xx`;
CREATE TABLE `t_scssjc1xx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SCSSID` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产设施 id',
  `JCR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检测人',
  `JCRQ` date NOT NULL COMMENT '检测日期',
  `JCRDW` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检测人单位',
  `JCNR` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检测内容',
  `JCJG` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检测结果',
  `JCZT` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检测状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设施检测信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scssjcxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scssjcxx`;
CREATE TABLE `t_scssjcxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SCSSID` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产设施 id',
  `JCNR` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查内容',
  `FZBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责部门',
  `JCZB` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查指标',
  `YJZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '预警值',
  `LSZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '联锁值',
  `JCR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查人',
  `JCRQ` date NOT NULL COMMENT '检查日期',
  `JCRBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查人部门',
  `JCJG` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查结果',
  `JCZT` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '检查状态',
  `FJMC` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '附件名称',
  `FJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设施检查信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scsstyxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scsstyxx`;
CREATE TABLE `t_scsstyxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SCSSID` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产设施 t_scssxx 的 id',
  `TYLY` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '停用理由',
  `TYHCS` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '停用后措施',
  `SJTYRQ` date NOT NULL COMMENT '实际停用日期',
  `TYTJR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '停用提交人',
  `TYTJRQ` date NOT NULL COMMENT '停用提交日期',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设施停用信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scsswxxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scsswxxx`;
CREATE TABLE `t_scsswxxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `SCSSID` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产设施 id',
  `SSYCX` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '设施异常项',
  `WXZT` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '维修状态',
  `WXQK` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '维修情况',
  `WXFZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '维修负责人',
  `WXFZRDW` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '维修负责人单位',
  `WXKSRQ` date NOT NULL COMMENT '维修开始日期',
  `WXJSRQ` date NOT NULL COMMENT '维修结束日期',
  `WXBZFJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '维修标准附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设施维修信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_scssxx
-- ----------------------------
DROP TABLE IF EXISTS `t_scssxx`;
CREATE TABLE `t_scssxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `ZZSSMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置设施名称',
  `ZZSSWH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置设施位号',
  `zzbm` char(17) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '装置编码',
  `ZZSSYT` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '装置设施用途',
  `ZZSSXH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '装置设施型号',
  `LXLB` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '类型/类别',
  `DWBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单位部门',
  `SZBW` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设置部位',
  `SCRQ` date NOT NULL COMMENT '生产日期',
  `SYQX` tinyint(4) NOT NULL COMMENT '使用期限',
  `SMZQ` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生命周期',
  `TYRQ` date NOT NULL COMMENT '投用日期',
  `WXZT` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '维修状态',
  `TYZT` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '停用状态',
  `SCJCRQ` date NOT NULL COMMENT '上次检查日期',
  `SCJCRQ_1` date NOT NULL COMMENT '上次检测日期',
  `SCBYRQ` date NOT NULL COMMENT '上次保养日期',
  `XCJCRQ` date NOT NULL COMMENT '下次检查日期',
  `XCJCRQ_1` date NOT NULL COMMENT '下次检测日期',
  `XCBYRQ` date NOT NULL COMMENT '下次保养日期',
  `FZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人',
  `FZRDW` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人部门',
  `GYS` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '供应商',
  `SYSM` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '使用说明',
  `SFJC` tinyint(2) NULL DEFAULT NULL COMMENT '是否检查',
  `JCZQ` tinyint(4) NULL DEFAULT NULL COMMENT '检查周期',
  `JCTQTX` tinyint(4) NULL DEFAULT NULL COMMENT '检查提前提醒',
  `SFJC_1` tinyint(2) NULL DEFAULT NULL COMMENT '是否检测',
  `JCZQ_1` tinyint(4) NULL DEFAULT NULL COMMENT '检测周期',
  `JCTQTX_1` tinyint(4) NULL DEFAULT NULL COMMENT '检测提前提醒',
  `SFSTZSB` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否是特种设备',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `company_code` tinyint(9) NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '生产设施信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sczzxx
-- ----------------------------
DROP TABLE IF EXISTS `t_sczzxx`;
CREATE TABLE `t_sczzxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `ZZWH` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置位号',
  `ZZMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置名称',
  `ZZXH` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置型号',
  `ZZWZ` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '装置位置',
  `SFGJZZ` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否关键装置',
  `SSWXGY` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属危险工艺',
  `SJZYWHP` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '涉及主要危化品',
  `ZZZWHJ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '装置周围环境',
  `ZZGN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '装置功能',
  `SSZDWXYDYMC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属重大危险源单元名称',
  `SSZDWXYDYBH` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属重大危险源单元编号',
  `ZDHKZFS` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '自动化控制方式',
  `TYRQ` date NOT NULL COMMENT '投用日期',
  `XCZP` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '现场照片',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` tinyint(14) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` tinyint(14) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_shutdown_exam
-- ----------------------------
DROP TABLE IF EXISTS `t_shutdown_exam`;
CREATE TABLE `t_shutdown_exam`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '统一社会信用代码',
  `plan_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '方案名称',
  `plan_type` tinyint(2) NOT NULL COMMENT '类型 1:开车  2：停车  3：检修',
  `start_time` date NULL DEFAULT NULL COMMENT '开始日期',
  `end_time` date NULL DEFAULT NULL COMMENT '结束日期',
  `plan_description` varchar(2200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '方案描述',
  `facility_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '装置名称',
  `apply_person` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '申请人',
  `apply_time` datetime(0) NULL DEFAULT NULL COMMENT '申请时间',
  `apply_status` tinyint(2) NULL DEFAULT NULL COMMENT '状态 1：未开始    2：进行中   3：已结束',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `XYFJMCFJ` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '协议附件',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '开停车大检修' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sxkjzy
-- ----------------------------
DROP TABLE IF EXISTS `t_sxkjzy`;
CREATE TABLE `t_sxkjzy`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业ID',
  `sfsstqy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否在四色图区域内',
  `fssstid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险四色图ID',
  `zyzbh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业证编号',
  `sqdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请单位',
  `zysqsj` datetime(0) NOT NULL COMMENT '作业申请时间',
  `sqr` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业申请人',
  `zynr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业内容',
  `zywz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业位置',
  `yyjzmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '受限空间内原有介质名称',
  `zyryxx` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作业人员信息',
  `zydwlx` enum('1','2') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位类型',
  `zydwmc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业单位名称',
  `zyfzr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '作业负责人',
  `zysskssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施开始时间',
  `zyssjssj` datetime(0) NULL DEFAULT NULL COMMENT '作业实施结束时间',
  `sfsjqttszy` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否涉及的其他特殊作业',
  `sjqttszyzbh` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及的其他特殊作业安全作业证编号',
  `fxbs` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险辨识',
  `aqjdr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全交底人',
  `jsjdr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接受交底人',
  `jhr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监护人',
  `dqzt` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前状态',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `companyCode` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '作业地点纬度',
  `tyshxydm` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '受限空间作业信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sxkjzy_aqcs
-- ----------------------------
DROP TABLE IF EXISTS `t_sxkjzy_aqcs`;
CREATE TABLE `t_sxkjzy_aqcs`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `xh` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '序号',
  `aqcsnr` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全措施内容',
  `sfsj` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否涉及',
  `qrr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '确认人',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '受限空间作业安全措施表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sxkjzy_qtfx
-- ----------------------------
DROP TABLE IF EXISTS `t_sxkjzy_qtfx`;
CREATE TABLE `t_sxkjzy_qtfx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','6') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `qtlx` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '气体类型',
  `qtmc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '代表性气体名称',
  `fxjg` decimal(4, 2) NOT NULL COMMENT '分析结果',
  `jgdw` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分析结果单位',
  `fxr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分析人',
  `fxsj` datetime(0) NOT NULL COMMENT '分析时间',
  `cyfxbw` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '采样分析部位',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '受限空间作业气体分析数据表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sxkjzy_splz
-- ----------------------------
DROP TABLE IF EXISTS `t_sxkjzy_splz`;
CREATE TABLE `t_sxkjzy_splz`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `zyid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业ID',
  `zylx` enum('1','2','3','4','5','6','7','8') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联作业类型',
  `lcjd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流程节点名称',
  `clry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理人员名称',
  `clyj` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理意见',
  `clsj` datetime(0) NOT NULL COMMENT '处理时间',
  `qmtp` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '签名图片',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '受限空间作业审批流转记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '密码',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `tyshxydm` char(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '统一社会信用代码',
  `company_name` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '企业名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `lock_flag` char(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT '0',
  `delete_mark` char(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT '0',
  PRIMARY KEY (`user_id`) USING BTREE,
  INDEX `user_idx1_username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '五位一体上传数据用户表' ROW_FORMAT = Dynamic;

INSERT INTO `jt_prod`.`t_user`(`user_id`, `username`, `password`, `phone`, `tyshxydm`, `company_name`, `create_time`, `update_time`, `lock_flag`, `delete_mark`) VALUES (1, 'chenqi', '$2a$10$IVzj1Wd.ZQdOIWdb1htQjexU94uoNeuk1crlQ9ExVupPi0Iy1uv.C', '13812345678', NULL, '', '2023-12-08 15:24:39', '2023-12-08 15:32:19', '0', '0');


-- ----------------------------
-- Table structure for t_xmstsxx
-- ----------------------------
DROP TABLE IF EXISTS `t_xmstsxx`;
CREATE TABLE `t_xmstsxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `XMMC` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '项目名称',
  `XMBH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '项目编号',
  `XMXZ` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '项目性质',
  `XMJSDW` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '项目建设单位',
  `XMZTZ` decimal(10, 2) NOT NULL COMMENT '项目总投资',
  `XMJSDD` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '项目建设地点',
  `XMJZQK` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目进展情况',
  `XMKGRQ` date NOT NULL COMMENT '项目开工日期',
  `XMJGYSRQ` date NOT NULL COMMENT '项目竣工验收日期',
  `XMMS` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '项目描述',
  `XMSTSLB` enum('1','3','4','5') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '项目三同时类别',
  `FJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '附件',
  `FJMC` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '附件名称',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '项目三同时信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yhpcjl
-- ----------------------------
DROP TABLE IF EXISTS `t_yhpcjl`;
CREATE TABLE `t_yhpcjl`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '排查记录ID',
  `CHECK_TASK_ID` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患排查任务ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `CHECK_TIME` datetime(0) NOT NULL COMMENT '排查时间',
  `CHECK_STATUS` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '排查结果(正常:0;存在隐患:1;未排查:2;其他:3 )',
  `CREATE_BY_MOBILE` char(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人手机号',
  `UPDATE_BY_MOBILE` char(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人手机号',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '隐患排查记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yhpcrwxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yhpcrwxx`;
CREATE TABLE `t_yhpcrwxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患排查任务ID',
  `RISK_MEASURE_ID` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管控措施ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `TROUBLESHOOT_CONTENT` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患排查内容',
  `CHECK_CYCLE` decimal(4, 2) NOT NULL COMMENT '巡检周期',
  `CHECK_CYCLE_UNIT` char(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '巡检周期单位(小时、天、月、年)',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '隐患排查任务信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yhzlxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yhzlxx`;
CREATE TABLE `t_yhzlxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `DANGER_NAME` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患名称',
  `HAZARD_CODE` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '风险分析对象编码（危险源编码）',
  `RISK_MEASURE_ID` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管控措施ID',
  `RECORD_ID` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '隐患排查记录ID',
  `DANGER_LEVEL` tinyint(2) NOT NULL COMMENT '隐患等级（一般隐患：0；重大隐患：1）',
  `REGIST_TIME` datetime(0) NOT NULL COMMENT '登记时间',
  `REGISTRANT` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '登记人姓名',
  `DANGER_SRC` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患来源（检查来源分类）',
  `DANGER_MANAGE_TYPE` tinyint(2) NOT NULL COMMENT '治理类型（即查即改：0、限期整改：1）',
  `HAZARD_DANGER_TYPE` tinyint(2) NOT NULL COMMENT '隐患类型（安全：1；工艺：2；电气：3；仪表：4；消防：5；总图：6；设备：7；其他：8）',
  `DANGER_DESC` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '隐患描述',
  `DANGER_REASON` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '原因分析',
  `CONTROL_MEASURES` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '控制措施',
  `COST` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '整改资金',
  `LIABLE_PERSON` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '整改责任人',
  `DANGER_MANAGE_DEADLINE` date NOT NULL COMMENT '隐患治理期限',
  `CHECK_ACCEPT_PERSON` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '验收人姓名',
  `CHECK_ACCEPT_TIME` date NOT NULL COMMENT '验收时间',
  `CHECK_ACCEPT_COMMENT` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '验收情况描述',
  `DANGER_STATE` tinyint(2) NOT NULL COMMENT '隐患状态（整改中：0；待验收：1；已验收：9）',
  `MANAGEMENT_CLASSIFICATION` tinyint(2) NULL DEFAULT NULL COMMENT '人物管理分类（1：人的不安全行为；2：物的不安全状态；3：管理上的缺陷）',
  `OCCURRENCE_LINK` tinyint(2) NULL DEFAULT NULL COMMENT '发生环节',
  `ATTACHMENTS1` blob NULL COMMENT '隐患照片',
  `ATTACHMENTS2` blob NULL COMMENT '隐患整改照片',
  `FJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '隐患治理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yjczkxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yjczkxx`;
CREATE TABLE `t_yjczkxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应急卡ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '统一社会信用代码',
  `YJKMC` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应急卡名称',
  `GLGWMC` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关联岗位名称',
  `CZKBH` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处置卡编号',
  `SGFX` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事故风险',
  `FSCS` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发生场所',
  `GYSM` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '工艺说明',
  `SGTZ` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '事故特征',
  `WHMS` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '危害描述',
  `BZSM` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '步骤说明',
  `CZCS` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处置措施',
  `ZYZRR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主要责任人',
  `ZYSX` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '注意事项',
  `NBYJDH` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内部应急电话',
  `WBYJDH` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '外部应急电话',
  `FJ` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '应急处置卡信息表：t_yjczkxx' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yjdwglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yjdwglxx`;
CREATE TABLE `t_yjdwglxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `DWMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队伍名称',
  `DWJB` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队伍级别(1：公司；2：分厂-车间；3：工序-班组等)',
  `DWFZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队伍负责人',
  `FZRBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人部门',
  `FZRSJ` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人手机',
  `GDDH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '固定电话(格式：区号-电话号码)',
  `DWMS` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '队伍描述',
  `RYGH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '人员工号',
  `RYMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '人员名称',
  `RYXB` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '人员性别(1：男；2：女)',
  `SJHM` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机号码',
  `ZW` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '职位',
  `XGFJ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '相关附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应急队伍管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yjwzglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yjwzglxx`;
CREATE TABLE `t_yjwzglxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `WZMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '物资名称',
  `WZBH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '物资编号',
  `WZYT` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物资用途',
  `WZXH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '物资型号',
  `FZBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责部门',
  `WZFL` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '物资分类',
  `CFWZ` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '存放位置',
  `CCSL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '存储数量',
  `SCRQ` date NOT NULL COMMENT '生产日期',
  `SYQY` int(2) UNSIGNED NOT NULL COMMENT '使用期限(单位：月)',
  `SMZQ` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生命周期',
  `WZZT` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '物资状态',
  `TYRQ` date NOT NULL COMMENT '投用日期',
  `SYSM` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '使用说明',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应急物资管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yjyaglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yjyaglxx`;
CREATE TABLE `t_yjyaglxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `YAMC` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '预案名称',
  `SYBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '适用部门',
  `YALX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '预案类型',
  `WXYGL` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '危险源关联',
  `YAJB` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '预案级别',
  `BXR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '编写人',
  `BXBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '编写部门',
  `FBSSRQ` date NOT NULL COMMENT '发布实施日期',
  `YAFJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '预案附件',
  `BASJ` datetime(0) NULL DEFAULT NULL COMMENT '备案时间',
  `BAHZFJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备案回执附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应急预案管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yjyljhxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yjyljhxx`;
CREATE TABLE `t_yjyljhxx`  (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '统一社会信用代码',
  `YLMC` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '演练名称',
  `YLDD` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '演练地点',
  `ZBBM` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主办部门',
  `YLFS` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '演练方式：1-综合；2-桌面；3-专项',
  `YJYA` char(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应急预案主键UUID',
  `YLJB` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '演练级别：1-公司级；2-分厂级；3-车间级',
  `JHDZRQ` date NOT NULL COMMENT '计划定制日期',
  `JHYLRQ` date NOT NULL COMMENT '计划演练日期',
  `JHZDR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '计划定制人',
  `BZ` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '备注',
  `XGFJ` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '相关附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '应急演练计划信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_yjylpjxx
-- ----------------------------
DROP TABLE IF EXISTS `t_yjylpjxx`;
CREATE TABLE `t_yjylpjxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键UUID(32位或者36位字符)',
  `TYSHXYDM` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `YLJH` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '演练计划ID',
  `SJYLRQ` date NOT NULL COMMENT '实际演练日期',
  `YLSSRY` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '演练实施人员',
  `ZYCYRY` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主要参演人员',
  `QTCYBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '其它参演部门',
  `YLNR` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '演练内容',
  `YLMD` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '演练目的',
  `YLGC` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '演练过程',
  `YLXJ` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '演练小结',
  `BZYSMS` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '不足因素描述',
  `SFZG` tinyint(2) NOT NULL COMMENT '是否整改(0:否,1:是)',
  `PJYJ` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '评价意见',
  `PJZT` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '评价状态(1:评价中;2:已评价)',
  `XGFJ` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '相关附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应急演练评价表（t_yjylpjxx）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_zdwxyglxx
-- ----------------------------
DROP TABLE IF EXISTS `t_zdwxyglxx`;
CREATE TABLE `t_zdwxyglxx`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `ZDWXYBH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '重大危险源编号',
  `ZDWXYMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '重大危险源名称',
  `WXYJC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '危险源简称',
  `WXLLX` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '危险源类型',
  `SSBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属部门',
  `FZRDH` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '负责人电话',
  `SFZHGYQ` bit(1) NOT NULL COMMENT '是否在化工园区',
  `XXDZ` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '详细地址',
  `ZDMJ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '占地面积',
  `GDZCZ` decimal(10, 2) NULL DEFAULT NULL COMMENT '固定资产值',
  `SJSYNX` decimal(10, 0) NOT NULL COMMENT '设计使用年限',
  `CCXS` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '存储形式',
  `JCZQ` decimal(10, 0) NOT NULL COMMENT '检查周期',
  `JSGYLC` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '简述工艺流程',
  `GYGCXX` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '公用工程信息',
  `AQFZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全负责人',
  `AQFZRSJ` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '安全负责人手机',
  `QYFZR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域负责人',
  `QYFZRSJ` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域负责人手机',
  `WHCD` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '危害程度',
  `PSND` smallint(6) NULL DEFAULT NULL COMMENT '评审年度(年)',
  `ZDWXYMS` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '重大危险源描述',
  `SCJYHDLX` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产经营活动类型',
  `SCCCCSCQ` enum('0','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '生产存储场所产权',
  `FLFJDSSSFDQJSJC` bit(1) NOT NULL COMMENT '防雷防静电设施是否定期接受检测',
  `SJWXGY` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '涉及危险工艺',
  `HJWZ` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '环境位置',
  `TYRQ` date NULL DEFAULT NULL COMMENT '投用日期',
  `RZ` decimal(9, 0) NOT NULL COMMENT 'R值',
  `ZDWXYJB` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '重大危险源级别',
  `YLRQZS` smallint(6) NOT NULL COMMENT '压力容器总数',
  `FLFJDZJ` datetime(0) NOT NULL COMMENT '防雷防静电设施检测时间：最近一次检测时间',
  `FLFJDDQ` datetime(0) NOT NULL COMMENT '防雷防静电设施检测时间：到期时间',
  `WXYBAYXQS` datetime(0) NOT NULL COMMENT '危险源备案有效期始',
  `WXYBAYXQZ` datetime(0) NOT NULL COMMENT '危险源备案有效期止',
  `DYNSJDWXHXP` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单元内涉及的危险化学品',
  `WXHXPCL` decimal(9, 3) NOT NULL COMMENT '危险化学品存量',
  `WXHXPXZ` enum('1','2','3') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '危险化学品性质',
  `SCZZHQY` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所处装置或区域',
  `CZL` decimal(9, 3) NULL DEFAULT NULL COMMENT '存在量',
  `ZBHJLX` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '周边环境类型',
  `ZBHJMC` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '周边环境名称',
  `ZBHJRS` decimal(9, 0) NULL DEFAULT NULL COMMENT '周边环境人数',
  `YWXYZJJL` decimal(6, 0) NULL DEFAULT NULL COMMENT '与危险源最近距离',
  `ZDWXYZBAQJJ` decimal(6, 0) NULL DEFAULT NULL COMMENT '重大危险源周边安全间距',
  `ZBHJLXR` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '周边环境联系人',
  `ZBHJLXRDH` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '周边环境联系人电话',
  `ZBFHMBZJJL` decimal(5, 0) NULL DEFAULT NULL COMMENT '周边防护目标最近距离（米）',
  `WBJ500MFWLRSGS` decimal(8, 0) NULL DEFAULT NULL COMMENT '外边界500米范围人数估算',
  `JD` decimal(10, 6) NOT NULL COMMENT '经度（度）',
  `WD` decimal(10, 6) NOT NULL COMMENT '纬度（度）',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` smallint(6) NOT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '重大危险源管理信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_zycswxyshwpwxwhtxyzkxx
-- ----------------------------
DROP TABLE IF EXISTS `t_zycswxyshwpwxwhtxyzkxx`;
CREATE TABLE `t_zycswxyshwpwxwhtxyzkxx`  (
  `id` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '应知卡ID',
  `TYSHXYDM` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `GWMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '岗位名称',
  `ZYWXYHYS` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主要危险有害因素',
  `YDZSGFX` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '易导致事故风险',
  `FXDJ` char(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险等级',
  `FXGKCS` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '风险管控措施',
  `YJCSDC` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '应急处置对策',
  `AQJSBS` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '安全警示标示',
  `FJ` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '附件',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` tinyint(2) NOT NULL COMMENT '删除标识',
  `COMPANY_CODE` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '企业编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '作业场所岗位风险应知卡信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_zyqyxx
-- ----------------------------
DROP TABLE IF EXISTS `t_zyqyxx`;
CREATE TABLE `t_zyqyxx`  (
  `TYSHXYDM` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统一社会信用代码',
  `YQBH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域编号',
  `QYMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域名称',
  `QYLX` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域类型',
  `QYLC` int(2) NULL DEFAULT NULL COMMENT '区域楼层',
  `QYGD` int(5) NULL DEFAULT NULL COMMENT '区域高度',
  `QYFXDJ` enum('1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域风险等级',
  `GLDXLX` enum('0','1','2','3','4') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关联对象类型',
  `GLDXBH` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关联对象编号',
  `GLDXMC` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关联对象名称',
  `SFZDJGQY` tinyint(1) NOT NULL COMMENT '是否重点监管区域 (0：否；1：是)',
  `QYSFSYSCQ` tinyint(1) NOT NULL COMMENT '区域是否属于生产区 (0：非生产区；1：生产区)',
  `QYFW` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '区域范围',
  `QYSZBM` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域所在部门',
  `ZDRS` int(5) NOT NULL COMMENT '区域最大人数',
  `JD` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '经度位置信息',
  `WD` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '纬度位置信息',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人',
  `update_time` datetime(0) NOT NULL COMMENT '最后修改时间',
  `update_by` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '最后修改人',
  `delete_mark` int(2) NOT NULL COMMENT '删除标识 (未删除：0；已删除：1)'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '作业区域信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
