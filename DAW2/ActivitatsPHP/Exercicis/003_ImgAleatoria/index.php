<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Número Aleatori</title>
</head>

<body style="text-align: center;">

    <h1> Número Aleatori 1 - 10</h1>

    <?php
    /*Aquesta pàgina mostrará un número aleatori de 1 a 10 cada vegada que carregui la pàgina */

    $daus = array();

    for ($i = 1; $i < 6; $i++) {
        $daus[$i] = "img/" + $i + ".svg";
    }

    $iniciHTML = "<p><span style='border: 2px solid black; padding: 10px; font-size: 60px'>";
    $nRandom = rand(1, 6);
    $img = '<img src="' . $daus[$nRandom] . '">';
    $finHTML = "</span></p>";

    echo $iniciHTML . $img . $finHTML;

    echo "<img src ='img/" . rand(1, 6) . ".svg'>";
    ?>

    <img src="img/<?php echo rand(1, 6) ?>.svg">
    <img src="img/<?= rand(1, 6) ?>.svg">
    <img src="img/<?= $daus[rand(1, 6)] ?>.svg">

</body>

</html>