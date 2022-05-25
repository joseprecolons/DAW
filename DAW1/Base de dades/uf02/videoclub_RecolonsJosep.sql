drop database videoclub_RecolonsJosep;
create database videoclub_RecolonsJosep;
use videoclub_RecolonsJosep;

create table PAISOS (
    codi_pais smallint unsigned not null primary key,
    nom_pais varchar(20) not null
);

create table ACTORS (
    codi_actor smallint unsigned not null primary key,
    nom_actor varchar(40) not null,
    anynaix_actors smallint unsigned, 
    codi_pais smallint unsigned not null,
    sexe varchar(10),
    foreign key (codi_pais)
        references PAISOS (codi_pais)
);

create table PELLICULES (
    codi_peli smallint unsigned not null primary key,
    titol_peli varchar(30) not null,
    any_peli smallint
);

create table EXEMPLARS (
    codi_peli smallint unsigned not null,
    num_exemplar smallint unsigned not null,
    estat varchar(10) not null,
    primary key (codi_peli, num_exemplar),
    foreign key (codi_peli)
        references PELLICULES (codi_peli)
);

create table DIRECTORS (
    codi_director smallint unsigned not null primary key,
    nom_director varchar(40) not null,
    codi_pais smallint unsigned not null,
    foreign key (codi_pais)
        references PAISOS (codi_pais)
);

create table SOCIS (
    codi_soci smallint unsigned not null,
    nif varchar(9) not null,
    nom_soci varchar(40),
    codi_pais smallint unsigned not null,
    adre_soci varchar(40),
    telef_soci varchar(9),
    codi_avalador smallint unsigned not null,
    primary key (codi_soci),
    foreign key (codi_avalador)
        references SOCIS(codi_soci),
    foreign key (codi_pais)
        references PAISOS (codi_pais)
);

create table ACTORS_PELLICULES (
    codi_actor smallint unsigned not null,
    codi_peli smallint unsigned not null,
    paper varchar(30) not null,
    principal boolean not null,
    primary key (codi_actor, codi_peli),
    foreign key (codi_peli)
        references PELLICULES(codi_peli),
    foreign key (codi_actor)
        references ACTORS(codi_actor)
);

create table PRESTECS (
    codi_soci smallint unsigned not null,
    codi_peli smallint unsigned not null,
    num_exemplar smallint unsigned not null,
    data_prestec date not null primary key,
    data_retorn date,
    foreign key (codi_peli)
        references PELLICULES(codi_peli),
    foreign key (codi_soci)
        references SOCIS(codi_soci), 
    foreign key (num_exemplar)
        references PELLICULES(codi_peli)
);

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




