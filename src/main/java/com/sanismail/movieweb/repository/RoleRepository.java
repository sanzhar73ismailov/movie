package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanismail.movieweb.model.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

//    @Override
//    void delete(Role role);
}
