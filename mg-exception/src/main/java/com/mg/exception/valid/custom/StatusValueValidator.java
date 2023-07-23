package com.mg.exception.valid.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author Magi
 * @Date 2023/7/23 17:15
 * @Version 1.0
 * @Description
 */
public class StatusValueValidator implements ConstraintValidator<StatusValue, Integer> {
    Set<Integer> values;

    @Override
    public void initialize(StatusValue constraintAnnotation) {
        values = Arrays.stream(constraintAnnotation.values()).boxed().collect(Collectors.toSet());
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if (values.contains(integer)) {
            return true;
        }
        return false;
    }
}
