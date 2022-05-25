<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mou Fitxa</title>
</head>

<body>
    <h1>Mou Fitxa</h1>

    <?php
    $valor = rand(1, 6);
    $valorCercle = $valor * 100 - 50;
    ?>

    <img src="img/<?php echo $valor ?>.svg">

    <p>
        <svg width="620" height="120" viewBox="-15 -15 620 120" style="background-color: white; font-family: sans-serif;">

            <?php
            for ($i = 1; $i < 7; $i++) {
                $posicioRect = $i * 100 - 100;
                $posicio = $i * 100 - 50;

                echo '<rect x="' . $posicioRect . '" y="0" width="100" height="100" stroke="black" stroke-width="1" fill="none"></rect>
            <text x="' . $posicio . '" y="80" text-anchor="middle" font-size="80" fill="lightgray">' . $i . '</text>';
            }

            ?>
            <circle cx="<?php echo $valorCercle ?>" cy="50" r="30" stroke="black" stroke-width="2" fill="red"></circle>


        </svg>
    </p>

</body>

</html>