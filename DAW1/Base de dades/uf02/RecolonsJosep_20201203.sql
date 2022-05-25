mysql> use videoclub;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
--------------
show tables
--------------

+---------------------+
| Tables_in_videoclub |
+---------------------+
| ACTORS              |
| ACTORS_PELLICULES   |
| DIRECTORS           |
| EXEMPLARS           |
| PELLICULES          |
| PRESTECS            |
| SOCIS               |
+---------------------+
7 rows in set (0.00 sec)

mysql> -- Enunciat 1
mysql> SELECT COUNT(id_actor) Actors FROM ACTORS;
--------------
SELECT COUNT(id_actor) Actors FROM ACTORS
--------------

+--------+
| Actors |
+--------+
|     23 |
+--------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(id_peli) "Actors que fan la peli" FROM ACTORS_PELLICULES;
--------------
SELECT COUNT(id_peli) "Actors que fan la peli" FROM ACTORS_PELLICULES
--------------

+------------------------+
| Actors que fan la peli |
+------------------------+
|                     51 |
+------------------------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(id_dire) Directors FROM DIRECTORS;
--------------
SELECT COUNT(id_dire) Directors FROM DIRECTORS
--------------

+-----------+
| Directors |
+-----------+
|        14 |
+-----------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(id_peli) Pel·lícules FROM PELLICULES;
--------------
SELECT COUNT(id_peli) Pel·lícules FROM PELLICULES
--------------

+---------------+
| Pel·lícules   |
+---------------+
|            18 |
+---------------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(id_peli) Exemplars FROM EXEMPLARS;
--------------
SELECT COUNT(id_peli) Exemplars FROM EXEMPLARS
--------------

+-----------+
| Exemplars |
+-----------+
|        64 |
+-----------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(id_soci) Socis FROM SOCIS;
--------------
SELECT COUNT(id_soci) Socis FROM SOCIS
--------------

+-------+
| Socis |
+-------+
|     8 |
+-------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(id_soci) Préstecs FROM PRESTECS;
--------------
SELECT COUNT(id_soci) Préstecs FROM PRESTECS
--------------

+-----------+
| Préstecs  |
+-----------+
|        20 |
+-----------+
1 row in set (0.00 sec)

mysql> -- Enunciat 2
mysql> desc ACTORS;
--------------
desc ACTORS
--------------

+---------------+----------------------+------+-----+---------+-------+
| Field         | Type                 | Null | Key | Default | Extra |
+---------------+----------------------+------+-----+---------+-------+
| id_actor      | smallint(5) unsigned | NO   | PRI | NULL    |       |
| nom_actor     | varchar(30)          | YES  |     | NULL    |       |
| nacio_actor   | varchar(20)          | YES  |     | NULL    |       |
| anynaix_actor | smallint(5) unsigned | YES  |     | NULL    |       |
| sexe_actor    | varchar(6)           | YES  |     | NULL    |       |
+---------------+----------------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> desc ACTORS_PELLICULES;
--------------
desc ACTORS_PELLICULES
--------------

+-----------+----------------------+------+-----+---------+-------+
| Field     | Type                 | Null | Key | Default | Extra |
+-----------+----------------------+------+-----+---------+-------+
| id_peli   | smallint(5) unsigned | NO   | PRI | NULL    |       |
| id_actor  | smallint(5) unsigned | NO   | PRI | NULL    |       |
| papel     | varchar(30)          | YES  |     | NULL    |       |
| principal | tinyint(1)           | YES  |     | NULL    |       |
+-----------+----------------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

mysql> desc PELLICULES;
--------------
desc PELLICULES
--------------

+-----------------+----------------------+------+-----+---------+-------+
| Field           | Type                 | Null | Key | Default | Extra |
+-----------------+----------------------+------+-----+---------+-------+
| id_peli         | smallint(5) unsigned | NO   | PRI | NULL    |       |
| titol_peli      | varchar(40)          | YES  |     | NULL    |       |
| nacio_peli      | varchar(20)          | YES  |     | NULL    |       |
| produ_peli      | varchar(25)          | YES  |     | NULL    |       |
| any_peli        | smallint(5) unsigned | YES  |     | NULL    |       |
| id_dire_peli    | smallint(5) unsigned | YES  | MUL | NULL    |       |
| recaudacio_peli | bigint(20) unsigned  | YES  |     | NULL    |       |
| pressupost_peli | bigint(20) unsigned  | YES  |     | NULL    |       |
+-----------------+----------------------+------+-----+---------+-------+
8 rows in set (0.00 sec)

mysql> desc DIRECTORS;
--------------
desc DIRECTORS
--------------

+------------+----------------------+------+-----+---------+-------+
| Field      | Type                 | Null | Key | Default | Extra |
+------------+----------------------+------+-----+---------+-------+
| id_dire    | smallint(5) unsigned | NO   | PRI | NULL    |       |
| nom_dire   | varchar(30)          | YES  |     | NULL    |       |
| nacio_dire | varchar(20)          | YES  |     | NULL    |       |
+------------+----------------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> desc EXEMPLARS;
--------------
desc EXEMPLARS
--------------

+----------------+----------------------+------+-----+---------+-------+
| Field          | Type                 | Null | Key | Default | Extra |
+----------------+----------------------+------+-----+---------+-------+
| id_peli        | smallint(5) unsigned | NO   | PRI | NULL    |       |
| num_exemplar   | smallint(5) unsigned | NO   | PRI | NULL    |       |
| estat_exemplar | varchar(15)          | YES  |     | NULL    |       |
+----------------+----------------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> desc PRESTECS;
--------------
desc PRESTECS
--------------

+--------------+----------------------+------+-----+---------+-------+
| Field        | Type                 | Null | Key | Default | Extra |
+--------------+----------------------+------+-----+---------+-------+
| id_soci      | varchar(10)          | YES  | MUL | NULL    |       |
| id_peli      | smallint(5) unsigned | NO   | PRI | NULL    |       |
| num_exemplar | smallint(5) unsigned | NO   | PRI | NULL    |       |
| data_prestec | date                 | NO   | PRI | NULL    |       |
| data_retorn  | date                 | YES  |     | NULL    |       |
+--------------+----------------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> desc SOCIS;
--------------
desc SOCIS
--------------

+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| id_soci     | varchar(10) | NO   | PRI | NULL    |       |
| nom_soci    | varchar(30) | YES  |     | NULL    |       |
| add_soci    | varchar(50) | YES  |     | NULL    |       |
| tel_soci    | varchar(10) | YES  |     | NULL    |       |
| id_avalista | varchar(10) | YES  | MUL | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> -- Enunciat 3 a.
mysql> SELECT COUNT(id_soci) "Prèstecs de desembre 2017" FROM PRESTECS WHERE data_prestec > "2017-11-30" AND data_prestec < "2018-1-1";
--------------
SELECT COUNT(id_soci) "Prèstecs de desembre 2017" FROM PRESTECS WHERE data_prestec > "2017-11-30" AND data_prestec < "2018-1-1"
--------------

+----------------------------+
| Prèstecs de desembre 2017  |
+----------------------------+
|                          5 |
+----------------------------+
1 row in set (0.00 sec)

mysql> -- Enunciat 3 b.
mysql> SELECT COUNT(id_soci) "Préstecs de desembre 2017" FROM PRESTECS WHERE data_prestec BETWEEN "2017-11-30" AND "2018-1-1";
--------------
SELECT COUNT(id_soci) "Préstecs de desembre 2017" FROM PRESTECS WHERE data_prestec BETWEEN "2017-11-30" AND "2018-1-1"
--------------

+----------------------------+
| Préstecs de desembre 2017  |
+----------------------------+
|                          5 |
+----------------------------+
1 row in set (0.00 sec)

mysql> -- Enunciat 3 c.
mysql> SELECT COUNT(id_soci) "Préstecs de desembre 2017" FROM PRESTECS WHERE data_prestec IN ("2017-12-1","2018-12-30");
--------------
SELECT COUNT(id_soci) "Préstecs de desembre 2017" FROM PRESTECS WHERE data_prestec IN ("2017-12-1","2018-12-30")
--------------

+----------------------------+
| Préstecs de desembre 2017  |
+----------------------------+
|                          3 |
+----------------------------+

1 row in set (0.00 sec)

mysql> -- Enunciat 4 a.
mysql> SELECT nom_actor Actriu, anynaix_actor "Data Naix.", YEAR(CURDATE())-anynaix_actor Edat FROM ACTORS WHERE sexe_actor="dona";
--------------
SELECT nom_actor Actriu, anynaix_actor "Data Naix.", YEAR(CURDATE())-anynaix_actor Edat FROM ACTORS WHERE sexe_actor="dona"
--------------

+----------------------+------------+------+
| Actriu               | Data Naix. | Edat |
+----------------------+------------+------+
| Diane Kruger         |       1976 |   44 |
| Catherine Zeta-Jones |       1969 |   51 |
| Jessica Alba         |       1981 |   39 |
| Gwyneth Paltrow      |       1972 |   48 |
| Scarlett Johansson   |       1984 |   36 |
| Hayley Atwell        |       1982 |   38 |
+----------------------+------------+------+
6 rows in set (0.00 sec)

mysql> -- Enunciat 4 b.
mysql> SELECT nom_actor Actriu, anynaix_actor "Data Naix.", YEAR(CURDATE())-anynaix_actor Edat FROM ACTORS WHERE sexe_actor="dona" ORDER BY Edat;
--------------
SELECT nom_actor Actriu, anynaix_actor "Data Naix.", YEAR(CURDATE())-anynaix_actor Edat FROM ACTORS WHERE sexe_actor="dona" ORDER BY Edat
--------------

+----------------------+------------+------+
| Actriu               | Data Naix. | Edat |
+----------------------+------------+------+
| Scarlett Johansson   |       1984 |   36 |
| Hayley Atwell        |       1982 |   38 |
| Jessica Alba         |       1981 |   39 |
| Diane Kruger         |       1976 |   44 |
| Gwyneth Paltrow      |       1972 |   48 |
| Catherine Zeta-Jones |       1969 |   51 |
+----------------------+------------+------+
6 rows in set (0.00 sec)

mysql> -- Enunciat 4 c.
mysql> SELECT nom_actor Actriu, anynaix_actor "Data Naix.", YEAR(CURDATE())-anynaix_actor Edat FROM ACTORS WHERE sexe_actor="dona" AND anynaix_actor = (SELECT MAX(anynaix_actor)FROM ACTORS);
--------------
SELECT nom_actor Actriu, anynaix_actor "Data Naix.", YEAR(CURDATE())-anynaix_actor Edat FROM ACTORS WHERE sexe_actor="dona" AND anynaix_actor = (SELECT MAX(anynaix_actor)FROM ACTORS)
--------------

+--------------------+------------+------+
| Actriu             | Data Naix. | Edat |
+--------------------+------------+------+
| Scarlett Johansson |       1984 |   36 |
+--------------------+------------+------+
1 row in set (0.00 sec)

mysql> -- Enunciat 5 a.

mysql> SELECT CONCAT (nom_actor, " és ", sexe_actor,", va néixer l'any ", anynaix_actor, ", per tant té ", YEAR(CURDATE()) - anynaix_actor," anys.") FROM ACTORS;
--------------
SELECT CONCAT (nom_actor, " és ", sexe_actor,", va néixer l'any ", anynaix_actor, ", per tant té ", YEAR(CURDATE()) - anynaix_actor," anys.") FROM ACTORS
--------------

+-------------------------------------------------------------------------------------------------------------------------------------------+
| CONCAT (nom_actor, " és ", sexe_actor,", va néixer l'any ", anynaix_actor, ", per tant té ", YEAR(CURDATE()) - anynaix_actor," anys.")    |
+-------------------------------------------------------------------------------------------------------------------------------------------+
| Nicolas Cage és home, va néixer l'any 1964, per tant té 56 anys.                                                                          |
| Diane Kruger és dona, va néixer l'any 1976, per tant té 44 anys.                                                                          |
| Tom Hanks és home, va néixer l'any 1956, per tant té 64 anys.                                                                             |
| Catherine Zeta-Jones és dona, va néixer l'any 1969, per tant té 51 anys.                                                                  |
| Javier Bardem és home, va néixer l'any 1969, per tant té 51 anys.                                                                         |
| Tom Cruise és home, va néixer l'any 1962, per tant té 58 anys.                                                                            |
| Jamie Foxx és home, va néixer l'any 1967, per tant té 53 anys.                                                                            |
| Jessica Alba és dona, va néixer l'any 1981, per tant té 39 anys.                                                                          |
| Ioan Gruffudd és home, va néixer l'any 1973, per tant té 47 anys.                                                                         |
| Robert Downey Jr. és home, va néixer l'any 1965, per tant té 55 anys.                                                                     |
| Gwyneth Paltrow és dona, va néixer l'any 1972, per tant té 48 anys.                                                                       |
| Chris Hemsworth és home, va néixer l'any 1983, per tant té 37 anys.                                                                       |
| Mark Ruffalo és home, va néixer l'any 1967, per tant té 53 anys.                                                                          |
| Chris Evans és home, va néixer l'any 1981, per tant té 39 anys.                                                                           |
| Scarlett Johansson és dona, va néixer l'any 1984, per tant té 36 anys.                                                                    |
| Jeremy Renner és home, va néixer l'any 1981, per tant té 39 anys.                                                                         |
| James Spader és home, va néixer l'any 1960, per tant té 60 anys.                                                                          |
| Michael Chiklis és home, va néixer l'any 1969, per tant té 51 anys.                                                                       |
| Hayley Atwell és dona, va néixer l'any 1982, per tant té 38 anys.                                                                         |
| Sebastian Stan és home, va néixer l'any 1982, per tant té 38 anys.                                                                        |
| Al Pacino és home, va néixer l'any 1940, per tant té 80 anys.                                                                             |
| James Caan és home, va néixer l'any 1940, per tant té 80 anys.                                                                            |
| Marlon Brando és home, va néixer l'any 1924, per tant té 96 anys.                                                                         |
+-------------------------------------------------------------------------------------------------------------------------------------------+
23 rows in set (0.00 sec)

mysql> SELECT CONCAT (nom_actor, " és ", sexe_actor,", va néixer l'any ", anynaix_actor, ", per tant té ", YEAR(CURDATE()) - anynaix_actor," anys.") "Informació de l'actor" FROM ACTORS;
--------------
SELECT CONCAT (nom_actor, " és ", sexe_actor,", va néixer l'any ", anynaix_actor, ", per tant té ", YEAR(CURDATE()) - anynaix_actor," anys.") "Informació de l'actor" FROM ACTORS
--------------

+-----------------------------------------------------------------------------+
| Informació de l'actor                                                       |
+-----------------------------------------------------------------------------+
| Nicolas Cage és home, va néixer l'any 1964, per tant té 56 anys.            |
| Diane Kruger és dona, va néixer l'any 1976, per tant té 44 anys.            |
| Tom Hanks és home, va néixer l'any 1956, per tant té 64 anys.               |
| Catherine Zeta-Jones és dona, va néixer l'any 1969, per tant té 51 anys.    |
| Javier Bardem és home, va néixer l'any 1969, per tant té 51 anys.           |
| Tom Cruise és home, va néixer l'any 1962, per tant té 58 anys.              |
| Jamie Foxx és home, va néixer l'any 1967, per tant té 53 anys.              |
| Jessica Alba és dona, va néixer l'any 1981, per tant té 39 anys.            |
| Ioan Gruffudd és home, va néixer l'any 1973, per tant té 47 anys.           |
| Robert Downey Jr. és home, va néixer l'any 1965, per tant té 55 anys.       |
| Gwyneth Paltrow és dona, va néixer l'any 1972, per tant té 48 anys.         |
| Chris Hemsworth és home, va néixer l'any 1983, per tant té 37 anys.         |
| Mark Ruffalo és home, va néixer l'any 1967, per tant té 53 anys.            |
| Chris Evans és home, va néixer l'any 1981, per tant té 39 anys.             |
| Scarlett Johansson és dona, va néixer l'any 1984, per tant té 36 anys.      |
| Jeremy Renner és home, va néixer l'any 1981, per tant té 39 anys.           |
| James Spader és home, va néixer l'any 1960, per tant té 60 anys.            |
| Michael Chiklis és home, va néixer l'any 1969, per tant té 51 anys.         |
| Hayley Atwell és dona, va néixer l'any 1982, per tant té 38 anys.           |
| Sebastian Stan és home, va néixer l'any 1982, per tant té 38 anys.          |
| Al Pacino és home, va néixer l'any 1940, per tant té 80 anys.               |
| James Caan és home, va néixer l'any 1940, per tant té 80 anys.              |
| Marlon Brando és home, va néixer l'any 1924, per tant té 96 anys.           |
+-----------------------------------------------------------------------------+
23 rows in set (0.00 sec)

mysql> -- Enunciat 5 b.
mysql> SELECT CONCAT (nom_actor, " és ", sexe_actor,", va néixer l'any ", anynaix_actor, ", per tant té ", YEAR(CURDATE()) - anynaix_actor," anys.") "Informació de l'actor" FROM ACTORS;
--------------
SELECT CONCAT (nom_actor, " és ", sexe_actor,", va néixer l'any ", anynaix_actor, ", per tant té ", YEAR(CURDATE()) - anynaix_actor," anys.") "Informació de l'actor" FROM ACTORS
--------------

+-----------------------------------------------------------------------------+
| Informació de l'actor                                                       |
+-----------------------------------------------------------------------------+
| Nicolas Cage és home, va néixer l'any 1964, per tant té 56 anys.            |
| Diane Kruger és dona, va néixer l'any 1976, per tant té 44 anys.            |
| Tom Hanks és home, va néixer l'any 1956, per tant té 64 anys.               |
| Catherine Zeta-Jones és dona, va néixer l'any 1969, per tant té 51 anys.    |
| Javier Bardem és home, va néixer l'any 1969, per tant té 51 anys.           |
| Tom Cruise és home, va néixer l'any 1962, per tant té 58 anys.              |
| Jamie Foxx és home, va néixer l'any 1967, per tant té 53 anys.              |
| Jessica Alba és dona, va néixer l'any 1981, per tant té 39 anys.            |
| Ioan Gruffudd és home, va néixer l'any 1973, per tant té 47 anys.           |
| Robert Downey Jr. és home, va néixer l'any 1965, per tant té 55 anys.       |
| Gwyneth Paltrow és dona, va néixer l'any 1972, per tant té 48 anys.         |
| Chris Hemsworth és home, va néixer l'any 1983, per tant té 37 anys.         |
| Mark Ruffalo és home, va néixer l'any 1967, per tant té 53 anys.            |
| Chris Evans és home, va néixer l'any 1981, per tant té 39 anys.             |
| Scarlett Johansson és dona, va néixer l'any 1984, per tant té 36 anys.      |
| Jeremy Renner és home, va néixer l'any 1981, per tant té 39 anys.           |
| James Spader és home, va néixer l'any 1960, per tant té 60 anys.            |
| Michael Chiklis és home, va néixer l'any 1969, per tant té 51 anys.         |
| Hayley Atwell és dona, va néixer l'any 1982, per tant té 38 anys.           |
| Sebastian Stan és home, va néixer l'any 1982, per tant té 38 anys.          |
| Al Pacino és home, va néixer l'any 1940, per tant té 80 anys.               |
| James Caan és home, va néixer l'any 1940, per tant té 80 anys.              |
| Marlon Brando és home, va néixer l'any 1924, per tant té 96 anys.           |
+-----------------------------------------------------------------------------+
23 rows in set (0.00 sec)

mysql> show tables;
--------------
show tables
--------------

+---------------------+
| Tables_in_videoclub |
+---------------------+
| ACTORS              |
| ACTORS_PELLICULES   |
| DIRECTORS           |
| EXEMPLARS           |
| PELLICULES          |
| PRESTECS            |
| SOCIS               |
+---------------------+
7 rows in set (0.00 sec)

mysql> SELECT * FROM ACTORS;
--------------
SELECT * FROM ACTORS
--------------

+----------+----------------------+-------------+---------------+------------+
| id_actor | nom_actor            | nacio_actor | anynaix_actor | sexe_actor |
+----------+----------------------+-------------+---------------+------------+
|        1 | Nicolas Cage         | EUA         |          1964 | home       |
|        2 | Diane Kruger         | Alemanya    |          1976 | dona       |
|        3 | Tom Hanks            | EUA         |          1956 | home       |
|        4 | Catherine Zeta-Jones | Regne Unit  |          1969 | dona       |
|        5 | Javier Bardem        | Espanya     |          1969 | home       |
|        6 | Tom Cruise           | EUA         |          1962 | home       |
|        7 | Jamie Foxx           | EUA         |          1967 | home       |
|        8 | Jessica Alba         | EUA         |          1981 | dona       |
|        9 | Ioan Gruffudd        | Regne Unit  |          1973 | home       |
|       10 | Robert Downey Jr.    | EUA         |          1965 | home       |
|       11 | Gwyneth Paltrow      | Regne Unit  |          1972 | dona       |
|       12 | Chris Hemsworth      | Australia   |          1983 | home       |
|       13 | Mark Ruffalo         | EUA         |          1967 | home       |
|       14 | Chris Evans          | EUA         |          1981 | home       |
|       15 | Scarlett Johansson   | EUA         |          1984 | dona       |
|       16 | Jeremy Renner        | França      |          1981 | home       |
|       17 | James Spader         | Regne Unit  |          1960 | home       |
|       18 | Michael Chiklis      | EUA         |          1969 | home       |
|       19 | Hayley Atwell        | Regne Unit  |          1982 | dona       |
|       20 | Sebastian Stan       | EUA         |          1982 | home       |
|       21 | Al Pacino            | EUA         |          1940 | home       |
|       22 | James Caan           | EUA         |          1940 | home       |
|       23 | Marlon Brando        | EUA         |          1924 | home       |
+----------+----------------------+-------------+---------------+------------+
23 rows in set (0.00 sec)

mysql> INSERT INTO ACTORS (24, "Joaquin Phoenix", EUA, 1974, home);
--------------
INSERT INTO ACTORS (24, "Joaquin Phoenix", EUA, 1974, home)
--------------

ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '24, "Joaquin Phoenix", EUA, 1974, home)' at line 1
mysql> INSERT (24, "Joaquin Phoenix", EUA, 1974, home) INTO ACTORS;
--------------
INSERT (24, "Joaquin Phoenix", EUA, 1974, home) INTO ACTORS
--------------

ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(24, "Joaquin Phoenix", EUA, 1974, home) INTO ACTORS' at line 1
mysql> INSERT INTO ACTORS VALUES (24, "Joaquin Phoenix", EUA, 1974, home);
--------------
INSERT INTO ACTORS VALUES (24, "Joaquin Phoenix", EUA, 1974, home)
--------------

ERROR 1054 (42S22): Unknown column 'EUA' in 'field list'
mysql> INSERT INTO ACTORS VALUES (24,'Joaquin Phoenix', 'EUA', 1974, 'home');
--------------
INSERT INTO ACTORS VALUES (24,'Joaquin Phoenix', 'EUA', 1974, 'home')
--------------

Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO ACTORS VALUES (25,'Robert De Niro', 'EUA', 1943, 'home');
--------------
INSERT INTO ACTORS VALUES (25,'Robert De Niro', 'EUA', 1943, 'home')
--------------

Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO ACTORS VALUES (26,'Zazie Beetz', 'Alemanya', 1991, 'dona');
--------------
INSERT INTO ACTORS VALUES (26,'Zazie Beetz', 'Alemanya', 1991, 'dona')
--------------

Query OK, 1 row affected (0.05 sec)

mysql> show tables;
--------------
show tables
--------------

+---------------------+
| Tables_in_videoclub |
+---------------------+
| ACTORS              |
| ACTORS_PELLICULES   |
| DIRECTORS           |
| EXEMPLARS           |
| PELLICULES          |
| PRESTECS            |
| SOCIS               |
+---------------------+
7 rows in set (0.00 sec)

mysql> SELECT * FROM DIRECTORS;
--------------
SELECT * FROM DIRECTORS
--------------

+---------+--------------------------+------------+
| id_dire | nom_dire                 | nacio_dire |
+---------+--------------------------+------------+
|       1 | Steven Spielberg         | EUA        |
|       2 | Amenabar                 | Espanya    |
|       3 | Steve Buscemi            | EUA        |
|       4 | Jon Turteltaub           | Alemanya   |
|       5 | Michael Mann             | EUA        |
|       6 | Jon Favreau              | EUA        |
|       7 | Joss Whedon              | EUA        |
|       8 | Jon Turteltaub           | EUA        |
|       9 | Shane Black              | EUA        |
|      10 | Joe Johnston             | Australia  |
|      11 | Anthony Russo, Joe Russo | EUA        |
|      12 | Francis Ford Coppola     | EUA        |
|      13 | Rob Reiner               | EUA        |
|      14 | Elia Kazan               | Turquia    |
+---------+--------------------------+------------+
14 rows in set (0.00 sec)

mysql> INSERT INTO DIRECTORS VALUES (14,'Todd Philips', 'EUA');
--------------
INSERT INTO DIRECTORS VALUES (14,'Todd Philips', 'EUA')
--------------

ERROR 1062 (23000): Duplicate entry '14' for key 'PRIMARY'
mysql> INSERT INTO DIRECTORS VALUES (15,'Todd Philips', 'EUA');
--------------
INSERT INTO DIRECTORS VALUES (15,'Todd Philips', 'EUA')
--------------

Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM PELLICULES;
--------------
SELECT * FROM PELLICULES
--------------

+---------+-------------------------------------------+------------+---------------------------+----------+--------------+-----------------+-----------------+
| id_peli | titol_peli                                | nacio_peli | produ_peli                | any_peli | id_dire_peli | recaudacio_peli | pressupost_peli |
+---------+-------------------------------------------+------------+---------------------------+----------+--------------+-----------------+-----------------+
|       1 | La busqueda                               | EUA        | Jerry Bruckheimer Films   |     2004 |            4 |       174443000 |       100000000 |
|       2 | La terminal                               | EUA        | Dreamworks                |     2004 |            1 |       140813273 |        60000000 |
|       3 | Mar adentro                               | Espanya    | Sogepaq                   |     2004 |            2 |        38535221 |        10000000 |
|       4 | Colateral                                 | EUA        | Paramount                 |     2004 |            1 |       217764291 |        65000000 |
|       5 | Los 4 fantásticos                         | EUA        | Paramount                 |     2005 |            3 |       175424795 |       100000000 |
|       6 | Sin City                                  | EUA        | Dreamworks                |     2005 |            5 |       254152450 |       140000000 |
|       7 | Iron Man                                  | EUA        | Marvel Enterprises        |     2008 |            6 |       585174222 |       140000000 |
|       8 | Los Vengadores                            | EUA        | Marvel Enterprises        |     2012 |            7 |      1519557910 |       220000000 |
|       9 | Los Vengadores: La era de Ultron          | EUA        | Marvel Enterprises        |     2015 |            7 |      1405413868 |       250000000 |
|      10 | La busqueda 2: El diario secreto          | EUA        | Jerry Bruckheimer Films   |     2008 |            8 |       457364600 |       130000000 |
|      11 | Iron Man 2                                | EUA        | Marvel Enterprises        |     2010 |            6 |       623933331 |       200000000 |
|      12 | Iron Man 3                                | EUA        | Marvel Enterprises        |     2013 |            9 |      1215439994 |       200000000 |
|      13 | Capitán América: El primer vengador       | EUA        | Marvel Enterprises        |     2011 |           10 |       370569774 |       140000000 |
|      14 | Capitán América: El Soldado de Invierno   | EUA        | Marvel Enterprises        |     2014 |           11 |       714766572 |       170000000 |
|      15 | Capitán América: Civil War                | EUA        | Marvel Enterprises        |     2016 |           11 |      1153304495 |       250000000 |
|      16 | El padrino                                | EUA        | Paramount                 |     1972 |           12 |       246120986 |         6000000 |
|      17 | Misery                                    | EUA        | Castle Rock Entertainment |     1990 |           13 |        61276872 |        20000000 |
|      18 | La ley del silencio                       | EUA        | Horizon Pictures          |     1954 |           14 |          910000 |        10000000 |
+---------+-------------------------------------------+------------+---------------------------+----------+--------------+-----------------+-----------------+
18 rows in set (0.00 sec)

mysql> INSERT INTO PELLICULES VALUES (19,'Joker', 'EUA', 'Warner Bros.', 2019, 15, 1070401461, 55000000);
--------------
INSERT INTO PELLICULES VALUES (19,'Joker', 'EUA', 'Warner Bros.', 2019, 15, 1070401461, 55000000)
--------------

Query OK, 1 row affected (0.00 sec)

mysql> SELECT * FROM ACTORS_PELLICULES;
--------------
SELECT * FROM ACTORS_PELLICULES
--------------

+---------+----------+--------------------------------+-----------+
| id_peli | id_actor | papel                          | principal |
+---------+----------+--------------------------------+-----------+
|       1 |        1 | Benjamin Franklin Gates        |         1 |
|       1 |        2 | Abigail Chase                  |         0 |
|       2 |        3 | Viktor Navorski                |         1 |
|       2 |        4 | Amelia Warren                  |         0 |
|       3 |        5 | Ramón Sampedro                 |         1 |
|       4 |        5 | Felix                          |         0 |
|       4 |        6 | Vincent                        |         1 |
|       4 |        7 | Max                            |         0 |
|       5 |        8 | Sue Storm                      |         1 |
|       5 |        9 | Reed Richards                  |         1 |
|       5 |       14 | Johny Storm                    |         1 |
|       5 |       18 | Ben Grimm                      |         1 |
|       6 |        8 | Nancy                          |         1 |
|       7 |       10 | Tony Stark / Iron Man          |         1 |
|       7 |       11 | Pepper Potts                   |         0 |
|       8 |       10 | Tony Stark / Iron Man          |         1 |
|       8 |       11 | Pepper Potts                   |         0 |
|       8 |       12 | Thor                           |         1 |
|       8 |       13 | Bruce Banner / The Hulk        |         1 |
|       8 |       14 | Steve Rogers / Captain America |         1 |
|       8 |       15 | Natasha Romanoff / Black Widow |         1 |
|       8 |       16 | Clint Barton / Hawkeye         |         1 |
|       9 |       10 | Tony Stark / Iron Man          |         1 |
|       9 |       12 | Thor                           |         1 |
|       9 |       13 | Bruce Banner / The Hulk        |         1 |
|       9 |       14 | Steve Rogers / Captain America |         1 |
|       9 |       15 | Natasha Romanoff / Black Widow |         1 |
|       9 |       16 | Clint Barton / Hawkeye         |         1 |
|       9 |       17 | Ultron                         |         1 |
|      10 |        1 | Benjamin Franklin Gates        |         1 |
|      10 |        2 | Abigail Chase                  |         0 |
|      11 |       10 | Tony Stark / Iron Man          |         1 |
|      11 |       11 | Pepper Potts                   |         0 |
|      12 |       10 | Tony Stark / Iron Man          |         1 |
|      12 |       11 | Pepper Potts                   |         0 |
|      13 |       14 | Steve Rogers / Captain America |         1 |
|      13 |       19 | Peggy Carter                   |         0 |
|      13 |       20 | Bucky Barnes                   |         0 |
|      14 |       14 | Steve Rogers / Captain America |         1 |
|      14 |       15 | Natasha Romanoff / Black Widow |         0 |
|      14 |       20 | Bucky Barnes / Winter Soldier  |         0 |
|      15 |       10 | Tony Stark / Iron Man          |         1 |
|      15 |       14 | Steve Rogers / Captain America |         1 |
|      15 |       15 | Natasha Romanoff / Black Widow |         0 |
|      15 |       16 | Clint Barton / Hawkeye         |         1 |
|      15 |       20 | Bucky Barnes / Winter Soldier  |         0 |
|      16 |       21 | Michael Corleone               |         1 |
|      16 |       22 | Don Vito Corleone              |         1 |
|      16 |       23 | Sonny Corleone                 |         1 |
|      17 |       22 | Paul Sheldon                   |         1 |
|      18 |       23 | Terry Malloy                   |         1 |
+---------+----------+--------------------------------+-----------+
51 rows in set (0.00 sec)

mysql> INSERT INTO ACTORS_PELLICULES VALUES (19, 24, 'Arthur Fleck', 1)
    -> (19, 25, 'Murray Franklin', 1)
    -> (19, 26, 'Sohpie Dumond', 1);
--------------
INSERT INTO ACTORS_PELLICULES VALUES (19, 24, 'Arthur Fleck', 1)
(19, 25, 'Murray Franklin', 1)
(19, 26, 'Sohpie Dumond', 1)
--------------

ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(19, 25, 'Murray Franklin', 1)
(19, 26, 'Sohpie Dumond', 1)' at line 2
mysql> INSERT INTO ACTORS_PELLICULES VALUES (19, 24, 'Arthur Fleck', 1), (19, 25, 'Murray Franklin', 1), (19, 26, 'Sohpie Dumond', 1);
--------------
INSERT INTO ACTORS_PELLICULES VALUES (19, 24, 'Arthur Fleck', 1), (19, 25, 'Murray Franklin', 1), (19, 26, 'Sohpie Dumond', 1)
--------------

Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> show tables;
--------------
show tables
--------------

+---------------------+
| Tables_in_videoclub |
+---------------------+
| ACTORS              |
| ACTORS_PELLICULES   |
| DIRECTORS           |
| EXEMPLARS           |
| PELLICULES          |
| PRESTECS            |
| SOCIS               |
+---------------------+
7 rows in set (0.00 sec)

mysql> SELECT * FROM EXEMPLARS;
--------------
SELECT * FROM EXEMPLARS
--------------

+---------+--------------+----------------+
| id_peli | num_exemplar | estat_exemplar |
+---------+--------------+----------------+
|       1 |            1 | bon estat      |
|       1 |            2 | bon estat      |
|       1 |            3 | estat regular  |
|       1 |            4 | mal estat      |
|       2 |            1 | mal estat      |
|       2 |            2 | bon estat      |
|       2 |            3 | estat regular  |
|       2 |            4 | bon estat      |
|       3 |            1 | bon estat      |
|       3 |            2 | bon estat      |
|       3 |            3 | estat regular  |
|       3 |            4 | mal estat      |
|       4 |            1 | mal estat      |
|       4 |            2 | bon estat      |
|       4 |            3 | estat regular  |
|       5 |            1 | bon estat      |
|       5 |            2 | bon estat      |
|       5 |            3 | estat regular  |
|       5 |            4 | mal estat      |
|       6 |            1 | bon estat      |
|       6 |            2 | bon estat      |
|       7 |            1 | bon estat      |
|       7 |            2 | bon estat      |
|       7 |            3 | estat regular  |
|       8 |            1 | bon estat      |
|       8 |            2 | mal estat      |
|       8 |            3 | estat regular  |
|       8 |            4 | bon estat      |
|       8 |            5 | bon estat      |
|       9 |            1 | bon estat      |
|       9 |            2 | mal estat      |
|       9 |            3 | bon estat      |
|       9 |            4 | bon estat      |
|      10 |            1 | mal estat      |
|      10 |            2 | mal estat      |
|      10 |            3 | estat regular  |
|      10 |            4 | bon estat      |
|      11 |            1 | bon estat      |
|      11 |            2 | mal estat      |
|      11 |            3 | estat regular  |
|      11 |            4 | estat regular  |
|      12 |            1 | bon estat      |
|      12 |            2 | bon estat      |
|      13 |            1 | bon estat      |
|      13 |            2 | bon estat      |
|      13 |            3 | estat regular  |
|      14 |            1 | bon estat      |
|      14 |            2 | mal estat      |
|      14 |            3 | estat regular  |
|      14 |            4 | bon estat      |
|      14 |            5 | bon estat      |
|      15 |            1 | bon estat      |
|      15 |            2 | mal estat      |
|      15 |            3 | bon estat      |
|      15 |            4 | bon estat      |
|      16 |            1 | bon estat      |
|      16 |            2 | mal estat      |
|      16 |            3 | estat regular  |
|      17 |            1 | mal estat      |
|      17 |            2 | estat regular  |
|      17 |            3 | bon estat      |
|      18 |            1 | bon estat      |
|      18 |            2 | mal estat      |
|      18 |            3 | estat regular  |
+---------+--------------+----------------+
64 rows in set (0.00 sec)

mysql> show tables;
--------------
show tables
--------------

+---------------------+
| Tables_in_videoclub |
+---------------------+
| ACTORS              |
| ACTORS_PELLICULES   |
| DIRECTORS           |
| EXEMPLARS           |
| PELLICULES          |
| PRESTECS            |
| SOCIS               |
+---------------------+
7 rows in set (0.00 sec)

mysql> -- Enunciat 6
mysql> SELECT * FROM ACTORS;
--------------
SELECT * FROM ACTORS
--------------

+----------+----------------------+-------------+---------------+------------+
| id_actor | nom_actor            | nacio_actor | anynaix_actor | sexe_actor |
+----------+----------------------+-------------+---------------+------------+
|        1 | Nicolas Cage         | EUA         |          1964 | home       |
|        2 | Diane Kruger         | Alemanya    |          1976 | dona       |
|        3 | Tom Hanks            | EUA         |          1956 | home       |
|        4 | Catherine Zeta-Jones | Regne Unit  |          1969 | dona       |
|        5 | Javier Bardem        | Espanya     |          1969 | home       |
|        6 | Tom Cruise           | EUA         |          1962 | home       |
|        7 | Jamie Foxx           | EUA         |          1967 | home       |
|        8 | Jessica Alba         | EUA         |          1981 | dona       |
|        9 | Ioan Gruffudd        | Regne Unit  |          1973 | home       |
|       10 | Robert Downey Jr.    | EUA         |          1965 | home       |
|       11 | Gwyneth Paltrow      | Regne Unit  |          1972 | dona       |
|       12 | Chris Hemsworth      | Australia   |          1983 | home       |
|       13 | Mark Ruffalo         | EUA         |          1967 | home       |
|       14 | Chris Evans          | EUA         |          1981 | home       |
|       15 | Scarlett Johansson   | EUA         |          1984 | dona       |
|       16 | Jeremy Renner        | França      |          1981 | home       |
|       17 | James Spader         | Regne Unit  |          1960 | home       |
|       18 | Michael Chiklis      | EUA         |          1969 | home       |
|       19 | Hayley Atwell        | Regne Unit  |          1982 | dona       |
|       20 | Sebastian Stan       | EUA         |          1982 | home       |
|       21 | Al Pacino            | EUA         |          1940 | home       |
|       22 | James Caan           | EUA         |          1940 | home       |
|       23 | Marlon Brando        | EUA         |          1924 | home       |
|       24 | Joaquin Phoenix      | EUA         |          1974 | home       |
|       25 | Robert De Niro       | EUA         |          1943 | home       |
|       26 | Zazie Beetz          | Alemanya    |          1991 | dona       |
+----------+----------------------+-------------+---------------+------------+
26 rows in set (0.00 sec)

mysql> SELECT * FROM DIRECTORS;
--------------
SELECT * FROM DIRECTORS
--------------

+---------+--------------------------+------------+
| id_dire | nom_dire                 | nacio_dire |
+---------+--------------------------+------------+
|       1 | Steven Spielberg         | EUA        |
|       2 | Amenabar                 | Espanya    |
|       3 | Steve Buscemi            | EUA        |
|       4 | Jon Turteltaub           | Alemanya   |
|       5 | Michael Mann             | EUA        |
|       6 | Jon Favreau              | EUA        |
|       7 | Joss Whedon              | EUA        |
|       8 | Jon Turteltaub           | EUA        |
|       9 | Shane Black              | EUA        |
|      10 | Joe Johnston             | Australia  |
|      11 | Anthony Russo, Joe Russo | EUA        |
|      12 | Francis Ford Coppola     | EUA        |
|      13 | Rob Reiner               | EUA        |
|      14 | Elia Kazan               | Turquia    |
|      15 | Todd Philips             | EUA        |
+---------+--------------------------+------------+
15 rows in set (0.00 sec)

mysql> SELECT * FROM PELLICULES;
--------------
SELECT * FROM PELLICULES
--------------

+---------+-------------------------------------------+------------+---------------------------+----------+--------------+-----------------+-----------------+
| id_peli | titol_peli                                | nacio_peli | produ_peli                | any_peli | id_dire_peli | recaudacio_peli | pressupost_peli |
+---------+-------------------------------------------+------------+---------------------------+----------+--------------+-----------------+-----------------+
|       1 | La busqueda                               | EUA        | Jerry Bruckheimer Films   |     2004 |            4 |       174443000 |       100000000 |
|       2 | La terminal                               | EUA        | Dreamworks                |     2004 |            1 |       140813273 |        60000000 |
|       3 | Mar adentro                               | Espanya    | Sogepaq                   |     2004 |            2 |        38535221 |        10000000 |
|       4 | Colateral                                 | EUA        | Paramount                 |     2004 |            1 |       217764291 |        65000000 |
|       5 | Los 4 fantásticos                         | EUA        | Paramount                 |     2005 |            3 |       175424795 |       100000000 |
|       6 | Sin City                                  | EUA        | Dreamworks                |     2005 |            5 |       254152450 |       140000000 |
|       7 | Iron Man                                  | EUA        | Marvel Enterprises        |     2008 |            6 |       585174222 |       140000000 |
|       8 | Los Vengadores                            | EUA        | Marvel Enterprises        |     2012 |            7 |      1519557910 |       220000000 |
|       9 | Los Vengadores: La era de Ultron          | EUA        | Marvel Enterprises        |     2015 |            7 |      1405413868 |       250000000 |
|      10 | La busqueda 2: El diario secreto          | EUA        | Jerry Bruckheimer Films   |     2008 |            8 |       457364600 |       130000000 |
|      11 | Iron Man 2                                | EUA        | Marvel Enterprises        |     2010 |            6 |       623933331 |       200000000 |
|      12 | Iron Man 3                                | EUA        | Marvel Enterprises        |     2013 |            9 |      1215439994 |       200000000 |
|      13 | Capitán América: El primer vengador       | EUA        | Marvel Enterprises        |     2011 |           10 |       370569774 |       140000000 |
|      14 | Capitán América: El Soldado de Invierno   | EUA        | Marvel Enterprises        |     2014 |           11 |       714766572 |       170000000 |
|      15 | Capitán América: Civil War                | EUA        | Marvel Enterprises        |     2016 |           11 |      1153304495 |       250000000 |
|      16 | El padrino                                | EUA        | Paramount                 |     1972 |           12 |       246120986 |         6000000 |
|      17 | Misery                                    | EUA        | Castle Rock Entertainment |     1990 |           13 |        61276872 |        20000000 |
|      18 | La ley del silencio                       | EUA        | Horizon Pictures          |     1954 |           14 |          910000 |        10000000 |
|      19 | Joker                                     | EUA        | Warner Bros.              |     2019 |           15 |      1070401461 |        55000000 |
+---------+-------------------------------------------+------------+---------------------------+----------+--------------+-----------------+-----------------+
19 rows in set (0.00 sec)

mysql> SELECT * FROM ACTORS_PELLICULES;
--------------
SELECT * FROM ACTORS_PELLICULES
--------------

+---------+----------+--------------------------------+-----------+
| id_peli | id_actor | papel                          | principal |
+---------+----------+--------------------------------+-----------+
|       1 |        1 | Benjamin Franklin Gates        |         1 |
|       1 |        2 | Abigail Chase                  |         0 |
|       2 |        3 | Viktor Navorski                |         1 |
|       2 |        4 | Amelia Warren                  |         0 |
|       3 |        5 | Ramón Sampedro                 |         1 |
|       4 |        5 | Felix                          |         0 |
|       4 |        6 | Vincent                        |         1 |
|       4 |        7 | Max                            |         0 |
|       5 |        8 | Sue Storm                      |         1 |
|       5 |        9 | Reed Richards                  |         1 |
|       5 |       14 | Johny Storm                    |         1 |
|       5 |       18 | Ben Grimm                      |         1 |
|       6 |        8 | Nancy                          |         1 |
|       7 |       10 | Tony Stark / Iron Man          |         1 |
|       7 |       11 | Pepper Potts                   |         0 |
|       8 |       10 | Tony Stark / Iron Man          |         1 |
|       8 |       11 | Pepper Potts                   |         0 |
|       8 |       12 | Thor                           |         1 |
|       8 |       13 | Bruce Banner / The Hulk        |         1 |
|       8 |       14 | Steve Rogers / Captain America |         1 |
|       8 |       15 | Natasha Romanoff / Black Widow |         1 |
|       8 |       16 | Clint Barton / Hawkeye         |         1 |
|       9 |       10 | Tony Stark / Iron Man          |         1 |
|       9 |       12 | Thor                           |         1 |
|       9 |       13 | Bruce Banner / The Hulk        |         1 |
|       9 |       14 | Steve Rogers / Captain America |         1 |
|       9 |       15 | Natasha Romanoff / Black Widow |         1 |
|       9 |       16 | Clint Barton / Hawkeye         |         1 |
|       9 |       17 | Ultron                         |         1 |
|      10 |        1 | Benjamin Franklin Gates        |         1 |
|      10 |        2 | Abigail Chase                  |         0 |
|      11 |       10 | Tony Stark / Iron Man          |         1 |
|      11 |       11 | Pepper Potts                   |         0 |
|      12 |       10 | Tony Stark / Iron Man          |         1 |
|      12 |       11 | Pepper Potts                   |         0 |
|      13 |       14 | Steve Rogers / Captain America |         1 |
|      13 |       19 | Peggy Carter                   |         0 |
|      13 |       20 | Bucky Barnes                   |         0 |
|      14 |       14 | Steve Rogers / Captain America |         1 |
|      14 |       15 | Natasha Romanoff / Black Widow |         0 |
|      14 |       20 | Bucky Barnes / Winter Soldier  |         0 |
|      15 |       10 | Tony Stark / Iron Man          |         1 |
|      15 |       14 | Steve Rogers / Captain America |         1 |
|      15 |       15 | Natasha Romanoff / Black Widow |         0 |
|      15 |       16 | Clint Barton / Hawkeye         |         1 |
|      15 |       20 | Bucky Barnes / Winter Soldier  |         0 |
|      16 |       21 | Michael Corleone               |         1 |
|      16 |       22 | Don Vito Corleone              |         1 |
|      16 |       23 | Sonny Corleone                 |         1 |
|      17 |       22 | Paul Sheldon                   |         1 |
|      18 |       23 | Terry Malloy                   |         1 |
|      19 |       24 | Arthur Fleck                   |         1 |
|      19 |       25 | Murray Franklin                |         1 |
|      19 |       26 | Sohpie Dumond                  |         1 |
+---------+----------+--------------------------------+-----------+
54 rows in set (0.00 sec)
