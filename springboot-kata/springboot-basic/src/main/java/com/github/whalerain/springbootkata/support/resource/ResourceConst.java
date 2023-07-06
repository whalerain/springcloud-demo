package com.github.whalerain.springbootkata.support.resource;

import com.github.whalerain.springbootkata.config.ApplicationContextProvider;
import com.github.whalerain.springbootkata.config.PropKata;

/**
 * @author ZhangXi
 */
public class ResourceConst {

    public static String URL_PREFIX =
            ApplicationContextProvider.getBean(PropKata.class).getResourceUrlPrefix();

}
