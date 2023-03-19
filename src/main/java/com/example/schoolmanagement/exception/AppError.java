package com.example.schoolmanagement.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppError {
    private boolean success = false;
    private String errorCode;
    private String errorMessage;
}
