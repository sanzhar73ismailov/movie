package com.sanismail.movieweb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sanismail.movieweb.model.entity.Actor;
import com.sanismail.movieweb.repository.ActorRepository;
import com.sanismail.movieweb.exception.EntityNotFoundException;
import com.sanismail.movieweb.exception.IdHasNullValueException;

@Service
public class ActorService {
    @Autowired
    ActorRepository repository;

    public Actor save(Actor actor) {
        return repository.save(actor);
    }

    public Actor getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id, Actor.class));
    }

    public List<Actor> getAll() {
        return (List<Actor>) repository.findAll();
    }

    public Actor update(Actor actor) {
        validate(actor);
        return this.save(actor);
    }


    public void remove(Actor actor) {
        validate(actor);
        repository.deleteById(actor.getId());
    }

    private void validate(Actor actor) {
        checkIdIsNotNull(actor);
        if (!repository.existsById(actor.getId())) {
            throw new EntityNotFoundException(actor.getId(), Actor.class);
        }
    }

    private void checkIdIsNotNull(Actor actor) {
        if (actor.getId() == null) {
            new IdHasNullValueException(Actor.class);
        }
    }
}
