## Springboot Basic

`springboot`在使用中集成了很多的部件和功能，有些是基础，而有些则需要根据技术选型和业务需求来确定。

该项目就着重与基础与常用功能配置使用最佳实践，以帮助自己及其他开发者快速构建起基础服务。

# 实践清单

## Web MVC

* `@SpringBootApplication` 注解

```java
@SpringBootApplication
public class SpringbootKataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKataApplication.class, args);
    }

}
```

* 端口配置

```yml
# application.yml
server:
  port: 8080
```

### 全局异常处理（结合错误码） 

* 定义 `GlobalExceptionHandler`，从[国际化](#国际化消息)文件中加载对应错误说明

```java
@ControllerAdvice
public class GlobalExceptionHandler {

    private static String MSG_ERROR_CODE = "error.code.";

    private final MessageSource messageSource;

    @Autowired
    public GlobalExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BaseResponse handleException(Exception e) {
        log.error("处理未知异常", e);
        BaseResponse response = new BaseResponse();
        String message = messageSource.getMessage(
                "exception.handler.msg.unknown", null, LocaleContextHolder.getLocale());
        response.fail(message, SysErrorCode.INNER_ERROR);
        return response;
    }
}
```

### 自定义类型转换

* 自定义组件实现接口： `org.springframework.core.convert.converter.Converter`

```java
@Component
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String stringDate) {
        //todo 根据不同时间格式进行转换
        return null;
    }
}
```

* 配置 `WebMvcConfigurer`

```java
// todo 待整理
```

### 拦截器



### 过滤器

### 监听器

### 跨域CORS

上传文件跨域需要额外配置：

```java

```

## 通用

### 多环境


### API多版本路径

// todo 

### 自定义启动与关闭

// todo 

### 日志

#### 日志文件

#### 动态日志监听


### 时间配置



### 国际化消息

### 参数校验（国际化）



## 数据库

### 数据源




### 连接池 - Druid




### 数据版本迁移 - flyway



### ORM - Mybatis



## 缓存

### Spring Cache



## 任务

### 定时任务



### 异步任务

## 测试

### 单元测试 - JUnit5



参考 `demo` 文件夹下测试类 

### 集成测试 - SpringBoot Test



### 测试报告（可选）



## DevOps(可选)

### jenkins脚本

### springAction脚本

测试启动github actions



## 其他(可选)

### 虚拟文件服务器

```java
@Profile(AppConst.PROFILE_DEV)
@Configuration
public class SimpleFileServerConfiguration implements WebMvcConfigurer {

    /**
     * springboot可以将本地文件地址映射为虚拟网络地址，从而实现简单的文件服务器
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("file:E:/develop/files/resources/");
    }
}
```

### API文档

配置：

```java
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
``` 

使用：

```java

```


### Actuator

 





