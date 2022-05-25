<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cercle de color</title>
</head>

<body>
    <h1>Cercle de color</h1>
    <svg height="150" width="150">
        <circle cx="75" cy="75" r="50" stroke="black" stroke-width="3" fill="<?php echo 'rgb(' . rand(0, 255) . ', ' . rand(0, 255) . ', ' . rand(0, 255) . ')'; ?>" />
    </svg>

    <?php
    /*Fer un programa que cada vegada que s'executi la pàgina mostri un cercle de 50px de radi i un color escollit de manera aleatoria
    Pista: El tag HTML per dibuixar un cercle és el tag circle*/

    $color = 'rgb(' . rand(0, 255) . ', ' . rand(0, 255) . ', ' . rand(0, 255) . ')';
    $cercle = '<svg height="150" width="150">
    <circle cx="75" cy="75" r="50" stroke="black" stroke-width="3" fill="' . $color . '" />
  </svg>';


    echo $cercle;
    ?>
</body>

</html>