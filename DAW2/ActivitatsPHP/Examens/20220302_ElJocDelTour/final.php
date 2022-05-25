<?php
session_start();
require_once("inc/funcions.inc");
require_once("inc/constant.inc");

$reiniciarPuntuacio = recollirDades("reiniciarPuntuacio");

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
    <?php
    if ($reiniciarPuntuacio != "") {
        reiniciarPuntuacio($mysqli);
        echo "<h3>Puntuació reiniciada a 0</h3>";
    }   else {

    
    ?>

        <h1>Resultats </h1>

        <?php
            echo "<p>Has aconseguit ".getPuntuacio($mysqli)." punts</p>"
        ?>
        <?php
        }
        ?>

        <form action="index.php" method="post" style="display:inline">
            <input type="submit" value="Finalitzar el joc"> -
        </form>
        <form action="final.php" method="post" style="display:inline">
            <input type="submit" value="Reiniciar puntuació" name="reiniciarPuntuacio">
        </form>
    <center>

</body>
</html>