package com.github.whalerain.springbootkata.exception;

import com.github.whalerain.springbootkata.support.base.ErrorCoder;

/**
 * @author ZhangXi
 */
public class InvalidParamException extends Exception {

    private ErrorCoder errorCoder;

    public InvalidParamException(String message) {
        super(message);
    }

    public InvalidParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParamException with(ErrorCoder errorCoder) {
        this.errorCoder = errorCoder;
        return this;
    }

}
