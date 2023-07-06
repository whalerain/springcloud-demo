package com.github.whalerain.springbootkata.tool;

import cn.hutool.core.util.StrUtil;

import java.util.List;

/**
 * @author ZhangXi
 */
public final class StrTools {

    /**
     * 检查字符串中是否不包含任何有意义内容
     *
     * @param value
     * @return
     */
    public static boolean findNothingIn(String value) {
        return StrUtil.isBlank(value);
    }


    public static boolean findNothingIn(String... values) {
        if(null == values) {
            return true;
        }
        for(String value : values) {
            if(! StrUtil.isBlank(value)) {
                return false;
            }
        }
        return true;
    }


    public static boolean findNothingIn(List<String> values) {
        if(null == values) {
            return true;
        }
        for(String value : values) {
            if(! StrUtil.isBlank(value)) {
                return false;
            }
        }
        return true;
    }






}
