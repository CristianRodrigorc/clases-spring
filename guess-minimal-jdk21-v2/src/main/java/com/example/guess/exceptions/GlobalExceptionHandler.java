package com.example.guess.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity <ErrorResponse> handleIllegalArgument(IllegalArgumentException e){
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage(), 400));
    }

    public ResponseEntity <ErrorResponse> handleNotFund(NoSuchElementException e){
        return ResponseEntity.status(404).body(new ErrorResponse(e.getMessage(), 404));
    }
}
