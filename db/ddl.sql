/*
# Programming Tasks

These tasks consist of several aspects of programming that might be useful as an entry level for an interview.

# Task Description and Requirements
The goal of this task is to create a movie recommender system. The basic description of the system is provided below:

The application is a catalog of movies of different genres. Each movie has a title, description, film director, list of actors, and image(s) from the main playbill.
    Each movie is categorized into one or more genres.
    Only the administrator can create, remove and update the list of movies.
        Users can rate the movies according to different criteria (e.g, how novel are the ideas of the movie, their final score, etc.).
        The main feature of the system is that users can pick one movie and get the list of similar movies and/or movies that were liked
        the most by other users watching the same movie (no need for complex algorithms, some simple recommendation is enough!).
*/

CREATE SCHEMA IF NOT EXISTS main;

drop table if exists main.movie;
create table if not exists main.movie (
	id int primary key,
	title varchar(1024) not null,
	description text not null,
	film_director varchar(100) not null,
	release_year int not null
);

comment on table main.movie is 'List of movies';
comment on column main.movie.id is 'PK';
comment on column main.movie.title is 'Title of movie';
comment on column main.movie.description is 'Description of movie';
comment on column main.movie.film_director is 'Film director of movie';
comment on column main.movie.release_year is 'Release year';

drop table if exists main.actor;
create table if not exists main.actor (
	id int primary key,
	name varchar(200) not null,
	date_birth date not null,
	sex varchar(20) not null
);
comment on table main.actor is 'List of actors';
comment on column main.actor.id is 'PK';
comment on column main.actor.name is 'Name of person';
comment on column main.actor.date_birth is 'Date of birth';
comment on column main.actor.sex is 'Sex';

drop table if exists main.genre;
create table if not exists main.genre (
                                          id int primary key,
                                          name varchar(100) not null
);
comment on table main.genre is 'List of genres';
comment on column main.genre.id is 'PK';
comment on column main.genre.name is 'Genre name';

drop table if exists main.image;
create table if not exists main.image (
	id int primary key,
	name varchar(100) not null,
	image bytea not null,
	movie_id int not null
);
comment on table main.image is 'List of movie images';
comment on column main.image.id is 'PK';
comment on column main.image.name is 'Image name';
comment on column main.image.image is 'Bytes of image';
comment on column main.image.movie_id is 'FK of movie';

drop table if exists main.movie_actor;
create table if not exists main.movie_actor(
	id int primary key,
	movie_id int not null,
	actor_id int not null
);
comment on table main.movie_actor is 'Movies and actors';
comment on column main.movie_actor.id is 'PK';
comment on column main.movie_actor.movie_id is 'FK of movie';
comment on column main.movie_actor.actor_id is 'FK of actor';

drop table if exists main.movie_genre;
create table if not exists main.movie_genre(
	id int primary key,
	movie_id int not null,
	genre_id int not null
);
comment on table main.movie_genre is 'Movies and genres';
comment on column main.movie_genre.id is 'PK';
comment on column main.movie_genre.movie_id is 'FK of movie';
comment on column main.movie_genre.genre_id is 'FK of genre';


drop table if exists main.muser;
create table if not exists main.muser (
    id int primary key,
    login varchar(50) not null,
	password varchar(20) not null,
	name  varchar(50)
	
);
comment on table main.muser is 'List of users';
comment on column main.muser.id is 'PK';
comment on column main.muser.login is 'Login of user';
comment on column main.muser.password is 'Password';
comment on column main.muser.name is 'User name';

drop table if exists main.muser_movie_rating;
create table if not exists main.muser_movie_rating (
    id int primary key,
    muser_id int not null,
	movie_id int not null,
	rating int not null
	
);
comment on table main.muser_movie_rating is 'Movie rating from user';
comment on column main.muser_movie_rating.id is 'PK';
comment on column main.muser_movie_rating.muser_id is 'FK of user';
comment on column main.muser_movie_rating.movie_id is 'FK of movie';
comment on column main.muser_movie_rating.rating is 'Rating - number from1 to 10';


drop table if exists main.mrole;
create table if not exists main.mrole (
                                          id int primary key,
                                          name varchar(100) not null
);
comment on table main.mrole is 'List of roles';
comment on column main.mrole.id is 'PK';
comment on column main.mrole.name is 'Role name';

drop table if exists main.muser_mrole;
create table if not exists main.muser_mrole(
   id int primary key,
   muser_id int not null,
   mrole_id int not null
);
comment on table main.muser_mrole is 'Users and roles';
comment on column main.muser_mrole.id is 'PK';
comment on column main.muser_mrole.muser_id is 'FK of user';
comment on column main.muser_mrole.mrole_id is 'FK of role';

create sequence if not exists main.movie_seq;
create sequence if not exists main.actor_seq;
create sequence if not exists main.genre_seq;
create sequence if not exists main.image_seq;
create sequence if not exists main.movie_actor_seq;
create sequence if not exists main.movie_genre_seq;

create sequence if not exists main.muser_seq;
create sequence if not exists main.mrole_seq;
create sequence if not exists main.muser_movie_rating_seq;
create sequence if not exists main.muser_mrole_seq;


alter table if exists main.image
    add foreign key (movie_id)
    references main.movie (id);

alter table if exists main.movie_actor
    add foreign key (movie_id)
    references main.movie (id);
alter table if exists main.movie_actor
    add foreign key (actor_id)
    references main.actor (id);

alter table if exists main.movie_genre
    add foreign key (movie_id)
    references main.movie (id);
	
alter table if exists main.movie_genre
    add foreign key (genre_id)
    references main.genre (id);

alter table if exists main.muser_movie_rating
    add foreign key (muser_id)
    references main.muser (id);
	
alter table if exists main.muser_movie_rating
    add foreign key (movie_id)
    references main.movie (id);

alter table if exists main.muser_mrole
    add foreign key (muser_id)
    references main.muser (id);
	
alter table if exists main.muser_mrole
    add foreign key (mrole_id)
    references main.mrole (id);
