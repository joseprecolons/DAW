SELECT "Inserció de tres registres a ACTORS" Inici;
INSERT INTO ACTORS VALUES 
(21, 'Al Pacino', 'EUA', 1940, 'home'), 
(22, 'James Caan', 'EUA', 1940, 'home'), 
(23, 'Marlon Brando', 'EUA', 1924, 'home');
SELECT * FROM ACTORS;
SELECT "Inserció de tres registres a ACTORS" Final;

SELECT "Inserció de tres registres a DIRECTORS" Inici;
INSERT INTO DIRECTORS VALUES 
(12, 'Francis Ford Coppola', 'EUA'), 
(13, 'Rob Reiner', 'EUA'), 
(14, 'Elia Kazan', 'Turquia');
SELECT * FROM DIRECTORS;
SELECT "Inserció de tres registres a DIRECTORS" Final;

SELECT "Inserció de tres registres a PELLICULES" Inici;
INSERT INTO PELLICULES VALUES 
(16, 'El padrino', 'EUA', 'Paramount', 1972, 12, 246120986, 6000000), 
(17, 'Misery', 'EUA', 'Castle Rock Entertainment', 1990, 13, 61276872, 20000000), 
(18, 'La ley del silencio', 'EUA', 'Horizon Pictures', 1954, 14, 910000, 10000000);
SELECT * FROM PELLICULES;
SELECT "Inserció de tres registres a PELLICULES" Final;

SELECT "Inserció de tres registres a ACTORS_PELLICULES" Inici;
INSERT INTO ACTORS_PELLICULES VALUES 
(16, 21, 'Michael Corleone', 1), 
(16, 22, 'Don Vito Corleone', 1), 
(16, 23, 'Sonny Corleone', 1), 
(17, 22, 'Paul Sheldon', 1), 
(18, 23, 'Terry Malloy', 1);
SELECT * FROM ACTORS_PELLICULES;
SELECT "Inserció de tres registres a ACTORS_PELLICULES" Final;

SELECT "Inserció de tres registres a EXEMPLARS" Inici;
INSERT INTO EXEMPLARS VALUES 
(16, 1, 'bon estat'), 
(16, 2, 'mal estat'), 
(16, 3, 'estat regular'), 
(17, 1, 'mal estat'), 
(17, 2, 'estat regular'), 
(17, 3, 'bon estat'), 
(18, 1, 'bon estat'), 
(18, 2, 'mal estat'), 
(18, 3, 'estat regular');
SELECT * FROM EXEMPLARS;
SELECT "Inserció de tres registres a EXEMPLARS" Final;

SELECT "Inserció de tres registres a SOCIS" Inici;
INSERT INTO SOCIS VALUES 
(6666, 'Josep Recolons', 'C. Balmes, 187', 943432844, 2222), 
(7777, 'Pol Pavon', 'Av. Catalunya, 190', 943566844, 3333), 
(8888, 'Joan Pardo', 'Av. del park, 19', 978384723, 1111);
SELECT * FROM SOCIS;
SELECT "Inserció de tres registres a SOCIS" Final;

SELECT "Inserció de tres registres a PRESTECS" Inici;
INSERT INTO PRESTECS VALUES 
(6666, 16, 2, '2020-12-01', '2020-12-05'), 
(7777, 17, 3, '2020-12-01', '2020-12-09'), 
(8888, 18, 1, '2020-12-01', '2020-12-15');
SELECT * FROM PRESTECS;
SELECT "Inserció de tres registres a PRESTECS" Final;

