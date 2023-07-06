package com.github.whalerain.springbootkata.config;

import com.github.whalerain.springbootkata.bean.MyListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 监听器配置
 *
 * @author ZhangXi
 */
@Configuration
public class ListenerConfiguration {

    @Bean
    public ServletListenerRegistrationBean<MyListener> MyListenerRegister(MyListener myListener) {
        ServletListenerRegistrationBean<MyListener> bean = new ServletListenerRegistrationBean<>();
        bean.setListener(myListener);
        bean.setEnabled(true);
        bean.setOrder(1);
        return bean;
    }

}
