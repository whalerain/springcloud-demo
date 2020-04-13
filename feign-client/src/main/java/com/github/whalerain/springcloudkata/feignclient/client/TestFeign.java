package com.github.whalerain.springcloudkata.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangXi
 */
@FeignClient(value = "eureka-client")
public interface TestFeign {

    /**
     *
     * @return
     */
    @GetMapping(path = "/feign/hi")
    String sayHi();


}
