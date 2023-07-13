package com.github.whalerain.springbootkata.tool;

import com.github.whalerain.springbootkata.config.ApplicationContextProvider;
import com.github.whalerain.springbootkata.config.PropKata;

/**
 * 系统应用工具类
 *
 * @author ZhangXi
 */
public final class AppTools {

    /**
     * 获取配置文件中自定义配置属性对象:kata
     * @return {@link PropKata}
     */
    public static PropKata getPropKataBean() {
        return ApplicationContextProvider.getBean(PropKata.class);
    }

}
