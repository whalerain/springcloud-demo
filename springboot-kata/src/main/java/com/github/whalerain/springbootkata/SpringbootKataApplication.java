package com.github.whalerain.springbootkata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

/**
 * Spring Boot最佳实践
 * @author ZhangXi
 */
@SpringBootApplication
public class SpringbootKataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKataApplication.class, args);

        // 优雅停机
        Runtime.getRuntime().addShutdownHook(new MyShutdownRunner());

    }

}
