package com.github.whalerain.springbootkata.validation.validator;

import com.github.whalerain.springbootkata.config.ApplicationContextProvider;
import com.github.whalerain.springbootkata.config.PropKata;
import com.github.whalerain.springbootkata.validation.Mobile;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * 自定义手机参数校验器
 *
 * @author ZhangXi
 */
@Slf4j
public class MobileValidator implements ConstraintValidator<Mobile, String> {

    @Override
    public boolean isValid(String mobile, ConstraintValidatorContext constraintValidatorContext) {
        PropKata kata = (PropKata) ApplicationContextProvider.getBean("propKata");
        String mobileRegexp = kata.getRegexpMobile();
        return Pattern.matches(mobileRegexp, mobile);
    }
}
