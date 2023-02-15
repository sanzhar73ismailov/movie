package com.sanismail.movieweb.service;

import static java.lang.String.format;

public class IdHasNullValueException extends RuntimeException {
    public IdHasNullValueException(Class classParam) {
        super(format("Entity %s has null value", classParam.getSimpleName()));
    }
}
