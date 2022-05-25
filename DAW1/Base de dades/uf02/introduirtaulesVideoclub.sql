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




