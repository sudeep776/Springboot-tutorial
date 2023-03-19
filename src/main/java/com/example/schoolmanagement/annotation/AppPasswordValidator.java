package com.example.schoolmanagement.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.example.schoolmanagement.annotation.impl.AppPasswordValidatorImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint (validatedBy = AppPasswordValidatorImpl.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AppPasswordValidator {
    String message() default "Invalid password";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
