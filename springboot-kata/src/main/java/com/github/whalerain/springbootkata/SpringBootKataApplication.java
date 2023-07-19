package com.github.whalerain.springbootkata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot最佳实践
 * @author ZhangXi
 */
@SpringBootApplication
public class SpringBootKataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKataApplication.class, args);

        // 优雅停机
        Runtime.getRuntime().addShutdownHook(new MyShutdownRunner());

    }

}
