package com.github.whalerain.springbootkata.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author ZhangXi
 */
@Slf4j
@Component
public class AsyncTask {

    @Async
    public void doTaskOne() {
    }

    /**
     * todo 使用自定义线程池
     */
    @Async
    public void doTaskTwo() {

    }

    /**
     * 使用自定义线程池执行异步任务
     */
    @Async(value = "myAsyncExecutor")
    public void doTaskThree() {

    }

}
