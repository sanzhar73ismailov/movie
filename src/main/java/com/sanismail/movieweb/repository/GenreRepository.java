package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sanismail.movieweb.model.entity.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Integer> {
}
