package com.github.whalerain.springboot3kata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot3KataApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3KataApplication.class, args);

        // 优雅停机
//        Runtime.getRuntime().addShutdownHook(new MyShutdownRunner());

    }



}
