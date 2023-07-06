package com.github.whalerain.springbootkata.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhangXi
 */
@OpenAPIDefinition(
        info = @Info(
                title = "spring kata API",
                version = "v1.0.1",
                description = "springboot最佳实践，项目类型：basic"
        )
)
@Configuration
public class ApiDocConfiguration {
}
