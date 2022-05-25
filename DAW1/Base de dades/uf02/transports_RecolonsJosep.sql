drop database if exists transports_RecolonsJosep;
create database transports_RecolonsJosep;
use transports_RecolonsJosep;

create table CAMIONERS (
    codi_camioner smallint not null auto_increment primary key,
    nif varchar(9) not null,
    nom_camioner varchar(40) not null,
    tlf_camioner varchar(9),
    adre_camioner varchar(40),
    salari_camioner smallint unsigned,
    poblacio_camioner varchar(40)
);

create table CAMIONS (
    codi_camio smallint not null auto_increment primary key,
    matricula varchar(7) not null,
    model varchar(40),
    tipus varchar(20),
    potencia smallint unsigned
);

create table PAQUETS (
    codi_paquet smallint not null auto_increment primary key,
    descripcio varchar(255),
    destinatari varchar(40) not null,
    adre_destinatari varchar(30) not null
);

create table PROVINCIA (
    codi_provincia smallint not null auto_increment primary key,
    nom_provincia varchar(20) not null
);

create table CONDUIR (
    codi_camioner smallint not null,
    codi_camio smallint not null,
    data_conduccio date not null,
    primary key(codi_camioner, codi_camio),
    foreign key (codi_camioner)
        references CAMIONERS(codi_camioner),
    foreign key (codi_camio)
        references CAMIONS(codi_camio)
);

SELECT "Inserció de tres registres a CAMIONERS" Inici;
INSERT INTO CAMIONERS(nif, nom_camioner, tlf_camioner, adre_camioner, salari_camioner, poblacio_camioner) VALUES
('75495862H', 'Josep', '547823486', 'C. Balmes, 187', 3000, 'Mataró'), 
('94343244F', 'Pol', '628765345', 'Av. Catalunya, 190', 4000, 'Mataró'), 
('75495862H', 'Joan', '645476895', 'Av. del park, 19', 3500, 'Mataró');
SELECT * FROM CAMIONERS;
SELECT "Inserció de tres registres a CAMIONERS" Final;

SELECT "Inserció de tres registres a CAMIONS" Inici;
INSERT INTO CAMIONS(matricula, model, tipus, potencia) VALUES
('4356HKL', 'Model A', 'Tipus 1', '657'), 
('2049KKD', 'Model B', 'Tipus 2', '830'), 
('1964LDP', 'Model C', 'Tipus 3', '558');
SELECT * FROM CAMIONS;
SELECT "Inserció de tres registres a CAMIONS" Final;

SELECT "Inserció de tres registres a PAQUETS" Inici;
INSERT INTO PAQUETS(descripcio, destinatari, adre_destinatari) VALUES
('El término paquete, que procede del vocablo francés paquet, tiene múltiples significados. Un paquete puede ser un recipiente que se emplea para transportar o entregar un producto. ... El concepto alude tanto al envoltorio como al contenido.', 'Josep', 'C. Balmes, 187'), 
('El término paquete, que procede del vocablo francés paquet, tiene múltiples significados. Un paquete puede ser un recipiente que se emplea para transportar o entregar un producto. ... El concepto alude tanto al envoltorio como al contenido.', 'Pol', 'Av. Catalunya, 190'), 
('El término paquete, que procede del vocablo francés paquet, tiene múltiples significados. Un paquete puede ser un recipiente que se emplea para transportar o entregar un producto. ... El concepto alude tanto al envoltorio como al contenido.', 'Joan', 'Av. del park, 19');
SELECT * FROM PAQUETS;
SELECT "Inserció de tres registres a PAQUETS" Final;

SELECT "Inserció de tres registres a CONDUIR" Inici;
INSERT INTO CONDUIR VALUES
(1, 2, '2021-1-01'), 
(2, 1, '2021-1-03'),
(3, 2, '2021-1-08');
SELECT * FROM CONDUIR;
SELECT "Inserció de tres registres a CONDUIR" Final;