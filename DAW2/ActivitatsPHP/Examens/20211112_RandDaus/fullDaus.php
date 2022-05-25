<?php
include("inc/funcions.php");

$numDaus = recollirDades("numDaus");
$color = recollirDades("color");
$titol = recollirDades("titol");
$nDausSeleccionats = recollirDades("nDausSeleccionats");
$tornada = recollirDades("tornada");

$daus = array();
$dausColors = array();
?>

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
    if ($numDaus > 10 || $numDaus < 2) {
        echo '<p style="color:red;">El número que has indicat, ha de ser entre 2 i 10</p>';
    } else if($color != 1 && $color != 2) {
        echo '<p style="color:red;">El color que has indicat, ha de ser blau o vermell</p>';
    } else {


    if ($titol != null) {
        echo '<h1>COMPTAR DAUS (RESULTAT)</h1>';
    }
    if ($nDausSeleccionats != null) {
        echo '<p>' . $numDaus . ' daus</p>';
    }

    for ($i = 0; $i < $numDaus; $i++) {
        $daus[$i] = numRandom(1, 6);
    }

    for ($i = 0, $j = 0, $k = 0; $i < $numDaus; $i++) {
        if (numRandom(0, 1) == 0) {
            echo '<img src="imgs/' . $daus[$i] . '.svg" style="border:2px solid blue">';
            $dausColors[0][$j] = $daus[$i];
            $j++;
        } else {
            echo '<img src="imgs/' . $daus[$i] . '.svg" style="border:2px solid red">';
            $dausColors[1][$k] = $daus[$i];
            $k++;
        }
    }
    ?>
    <form action="colorDaus.php" method="POST">
        <?php


        if ($tornada != null) {
            echo '<button type="submit">Següent</button>';
        }

        if ($color == 1) {
           $cadena = implode("," , $dausColors[0]); 
        } else {
            $cadena = implode("," , $dausColors[1]); 
        }
        ?>

        <input type="hidden" name="cadena" value="<?=$cadena?>">
        <input type="hidden" name="color" value="<?=$color?>">


    </form>

    <?php } ?>
</body>

</html>