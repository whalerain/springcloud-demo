package com.github.whalerain.springcloudkata.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangXi
 */
@RestController
public class TestController {

    @Value("${from}")
    private String value;


    @RequestMapping(value = "/test/config", method = RequestMethod.GET)
    public String testRemoteConfig() {
        return value;
    }


}
