package com.example.schoolmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;

@RestController
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * Constraint violation exception handler
     *
     * @param ex ConstraintViolationException
     * @return List<ValidationError> - list of ValidationError built
     * from set of ConstraintViolation
     *//*
    @ResponseStatus (HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler (ConstraintViolationException.class)
    public AppError handleConstraintViolation(ConstraintViolationException ex) {
        log.debug("Constraint violation exception encountered: {}", ex.getConstraintViolations(), ex);
        return AppError.builder()
                .errorCode("constraint violation exception")
                .errorMessage(ex.getMessage())
                       .build();
    }*/

}
