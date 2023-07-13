package com.github.whalerain.springbootkata.config;

import com.github.whalerain.springbootkata.constant.SysErrorCoder;
import com.github.whalerain.springbootkata.support.base.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 全局异常处理
 *
 * 如果是纯API服务，可以使用 {@link RestControllerAdvice}注释
 * @author ZhangXi
 */
@Slf4j
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
        response.fail(message, SysErrorCoder.INNER_ERROR);
        return response;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public BaseResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error("处理参数校验异常", e);
        List<FieldError> errors = e.getBindingResult().getFieldErrors();
        String[] infos = null;
        if(null != errors && errors.size() > 0) {
            FieldError error = errors.get(0);
            Object rejectedValue = error.getRejectedValue();
            infos = new String[]{
                    error.getField(),
                    rejectedValue == null ? null : rejectedValue.toString(),
                    error.getDefaultMessage()
            };
        }
        BaseResponse response = new BaseResponse();
        String message = messageSource.getMessage(
                "exception.handler.msg.param.invalid", infos, LocaleContextHolder.getLocale());
        response.fail(message, SysErrorCoder.PARAM_INVALID);
        return response;
    }

}
