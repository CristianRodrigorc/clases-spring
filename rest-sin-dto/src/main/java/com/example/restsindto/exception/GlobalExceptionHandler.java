package com.example.restsindto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(Exception.class)
public ResponseEntity<?> handleGeneral(Exception ex) {
    Map<String, Object> body = new HashMap<>();
    body.put("error", ex.getClass().getSimpleName());
    body.put("message", ex.getMessage());
    ex.printStackTrace(); // Imprime el stacktrace completo en consola
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
}

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidation(MethodArgumentNotValidException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("error", "Validación fallida");
        body.put("details", ex.getBindingResult().getFieldErrors().stream()
                .map(fe -> fe.getField() + ": " + fe.getDefaultMessage()).toList());
        return ResponseEntity.badRequest().body(body);
    }
}
