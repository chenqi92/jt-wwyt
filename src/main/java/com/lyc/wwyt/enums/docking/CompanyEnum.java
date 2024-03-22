package com.lyc.wwyt.enums.docking;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 枚举类 CompanyEnum 对接常州中间库数据
 *
 * @author ChenQi
 * @date 2023/7/10
 */
public enum CompanyEnum {

    ZYCH("13204820001", "中盐常州化工股份有限公司", "91320400732252465D", "320410386"),

    ZDHF("13204820004", "江苏中东化肥股份有限公司", "9132040056775521X8", "320480002"),

    LSXQ("13205090001", "江苏蓝色星球环保新材料有限公司", "91320413588424540H", "");

    private final String orgCode;

    private final String companyName;

    private final String tyxydm;

    @Getter
    private final String companyCode;

    public final static List<String> orgCodeList = new ArrayList<>();

    public final static Map<String, String> orgMap = new HashMap<>();

    public final static Map<String, String> companyCodeMap = new HashMap<>();

    static {
        CompanyEnum[] companyEnums = CompanyEnum.values();
        for (CompanyEnum companyEnum : companyEnums) {
            orgCodeList.add(companyEnum.getOrgCode());
            orgMap.put(companyEnum.getOrgCode(), companyEnum.getTyxydm());
            companyCodeMap.put(companyEnum.getOrgCode(), companyEnum.getCompanyCode());
        }
    }

    CompanyEnum(String orgCode, String companyName, String tyxydm, String companyCode) {
        this.orgCode = orgCode;
        this.companyName = companyName;
        this.tyxydm = tyxydm;
        this.companyCode = companyCode;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getTyxydm() {
        return this.tyxydm;
    }
}
