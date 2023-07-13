package com.github.whalerain.springbootkata.config;

import cn.hutool.core.thread.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.*;

/**
 * 异步任务配置
 *
 * @author ZhangXi
 */
@Slf4j
@EnableAsync
@Configuration
public class AsyncConfiguration {

    //fixme 可配置自定义线程池，在@Async中使用

    @Bean(name = "myAsyncExecutor")
    public Executor myAsyncExecutor() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setNamePrefix("async-task-")
                .setDaemon(true)
                .build();
        int threads = Runtime.getRuntime().availableProcessors() + 1;
        return new ThreadPoolExecutor(threads, 2*threads, 5, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(1024), threadFactory,
                (r, executor) -> {
                    log.info("my task is running !");
                });
    }




}
