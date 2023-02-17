package com.sanismail.movieweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanismail.movieweb.dto.UserDto;
import com.sanismail.movieweb.model.entity.User;
import com.sanismail.movieweb.service.UserService;
import com.sanismail.movieweb.util.GenericResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import jakarta.servlet.http.HttpServletRequest;

@RestController
public class RegistrationRestController {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

//    @Autowired
//    UserService userService;
//
//    @PostMapping("/user/registration")
//    public GenericResponse registerUserAccount(final UserDto accountDto, final HttpServletRequest request) {
//        LOGGER.debug("Registering user account with information: {}", accountDto);
//        final User registered = userService.registerNewUserAccount(accountDto);
//        LOGGER.info("user with ID {} registered", registered.getId());
//        return new GenericResponse("success");
//    }
}
