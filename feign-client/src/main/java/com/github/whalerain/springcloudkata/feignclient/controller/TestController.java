package com.github.whalerain.springcloudkata.feignclient.controller;

import com.github.whalerain.springcloudkata.feignclient.client.TestFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangXi
 */
@Slf4j
@RestController
public class TestController {

    private final TestFeign testFeign;

    @Autowired
    public TestController(TestFeign testFeign) {
        this.testFeign = testFeign;
    }

    @GetMapping(path = "/test/sayhi")
    public String testSayHi() {
        String value = testFeign.sayHi();
        return "获取feign client 结果：" + value;
    }


}
