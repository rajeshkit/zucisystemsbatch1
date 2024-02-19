package com.zuci.cafeteria.exception;

import com.zuci.cafeteria.model.ApiError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
@Configuration
public class ApplicationExceptionHandler {
    @ExceptionHandler(CafeteriaIdNotExistException.class)
    public ApiError add(CafeteriaIdNotExistException e, HttpServletRequest request){
        List<String> stringList=new ArrayList<>();
        stringList.add(e.getMessage());
        ApiError apiError=ApiError.builder().path(request.getRequestURI())
                .message(stringList)
                .date(new Date())
                .build();
        return apiError;  //json response
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiError add1(MethodArgumentNotValidException e, HttpServletRequest request
    , BindingResult bindingResult){
        List<FieldError> fieldErrors =bindingResult.getFieldErrors();
        List<String> stringList=new ArrayList<>();
        for (FieldError fe:fieldErrors) {
           stringList.add(fe.getField() + ":"+fe.getDefaultMessage());
        }
        ApiError apiError=ApiError.builder().path(request.getRequestURI())
                .message(stringList)
                .date(new Date())
                .build();

        return apiError; //json response
    }
}
