package com.github.whalerain.springbootkata.menum;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * 数据库查询排序顺序
 *
 * @author ZhangXi
 */
public enum  SortOrder {

    ASC("asc"),
    DESC("desc");

    @EnumValue
    private String enumValue;

    SortOrder(String enumValue) {
        this.enumValue = enumValue;
    }

    public String getEnumValue() {
        return enumValue;
    }
}
