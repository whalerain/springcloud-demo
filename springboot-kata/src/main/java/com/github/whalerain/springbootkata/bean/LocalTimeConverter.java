package com.github.whalerain.springbootkata.bean;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalTime;

/**
 * @author ZhangXi
 */
public class LocalTimeConverter implements Converter<String, LocalTime> {

    @Override
    public LocalTime convert(String s) {
        return null;
    }
}
