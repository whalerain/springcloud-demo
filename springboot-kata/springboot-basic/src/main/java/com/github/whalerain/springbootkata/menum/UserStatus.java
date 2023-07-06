package com.github.whalerain.springbootkata.menum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 *
 * @author ZhangXi
 */
public enum UserStatus {
    /**
     * 正常状态
     */
    NORMAL(0, "normal", "正常"),
    DISABLED(1, "disabled", "禁用");

    @EnumValue
    private Integer value;

    @JsonValue
    private String name;

    private String desc;

    UserStatus(Integer value, String name, String desc) {
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

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * API文档中显示@JsonValue标注的属性
     * @return 用户状态名称
     */
    @Override
    public String toString() {
        return this.name;
    }
}
