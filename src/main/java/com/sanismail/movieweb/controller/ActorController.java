package com.sanismail.movieweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sanismail.movieweb.model.entity.Actor;
import com.sanismail.movieweb.service.ActorService;

@RequestMapping("/actor")
@RestController()
public class ActorController {
    @Autowired
    ActorService actorService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/")
    public Actor create(@RequestBody Actor actor) {
        return actorService.save(actor);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/{id}")
    public Actor read(@PathVariable("id") Integer id) {
        return actorService.getById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    public List<Actor> readAll() {
        return actorService.getAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "/")
    public Actor update(@RequestBody Actor actor) {
        return actorService.update(actor);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(path = "/")
    public void delete(@RequestBody Actor actor) {
        actorService.remove(actor);
    }
}
