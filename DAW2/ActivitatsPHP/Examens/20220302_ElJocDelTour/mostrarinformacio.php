<?php
session_start();
require_once("inc/funcions.inc");
require_once("inc/constant.inc");

$mysqli = new mysqli(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);

?>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz de ciclisme </title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="estils.css">
</head>
<body>
<center>
    <div class="container bg-dark text-light">

        <h1>Resultats</h1>
        <?php
            $sql = "SELECT alias, puntuacio FROM "._TABLEUSUARIS." INNER JOIN partida WHERE partida.idusuari = usuari.id";
            $result = $mysqli->query($sql);

        ?>
        <table>
            <tbody>
        <?php
            while ($row = $result -> fetch_array()) {
              echo '</tr><td><label>'.$row["alias"].'</label></td>
              <td><label>'.$row["puntuacio"].'</label></td></tr>';  
            }
        ?>
            </tbody>
        </table>
        <form action="index.php" method="post">
            <input type="submit" value="Tornar al Quiz">
        </form>
    <center>

</body>
</html>