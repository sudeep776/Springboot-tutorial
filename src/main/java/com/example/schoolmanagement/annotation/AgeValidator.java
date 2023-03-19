package com.example.schoolmanagement.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.example.schoolmanagement.annotation.impl.AgeValidatorImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint (validatedBy = AgeValidatorImpl.class)
@Target(ElementType.FIELD)
@Retention (RetentionPolicy.RUNTIME)
public @interface AgeValidator {
    String message() default "Invalid age";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
