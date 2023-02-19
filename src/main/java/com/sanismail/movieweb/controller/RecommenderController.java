package com.sanismail.movieweb.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sanismail.movieweb.config.MapperUtil;
import com.sanismail.movieweb.dto.MovieDto;
import com.sanismail.movieweb.model.entity.Movie;
import com.sanismail.movieweb.service.MovieService;
import com.sanismail.movieweb.exception.MoviesNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * The main feature of the system is that users can pick one movie and get the list of similar movies and/or
 * movies that were liked the most by other users watching the same movie (no need for complex algorithms,
 * some simple recommendation is enough!).
 */

@RequestMapping("/recommend")
@RestController
public class RecommenderController {
    @Autowired
    MovieService movieService;
    @Autowired
    private ModelMapper modelMapper;

    /**
     * @param movieId - movie id number
     * @return Last 3 movies (by release year) of the same genres
     */

    @Operation(summary = "Get the list of similar movies")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the movies",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MovieDto.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Movies not found",
                    content = @Content)})
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/{movieId}")
    public List<MovieDto> getRecommended(@PathVariable("movieId") Integer movieId) {
        Movie movie = movieService.getById(movieId);
        List<MovieDto> movies = MapperUtil.convertList(movieService.getRecommended(movieId, 3), this::convertToDto);
        if (movies.isEmpty()) {
            throw new MoviesNotFoundException(movie.getTitle());
        }
        return movies;
    }

    private MovieDto convertToDto(Movie entity) {
        return modelMapper.map(entity, MovieDto.class);
    }

    private Movie convertToEntity(MovieDto dto) {
        return modelMapper.map(dto, Movie.class);
    }
}
