package com.github.whalerain.springbootkata;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 自定义启动器
 * @author ZhangXi
 */
@Slf4j
@Component
public class MyInitialRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("执行一些启动后自定义的方法......");
    }
}
