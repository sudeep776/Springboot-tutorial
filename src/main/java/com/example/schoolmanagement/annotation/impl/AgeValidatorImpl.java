package com.example.schoolmanagement.annotation.impl;

import com.example.schoolmanagement.annotation.AgeValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidatorImpl implements ConstraintValidator<AgeValidator, Integer> {
    @Override
    public void initialize(AgeValidator constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        return age != null && age > 18;
    }
}
