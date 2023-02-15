package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanismail.movieweb.model.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
