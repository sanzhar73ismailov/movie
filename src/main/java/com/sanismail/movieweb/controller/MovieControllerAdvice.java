package com.sanismail.movieweb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sanismail.movieweb.service.exception.EntityNotFoundException;
import com.sanismail.movieweb.service.exception.IdHasNullValueException;
import com.sanismail.movieweb.service.exception.MoviesNotFoundException;

@ControllerAdvice
public class MovieControllerAdvice {
    @ResponseBody
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String objectNotFoundHandler(EntityNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(IdHasNullValueException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String idHasNullValueExceptionHandler(IdHasNullValueException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(MoviesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String moviesNotFoundExceptionExceptionHandler(MoviesNotFoundException ex) {
        return ex.getMessage();
    }
}
