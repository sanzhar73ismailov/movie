package com.sanismail.movieweb.service.exception;

import static java.lang.String.format;


public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Integer id, Class classParam) {
        super(format("Could not find %s %d", classParam.getSimpleName(), id));
    }
}
