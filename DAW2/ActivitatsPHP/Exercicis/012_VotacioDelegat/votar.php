<?php
session_start();
require_once("inc/functions.php");
require_once("inc/constants.php");

$vot = recollirDades("vot");
$id = $_SESSION['id'];

if ($vot != "") {
$mysqli = new mysqli(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);

$sql = "UPDATE "._TABLEALUMNES. " SET vota_a = $vot, data_hora_voto = SYSDATE(), ip = '".getUserIpAddr()."' WHERE id = $id";

$result = $mysqli->query($sql);

header("location:panell.php");

}
// echo $result;
