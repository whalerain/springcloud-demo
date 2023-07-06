package com.github.whalerain.springbootkata.support.base;

import lombok.Data;

/**
 * 基础API响应VO类
 *
 * @author ZhangXi
 */
@Data
public class BaseResponse<T> {

    private static final String DEFAULT_MESSAGE = "";

    private ApiStatus status;

    private Integer errorCode;

    private T data;

    private String message;


    public void success() {
        this.status = ApiStatus.SUCCESS;
    }

    public void success(String message) {
        success();
        this.message = message;
    }

    public void success(String message, T data) {
        success(message);
        this.data = data;
    }

    public void fail() {
        this.status = ApiStatus.FAILURE;
    }

    public void fail(String message) {
        fail();
        this.message = message;
    }

    public void fail(String message, ErrorCoder errorCoder) {
        fail(message);
        if(null != errorCoder) {
            this.errorCode = errorCoder.take();
        }
    }

}
