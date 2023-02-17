package com.sanismail.movieweb.dto;

import java.util.Objects;
import java.util.Set;

import org.hibernate.Hibernate;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sanismail.movieweb.model.entity.Actor;
import com.sanismail.movieweb.model.entity.Genre;
import com.sanismail.movieweb.model.entity.Image;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
private Integer id;
    private String title;
    private String description;
    private String filmDirector;
    private Integer releaseYear;
    private Set<ImageDto> images;
    private Set<ActorDto> actors;
    private Set<GenreDto> genres;
}
