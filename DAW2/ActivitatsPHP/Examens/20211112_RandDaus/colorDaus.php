<?php
include("inc/funcions.php");

$color = recollirDades("color");
$cadena = recollirDades("cadena");

$daus = array();
$daus = explode(",", $cadena);
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
    <h1>Pantalla Final</h1>
    <?php
        echo '<p>Tenim ' . count($daus) . ' daus ';
        if ($color == 1) {
            echo 'blaus</p>';
        } else {
            echo 'vermells</p>';
        }
        for ($i = 0; $i < count($daus); $i++) {
        if ($color == 1) {
            echo '<img src="imgs/' . $daus[$i] . '.svg" style="border:2px solid blue">';
        } else {
            echo '<img src="imgs/' . $daus[$i] . '.svg" style="border:2px solid red">';
        }
    }
    ?>

    <form action="index.php" method="POST">
        <button type="submit">Tornar a l'inici</button>
    </form>
</body>
</html>