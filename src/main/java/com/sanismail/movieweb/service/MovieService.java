package com.sanismail.movieweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanismail.movieweb.model.entity.Actor;
import com.sanismail.movieweb.model.entity.Movie;
import com.sanismail.movieweb.repository.MovieRepository;
import com.sanismail.movieweb.service.exception.EntityNotFoundException;
import com.sanismail.movieweb.service.exception.IdHasNullValueException;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;

    public Movie save(Movie entity) {
        return repository.save(entity);
    }

    public Movie getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id, Movie.class));
    }

    public List<Movie> getAll() {
        return (List<Movie>) repository.findAll();
    }

    public Movie update(Movie entity) {
        validate(entity);
        return this.save(entity);
    }


    public void remove(Movie entity) {
        validate(entity);
        repository.deleteById(entity.getId());
    }

    private void validate(Movie entity) {
        checkIdIsNotNull(entity);
        if (!repository.existsById(entity.getId())) {
            throw new EntityNotFoundException(entity.getId(), Actor.class);
        }
    }

    private void checkIdIsNotNull(Movie entity) {
        if (entity.getId() == null) {
            new IdHasNullValueException(Actor.class);
        }
    }
}
