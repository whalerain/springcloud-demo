package com.github.whalerain.springbootkata.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 日期格式转换器
 * 将{@link String}转换为{@link Date}
 *
 * @author ZhangXi
 */
@Slf4j
@Component
public class DateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String stringDate) {
        //todo 根据不同时间格式进行转换
        return null;
    }

}
