package com.test.demo.validators;

import com.test.demo.constraints.NumberConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberValidator implements ConstraintValidator<NumberConstraint, Integer> {
    @Override
    public void initialize(NumberConstraint constraintAnnotation) {

    }

    /**
     * Number must be between 18 and 80
     *
     * @param value
     * @param context
     * @return
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return (value >= 18 && value <= 80);
    }
}
