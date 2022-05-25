<?php
session_start();
require_once("inc/funcions.php");

$jugadorMoviment1;
$jugadorMoviment2;

$valors = array(
    "0" => "imgs/lagarto.png",
    "1" => "imgs/paper.png",
    "2" => "imgs/pedra.png",
    "3" => "imgs/spock.png",
    "4" => "imgs/tisores.png"
);

$_SESSION["tiradaActual"] = isset($_POST["reiniciarPartida"]) ? 0 : $_SESSION["tiradaActual"];
$_SESSION["marcadorJugador1"] = isset($_POST["reiniciarPartida"]) ? 0 : $_SESSION["marcadorJugador1"];
$_SESSION["marcadorJugador2"] = isset($_POST["reiniciarPartida"]) ? 0 : $_SESSION["marcadorJugador2"];
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="styles/styleTaulell.css" rel="stylesheet" type="text/css">
    <title>taulell</title>
</head>

<body>
    <div class="taulell">
        <?php
        echo '<h2>' . $_SESSION["nom1"] . ' - ' . $_SESSION["nom2"] . '</h2>';

        if ($_SESSION["tiradaActual"] != 0) {

            echo '<h3>Tirada: ' . $_SESSION["tiradaActual"] . '/' . $_SESSION["tiradesTotals"] . '</h3>';
            echo '<h3>' . $_SESSION["marcadorJugador1"] . ' - ' . $_SESSION["marcadorJugador2"] . '</h3>';

            $jugadorMoviment1 = mostrarImatge($valors);
            $jugadorMoviment2 = mostrarImatge($valors);

            if ($jugadorMoviment1 == $jugadorMoviment2) {
                echo '<p> Empat entre el jugador ' . $_SESSION["nom1"] . ' i el jugador ' . $_SESSION["nom2"];
            } else {
                $_SESSION["marcadorJugador1"] = guanyadorPartida($jugadorMoviment1, $jugadorMoviment2, $_SESSION["nom1"], $_SESSION["marcadorJugador1"]);
                $_SESSION["marcadorJugador2"] = guanyadorPartida($jugadorMoviment2, $jugadorMoviment1, $_SESSION["nom2"], $_SESSION["marcadorJugador2"]);
            }

            if ($_SESSION["tiradaActual"] < $_SESSION["tiradesTotals"]) {
        ?>
                <form action="taulell.php" method="post">

                    <?php

                    $_SESSION["tiradaActual"]++;
                    ?>
                    <button type="submit">Següent tirada</button>
                </form>
            <?php } else { ?>

                <form action="pantallaFinal.php" method="post">
                    <button type="submit">Resultat Final</button>
                </form>

            <?php } ?>
            <form action="taulell.php" method="post">
                <input type="hidden" name="reiniciarPartida" value="true">
                <button type="submit">Reiniciar Partida</button>
            </form>
        <?php } else { ?>

            <form action="taulell.php" method="post">
                <?php
                $_SESSION["tiradaActual"]++;
                ?>
                <button type="submit">Tirar</button>
            </form>

        <?php } ?>

    </div>
</body>

</html>