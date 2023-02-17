package com.sanismail.movieweb.service.exception;

import static java.lang.String.format;

public class IdHasNullValueException extends RuntimeException {
    public IdHasNullValueException(Class classParam) {
        super(format("Entity %s has null value", classParam.getSimpleName()));
    }
}
