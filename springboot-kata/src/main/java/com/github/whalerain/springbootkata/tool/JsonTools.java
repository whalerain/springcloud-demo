package com.github.whalerain.springbootkata.tool;

import cn.hutool.json.JSONUtil;

/**
 * @author ZhangXi
 */
public class JsonTools {


    public static String toJsonStr(Object obj) {
        return JSONUtil.toJsonStr(obj);
    }



}
