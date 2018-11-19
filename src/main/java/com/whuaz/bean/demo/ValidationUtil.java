package com.whuaz.bean.demo;

import javax.validation.*;
import java.util.Set;

/**
 * @author grez
 * @since 18-11-17
 **/
public class ValidationUtil {

    private static Validator validator;

    static {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    public static <T> void validate(T t) throws ValidationException {
        Set<ConstraintViolation<T>> set = validator.validate(t);
        if (set.size() > 0) {
            StringBuilder validateError = new StringBuilder();
            for (ConstraintViolation<T> val : set) {
                validateError.append(val.getMessage() + " ;");
            }
            throw new ValidationException(validateError.toString());
        }
    }
}
