package com.github.whalerain.springbootkata.menum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 性别枚举类
 *
 * @author ZhangXi
 */
public enum Sex {

    /**
     * 男性
     */
    MAN(1, "man", "男性"),
    /**
     * 女性
     */
    WOMAN(2, "woman", "女性");

    /**
     * 性别数据标记
     */
    @EnumValue
    private Integer value;

    /**
     * 性别名称
     */
    @JsonValue
    private String name;

    /**
     * 性别说明
     */
    private String desc;

    Sex(Integer value, String name, String desc) {
        this.value = value;
        this.name = name;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }


    /**
     * API文档中显示@JsonValue标注的属性
     * @return 性别名称
     */
    @Override
    public String toString() {
        return this.name;
    }
}
