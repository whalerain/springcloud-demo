package com.github.whalerain.springbootkata.config;

import com.github.whalerain.springbootkata.bean.IpInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 *
 * @author ZhangXi
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    private final IpInterceptor ipInterceptor;

    @Autowired
    public InterceptorConfiguration(IpInterceptor ipInterceptor) {
        this.ipInterceptor = ipInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(ipInterceptor).addPathPatterns("/**");
    }
}
