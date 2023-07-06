package com.github.whalerain.springbootkata.config;

import com.github.whalerain.springbootkata.constant.AppConst;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 简易文件服务器配置
 *
 * @author ZhangXi
 */
@Profile(AppConst.PROFILE_DEV)
@Configuration
public class SimpleFileServerConfiguration implements WebMvcConfigurer {

    /**
     * springboot可以将本地文件地址映射为虚拟网络地址，从而实现简单的文件服务器
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("file:E:/develop/files/resources/");
    }
}
