package com.sanismail.movieweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanismail.movieweb.model.entity.Actor;
import com.sanismail.movieweb.model.entity.Genre;
import com.sanismail.movieweb.repository.GenreRepository;
import com.sanismail.movieweb.service.exception.EntityNotFoundException;
import com.sanismail.movieweb.service.exception.IdHasNullValueException;

@Service
public class GenreService {
    @Autowired
    GenreRepository repository;

    public Genre save(Genre entity) {
        return repository.save(entity);
    }

    public Genre getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id, Genre.class));
    }

    public List<Genre> getAll() {
        return (List<Genre>) repository.findAll();
    }

    public Genre update(Genre entity) {
        validate(entity);
        return this.save(entity);
    }


    public void remove(Genre entity) {
        validate(entity);
        repository.deleteById(entity.getId());
    }

    private void validate(Genre entity) {
        checkIdIsNotNull(entity);
        if (!repository.existsById(entity.getId())) {
            throw new EntityNotFoundException(entity.getId(), Actor.class);
        }
    }

    private void checkIdIsNotNull(Genre entity) {
        if (entity.getId() == null) {
            new IdHasNullValueException(Actor.class);
        }
    }
}
