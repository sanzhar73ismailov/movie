package com.sanismail.movieweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sanismail.movieweb.model.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query(value = "SELECT DISTINCT m.* FROM main.movie m " +
            "       INNER JOIN main.movie_genre mg on m.id = mg.movie_id " +
            "       WHERE mg.genre_id IN " +
            "            (SELECT genre_id FROM main.movie_genre WHERE movie_id =:movieId)" +
            "       ORDER BY m.release_year DESC" +
            "       LIMIT :size ",
            nativeQuery = true)
    List<Movie> findMoviesByMovieExampleId(@Param("movieId") Integer movieId, @Param("size") Integer size);

}
