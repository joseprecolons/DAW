-- phpMyAdmin SQL Dump
-- version 4.4.15.10
-- https://www.phpmyadmin.net
--
-- Servidor: localhost
-- Temps de generació: 02-03-2022 a les 18:01:05
-- Versió del servidor: 10.3.28-MariaDB
-- Versió de PHP: 7.3.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de dades: `eljocdeltour`
--

-- --------------------------------------------------------

--
-- Estructura de la taula `corredor`
--

CREATE TABLE IF NOT EXISTS `corredor` (
  `id` int(3) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `foto` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

--
-- Bolcant dades de la taula `corredor`
--

INSERT INTO `corredor` (`id`, `nom`, `foto`) VALUES
(1, 'Richard Carapaz', '01.jpeg'),
(2, 'Chris Froome', '02.jpeg'),
(3, 'Carlos Verona', '03.jpeg'),
(4, 'Remco Evenepoel', '04.jpeg'),
(5, 'Victor Campenaerts', '05.jpeg'),
(6, 'Simon Yates', '06.jpeg'),
(7, 'Mikel Landa', '07.jpeg'),
(8, 'Fernand Gaviria', '08.jpeg'),
(9, 'Samuel Gaze', '09.jpeg'),
(10, 'Victor Koretzky', '10.jpeg'),
(11, 'Filipo Gana', '11.jpeg'),
(12, 'Marc SOler', '12.jpeg'),
(13, 'Jack Haig', '13.jpeg'),
(14, 'Sepp Kuss', '14.jpeg'),
(15, 'Romain Bardet', '15.jpeg');

-- --------------------------------------------------------

--
-- Estructura de la taula `partida`
--

CREATE TABLE IF NOT EXISTS `partida` (
  `idusuari` int(3) NOT NULL,
  `numpartida` int(3) NOT NULL,
  `puntuacio` int(4) NOT NULL,
  `datahora` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `usuari`
--

CREATE TABLE IF NOT EXISTS `usuari` (
  `id` int(3) NOT NULL,
  `alias` varchar(255) NOT NULL,
  `actiu` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Bolcant dades de la taula `usuari`
--

INSERT INTO `usuari` (`id`, `alias`, `actiu`) VALUES
(1, 'user1', 1),
(2, 'user2', 0);

--
-- Indexos per taules bolcades
--

--
-- Index de la taula `corredor`
--
ALTER TABLE `corredor`
  ADD PRIMARY KEY (`id`);

--
-- Index de la taula `usuari`
--
ALTER TABLE `usuari`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per les taules bolcades
--

--
-- AUTO_INCREMENT per la taula `corredor`
--
ALTER TABLE `corredor`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT per la taula `usuari`
--
ALTER TABLE `usuari`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
