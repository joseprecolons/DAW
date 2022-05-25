<?php 
session_start();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultats Retrat Robot</title>
</head>
<body>
    <?php
    echo '<h2>Nom del jugador: '. $_SESSION["nom"] . '</h2>';
    echo '<h2>Total imatges senceres de les actrius: '.$_SESSION["marcadorJugador"] . '</h2>';
    echo '<h2>Número de tirades fetes: '.$_SESSION["tiradesTotals"].'</h2>';
    ?>

    <form action="index.php" method="post">
    <button type="submit">Tornar a jugar</button>

    </form>
    
</body>
</html>