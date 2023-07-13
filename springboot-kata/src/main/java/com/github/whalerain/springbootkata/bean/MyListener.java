package com.github.whalerain.springbootkata.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author ZhangXi
 */
@Slf4j
@Component
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("初始化listener: myListener ...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
