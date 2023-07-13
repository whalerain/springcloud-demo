package com.github.whalerain.springbootkata.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 系统自定义配置
 * regexp: 自定义正则表达式
 *
 * @author ZhangXi
 */
@Data
@Component
public class PropKata {

    @Value("${kata.regexp.mobile}")
    private String regexpMobile;

    @Value("${kata.regexp.telephone}")
    private String regexpTelephone;

    @Value("${kata.res.url.prefix}")
    private String resourceUrlPrefix;

}
