package com.github.whalerain.springbootkata.bean;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;

/**
 *
 * @author ZhangXi
 */
public class LocalDateConverter implements Converter<String, LocalDate> {
    @Override
    public LocalDate convert(String s) {
        return null;
    }
}
