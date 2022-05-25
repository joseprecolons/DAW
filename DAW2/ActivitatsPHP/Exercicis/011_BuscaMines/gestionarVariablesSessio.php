<?php
session_start();
require_once("inc/functions.php");

$_SESSION["nom"] = recollirDades("nom");

$nivell = recollirDades("nivell");
if ($nivell == 0) {
    $_SESSION["nivell"] = '8,8,10';
} else if ($nivell == 1) {
    $_SESSION["nivell"] = '16,16,40';
} else if ($nivell == 2) {
    $_SESSION["nivell"] = '16,30,99'; 
}

header("location:taulell.php");
?>