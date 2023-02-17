package com.sanismail.movieweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sanismail.movieweb.model.entity.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer> {
}
