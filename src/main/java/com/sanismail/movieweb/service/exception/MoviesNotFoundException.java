package com.sanismail.movieweb.service.exception;

import static java.lang.String.format;

import com.sanismail.movieweb.dto.MovieDto;


public class MoviesNotFoundException extends RuntimeException {
    public MoviesNotFoundException(String title) {
        super(format("Could not recommend any movies for '%s'", title));
    }
}
