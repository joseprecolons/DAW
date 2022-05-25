<?php
require_once("inc/funcions.php");

$nom = recollirDades("nom");
$tiradesTotals = recollirDades("tirades");
$missatgeTotal = recollirDades("missatgeTotal");
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
        <?php
        echo '<p>Nom del jugador: ' . $nom;
        echo '<p>Número total de tirades realitzades: ' . $tiradesTotals;
        ?>
        <div class="resultats">
            <?php
            echo $missatgeTotal;
            ?>
        </div>

        <form action="index.php">
            <button type="submit">Tornar a jugar</button>
        </form>

    </div>
</body>

</html>