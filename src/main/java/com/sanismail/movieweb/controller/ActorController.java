package com.sanismail.movieweb.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
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

import com.sanismail.movieweb.config.MapperUtil;
import com.sanismail.movieweb.dto.ActorDto;
import com.sanismail.movieweb.model.entity.Actor;
import com.sanismail.movieweb.service.ActorService;

@RequestMapping("/actor")
@RestController
public class ActorController {
    @Autowired
    ActorService service;
    @Autowired
    private ModelMapper modelMapper;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/")
    public ActorDto create(@RequestBody ActorDto object) {
        return convertToDto(service.save(convertToEntity(object)));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/{id}")
    public ActorDto read(@PathVariable("id") Integer id) {
        return convertToDto(service.getById(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    public List<ActorDto> readAll() {
        return MapperUtil.convertList(service.getAll(), this::convertToDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "/")
    public ActorDto update(@RequestBody ActorDto object) {
        return convertToDto(service.update(convertToEntity(object)));
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(path = "/")
    public void delete(@RequestBody ActorDto object) {
        service.remove(convertToEntity(object));
    }

    private ActorDto convertToDto(Actor entity) {
        return modelMapper.map(entity, ActorDto.class);
    }

    private Actor convertToEntity(ActorDto dto) {
        return modelMapper.map(dto, Actor.class);
    }
}
