-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 18-05-2021 a las 23:53:42
-- Versión del servidor: 5.5.62
-- Versión de PHP: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `examengiroditalia`
--
CREATE DATABASE IF NOT EXISTS `examengiroditalia` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `examengiroditalia`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `corredor`
--

CREATE TABLE `corredor` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `puntuacio` int(11) NOT NULL,
  `idequip` int(11) NOT NULL,
  `foto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `corredor`
--

INSERT INTO `corredor` (`id`, `nom`, `puntuacio`, `idequip`, `foto`) VALUES
(1, 'BERNAL Egan', 5, 1, NULL),
(2, 'GANNA Filippo', 4, 1, NULL),
(3, 'PUCCIO Salvatore', 2, 1, NULL),
(4, 'MERLIER Tim', 3, 2, NULL),
(5, 'KRIEGER Alexander', 2, 2, NULL),
(6, ' VERMEERSCH Gianni', 1, 2, NULL),
(7, 'LANDA Mikel', 5, 3, NULL),
(8, 'ARASHIRO Yukiya', 1, 3, NULL),
(9, 'MOHORIČ Matej', 4, 3, NULL),
(10, 'SAGAN Peter', 5, 4, NULL),
(11, 'OSS Daniel', 4, 4, NULL),
(12, 'BUCHMANN Emanuel', 2, 4, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equip`
--

CREATE TABLE `equip` (
  `id` int(11) NOT NULL,
  `nomequip` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `equip`
--

INSERT INTO `equip` (`id`, `nomequip`) VALUES
(1, ' INEOS Grenadiers'),
(2, 'Alpecin-Fenix'),
(3, 'Bahrain - Victorious'),
(4, 'BORA - hansgrohe');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `corredor`
--
ALTER TABLE `corredor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `equip`
--
ALTER TABLE `equip`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `corredor`
--
ALTER TABLE `corredor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `equip`
--
ALTER TABLE `equip`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
