<?php
function recollirDades($nomCamp)
{
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp] : "";
}

function mostrarImatge($valors)
{
    $num = rand(0, 4);
    foreach ($valors as $clau => $valor) {
        if ($clau == $num) {
            echo '<img src="' . $valor . '"></img>';
        }
    }
    return $num;
}

function guanyadorPartida($numJugador, $numJugador2, $nomJugador, $marcador)
{
    switch ($numJugador) {
        case 0:
            if ($numJugador2 == 1 || $numJugador2 == 3) {
                echo '<p>Ha guanyat ' . $nomJugador . '</p>';
                $marcador++;
            }
            break;
        case 1:
            if ($numJugador2 == 2 || $numJugador2 == 3) {
                echo '<p>Ha guanyat ' . $nomJugador . '</p>';
                $marcador++;
            }
            break;
        case 2:
            if ($numJugador2 == 0 || $numJugador2 == 4) {
                echo '<p>Ha guanyat ' . $nomJugador . '</p>';
                $marcador++;
            }
            break;
        case 3:
            if ($numJugador2 == 2 || $numJugador2 == 4) {
                echo '<p>Ha guanyat ' . $nomJugador . '</p>';
                $marcador++;
            }
            break;
        case 4:
            if ($numJugador2 == 0 || $numJugador2 == 1) {
                echo '<p>Ha guanyat ' . $nomJugador . '</p>';
                $marcador++;
            }
            break;
    }

    return $marcador;
}
