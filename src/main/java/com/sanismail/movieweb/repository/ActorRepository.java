package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sanismail.movieweb.model.entity.Actor;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Integer> {
}
