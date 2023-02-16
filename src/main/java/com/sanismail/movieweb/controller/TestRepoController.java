package com.sanismail.movieweb.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanismail.movieweb.model.entity.*;
import com.sanismail.movieweb.repository.*;

@RequestMapping("/testrepo")
@RestController()
public class TestRepoController {
    @Autowired
    ActorRepository actorRepository;
    @Autowired
    GenreRepository genreRepository;
    @Autowired
    ImageRepository imageRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;


    @GetMapping(path = "/read")
    public String test() {
        List<CrudRepository> repos = List.of(
                actorRepository,
                genreRepository,
                imageRepository,
                movieRepository,
                roleRepository,
                userRepository
        );
        StringBuilder stb = new StringBuilder();
        for (CrudRepository repository : repos) {
            System.out.println("repository.getClass() = " + repository.getClass());
            Object object = repository.findById(1).orElse(String.format("no id 1 in repo %S", repository));
            stb.append("read: " + object).append("\n");
            stb.append("readAll: " + repository.findAll()).append("\n\n");
        }
        return stb.toString();
    }

    @GetMapping(path = "/create")
    public String testCreate() {
        StringBuilder stb = new StringBuilder();
        stb.append("\ngenre created: ")
                .append(genreRepository.save(Genre.builder()
                        .name("genre " + new Date())
                        .build()));
        stb.append("\nimage created: ")
                .append(imageRepository.save(Image.builder()
                        .name("image " + new Date())
                        .image(new Byte[]{1, 2, 3})
                        .movieId(1)
                        .build()));
        stb.append("\nmovie created: ")
                .append(movieRepository.save(Movie.builder()
                        .title("movie " + new Date())
                        .description("description " + new Date())
                        .filmDirector("filmDirector " + new Date())
                        .releaseYear(2001)
                        .build()));
        stb.append("\nrole created: ")
                .append(roleRepository.save(Role.builder()
                        .name("role " + new Date())
                        .build()));
        stb.append("\nuser created: ")
                .append(userRepository.save(User.builder()
                        .login("login " + new Date())
                        .password("password " + new Date())
                        .name("name " + new Date())
                        .build()));
        stb.append("\n");
        return stb.toString();
    }

    @GetMapping(path = "/readMovie")
    public String testReadMovie() {
        StringBuilder stb = new StringBuilder();
        System.out.println("repository.getClass() = " + movieRepository.getClass());
        Object object = movieRepository.findById(1).orElseThrow();
        stb.append("read: " + object).append("\n");
        stb.append("readAll: " + movieRepository.findAll()).append("\n\n");
        System.out.println("object = " + object);
        return stb.toString();
    }

    @GetMapping(path = "/readImage")
    public String testReadImage() {
        StringBuilder stb = new StringBuilder();
        System.out.println("repository.getClass() = " + imageRepository.getClass());
        Image object = imageRepository.findById(101).orElseThrow();
        stb.append("read: " + object).append("\n");
//        stb.append("readAll: " + imageRepository.findAll()).append("\n\n");
        if(object.getMovie() != null) {
            System.out.println("object = " + object.getMovie().getId());
            System.out.println("object = " + object.getMovie().getTitle());
            System.out.println("object = " + object.getMovie());
        }


        return stb.toString();
    }

    @GetMapping(path = "/readMovieAndActors")
    public String testReadMovieAndActors() {
        StringBuilder stb = new StringBuilder();
        System.out.println("repository.getClass() = " + movieRepository.getClass());
        Movie movie = movieRepository.findById(1).orElseThrow();
        stb.append("read: " + movie).append("\n");
//        stb.append("readAll: " + imageRepository.findAll()).append("\n\n");
        if(movie.getGenres() != null) {
            System.out.println("object.getGenres() = " + movie.getGenres());
        }

        Actor actor = actorRepository.findById(1).orElseThrow();
        System.out.println("actor = " + actor);

        Genre genre = genreRepository.findById(1).orElseThrow();
        System.out.println("genre=" + genre);

        return stb.toString();
    }
}
