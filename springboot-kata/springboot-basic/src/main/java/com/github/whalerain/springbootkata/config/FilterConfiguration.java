package com.github.whalerain.springbootkata.config;

import com.github.whalerain.springbootkata.bean.LocaleFilter;
import com.github.whalerain.springbootkata.bean.UrlFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器配置
 *
 * @author ZhangXi
 */
@Configuration
public class FilterConfiguration {

    @Bean
    FilterRegistrationBean<LocaleFilter> registerLocaleFilter(LocaleFilter localeFilter) {
        FilterRegistrationBean<LocaleFilter> bean = new FilterRegistrationBean<>();
        List<String> urls = new ArrayList<>();
        urls.add("/*");
        bean.setUrlPatterns(urls);
        bean.setFilter(localeFilter);
        bean.setEnabled(true);
        bean.setOrder(24);
        return bean;
    }

    @Bean
    FilterRegistrationBean<UrlFilter> urlFilterRegister(UrlFilter urlFilter) {
        FilterRegistrationBean<UrlFilter> bean = new FilterRegistrationBean<>();
        List<String> urls = new ArrayList<>();
        urls.add("/*");
        bean.setUrlPatterns(urls);
        bean.setFilter(urlFilter);
        bean.setEnabled(true);
        bean.setOrder(22);
        return bean;
    }



}
