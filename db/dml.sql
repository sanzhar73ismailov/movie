delete from main.movie_actor;
delete from main.movie_genre;
delete from main.actor;
delete from main.movie;
delete from main.genre;
delete from main.muser;
delete from main.mrole;
delete from main.muser_movie_rating;
delete from main.muser_mrole;






INSERT INTO main.actor(id, name, date_birth, sex) VALUES (1, 'Robert De Niro', '1943-08-17', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (2, 'Alfredo James Pacino', '1940-04-25', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (3, 'Marlon Brando', '1924-04-03', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (4, 'James Edmund Caan', '1940-04-26', 'male');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (5, 'Diane Keaton', '1946-01-05', 'female');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (6, 'Charlize Theron', '1975-08-07', 'female');
INSERT INTO main.actor(id, name, date_birth, sex) VALUES (7, 'Keanu Charles Reeves', '1964-09-02', 'male');

INSERT INTO main.movie(id, title, description, film_director, release_year) VALUES (1,'God Father','','Francis Ford Coppola','1972');
INSERT INTO main.movie(id, title, description, film_director, release_year) VALUES (2,'Devil''s Advocate','','Taylor Hackford','1997');

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

insert into main.movie_actor (id, movie_id, actor_id) values(1,1,1);
insert into main.movie_actor (id, movie_id, actor_id) values(2,1,2);
insert into main.movie_actor (id, movie_id, actor_id) values(3,1,3);
insert into main.movie_actor (id, movie_id, actor_id) values(4,1,4);
insert into main.movie_actor (id, movie_id, actor_id) values(5,1,5);
insert into main.movie_actor (id, movie_id, actor_id) values(6,2,2);
insert into main.movie_actor (id, movie_id, actor_id) values(7,2,6);
insert into main.movie_actor (id, movie_id, actor_id) values(8,2,7);

insert into main.movie_genre (id, movie_id, genre_id) values(1,1,7);
insert into main.movie_genre (id, movie_id, genre_id) values(2,1,9);
insert into main.movie_genre (id, movie_id, genre_id) values(3,2,9);
insert into main.movie_genre (id, movie_id, genre_id) values(4,2,12);
insert into main.movie_genre (id, movie_id, genre_id) values(5,2,13);
insert into main.movie_genre (id, movie_id, genre_id) values(6,2,14);

INSERT INTO main.muser(id, login, password, name)	VALUES (1, 'petr1', 'pass111', 'Petr Nowak');
INSERT INTO main.muser(id, login, password, name)	VALUES (2, 'iwona1', 'pass222', 'Iwona Kowalska');
	
INSERT INTO main.mrole(id, name) VALUES (1, 'admin');
INSERT INTO main.mrole(id, name) VALUES (2, 'user');
INSERT INTO main.mrole(id, name) VALUES (3, 'guest');
	
INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (1, 1, 1, 9);
INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (2, 1, 2, 5);
INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (3, 2, 1, 3);
INSERT INTO main.muser_movie_rating(id, muser_id, movie_id, rating)	VALUES (4, 2, 2, 8);

INSERT INTO main.muser_mrole(id, muser_id, mrole_id) VALUES (1, 1, 1);
INSERT INTO main.muser_mrole(id, muser_id, mrole_id) VALUES (2, 2, 2);

