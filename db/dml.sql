delete from main.movie_actor;
delete from main.movie_genre;
delete from main.muser_movie_rating;
delete from main.muser_mrole;
delete from main.mrole_privilege;
delete from main.actor;
delete from main.movie;
delete from main.genre;
delete from main.muser;
delete from main.mrole;
delete from main.privilege;


INSERT INTO main.actor(id, name, date_birth, sex) VALUES (1, 'Robert De Niro', '1943-08-17', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (2, 'Alfredo James Pacino', '1940-04-25', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (3, 'Marlon Brando', '1924-04-03', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (4, 'James Edmund Caan', '1940-04-26', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (5, 'Diane Keaton', '1946-01-05', 'female');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (6, 'Charlize Theron', '1975-08-07', 'female');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (7, 'Keanu Charles Reeves', '1964-09-02', 'male');

INSERT INTO main.movie(id, title, description, film_director, release_year) 
VALUES (1,'God Father','','Francis Ford Coppola','1972');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
VALUES (2,'Devil''s Advocate','','Taylor Hackford','1997');

INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (3,'Detective 1','','FIlm dir Detective 1','1991');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (4,'Detective 2','','FIlm dir Detective 2','1992');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (5,'Detective 3','','FIlm dir Detective 3','1993');

INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (6,'Fantasy 1','','FIlm dir Fantasy 1','1981');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (7,'Fantasy 2','','FIlm dir Fantasy 2','1982');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (8,'Fantasy 3','','FIlm dir Fantasy 3','1983');

INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (9,'Thriller 1','','FIlm dir Thriller 1','2001');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (10,'Thriller 2','','FIlm dir Thriller 2','2002');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (11,'Thriller 3','','FIlm dir Thriller 3','2003');
INSERT INTO main.movie(id, title, description, film_director, release_year) 
   VALUES (12,'Musicals (Dance) 1','','Musicals (Dance) 1','1977');


INSERT INTO main.genre(id, name) VALUES (1,'Action');
INSERT INTO main.genre(id, name) VALUES (2,'Horror');
INSERT INTO main.genre(id, name) VALUES (3,'Adventure');
INSERT INTO main.genre(id, name) VALUES (4,'Musicals (Dance)');
INSERT INTO main.genre(id, name) VALUES (5,'Comedy (& Black Comedy)');
INSERT INTO main.genre(id, name) VALUES (6,'Science Fiction');
INSERT INTO main.genre(id, name) VALUES (7,'Crime & Gangster');
INSERT INTO main.genre(id, name) VALUES (8,'War (Anti-War)');
INSERT INTO main.genre(id, name) VALUES (9,'Drama');
INSERT INTO main.genre(id, name) VALUES (10,'Westerns');
INSERT INTO main.genre(id, name) VALUES (11,'Epics/Historical/Period');
INSERT INTO main.genre(id, name) VALUES (12,'Fantasy');
INSERT INTO main.genre(id, name) VALUES (13,'Thriller');
INSERT INTO main.genre(id, name) VALUES (14,'Detective');

insert into main.movie_actor (movie_id, actor_id) values(1,1);
insert into main.movie_actor (movie_id, actor_id) values(1,2);
insert into main.movie_actor (movie_id, actor_id) values(1,3);
insert into main.movie_actor (movie_id, actor_id) values(1,4);
insert into main.movie_actor (movie_id, actor_id) values(1,5);
insert into main.movie_actor (movie_id, actor_id) values(2,2);
insert into main.movie_actor (movie_id, actor_id) values(2,6);
insert into main.movie_actor (movie_id, actor_id) values(2,7);

insert into main.movie_genre (movie_id, genre_id) values(1,7);
insert into main.movie_genre (movie_id, genre_id) values(1,9);
insert into main.movie_genre (movie_id, genre_id) values(2,9);
insert into main.movie_genre (movie_id, genre_id) values(2,12);
insert into main.movie_genre (movie_id, genre_id) values(2,13);
insert into main.movie_genre (movie_id, genre_id) values(2,14);
insert into main.movie_genre (movie_id, genre_id) values(3,14);
insert into main.movie_genre (movie_id, genre_id) values(4,14);
insert into main.movie_genre (movie_id, genre_id) values(5,14);
insert into main.movie_genre (movie_id, genre_id) values(6,12);
insert into main.movie_genre (movie_id, genre_id) values(7,12);
insert into main.movie_genre (movie_id, genre_id) values(8,12);
insert into main.movie_genre (movie_id, genre_id) values(9,13);
insert into main.movie_genre (movie_id, genre_id) values(10,13);
insert into main.movie_genre (movie_id, genre_id) values(11,13);
insert into main.movie_genre (movie_id, genre_id) values(11,4);

INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (1, 1, 1, 9);
INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (2, 1, 2, 5);
INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (3, 2, 1, 3);
INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (4, 2, 2, 8);

INSERT INTO main.muser(id, email, password, name)	VALUES (1, 'petr@gmail.com', 'pass111', 'Petr Nowak');
INSERT INTO main.muser(id, email, password, name)	VALUES (2, 'iwona@gmail.com', 'pass222', 'Iwona Kowalska');
/*
INSERT INTO main.mrole(id, name) VALUES (1, 'admin');
INSERT INTO main.mrole(id, name) VALUES (2, 'user');
INSERT INTO main.mrole(id, name) VALUES (3, 'guest');
INSERT INTO main.muser_mrole(muser_id, mrole_id) VALUES (1, 1);
INSERT INTO main.muser_mrole(muser_id, mrole_id) VALUES (2, 2);
*/
