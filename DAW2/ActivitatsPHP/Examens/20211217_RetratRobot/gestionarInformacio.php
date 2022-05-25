<?php
session_start();
require_once("inc/funcions.php");

$nom = recollirDades("nom");

$_SESSION["nom"] = $nom;

$tiradesTotals = recollirDades("tirades");
$_SESSION["tiradesTotals"] = $tiradesTotals;
$_SESSION["tiradaActual"] = 0;
$_SESSION["marcadorJugador"] = 0;

$_SESSION["ulls"];
$_SESSION["nas"];
$_SESSION["boca"];
header("location:taulell.php");
?>