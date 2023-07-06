package com.github.whalerain.springbootkata.validation;

import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.menum.Sex;
import com.github.whalerain.springbootkata.menum.UserStatus;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.Set;

/**
 * @author ZhangXi
 */
public class ValidatorTest {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    public void testInEnum() {
        User user = new User();
        user.setSex(Sex.MAN);
        user.setStatus(UserStatus.NORMAL);
        Set<ConstraintViolation<User>> set = validator.validate(user, Default.class);

    }




}
