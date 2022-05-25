<?php
session_start();
require_once("inc/funcions.php");

$reset = recollirDades("reset");

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Taulell Retrat Robot</title>
</head>

<body>
    <div class="taulell">
        <?php
        echo '<h2>Nom del jugador: ' . $_SESSION["nom"] . '</h2>';
        echo '<h3>Tirada: ' . $_SESSION["tiradaActual"] . '/' . $_SESSION["tiradesTotals"] . '</h3>';
        if ($_SESSION["tiradaActual"] != $_SESSION["tiradesTotals"]) {
            echo '<form action="taulell.php" method="post" class="form">';
            if ($reset == 3) {
                $_SESSION["ulls"] = mostrarImatges(3);
                echo '<button type="submit" name="reset" value="3">reset</button><br>';
                $_SESSION["nas"] = mostrarImatgesNoRand(2, $_SESSION["nas"]);
                echo '<button type="submit" name="reset" value="2">reset</button><br>';
                $_SESSION["boca"] = mostrarImatgesNoRand(1, $_SESSION["boca"]);
                echo '<button type="submit" name="reset" value="1">reset</button><br>';

            } else if ($reset == 2) {

                $_SESSION["ulls"] = mostrarImatgesNoRand(3, $_SESSION["ulls"]);
                echo '<button type="submit" value="3" name="reset">reset</button><br>';
                $_SESSION["nas"] = mostrarImatges(2);
                echo '<button type="submit" value="2" name="reset">reset</button><br>';
                $_SESSION["boca"] = mostrarImatgesNoRand(1, $_SESSION["boca"]);
                echo '<button type="submit" value="1" name="reset">reset</button><br>';

            } else if ($reset == 1) {

                $_SESSION["ulls"] = mostrarImatgesNoRand(3, $_SESSION["ulls"]);
                echo '<button type="submit" name="reset" value="3">reset</button><br>';
                $_SESSION["nas"] = mostrarImatgesNoRand(2, $_SESSION["nas"]);
                echo '<button type="submit" name="reset" value="2">reset</button><br>';
                $_SESSION["boca"] = mostrarImatges(1);
                echo '<button type="submit" name="reset" value="1">reset</button><br>';
            } else {

                $_SESSION["ulls"] = mostrarImatges(3);
                echo '<button type="submit" value="3" name="reset">reset</button><br>';
                $_SESSION["nas"] = mostrarImatges(2);
                echo '<button type="submit" value="2" name="reset">reset</button><br>';
                $_SESSION["boca"] = mostrarImatges(1);
                echo '<button type="submit" value="1" name="reset">reset</button><br>';
            }

            echo '</form>';

            $_SESSION["tiradaActual"]++;
        } else {
            if ($reset == 3) {
                $_SESSION["ulls"] = mostrarImatges(3);
                echo '<br>';
                $_SESSION["nas"] = mostrarImatgesNoRand(2, $_SESSION["nas"]);
                echo '<br>';
                $_SESSION["boca"] = mostrarImatgesNoRand(1, $_SESSION["boca"]);
                echo '<br>';
            } else if ($reset == 2) {

                $_SESSION["ulls"] = mostrarImatgesNoRand(3, $_SESSION["ulls"]);
                echo '<br>';
                $_SESSION["nas"] = mostrarImatges(2);
                echo '<br>';
                $_SESSION["boca"] = mostrarImatgesNoRand(1, $_SESSION["boca"]);
                echo '<br>';
            } else if ($reset == 1) {

                $_SESSION["ulls"] = mostrarImatgesNoRand(3, $_SESSION["ulls"]);
                echo '<br>';
                $_SESSION["nas"] = mostrarImatgesNoRand(2, $_SESSION["nas"]);
                echo '<br>';
                $_SESSION["boca"] = mostrarImatges(1);
                echo '<br>';
            }
            ?>
            <form action="resultats.php" method="post">

            <button type="submit">Veure Puntuacions</button>
            </form>
            <?php
        }

        if ($_SESSION["ulls"] == $_SESSION["nas"] && $_SESSION["ulls"] == $_SESSION["boca"]) {
            $_SESSION["marcadorJugador"]++;
        }
        ?>
    </div>

</body>

</html>