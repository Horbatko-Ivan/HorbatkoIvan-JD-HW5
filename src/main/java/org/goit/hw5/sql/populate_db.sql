INSERT INTO worker (id, name, birthday, level, salary)
VALUES (1, 'Francklyn', '1982-03-15', 'Trainee', 11688);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (2, 'Vivyan', '1981-05-15', 'Trainee', 2937);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (3, 'Krystle', '1980-10-15', 'Trainee', 10979);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (4, 'Juan', '1985-03-05', 'Junior', 13616);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (5, 'Faustina', '1980-11-29', 'Senior', 8880);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (6, 'Esme', '1984-03-06', 'Junior', 11021);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (7, 'Lyndsey', '1986-11-19', 'Junior', 9266);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (8, 'Sonny', '1981-10-08', 'Junior', 3410);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (9, 'Patton', '1981-08-11', 'Middle', 2005);
INSERT INTO worker (id, name, birthday, level, salary)
VALUES (10, 'Rhea', '1988-04-07', 'Trainee', 9571);


INSERT INTO client (id, name)
VALUES (1, 'Ralph');
INSERT INTO client (id, name)
VALUES (2, 'Alistair');
INSERT INTO client (id, name)
VALUES (3, 'Odey');
INSERT INTO client (id, name)
VALUES (4, 'Silva');
INSERT INTO client (id, name)
VALUES (5, 'Selestina');

INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (1, 1, '2020-02-20', '2023-04-05');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (2, 3, '2019-01-22', '2022-11-20');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (3, 4, '2020-02-02', '2023-02-22');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (4, 2, '2020-02-02', '2022-09-11');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (5, 2, '2020-06-27', '2022-08-13');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (6, 3, '2022-04-16', '2022-08-31');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (7, 5, '2019-04-29', '2023-03-08');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (8, 3, '2019-11-10', '2023-04-18');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (9, 1, '2020-06-10', '2023-06-13');
INSERT INTO project (id, client_id, start_date, finish_date)
VALUES (10, 1, '2019-03-25', '2022-08-29');

INSERT INTO project_worker (project_id, worker_id)
VALUES (1, 2);
INSERT INTO project_worker (project_id, worker_id)
VALUES (1, 10);
INSERT INTO project_worker (project_id, worker_id)
VALUES (1, 5);
INSERT INTO project_worker (project_id, worker_id)
VALUES (1, 8);
INSERT INTO project_worker (project_id, worker_id)
VALUES (2, 3);
INSERT INTO project_worker (project_id, worker_id)
VALUES (2, 6);
INSERT INTO project_worker (project_id, worker_id)
VALUES (2, 7);
INSERT INTO project_worker (project_id, worker_id)
VALUES (2, 9);
INSERT INTO project_worker (project_id, worker_id)
VALUES (3, 1);
INSERT INTO project_worker (project_id, worker_id)
VALUES (3, 4);
INSERT INTO project_worker (project_id, worker_id)
VALUES (3, 9);
INSERT INTO project_worker (project_id, worker_id)
VALUES (4, 2);
INSERT INTO project_worker (project_id, worker_id)
VALUES (4, 3);
INSERT INTO project_worker (project_id, worker_id)
VALUES (4, 7);
INSERT INTO project_worker (project_id, worker_id)
VALUES (5, 10);
INSERT INTO project_worker (project_id, worker_id)
VALUES (5, 8);
INSERT INTO project_worker (project_id, worker_id)
VALUES (6, 2);
INSERT INTO project_worker (project_id, worker_id)
VALUES (7, 3);
INSERT INTO project_worker (project_id, worker_id)
VALUES (7, 4);
INSERT INTO project_worker (project_id, worker_id)
VALUES (7, 5);
INSERT INTO project_worker (project_id, worker_id)
VALUES (7, 6);
INSERT INTO project_worker (project_id, worker_id)
VALUES (7, 7);
INSERT INTO project_worker (project_id, worker_id)
VALUES (8, 4);
INSERT INTO project_worker (project_id, worker_id)
VALUES (8, 7);
INSERT INTO project_worker (project_id, worker_id)
VALUES (8, 8);
INSERT INTO project_worker (project_id, worker_id)
VALUES (9, 4);
INSERT INTO project_worker (project_id, worker_id)
VALUES (9, 5);
INSERT INTO project_worker (project_id, worker_id)
VALUES (10, 2);
INSERT INTO project_worker (project_id, worker_id)
VALUES (10, 7);
INSERT INTO project_worker (project_id, worker_id)
VALUES (10, 8);
