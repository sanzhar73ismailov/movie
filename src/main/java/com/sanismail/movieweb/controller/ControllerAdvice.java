package com.sanismail.movieweb.controller;

import static java.time.LocalDateTime.now;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sanismail.movieweb.exception.EntityNotFoundException;
import com.sanismail.movieweb.exception.IdHasNullValueException;
import com.sanismail.movieweb.exception.MovieAuthException;
import com.sanismail.movieweb.exception.MoviesNotFoundException;

@RestControllerAdvice
public class ControllerAdvice {
    @ResponseBody
    @ExceptionHandler({EntityNotFoundException.class, MoviesNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse objectNotFoundHandler(Exception ex) {
        return getErrorResponse(ex, HttpStatus.NOT_FOUND);
    }

    @ResponseBody
    @ExceptionHandler(IdHasNullValueException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse idHasNullValueExceptionHandler(Exception ex) {
        return getErrorResponse(ex, HttpStatus.BAD_REQUEST);
    }


    @ResponseBody
    @ExceptionHandler(MovieAuthException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorResponse authExceptionHandler(Exception ex) {
        return getErrorResponse(ex, HttpStatus.UNAUTHORIZED);
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse exceptionHandler(Exception ex) {
        return getErrorResponse(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private static ErrorResponse getErrorResponse(Exception ex, HttpStatus httpStatus) {
        return ErrorResponse.builder()
                .message(ex.getMessage())
                .error(httpStatus.getReasonPhrase())
                .status(httpStatus. value())
                .timestamp(now())
                .build();
    }
}
