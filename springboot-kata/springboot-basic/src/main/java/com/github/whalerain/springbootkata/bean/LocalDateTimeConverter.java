package com.github.whalerain.springbootkata.bean;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author ZhangXi
 */
@Component
public class LocalDateTimeConverter implements Converter<String, LocalDateTime> {


    @Override
    public LocalDateTime convert(String stringDatetime) {
        return null;
    }
}
