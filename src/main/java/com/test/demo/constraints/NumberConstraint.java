package com.test.demo.constraints;

import com.test.demo.validators.NumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NumberValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberConstraint {
    String message() default "Invalid value entered";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
