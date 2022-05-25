<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Primer exemple PHP</title>
</head>
<body>
    <?php 
    echo "Aquesta es la meva primera pàgina php";
    ?>

    <p> Linea plana en html </p>

    <?php 
    echo "linea en php";
    ?>

    <?php 
    $nom = "josep";
    $cognom = "recolons";

    $nomComplert = $nom.$cognom;
    echo "<p>El meu nom és ".$nomComplert."</p>";
    ?>

    <?php
    $variable1 = 1;
    $variable2 = 2;
    $variable3 = 3;

    echo "<ul><li>".$variable1.
    "</li><li>".$variable2.
    "</li><li>".$variable3.
    "</li></ul>";

    $variable3 += $variable2 * $variable1;

    echo "<ul><li>$variable1".
    "</li><li>$variable2".
    "</li><li>$variable3".
    "</li></ul>";
    ?>
</body>
</html>


