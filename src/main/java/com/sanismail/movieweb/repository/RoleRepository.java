package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sanismail.movieweb.model.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}
