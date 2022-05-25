<?php
session_start();
require_once("inc/funcions.php");

$nom1 = recollirDades("nom1");
$_SESSION["nom1"] = $nom1;

$nom2 = recollirDades("nom2");
$_SESSION["nom2"] = $nom2;

$tiradesTotals = recollirDades("tirades");
$_SESSION["tiradesTotals"] = $tiradesTotals;

$_SESSION["tiradaActual"] = 0;

$_SESSION["marcadorJugador1"] = 0;
$_SESSION["marcadorJugador2"] = 0;


header("location:taulell.php");
?>