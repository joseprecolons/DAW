<?php
require_once("inc/funcions.php");
?>

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
    //Jugador atacant, entre 1 i 3 daus
    $nDausAtt = rand(1, 3);
    //Jugador defensor, entre 1 i 2 daus
    $nDausDef = rand(1, 2);
    //El número més petit dels dos que han sortit, per comparar-ho més tard.
    $nMenorDaus = $nDausAtt >= $nDausDef ? $nDausDef : $nDausAtt;
    //Array on es guardaran les dades de la partida
    $partida = array();

    $partida[0] = valorDaus($nDausAtt);
    $partida[1] = valorDaus($nDausDef);


    rsort($partida[0]);
    rsort($partida[1]);

    echo '<h1> Jugador 1 <br>';
    mostrarDadesPartida($partida[0], $nDausAtt);

    echo '<h1> Jugador 2 <br>';
    mostrarDadesPartida($partida[1], $nDausDef);

    $partida[2] = puntsPartida($nMenorDaus, $partida[0], $partida[1] );

    mostrarResultat($partida[2]);
    ?>
</body>

</html>