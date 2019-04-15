package com.fr.formation.students.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice // Indique à Spring que l'on va custom quelque chose qui concerne les controlleurs
public class CustomControllerAdvice extends ResponseEntityExceptionHandler { // Fourni des méthodes utilitaires de gestion d'exception

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<FieldError> errors = ex.getBindingResult().getFieldErrors();

        List<ValidationError> customErrors = new ArrayList<>();

        for (FieldError error : errors) {
            String attributeName = error.getField();
            String errorCode = error.getCode();

            ValidationError customError = new ValidationError();
            customError.setAttributeName(attributeName);
            customError.setErrorCode(errorCode);
            customErrors.add(customError);
        }

        ApiErrors apiErrors = new ApiErrors();
        apiErrors.setErrors(customErrors);
        apiErrors.setTimestamp(LocalDateTime.now());
        apiErrors.setTotalErrors(customErrors.size());
        HttpStatus newstatus = HttpStatus.UNPROCESSABLE_ENTITY;
        apiErrors.setHttpCode(newstatus.value());
        apiErrors.setHttpMessage(newstatus.getReasonPhrase());

        return new ResponseEntity<Object>(apiErrors, headers, newstatus);
    }
}
