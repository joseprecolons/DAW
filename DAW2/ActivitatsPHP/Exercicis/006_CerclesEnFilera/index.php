<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <?php
    /**Escriure un programa que dibuixi entre 1 i 10 cercles (random), de radi entre 10 i 50px (random) */
    ?>


    <?php
    $nCercles = rand(2, 10);
    $valorRadi = rand(10, 50);
    ?>

    <p>

    <?php
        echo '<svg width="1520" height="120" viewBox="-15 -15 1520 120" style="background-color: white; font-family: sans-serif;">';
        for ($i = 0, $j = 50; $i < $nCercles; $i++, $j += ($valorRadi*2)+20) {
            echo '<circle cx="' . $j . '" cy="50" r="' . $valorRadi . '" stroke="black" stroke-width="2" fill="red"></circle>';
        }
        echo '</svg>';
        ?>

    </p>

</body>

</html>