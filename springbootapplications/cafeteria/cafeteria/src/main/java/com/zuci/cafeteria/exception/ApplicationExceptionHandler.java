package com.zuci.cafeteria.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Configuration
public class ApplicationExceptionHandler {
    @ExceptionHandler(CafeteriaIdNotExistException.class)
    public String add(){
        return "Caferia id is not exist in the db update failed";
    }
}
