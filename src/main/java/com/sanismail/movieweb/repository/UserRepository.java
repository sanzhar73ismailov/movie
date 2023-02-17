package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanismail.movieweb.model.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
