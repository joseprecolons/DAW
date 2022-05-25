<?php
session_start();
require_once("inc/functions.php");
require_once("inc/constants.php");

$_SESSION["mail"] = recollirDades("mail");
$_SESSION["password"] = recollirDades("password");
$error = isset($_GET["error"])?$_GET["error"]:"";
$mail = $_SESSION["mail"];
$password = $_SESSION["password"];


$mysqli = new mysqli(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);


$sql = "SELECT * FROM " . _TABLEALUMNES . " WHERE correu = '$mail' LIMIT 1";

$result = $mysqli->query($sql);

// echo $result;

if ($error == 4) {
    header("location:index.php?error=4");
    exit();
}

if ($result -> num_rows == 0) {
    header("location:index.php?error=1");
    exit();
} else {
    while ($data = $result->fetch_array(MYSQLI_ASSOC)) {
        if ($data['passwd'] != $password) {
            header("location:index.php?error=2");
            exit();
        } else if($data['actiu'] != "1"){
            header("location:index.php?error=3");
            exit();
        } else {
            $_SESSION['id'] = $data['id'];
            $_SESSION['nom'] = $data['nom'];
            $_SESSION['cognom1'] = $data['cognom1'];
            $_SESSION['cognom2'] = $data['cognom2'];
            header("location:panell.php");
            exit();
        }
    }
}
