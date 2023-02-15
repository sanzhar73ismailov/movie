package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanismail.movieweb.model.entity.Image;

public interface ImageRepository extends CrudRepository<Image, Integer> {
}
