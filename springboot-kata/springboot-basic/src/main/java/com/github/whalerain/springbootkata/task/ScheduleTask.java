package com.github.whalerain.springbootkata.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author ZhangXi
 */
@Slf4j
@Component
public class ScheduleTask {

    //@Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        log.info("正在执行每秒一次任务...");
    }

    // @Scheduled(cron = "0/5 * * * * *")
    public void reportTime() {
        log.info("正在执行第二种每5秒一次任务...");
    }


}
