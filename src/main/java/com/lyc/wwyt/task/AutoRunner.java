package com.lyc.wwyt.task;

import cn.allbs.common.constant.StringPool;
import cn.allbs.common.utils.JsonUtil;
import cn.allbs.common.utils.ObjectUtil;
import cn.allbs.common.utils.StringUtil;
import cn.allbs.job.annotation.XxlJobAuto;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.MapUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.lyc.wwyt.config.properties.DockingTableProperties;
import com.lyc.wwyt.constants.PatternConstant;
import com.lyc.wwyt.enums.docking.CompanyEnum;
import com.lyc.wwyt.service.CommonService;
import com.lyc.wwyt.utils.NameUtils;
import com.lyc.wwyt.vo.TableInfoVO;
import com.xxl.job.core.handler.annotation.XxlJob;
import okhttp3.*;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 类 AutoRunner 获取数据
 *
 * @author ChenQi
 * @date 2023/6/30
 */
@Component
public class AutoRunner {

    private final static String REQUEST_URI = "https://hgjc.jsczyj.cn/api/datacenter/receive/getDataFromBusiCenter/";
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(AutoRunner.class);

    private OkHttpClient client = new OkHttpClient();

    @Resource
    private CommonService commonService;

    @Resource
    private DockingTableProperties dockingTableProperties;

    /**
     * 后续补上对应的运行时间
     *
     * @throws Exception
     */
    @XxlJob("middleTableDataSave")
    @XxlJobAuto(jobDesc = "从中安联科获取数据并储存至库中", author = "chenqi", scheduleConf = 1, timeUnit = TimeUnit.DAYS, triggerStatus = 1)
    public void getData() throws Exception {
        List<String> errTables = new LinkedList<>();
        dockingTableProperties.getTables().forEach(tableName -> {
            LocalDate now = LocalDate.now();
            SearchParam param = SearchParam.builder()
                    .serviceId(tableName)
                    .startTime(now.plusDays(-31))
                    .endTime(now.plusDays(-1))
                    .orgCode(String.join(StringPool.COMMA, CompanyEnum.orgCodeList))
                    .build();
            String json = JsonUtil.toJson(param);

            RequestBody body = RequestBody.create(json, JSON);
            Request request = new Request.Builder().url(REQUEST_URI).post(body).build();

            try (Response response = client.newCall(request).execute()) {
                JsonNode jsonNode = null;
                if (response.body() != null) {
                    jsonNode = JsonUtil.readValue(response.body().string(), JsonNode.class);
                }
                List<Map> list = null;
                if (jsonNode != null) {
                    list = JsonUtil.readList(jsonNode.at("/data").toString(), Map.class);
                }
                // 查询当前表中所有列数据
                List<TableInfoVO> tables = commonService.queryTableHeaders(tableName);
                if (CollUtil.isNotEmpty(tables) && CollUtil.isNotEmpty(list)) {
                    // 所有列
                    List<String> allColumns = tables.stream().map(TableInfoVO::getName).collect(Collectors.toList());
                    List<String> columns = new LinkedList<>();
                    List<List<Object>> dataList = new ArrayList<>();
                    list.forEach(a -> {
                        List<Object> values = new LinkedList<>();
                        allColumns.forEach(column -> {
                            if (a.containsKey(column)) {
                                // 判断值是否为特殊的时间格式
                                Object value = a.get(column);
                                if (ObjectUtil.isNotEmpty(value) && Pattern.compile(PatternConstant.TIME_PATTERN).matcher(value.toString()).matches()) {
                                    values.add(LocalDateTime.parse(value.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'+'SSSS")));
                                } else {
                                    values.add(a.get(column));
                                }
                                if (!columns.contains(column) && !columns.contains(NameUtils.getClassName(column))) {
                                    columns.add(column);
                                }
                            }
                            if (a.containsKey(NameUtils.getClassName(column)) && !column.equals(NameUtils.getClassName(column))) {
                                // 判断值是否为特殊的时间格式
                                Object value = a.get(NameUtils.getClassName(column));
                                if (ObjectUtil.isNotEmpty(value) && Pattern.compile(PatternConstant.TIME_PATTERN).matcher(value.toString()).matches()) {
                                    values.add(LocalDateTime.parse(value.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'+'SSSS")));
                                } else {
                                    values.add(value);
                                }
                                if (!columns.contains(NameUtils.getClassName(column)) && !columns.contains(column)) {
                                    columns.add(column);
                                }
                            }
                            if ("TYSHXYDM".equals(column) && StringUtil.isNotEmpty(MapUtil.getStr(a, "orgCode", ""))) {
                                if (!columns.contains(column) && !columns.contains(NameUtils.getClassName(column))) {
                                    columns.add(column);
                                }
                                values.add(CompanyEnum.orgMap.get(a.get("orgCode").toString()));
                            }
                            if (!a.containsKey("companyCode") && !a.containsKey("COMPANY_CODE") && ("companyCode".equals(column) || "companyCode".equals(NameUtils.getClassName(column))) && StringUtil.isNotEmpty(MapUtil.getStr(a, "orgCode", ""))) {
                                if (!columns.contains(column) && !columns.contains(NameUtils.getClassName(column))) {
                                    columns.add(column);
                                }
                                values.add(CompanyEnum.companyCodeMap.get(a.get("orgCode").toString()));
                            }
                        });
                        dataList.add(values);
                    });
                    // 保存数据
                    try {
                        commonService.saveOrUpdateData(dataList, columns, tableName);
                    } catch (Exception e) {
                        log.error("表{}数据保存失败!时间{},错误原因{}", tableName, now, e.getLocalizedMessage());
                        errTables.add(tableName);
                    }

                }
            } catch (Exception e) {
                log.error("表{}请求失败!", tableName);
            }
        });
        log.info("出错的表:" + String.join(StringPool.COMMA, errTables));
    }
}
