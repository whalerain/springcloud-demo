package com.github.whalerain.springbootkata.support.resource;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * 自定义图片URL序列化器
 *
 *
 *
 * @author ZhangXi
 */
public class ImageUrlSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (null != value && !"".equals(value)) {
            jsonGenerator.writeString(ResourceConst.URL_PREFIX +value);
        }
    }
}
