package com.example.schoolmanagement.annotation.impl;

import com.example.schoolmanagement.annotation.AppPasswordValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AppPasswordValidatorImpl implements ConstraintValidator<AppPasswordValidator, String> {
    @Override
    public void initialize(AppPasswordValidator constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        return password != null && password.length() > 5 && password.substring(0, 1).matches("[A-Z]");
    }
}
