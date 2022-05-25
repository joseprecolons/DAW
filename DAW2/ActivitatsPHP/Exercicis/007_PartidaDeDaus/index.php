<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Partida de Daus</title>
</head>

<body>
    <?php
    /**Escriu un programa que enfronti una sèrie de jugadors tirant una sèrie de daus a l'atzar entre 2 i 7 daus, i indicar el resultat
     * Es a dir , per a cada jugador, mostrar la imatge dels daus tirats
     * Els daus es comparen en ordre (el primer amb el primer, el segon amb el segon, etc...)
     * I guanya el jugador que més vegades treu el número més alt.
     */
    ?>

    <?php
    $nDaus = rand(2, 7);
    $partida = array();

    for ($i = 0; $i < $nDaus; $i++) {
       $partida[0][$i] = rand(1, 6);
       $partida[1][$i] = rand(1, 6);
    }

    echo '<h1> Jugador 1 <br>';
    for ($i = 0; $i < $nDaus; $i++) {
        echo '<img src="img/' . $partida[0][$i] . '.svg">';
    }

    echo '<h1> Jugador 2 <br>';
    for ($i = 0; $i < $nDaus; $i++) {
        echo '<img src="img/' . $partida[1][$i] . '.svg">';
    }

    $partidesGuanyades1;
    $partidesGuanyades2;

    for ($i = 0; $i < $nDaus; $i++) {
        if ($partida[0][$i] > $partida[1][$i]) {
            $partidesGuanyades1++;
        } else if ($partida[0][$i] < $partida[1][$i]) {
            $partidesGuanyades2++;
        }
     }

    echo '<p>El jugador número 1, ha guanyat ' . $partidesGuanyades1 . ' partides';
    echo '<p>El jugador número 2, ha guanyat ' . $partidesGuanyades2 . ' partides';
    echo '<p>Els jugadors en empatat ' . ($nDaus - ($partidesGuanyades1 + $partidesGuanyades2)) . ' partides';

    if ($partidesGuanyades1 > $partidesGuanyades2) {
        echo '<p>El guanyador es el jugador número 1';
    } else if ($partidesGuanyades1 < $partidesGuanyades2) {
        echo '<p>El guanyador es el jugador número 2';
    } else {
        echo '<p>Els jugadors en empatat';
    }
    ?>
</body>

</html>