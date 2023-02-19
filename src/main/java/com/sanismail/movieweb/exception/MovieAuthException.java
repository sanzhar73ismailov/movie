package com.sanismail.movieweb.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MovieAuthException extends RuntimeException {
    private final String message;
}
