package com.github.whalerain.springbootkata.constant;

import com.github.whalerain.springbootkata.support.base.ErrorCoder;

/**
 * 系统错误码枚举常量
 *
 * @author ZhangXi
 */
public enum SysErrorCoder implements ErrorCoder {

    INNER_ERROR(100001, "系统内部错误"),
    PARAM_INVALID(100002, "参数校验无效");

    private Integer enumValue;

    private String enumDesc;

    SysErrorCoder(Integer enumValue, String enumDesc) {
        this.enumValue = enumValue;
        this.enumDesc = enumDesc;
    }

    @Override
    public Integer take() {
        return this.enumValue;
    }

    public String getEnumDesc() {
        return enumDesc;
    }
}
