<?php

$nom = isset($_POST["nom"]) ? $_POST["nom"] : $_GET["nom"];
$hora = isset($_POST["hora"]) ? $_POST["hora"] : $_GET["hora"];
$minuts = isset($_POST["minuts"]) ? $_POST["minuts"] : $_GET["minuts"];



if (($hora >= 0 && $hora < 12) || ($hora == 12 && $minuts == 00)) {
    header("location:resultat.php?resultat=Bon Dia $nom");
} else if (($hora > 12 && $hora < 20) || ($hora == 20 && $minuts == 00) || ($hora == 12 && $minuts > 0)) {
    header("location:resultat.php?resultat=Bona Tarda $nom");
} else {
    header("location:resultat.php?resultat=Bona Nit $nom");
}

?>
