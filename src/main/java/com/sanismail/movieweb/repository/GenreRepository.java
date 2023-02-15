package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanismail.movieweb.model.entity.Genre;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
}
