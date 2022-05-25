<?php
require_once("inc/funcions.php");

$nom = recollirDades("nom");
$tiradesTotals = recollirDades("tirades");
$tiradaActual = isset($_POST["tirada"]) ? $_POST["tirada"] : 0;
$boleta = isset($_POST["boleta"]) ? $_POST["boleta"] : -1;
$carta = isset($_POST["carta"]) ? $_POST["carta"] : -1;
$missatgeTotal = isset($_POST["missatgeTotal"]) ? $_POST["missatgeTotal"] : "";

$missatgeWin = '<span style="color: green;">Enhorabona! Has encertat on era la boleta!!</span>';
$missatgeLose = '<span style="color: red;">Mala sort, Has fallat :c</span>';
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="styles/styleTaulell.css" rel="stylesheet" type="text/css">
    <title>Taulell</title>
</head>

<body>
    <div class="taulell">
    <?php

    if ($tiradaActual <= $tiradesTotals) {
        echo '<h3>Nom: ' . $nom . '</h3>';
        echo '<h3>Tirades: ' . $tiradaActual . '/' . $tiradesTotals . '</h3>';
    ?>
        <form action="taulell.php" method="POST">
            <?= afegirCartes(); ?>
            <input type="hidden" value="<?= $nom ?>" name="nom">
            <input type="hidden" value="<?= $tiradesTotals ?>" name="tirades">
            <input type="hidden" value="<?= $tiradaActual = ($tiradaActual <= $tiradesTotals) ? $tiradaActual + 1 : $tiradaActual ?>" name="tirada">
            <input type="hidden" value="<?= $boleta = rand(0, 2); ?>" name="boleta">

            <?php
            if ($carta == $boleta && $carta != -1 && $boleta != -1) {
                echo '<p>' . $missatgeWin;
                $missatgeTotal .= '<p>Resultat tirada número ' . ($tiradaActual - 1) . ': Win';
            } else if ($carta != -1 && $boleta != -1) {
                echo '<p>' . $missatgeLose;
                $missatgeTotal .= '<p>Resultat tirada número ' . ($tiradaActual - 1) . ': Lose';
            }
            ?>
            <input type="hidden" value="<?= $missatgeTotal ?>" name="missatgeTotal">
        </form>
    <?php
    } else {
        echo '<h3>Nom: ' . $nom . '</h3>';
        echo '<h3>Ja has acabat totes les tirades.</h3>';
    ?>
        <p><?= afegirCartes(); ?></p>
        <form action="pantallaFinal.php" method="POST">
            <input type="hidden" value="<?= $nom ?>" name="nom">
            <input type="hidden" value="<?= $tiradesTotals ?>" name="tirades">
            <input type="hidden" value="<?= $missatgeTotal ?>" name="missatgeTotal">
            <button type="submit">Veure resultats totals</button>
        </form>

    <?php } ?>

    </div>
</body>

</html>