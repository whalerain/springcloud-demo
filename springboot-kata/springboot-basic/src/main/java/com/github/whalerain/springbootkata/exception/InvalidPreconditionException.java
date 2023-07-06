package com.github.whalerain.springbootkata.exception;

/**
 *
 * @author ZhangXi
 */
public class InvalidPreconditionException extends Exception {

    public InvalidPreconditionException(String message) {
        super(message);
    }

    public InvalidPreconditionException(String message, Throwable cause) {
        super(message, cause);
    }
}
