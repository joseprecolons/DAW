<?php
session_start();
require_once("inc/funcions.php");
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="styles/stylePantallaFinal.css" rel="stylesheet" type="text/css">
    <title>Resultats</title>
</head>

<body>
    <div class="form">
        <h2>MARCADOR</h2>
        <?php
        echo '<h3>' . $_SESSION["marcadorJugador1"] . ' - ' . $_SESSION["marcadorJugador2"] . '</h3>';
        echo '<h3>Número total de tirades: ' . $_SESSION["tiradesTotals"] . '</h3>';

        if ($_SESSION["marcadorJugador1"] > $_SESSION["marcadorJugador2"]) {
            echo '<h1>El guanyador és ' . $_SESSION["nom1"] . '</h1>';
        } else if ($_SESSION["marcadorJugador2"] > $_SESSION["marcadorJugador1"]) {
            echo '<h1>El guanyador és ' . $_SESSION["nom2"] . '</h1>';
        } else {
            echo '<h1>EMPAT</h1>';
        }
        ?>

        <form action="index.php" method="post">
            <button type="submit">Tornar a començar</button>
        </form>

        <form action="taulell.php" method="post">
            <input type="hidden" name="reiniciarPartida" value="true">
            <button type="submit">Reiniciar Partida</button>
        </form>
    </div>
</body>

</html>