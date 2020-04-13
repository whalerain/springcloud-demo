package com.github.whalerain.springcloudkata.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangXi
 */
@Slf4j
@RestController
public class FeignController {


    @GetMapping(path = "/feign/hi")
    public String testFeign() {
        return "hello feign client!";
    }


}
