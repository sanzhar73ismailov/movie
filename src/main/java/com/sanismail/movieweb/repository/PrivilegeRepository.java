package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanismail.movieweb.model.entity.Privilege;

public interface PrivilegeRepository extends CrudRepository<Privilege, Integer> {
    Privilege findByName(String name);
}
