package com.whalerain.demo.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author Lance.X.Zhang
 * @since V? (创建时间：2019/3/5)
 */
@RestController
public class ClientOneController {

    private final DiscoveryClient discoveryClient;

    @Autowired
    public ClientOneController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/clientOne")
    public String test() {
        String services = "Services : " + discoveryClient.getServices();
        System.out.println("ClientOne Services : " + services);
        return services;
    }


}
