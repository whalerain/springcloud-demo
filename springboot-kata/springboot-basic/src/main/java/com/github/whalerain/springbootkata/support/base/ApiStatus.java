package com.github.whalerain.springbootkata.support.base;

/**
 * API响应状态枚举
 *
 * @author ZhangXi
 */
public enum ApiStatus implements StringGetter {

    /**
     * API返回状态值
     * SUCCESS: 请求成功
     * FAILURE: 请求失败，可能是业务或者系统错误
     * UNAUTHORIZED: 未认证请求
     * DENIED: 没有访问权限，拒绝访问
     */
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    UNAUTHORIZED("UNAUTHORIZED"),
    DENIED("DENIED");

    private String enumValue;

    ApiStatus(String enumValue) {
        this.enumValue = enumValue;
    }

    @Override
    public String take() {
        return this.enumValue;
    }
}
