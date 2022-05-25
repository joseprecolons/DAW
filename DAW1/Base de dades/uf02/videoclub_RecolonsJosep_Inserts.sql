SELECT "Inserció de tres registres a PAISOS" Inici;
INSERT INTO PAISOS VALUES
(1, 'EUA'), 
(2, 'Turquia'),
(3, 'Espanya');
SELECT * FROM PAISOS;
SELECT "Inserció de tres registres a PAISOS" Final;

SELECT "Inserció de tres registres a ACTORS" Inici;
INSERT INTO ACTORS VALUES 
(1, 'Al Pacino', 1940, 1, 'home'), 
(2, 'James Caan', 1940, 1, 'home'), 
(3, 'Marlon Brando', 1924, 1, 'home');
SELECT * FROM ACTORS;
SELECT "Inserció de tres registres a ACTORS" Final;

SELECT "Inserció de tres registres a DIRECTORS" Inici;
INSERT INTO DIRECTORS VALUES 
(1, 'Francis Ford Coppola', '1'), 
(2, 'Rob Reiner', '1'), 
(3, 'Elia Kazan', '2');
SELECT * FROM DIRECTORS;
SELECT "Inserció de tres registres a DIRECTORS" Final;

SELECT "Inserció de tres registres a PELLICULES" Inici;
INSERT INTO PELLICULES VALUES 
(1, 'El padrino', 1972), 
(2, 'Misery', 1990), 
(3, 'La ley del silencio', 1954);
SELECT * FROM PELLICULES;
SELECT "Inserció de tres registres a PELLICULES" Final;

SELECT "Inserció de tres registres a ACTORS_PELLICULES" Inici;
INSERT INTO ACTORS_PELLICULES VALUES 
(1, 1, 'Michael Corleone', 1),
(2, 1, 'Don Vito Corleone', 1), 
(3, 1, 'Sonny Corleone', 1), 
(2, 2, 'Paul Sheldon', 1), 
(3, 3, 'Terry Malloy', 1);
SELECT * FROM ACTORS_PELLICULES;
SELECT "Inserció de tres registres a ACTORS_PELLICULES" Final;

SELECT "Inserció de tres registres a EXEMPLARS" Inici;
INSERT INTO EXEMPLARS VALUES 
(1, 1, 'bon estat'), 
(1, 2, 'mal estat'), 
(1, 3, 'regular'), 
(2, 1, 'mal estat'), 
(2, 2, 'regular'), 
(2, 3, 'bon estat'), 
(3, 1, 'bon estat'), 
(3, 2, 'mal estat'), 
(3, 3, 'regular');
SELECT * FROM EXEMPLARS;
SELECT "Inserció de tres registres a EXEMPLARS" Final;

SELECT "Inserció de tres registres a SOCIS" Inici;
INSERT INTO SOCIS VALUES 
(1, '94343284J', 'Josep Recolons', 3, 'C. Balmes, 187', '644456775', 1), 
(2, '94343244F', 'Pol Pavon', 3, 'Av. Catalunya, 190', '628765345', 1), 
(3, '94342844D', 'Joan Pardo', 3, 'Av. del park, 19', '645476895', 1);
SELECT * FROM SOCIS;
SELECT "Inserció de tres registres a SOCIS" Final;

SELECT "Inserció de tres registres a PRESTECS" Inici;
INSERT INTO PRESTECS VALUES 
(1, 1, 2, '2020-12-01', '2020-12-05'), 
(2, 2, 3, '2020-12-02', '2020-12-09'), 
(3, 3, 1, '2020-12-03', '2020-12-15');
SELECT * FROM PRESTECS;
SELECT "Inserció de tres registres a PRESTECS" Final;

