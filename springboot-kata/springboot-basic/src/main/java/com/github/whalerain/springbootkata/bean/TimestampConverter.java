package com.github.whalerain.springbootkata.bean;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 *
 *
 * @author ZhangXi
 */
@Component
public class  TimestampConverter implements Converter<String, Timestamp> {

    @Override
    public Timestamp convert(String stringTime) {
        //todo 检查字符串格式是否符合时间戳
        long milliseconds = Long.parseLong(stringTime);
        return new Timestamp(milliseconds);
    }
}
