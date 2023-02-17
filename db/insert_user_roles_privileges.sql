INSERT INTO main.muser(id, email, password, name)	VALUES (1, 'petr@gmail.com', 'pass111', 'Petr Nowak');
INSERT INTO main.muser(id, email, password, name)	VALUES (2, 'iwona@gmail.com', 'pass222', 'Iwona Kowalska');
	
INSERT INTO main.mrole(id, name) VALUES (1, 'admin');
INSERT INTO main.mrole(id, name) VALUES (2, 'user');
INSERT INTO main.mrole(id, name) VALUES (3, 'guest');
	
INSERT INTO main.muser_mrole(id, muser_id, mrole_id) VALUES (1, 1, 1);
INSERT INTO main.muser_mrole(id, muser_id, mrole_id) VALUES (2, 2, 2);

INSERT INTO main.privilege(	id, name)	VALUES ('1', 'CREATE-USER');
INSERT INTO main.privilege(	id, name)	VALUES ('2', 'DELETE-USER');
	
INSERT INTO main.mrole_privilege(mrole_id, privilege_id) VALUES (1, 1);
INSERT INTO main.mrole_privilege(mrole_id, privilege_id) VALUES (1, 2);
INSERT INTO main.mrole_privilege(mrole_id, privilege_id) VALUES (2, 1);
delete from main.mrole_privilege where id=3;

select * from main.privilege;
select * from main.mrole_privilege;
select * from main.mrole;
select * from main.muser;
select * from main.muser_mrole;

